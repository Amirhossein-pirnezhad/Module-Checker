import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class SemanticChecker extends HashBaseListener {
    private enum Pass {COLLECT, CHECK}

    private static class Func {
        String name;
        String returnType;
        List<String> paramName = new ArrayList<>();
        List<String> paramType = new ArrayList<>();
        boolean hasReturnVal = false;

        Func(String name, String returnType) {
            this.name = name;
            this.returnType = returnType;
        }
    }

    private static class ClassIn {
        String name;
        Map<String, String> fields = new HashMap<>();
        Map<String, Func> methods = new HashMap<>();
        List<List<String>> constructors = new ArrayList<>();

        ClassIn(String name) {
            this.name = name;
        }
    }

    private Pass pass;
    private final List<String> errors = new ArrayList<>();
    private final Map<String, Func> funcs = new HashMap<>();
    private final Map<String, ClassIn> classes = new HashMap<>();
    private final Map<String, String> globalVar = new HashMap<>();
    private final Set<String> exceptions = new HashSet<>();
    private final Deque<Map<String, String>> scopes = new ArrayDeque<>();
    private String currentClass = null;
    private Func currentFunc = null;
    private int loopDepth = 0;
    private int switchDepth = 0;

    public List<String> getError() {
        return errors;
    }

    private void addBuiltInExceptions() {
        exceptions.add("SefrBood");
        exceptions.add("MahdoodeNadorost");
        exceptions.add("JadvalKhali");
        exceptions.add("GheireMojaz");
    }

    public void collectDef(ParseTree tree) {
        errors.clear();
        funcs.clear();
        classes.clear();
        globalVar.clear();
        exceptions.clear();
        addBuiltInExceptions();
        pass = Pass.COLLECT;
        currentFunc = null;
        currentClass = null;
        scopes.clear();
        loopDepth = 0;
        switchDepth = 0;
        ParseTreeWalker.DEFAULT.walk(this, tree);
    }

    public void SemanticCheck(ParseTree tree) {
        pass = Pass.CHECK;
        currentFunc = null;
        currentClass = null;
        scopes.clear();
        loopDepth = 0;
        switchDepth = 0;
        scopes.push(new HashMap<>(globalVar));
        ParseTreeWalker.DEFAULT.walk(this, tree);
    }

    private void error(Token token, String msg) {
        errors.add("Line " + token.getLine() + ":" + token.getCharPositionInLine() + " Semantic Error: " + msg);
    }

    //Scopes
    private void pushScope() {
        scopes.push(new HashMap<>());
    }

    private void popScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        }
    }

    private void defineVar(Token token, String name, String type) {
        if (scopes.isEmpty()) pushScope();

        for (Map<String, String> scope : scopes) {
            if (scope.containsKey(name)) {
                error(token, "variable '" + name + "' is already defined");
                return;
            }
        }

        scopes.peek().put(name, type);
    }

    private void defineParams(HashParser.ParamListContext params) {
        if (params == null) return;
        for (HashParser.ParamContext p : params.param()) {
            String name = p.ID().getText();
            String type = p.typeName().getText();
            checkKnownType(p.typeName().start, type, false);
            defineVar(p.ID().getSymbol(), name, type);
        }
    }

    private String resolveVar(String name) {
        for (Map<String, String> scope : scopes) {
            if (scope.containsKey(name)) return scope.get(name);
        }
        return null;
    }

    // type checher
    private String getLiteralType(HashParser.LiteralContext ctx) {
        if (ctx.INT() != null) return "adad";
        if (ctx.FLOAT() != null) return "ashari";
        if (ctx.STRING() != null) return "matn";
        if (ctx.CHAR() != null) return "harf";
        if (ctx.DOROST() != null || ctx.GHALAT() != null) return "boole";
        if (ctx.KHALI() != null) return "khali";
        return "unknown";
    }

    private String getObjectCreationType(HashParser.ObjectCreationContext ctx) {
        String className = ctx.CLASS_ID().getText();
        if (!classes.containsKey(className)) {
            error(ctx.CLASS_ID().getSymbol(), "class '" + className + "' is not defined");
            return "error";
        }
        checkConstructorArguments(className, ctx.argumentList(), ctx.CLASS_ID().getSymbol());
        return className;
    }

    private String getLvalueType(HashParser.LvalueContext ctx) {
        String currentType;
        int index;
        if (ctx.IN() != null) {
            if (currentClass == null) {
                error(ctx.start, "'in' can only be used inside a class");
                return "error";
            }
            currentType = currentClass;
            index = 0;
        } else {
            String name = ctx.ID(0).getText();
            currentType = resolveVar(name);
            if (currentType == null) {
                error(ctx.ID(0).getSymbol(), "variable '" + name + "' is not defined");
                return "error";
            }
            index = 1;
        }
        for (int i = index; i < ctx.ID().size(); i++) {
            currentType = findFieldType(currentType, ctx.ID(i).getText(), ctx.ID(i).getSymbol());
        }
        return currentType;
    }

    private String getExceptionCreationType(HashParser.ExceptionCreationContext ctx) {
        String exceptionName = ctx.exceptionType().getText();
        checkKnownException(ctx.exceptionType().start, exceptionName);
        return exceptionName;
    }

    private String getPrimaryType(HashParser.PrimaryExprContext ctx) {
        if (ctx.literal() != null) return getLiteralType(ctx.literal());
        if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            String type = resolveVar(name);
            if (type == null) {
                error(ctx.ID().getSymbol(), "variable '" + name + "' is not defined");
                return "error";
            }
            return type;
        }
        if (ctx.IN() != null) {
            if (currentClass == null) {
                error(ctx.IN().getSymbol(), "'in' can only be used inside a class");
                return "error";
            }
            return currentClass;
        }
        if (ctx.objectCreation() != null) return getObjectCreationType(ctx.objectCreation());
        if (ctx.exceptionCreation() != null) return getExceptionCreationType(ctx.exceptionCreation());
        if (ctx.expr() != null) return getExprType(ctx.expr());
        return "unknown";
    }

    private String getPostfixType(HashParser.PostfixExprContext ctx) {
        HashParser.PrimaryExprContext primary = ctx.primaryExpr();
        List<HashParser.PostfixPartContext> parts = ctx.postfixPart();
        int index = 0;
        String currentType;
        if (primary.ID() != null && !parts.isEmpty() && parts.get(0).LPAREN() != null) {
            String functionName = primary.ID().getText();
            currentType = checkFunctionCall(functionName, funcs.get(functionName), parts.get(0).argumentList(), primary.ID().getSymbol());
            index = 1;
        } else {
            currentType = getPrimaryType(primary);
        }
        while (index < parts.size()) {
            HashParser.PostfixPartContext part = parts.get(index);
            if (part.DOT() != null) {
                String memberName = part.ID().getText();
                if (index + 1 < parts.size() && parts.get(index + 1).LPAREN() != null) {
                    Func method = findMethod(currentType, memberName, part.ID().getSymbol());
                    currentType = checkFunctionCall(memberName, method, parts.get(index + 1).argumentList(), part.ID().getSymbol());
                    index += 2;
                } else {
                    currentType = findFieldType(currentType, memberName, part.ID().getSymbol());
                    index++;
                }
            } else if (part.LPAREN() != null) {
                error(part.start, "cannot call a non-function expression");
                currentType = "error";
                index++;
            }
        }
        if (ctx.postfixIncDec() != null) {
            if (!isNumeric(currentType) && !isUnknownOrError(currentType)) {
                error(ctx.postfixIncDec().start, "++/-- requires numeric expression");
                return "error";
            }
        }
        return currentType;
    }

    private String getUnaryType(HashParser.UnaryExprContext ctx) {
        if (ctx.postfixExpr() != null) return getPostfixType(ctx.postfixExpr());
        String op = ctx.getChild(0).getText();
        String inner = getUnaryType(ctx.unaryExpr());
        if (op.equals("!")) {
            if (!inner.equals("boole") && !isUnknownOrError(inner)) {
                error(ctx.start, "operator ! requires boole operand");
            }
            return "boole";
        }
        if (!isNumeric(inner) && !isUnknownOrError(inner)) {
            error(ctx.start, "unary operator '" + op + "' requires numeric operand");
            return "error";
        }
        return inner;
    }

    private String getPowerType(HashParser.PowerExprContext ctx) {
        String left = getUnaryType(ctx.unaryExpr());
        if (ctx.powerExpr() != null) {
            String right = getPowerType(ctx.powerExpr());
            if (isNumeric(left) && isNumeric(right)) {
                return left.equals("ashari") || right.equals("ashari") ? "ashari" : "adad";
            }
            if (!isUnknownOrError(left) && !isUnknownOrError(right)) {
                error(ctx.start, "operator ** requires numeric operands");
            }
            return "error";
        }
        return left;
    }

    private String getMultiplicativeType(HashParser.MultiplicativeExprContext ctx) {
        String result = getPowerType(ctx.powerExpr(0));
        for (int i = 1; i < ctx.powerExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            String right = getPowerType(ctx.powerExpr(i));
            if (!isNumeric(result) || !isNumeric(right)) {
                if (!isUnknownOrError(result) && !isUnknownOrError(right)) {
                    error(ctx.powerExpr(i).start, "arithmetic operators require numeric operands");
                }
                result = "error";
            } else if (op.equals("%")) {
                if (!result.equals("adad") || !right.equals("adad")) {
                    error(ctx.powerExpr(i).start, "operator % requires adad operands");
                    result = "error";
                } else {
                    result = "adad";
                }
            } else {
                result = result.equals("ashari") || right.equals("ashari") ? "ashari" : "adad";
            }
        }
        return result;
    }

    private String getAdditiveType(HashParser.AdditiveExprContext ctx) {
        String result = getMultiplicativeType(ctx.multiplicativeExpr(0));
        for (int i = 1; i < ctx.multiplicativeExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            String right = getMultiplicativeType(ctx.multiplicativeExpr(i));
            if (op.equals("+") && (result.equals("matn") || right.equals("matn"))) {
                result = "matn";
            } else if (isNumeric(result) && isNumeric(right)) {
                result = result.equals("ashari") || right.equals("ashari") ? "ashari" : "adad";
            } else if (!isUnknownOrError(result) && !isUnknownOrError(right)) {
                error(ctx.multiplicativeExpr(i).start, "operator '" + op + "' cannot be applied to '" + result + "' and '" + right + "'");
                result = "error";
            }
        }
        return result;
    }

    private String getRelationalType(HashParser.RelationalExprContext ctx) {
        String left = getAdditiveType(ctx.additiveExpr(0));
        for (int i = 1; i < ctx.additiveExpr().size(); i++) {
            String right = getAdditiveType(ctx.additiveExpr(i));
            if ((!isNumeric(left) || !isNumeric(right)) && !isUnknownOrError(left) && !isUnknownOrError(right)) {
                error(ctx.additiveExpr(i).start, "relational operators require numeric operands");
            }
        }
        return ctx.additiveExpr().size() > 1 ? "boole" : left;
    }

    private String getEqualityType(HashParser.EqualityExprContext ctx) {
        String left = getRelationalType(ctx.relationalExpr(0));
        for (int i = 1; i < ctx.relationalExpr().size(); i++) {
            String right = getRelationalType(ctx.relationalExpr(i));
            if (!isAssignable(left, right) && !isAssignable(right, left)) {
                error(ctx.relationalExpr(i).start, "equality operands have incompatible types: '" + left + "' and '" + right + "'");
            }
        }
        return ctx.relationalExpr().size() > 1 ? "boole" : left;
    }

    private String getLogicalAndType(HashParser.LogicalAndExprContext ctx) {
        String result = getEqualityType(ctx.equalityExpr(0));
        if (ctx.equalityExpr().size() > 1) {
            for (HashParser.EqualityExprContext part : ctx.equalityExpr()) {
                String t = getEqualityType(part);
                if (!t.equals("boole") && !isUnknownOrError(t)) {
                    error(part.start, "operator && requires boole operands");
                }
            }
            return "boole";
        }
        return result;
    }

    private String getLogicalOrType(HashParser.LogicalOrExprContext ctx) {
        String result = getLogicalAndType(ctx.logicalAndExpr(0));
        if (ctx.logicalAndExpr().size() > 1) {
            for (HashParser.LogicalAndExprContext part : ctx.logicalAndExpr()) {
                String t = getLogicalAndType(part);
                if (!t.equals("boole") && !isUnknownOrError(t)) {
                    error(part.start, "operator || requires boole operands");
                }
            }
            return "boole";
        }
        return result;
    }

    private String getExprType(HashParser.ExprContext ctx) {
        return getLogicalOrType(ctx.logicalOrExpr());
    }

    //Helpers and finders
    private boolean isPrimitive(String type) {
        return type.equals("adad") || type.equals("ashari") || type.equals("boole") || type.equals("matn") || type.equals("harf");
    }

    private boolean isNumeric(String type) {
        return type.equals("adad") || type.equals("ashari");
    }

    private boolean isUnknownOrError(String type) {
        return type.equals("unknown") || type.equals("error");
    }

    private boolean isAssignable(String target, String source) {
        if (isUnknownOrError(target) || isUnknownOrError(source)) return true;
        if (target.equals(source)) return true;
        if (target.equals("ashari") && source.equals("adad")) return true;
        if (source.equals("khali") && classes.containsKey(target)) return true;
        return false;
    }

    private void requireBoole(HashParser.ExprContext expr) {
        String type = getExprType(expr);
        if (!type.equals("boole") && !isUnknownOrError(type)) {
            error(expr.start, "condition must be boole, but found '" + type + "'");
        }
    }

    private void checkKnownType(Token token, String type, boolean allowHich) {
        if (type.equals("hich")) {
            if (!allowHich) error(token, "hich cannot be used as a variable or parameter type");
            return;
        }
        if (isPrimitive(type)) return;
        if (classes.containsKey(type)) return;
        error(token, "type/class '" + type + "' is not defined");
    }

    private void checkKnownException(Token token, String exceptionName) {
        if (!exceptions.contains(exceptionName)) {
            error(token, "exception '" + exceptionName + "' is not defined");
        }
    }

    private void checkExceptionVariableName(Token token, String varName) {
        if (exceptions.contains(varName)) {
            error(token, "variable name '" + varName + "' cannot be the name of an exception");
        }
    }

    private String findFieldType(String classType, String fieldName, Token token) {
        if (!classes.containsKey(classType)) {
            if (!isUnknownOrError(classType)) {
                error(token, "type '" + classType + "' has no fields");
            }
            return "error";
        }
        ClassIn cls = classes.get(classType);
        String fieldType = cls.fields.get(fieldName);
        if (fieldType == null) {
            error(token, "field '" + fieldName + "' is not defined in class '" + classType + "'");
            return "error";
        }
        return fieldType;
    }

    private Func findMethod(String classType, String methodName, Token token) {
        if (!classes.containsKey(classType)) {
            if (!isUnknownOrError(classType)) {
                error(token, "type '" + classType + "' has no methods");
            }
            return null;
        }
        ClassIn cls = classes.get(classType);
        Func method = cls.methods.get(methodName);
        if (method == null) {
            error(token, "method '" + methodName + "' is not defined in class '" + classType + "'");
        }
        return method;
    }

    private String checkFunctionCall(String name, Func function, HashParser.ArgumentListContext args, Token token) {
        List<HashParser.ExprContext> argExprs = args == null ? Collections.emptyList() : args.expr();
        if (function == null) {
            error(token, "function/method '" + name + "' is not defined");
            for (HashParser.ExprContext e : argExprs) getExprType(e);
            return "error";
        }
        if (argExprs.size() != function.paramType.size()) {
            error(token, "function/method '" + name + "' expects " + function.paramType.size() + " arguments but got " + argExprs.size());
        }
        int count = Math.min(argExprs.size(), function.paramType.size());
        for (int i = 0; i < count; i++) {
            String expected = function.paramType.get(i);
            String actual = getExprType(argExprs.get(i));
            if (!isAssignable(expected, actual)) {
                error(argExprs.get(i).start, "argument " + (i + 1) + " of '" + name + "' must be '" + expected + "' but found '" + actual + "'");
            }
        }
        return function.returnType;
    }

    private void checkConstructorArguments(String className, HashParser.ArgumentListContext args, Token token) {
        ClassIn cls = classes.get(className);
        if (cls == null) return;
        List<HashParser.ExprContext> argExprs = args == null ? Collections.emptyList() : args.expr();
        if (cls.constructors.isEmpty()) return;
        for (List<String> params : cls.constructors) {
            if (params.size() != argExprs.size()) continue;
            boolean ok = true;
            for (int i = 0; i < params.size(); i++) {
                String actual = getExprType(argExprs.get(i));
                if (!isAssignable(params.get(i), actual)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return;
        }
        error(token, "no matching constructor found for class '" + className + "'");
    }

    //Definition pass
    private List<String> paramTypesOf(HashParser.ParamListContext params) {
        List<String> result = new ArrayList<>();
        if (params != null) {
            for (HashParser.ParamContext p : params.param()) {
                result.add(p.typeName().getText());
            }
        }
        return result;
    }

    private Func buildFunctionInfo(String name, String returnType, HashParser.ParamListContext params) {
        Func info = new Func(name, returnType);
        if (params != null) {
            for (HashParser.ParamContext p : params.param()) {
                info.paramName.add(p.ID().getText());
                info.paramType.add(p.typeName().getText());
            }
        }
        return info;
    }

    private Func findCurrentFunction(String name) {
        if (currentClass == null) return funcs.get(name);
        ClassIn cls = classes.get(currentClass);
        if (cls == null) return null;
        return cls.methods.get(name);
    }

    private void collectGlobal(Token token, String name, String type) {
        if (globalVar.containsKey(name)) {
            error(token, "global variable '" + name + "' is already defined");
        } else {
            globalVar.put(name, type);
        }
    }

    private void collectField(Token token, String name, String type) {
        ClassIn cls = classes.get(currentClass);
        if (cls == null) return;
        if (cls.fields.containsKey(name)) {
            error(token, "field '" + name + "' is already defined in class '" + currentClass + "'");
        } else {
            cls.fields.put(name, type);
        }
    }

    @Override
    public void enterClassDecl(HashParser.ClassDeclContext ctx) {
        String className = ctx.CLASS_ID().getText();
        if (pass == Pass.COLLECT) {
            if (classes.containsKey(className)) {
                error(ctx.CLASS_ID().getSymbol(), "Duplicate class " + className);
            } else {
                classes.put(className, new ClassIn(className));
                exceptions.add(className);
            }
        }
        currentClass = className;
    }

    @Override
    public void exitClassDecl(HashParser.ClassDeclContext ctx) {
        currentClass = null;
    }

    @Override
    public void enterFunctionDecl(HashParser.FunctionDeclContext ctx) {
        String funcName = ctx.ID().getText();
        String returnType = ctx.returnType().getText();
        Func info = buildFunctionInfo(funcName, returnType, ctx.paramList());
        if (pass == Pass.COLLECT) {
            if (currentClass == null) {
                if (funcs.containsKey(funcName)) {
                    error(ctx.ID().getSymbol(), "Duplicate function " + funcName);
                } else {
                    funcs.put(funcName, info);
                }
            } else {
                ClassIn cls = classes.get(currentClass);
                if (cls != null) {
                    if (cls.methods.containsKey(funcName)) {
                        error(ctx.ID().getSymbol(), "Duplicate method " + funcName);
                    } else {
                        cls.methods.put(funcName, info);
                    }
                }
            }
            currentFunc = info;
            return;
        }
        currentFunc = findCurrentFunction(funcName);
        if (currentFunc == null) {
            currentFunc = buildFunctionInfo(funcName, returnType, ctx.paramList());
        }
        currentFunc.hasReturnVal = false;
        checkKnownType(ctx.returnType().start, returnType, true);
        pushScope();
        defineParams(ctx.paramList());
    }

    @Override
    public void exitFunctionDecl(HashParser.FunctionDeclContext ctx) {
        if (pass == Pass.COLLECT) {
            currentFunc = null;
            return;
        }
        if (currentFunc != null && !currentFunc.returnType.equals("hich") && !currentFunc.hasReturnVal) {
            error(ctx.ID().getSymbol(), "non-hich function '" + currentFunc.name + "' must have at least one bede <expr>;");
        }
        popScope();
        currentFunc = null;
    }

    @Override
    public void enterConstructorDecl(HashParser.ConstructorDeclContext ctx) {
        String name = ctx.CLASS_ID().getText();
        if (pass == Pass.COLLECT) {
            if (currentClass != null) {
                ClassIn c = classes.get(currentClass);
                if (c != null) {
                    c.constructors.add(paramTypesOf(ctx.paramList()));
                }
            }
            currentFunc = buildFunctionInfo(name, "hich", ctx.paramList());
            return;
        }
        if (currentClass == null) {
            error(ctx.CLASS_ID().getSymbol(), "constructor must be inside a class");
        } else if (!name.equals(currentClass)) {
            error(ctx.CLASS_ID().getSymbol(), "constructor name '" + name + "' must match class name '" + currentClass + "'");
        }
        currentFunc = buildFunctionInfo(name, "hich", ctx.paramList());
        pushScope();
        defineParams(ctx.paramList());
    }

    @Override
    public void exitConstructorDecl(HashParser.ConstructorDeclContext ctx) {
        if (pass == Pass.COLLECT) {
            currentFunc = null;
            return;
        }
        popScope();
        currentFunc = null;
    }

    @Override
    public void enterVarDecl(HashParser.VarDeclContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.typeName().getText();
        if (pass == Pass.COLLECT) {
            if (currentClass == null && currentFunc == null) {
                collectGlobal(ctx.ID().getSymbol(), name, type);
            } else if (currentClass != null && currentFunc == null) {
                collectField(ctx.ID().getSymbol(), name, type);
            }
            return;
        }
        checkKnownType(ctx.typeName().start, type, false);
        checkExceptionVariableName(ctx.ID().getSymbol(), name);
        boolean isTL = currentClass == null && currentFunc == null;
        boolean isField = currentClass != null && currentFunc == null;
        if (!isTL && !isField) {
            defineVar(ctx.ID().getSymbol(), name, type);
        }
        if (ctx.expr() != null) {
            String exprType = getExprType(ctx.expr());
            if (!isAssignable(type, exprType)) {
                error(ctx.ID().getSymbol(), "cannot assign '" + exprType + "' to variable '" + name + "' of type '" + type + "'");
            }
        }
    }

    @Override
    public void enterReturnStmt(HashParser.ReturnStmtContext ctx) {
        if (pass != Pass.CHECK) return;
        if (currentFunc == null) {
            error(ctx.BEDE().getSymbol(), "bede can only be used inside a function or constructor");
            return;
        }
        boolean hasExpr = ctx.expr() != null;
        if (currentFunc.returnType.equals("hich")) {
            if (hasExpr) {
                error(ctx.BEDE().getSymbol(), "hich function/constructor cannot return a value");
            }
            return;
        }
        if (!hasExpr) {
            error(ctx.BEDE().getSymbol(), "non-hich function must return a value");
            return;
        }
        currentFunc.hasReturnVal = true;
        String actualType = getExprType(ctx.expr());
        if (!isAssignable(currentFunc.returnType, actualType)) {
            error(ctx.BEDE().getSymbol(), "return type mismatch: expected '" + currentFunc.returnType + "' but found '" + actualType + "'");
        }
    }

    @Override
    public void enterAssignment(HashParser.AssignmentContext ctx) {
        if (pass != Pass.CHECK) return;
        String leftType = getLvalueType(ctx.lvalue());
        String rightType = getExprType(ctx.expr());
        if (!isAssignable(leftType, rightType)) {
            error(ctx.lvalue().start, "cannot assign '" + rightType + "' to lvalue of type '" + leftType + "'");
        }
    }

    @Override
    public void enterForInit(HashParser.ForInitContext ctx) {
        if (pass != Pass.CHECK) return;
        if (ctx.varDeclNoSemi() != null) {
            HashParser.VarDeclNoSemiContext v = ctx.varDeclNoSemi();
            String name = v.ID().getText();
            String type = v.typeName().getText();
            checkKnownType(v.typeName().start, type, false);
            checkExceptionVariableName(v.ID().getSymbol(), name);
            defineVar(v.ID().getSymbol(), name, type);
            if (v.expr() != null) {
                String exprType = getExprType(v.expr());
                if (!isAssignable(type, exprType)) {
                    error(v.ID().getSymbol(), "cannot assign '" + exprType + "' to variable '" + name + "' of type '" + type + "'");
                }
            }
        }
    }

    @Override
    public void enterIncDecExpr(HashParser.IncDecExprContext ctx) {
        if (pass != Pass.CHECK) return;
        String t = getLvalueType(ctx.lvalue());
        if (!isNumeric(t) && !isUnknownOrError(t)) {
            error(ctx.lvalue().start, "++/-- requires numeric variable, but found '" + t + "'");
        }
    }

    @Override
    public void enterIfStmt(HashParser.IfStmtContext ctx) {
        if (pass == Pass.CHECK) requireBoole(ctx.expr());
    }

    @Override
    public void enterWhileStmt(HashParser.WhileStmtContext ctx) {
        if (pass == Pass.CHECK) {
            requireBoole(ctx.expr());
            loopDepth++;
        }
    }

    @Override
    public void exitWhileStmt(HashParser.WhileStmtContext ctx) {
        if (pass == Pass.CHECK) {
            loopDepth--;
        }
    }

    @Override

    public void enterForStmt(HashParser.ForStmtContext ctx) {
        if (pass == Pass.CHECK) {
            pushScope();
            loopDepth++;
        }
    }

    @Override
    public void exitForStmt(HashParser.ForStmtContext ctx) {
        if (pass == Pass.CHECK) {
            if (ctx.expr() != null) requireBoole(ctx.expr());
            loopDepth--;
            popScope();
        }
    }

    @Override
    public void enterSwitchStmt(HashParser.SwitchStmtContext ctx) {
        if (pass == Pass.CHECK) {
            switchDepth++;
        }
    }

    @Override
    public void exitSwitchStmt(HashParser.SwitchStmtContext ctx) {
        if (pass == Pass.CHECK) {
            switchDepth--;
        }
    }

    @Override
    public void enterBreakStmt(HashParser.BreakStmtContext ctx) {
        if (pass != Pass.CHECK) return;
        if (loopDepth == 0 && switchDepth == 0) {
            error(ctx.SHEKAN().getSymbol(), "shekan can only be used inside a loop or switch");
        }
    }

    @Override
    public void enterContinueStmt(HashParser.ContinueStmtContext ctx) {
        if (pass != Pass.CHECK) return;
        if (loopDepth == 0) {
            error(ctx.EDAME().getSymbol(), "edame can only be used inside a loop");
        }
    }

    @Override
    public void enterPrintStmt(HashParser.PrintStmtContext ctx) {
        if (pass == Pass.CHECK) getExprType(ctx.expr());
    }

    @Override
    public void enterExprStmt(HashParser.ExprStmtContext ctx) {
        if (pass == Pass.CHECK) getExprType(ctx.expr());
    }

    @Override
    public void enterInputStmt(HashParser.InputStmtContext ctx) {
        if (pass != Pass.CHECK) return;
        String name = ctx.ID().getText();
        String type = ctx.primitiveType().getText();
        checkExceptionVariableName(ctx.ID().getSymbol(), name);
        defineVar(ctx.ID().getSymbol(), name, type);
    }

    @Override
    public void enterCatchClause(HashParser.CatchClauseContext ctx) {
        if (pass != Pass.CHECK) return;
        String exceptionName = ctx.exceptionType().getText();
        checkKnownException(ctx.exceptionType().start, exceptionName);
        pushScope();
        defineVar(ctx.ID().getSymbol(), ctx.ID().getText(), exceptionName);
    }

    @Override
    public void exitCatchClause(HashParser.CatchClauseContext ctx) {
        if (pass == Pass.CHECK) popScope();
    }

    @Override
    public void enterThrowStmt(HashParser.ThrowStmtContext ctx) {
        if (pass != Pass.CHECK) return;
        if (ctx.throwTarget().exceptionCreation() != null) {
            String exceptionName = ctx.throwTarget().exceptionCreation().exceptionType().getText();
            checkKnownException(ctx.throwTarget().exceptionCreation().exceptionType().start, exceptionName);
        } else if (ctx.throwTarget().ID() != null) {
            String name = ctx.throwTarget().ID().getText();
            String type = resolveVar(name);
            if (type == null) {
                error(ctx.throwTarget().ID().getSymbol(), "variable '" + name + "' is not defined");
            } else if (!exceptions.contains(type)) {
                error(ctx.throwTarget().ID().getSymbol(), "variable '" + name + "' is not an exception");
            }
        }
    }

    @Override
    public void enterBlock(HashParser.BlockContext ctx) {
        if (pass == Pass.CHECK) pushScope();
    }

    @Override
    public void exitBlock(HashParser.BlockContext ctx) {
        if (pass == Pass.CHECK) popScope();
    }
}