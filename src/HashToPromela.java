
import java.util.ArrayDeque;
import java.util.Deque;

public class HashToPromela extends HashBaseVisitor<String> {
    private int loopCounter = 0, exceptionCounter = 0;
    private final Deque<String> continueLabels = new ArrayDeque<>();
    private boolean isDivide = false;
    private String division = null;

    @Override
    public String visitProgram(HashParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        StringBuilder globalVars = new StringBuilder();
        StringBuilder mainBody = new StringBuilder();
        boolean mainStarted = false;
        for (var decl : ctx.topLevelDecl()) {
            if (!mainStarted && isTopLevelVarDecl(decl)) {
                String result = visit(decl);
                if (result != null && !result.isEmpty()) {
                    globalVars.append(result);
                }
            } else {
                mainStarted = true;

                String result = visit(decl);
                if (result != null && !result.isEmpty()) {
                    mainBody.append(indent(result));
                }
            }
        }
        //phase two Flags
        sb.append("bool divByZero = false;\n");
        sb.append("bool inLoop = false;\n");
        sb.append("bool exitLoop = false;\n");
        sb.append("bool endReachedFlag = false;\n");
        sb.append("\n");

        sb.append(globalVars);
        sb.append("\n");
        sb.append("active proctype main() {\n");
        sb.append(mainBody);
        //other flag
        sb.append("endReached:\n");
        sb.append("    endReachedFlag = true;\n");
        sb.append("    skip;\n");
        sb.append("}\n");

        return sb.toString();
    }

    @Override
    public String visitTopLevelDecl(HashParser.TopLevelDeclContext ctx) {
        if (ctx.statement() != null) { //don't check the function and class
            return visit(ctx.statement());
        }
        return "";
    }

    @Override
    public String visitVarDecl(HashParser.VarDeclContext varDecl) {
        String type = varDecl.typeName().getText();
        String name = varDecl.ID().getText();
        String promelaType = mapType(type);
        if (promelaType.isEmpty()) {
            return "";
        }
        if (varDecl.expr() != null) {
            String exprText = varDecl.expr().getText();
            if (isSimpleIncDecText(exprText)) {
                String varName = getIncDecVarName(exprText);
                boolean increment = isIncrement(exprText);
                StringBuilder sb = new StringBuilder();
                if (isPrefixIncDec(exprText)) {
                    sb.append(incDecUpdate(varName, increment)).append(";\n");
                    sb.append(promelaType).append(" ").append(name).append(" = ").append(varName).append(";\n");
                } else {
                    sb.append(promelaType).append(" ").append(name).append(" = ").append(varName).append(";\n");
                    sb.append(incDecUpdate(varName, increment)).append(";\n");
                }
                return sb.toString();
            }
            String value = visit(varDecl.expr());
            return promelaType + " " + name + " = " + value + ";\n";
        } else {
            return promelaType + " " + name + ";\n";
        }
    }


    @Override
    public String visitExpr(HashParser.ExprContext ctx) {
        return visit(ctx.logicalOrExpr());
    }
    @Override
    public String visitExprStmt(HashParser.ExprStmtContext ctx) {
        String text = ctx.expr().getText();

        if (isSimpleIncDecText(text)) {
            String varName = getIncDecVarName(text);
            boolean increment = isIncrement(text);

            return incDecUpdate(varName, increment) + ";\n";
        }

        return "";
    }

    @Override
    public String visitLogicalOrExpr(HashParser.LogicalOrExprContext ctx) {
        if (ctx.logicalAndExpr().size() == 1)
            return visit(ctx.logicalAndExpr(0));

        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.logicalAndExpr(0)));

        for (int i = 1; i < ctx.logicalAndExpr().size(); i++) {
            sb.append(" || ");
            sb.append(visit(ctx.logicalAndExpr(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitLogicalAndExpr(HashParser.LogicalAndExprContext ctx) {
        if (ctx.equalityExpr().size() == 1)
            return visit(ctx.equalityExpr(0));

        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.equalityExpr(0)));

        for (int i = 1; i < ctx.equalityExpr().size(); i++) {
            sb.append(" && ");
            sb.append(visit(ctx.equalityExpr(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitEqualityExpr(HashParser.EqualityExprContext ctx) {
        if (ctx.relationalExpr().size() == 1)
            return visit(ctx.relationalExpr(0));

        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.relationalExpr(0)));

        for (int i = 1; i < ctx.relationalExpr().size(); i++) {
            String operation = // for add == or !=
                    ctx.getChild(2 * i - 1).getText();
            sb.append(" ");
            sb.append(operation);
            sb.append(" ");
            sb.append(visit(ctx.relationalExpr(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitRelationalExpr(HashParser.RelationalExprContext ctx) {
        if (ctx.additiveExpr().size() == 1)
            return visit(ctx.additiveExpr(0));

        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.additiveExpr(0)));

        for (int i = 1; i < ctx.additiveExpr().size(); i++) {
            String operation =
                    ctx.getChild(2 * i - 1).getText();//for adding >= , ...
            sb.append(" ");
            sb.append(operation);
            sb.append(" ");
            sb.append(visit(ctx.additiveExpr(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitAdditiveExpr(HashParser.AdditiveExprContext ctx) {

        if (ctx.multiplicativeExpr().size() == 1)
            return visit(ctx.multiplicativeExpr(0));

        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.multiplicativeExpr(0)));

        for (int i = 1; i < ctx.multiplicativeExpr().size(); i++) {
            String operation =
                    ctx.getChild(2 * i - 1).getText();
            sb.append(" ");
            sb.append(operation);
            sb.append(" ");
            sb.append(visit(ctx.multiplicativeExpr(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitMultiplicativeExpr(HashParser.MultiplicativeExprContext ctx) {

        if (ctx.powerExpr().size() == 1)
            return visit(ctx.powerExpr(0));

        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.powerExpr(0)));

        for (int i = 1; i < ctx.powerExpr().size(); i++) {
            String operation =
                    ctx.getChild(2 * i - 1).getText();

            if (operation.equals("/")) isDivide = true;
            if (isDivide){
                division = visit(ctx.powerExpr(i));
            }

            sb.append(" ");
            sb.append(operation);
            sb.append(" ");
            sb.append(visit(ctx.powerExpr(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitPowerExpr(HashParser.PowerExprContext ctx) {
        String base = visit(ctx.unaryExpr());
        if (ctx.powerExpr() == null) {
            return base;
        }
        String exponentText = ctx.powerExpr().getText();
        if (!exponentText.matches("\\d+")) {
            return base;
        }

        int exponent = Integer.parseInt(exponentText);
        return expandPower(base, exponent);
    }

    @Override
    public String visitUnaryExpr(HashParser.UnaryExprContext ctx) {
        if (ctx.postfixExpr() != null)
            return visit(ctx.postfixExpr());

        String op = ctx.getChild(0).getText();
        return op + visit(ctx.unaryExpr());
    }
    //changed to support ++x and x++ in the correct way
    @Override
    public String visitPostfixExpr(HashParser.PostfixExprContext ctx) {
        String result = visit(ctx.primaryExpr());

        if (!ctx.postfixPart().isEmpty()) {
            return result;
        }

        if (ctx.postfixIncDec() != null) {
            return result;
        }

        return result;
    }

    @Override
    public String visitPrimaryExpr(HashParser.PrimaryExprContext ctx) {
        //ignore object creation and exception creation
        if (ctx.literal() != null)
            return visit(ctx.literal());

        if (ctx.ID() != null)
            return ctx.ID().getText();

        if (ctx.IN() != null)
            return "this";

        if (ctx.expr() != null)
            return "(" + visit(ctx.expr()) + ")";

        return ctx.getText();
    }

    @Override
    public String visitLiteral(HashParser.LiteralContext ctx) {

        if (ctx.DOROST() != null)
            return "true";

        if (ctx.GHALAT() != null)
            return "false";

        if (ctx.KHALI() != null)
            return "null";

        return ctx.getText();
    }
    //changed to prevent unsupported types in palermo
    private String mapType(String hashType) {
        switch (hashType) {
            case "adad":
                return "int";
            case "boole":
                return "bool";
            default:
                return "";
        }
    }

    @Override
    public String visitStatement(HashParser.StatementContext ctx) {
        isDivide = false;
        if (ctx.block() != null) return visit(ctx.block());
        if (ctx.varDecl() != null) return visit(ctx.varDecl());
        if (ctx.assignmentStmt() != null) return visit(ctx.assignmentStmt());
        if (ctx.ifStmt() != null) return visit(ctx.ifStmt());
        if (ctx.whileStmt() != null) return visit(ctx.whileStmt());
        if (ctx.forStmt() != null) return visit(ctx.forStmt());
        if (ctx.breakStmt() != null) return visit(ctx.breakStmt());
        if (ctx.continueStmt() != null) return visit(ctx.continueStmt());
        if (ctx.tryStmt() != null) return visit(ctx.tryStmt());
        if (ctx.switchStmt() != null)     return visit(ctx.switchStmt());
        if (ctx.exprStmt() != null) return visit(ctx.exprStmt());
        if (ctx.printStmt() != null)return visit(ctx.printStmt());
        throw new UnsupportedOperationException("Unsupported statement: " + ctx.getText());
    }


    @Override
    public String visitBlock(HashParser.BlockContext ctx) {
        StringBuilder sb = new StringBuilder();

        for (var st : ctx.statement()) {
            String result = visit(st);
            if (result != null && !result.isEmpty()) {
                sb.append(result);
            }
        }

        return sb.toString();
    }

    @Override
    public String visitAssignmentStmt(HashParser.AssignmentStmtContext ctx) {
        String left = ctx.assignment().lvalue().getText();
        String op = ctx.assignment().assignOp().getText();
        String exprText = ctx.assignment().expr().getText();
        if (op.equals("=") && isSimpleIncDecText(exprText)) {
            String varName = getIncDecVarName(exprText);
            boolean increment = isIncrement(exprText);
            StringBuilder sb = new StringBuilder();
            if (isPrefixIncDec(exprText)) {
                sb.append(incDecUpdate(varName, increment)).append(";\n");
                sb.append(left).append(" = ").append(varName).append(";\n");
            } else {
                sb.append(left).append(" = ").append(varName).append(";\n");
                sb.append(incDecUpdate(varName, increment)).append(";\n");
            }
            return sb.toString();
        }
        visit(ctx.assignment().expr());
        StringBuilder sb = new StringBuilder();
        System.out.println("is divide " + isDivide);
        if (isDivide){
            sb.append("if\n:: (");
            sb.append(division + " == 0").append(") -> \n");
            sb.append("    divByZero = true;\n");
            sb.append(":: else -> \n");
            return sb + indent(visit(ctx.assignment()) + ";\n");
        }
        return visit(ctx.assignment()) + ";\n";
    }

    @Override
    public String visitAssignment(HashParser.AssignmentContext ctx) {
        String left = ctx.lvalue().getText();
        String op = ctx.assignOp().getText();
        String right = visit(ctx.expr());
        switch (op) {
            case "=":
                return left + " = " + right;
            case "+=":
                return left + " = " + left + " + " + right;
            case "-=":
                return left + " = " + left + " - " + right;
            case "*=":
                return left + " = " + left + " * " + right;
            case "/=":
                return left + " = " + left + " / " + right;
            default:
                return "";
        }
    }

    @Override
    public String visitIfStmt(HashParser.IfStmtContext ctx) {
        String cond = visit(ctx.expr());
        StringBuilder sb = new StringBuilder();
        sb.append("if\n");
        sb.append(":: (").append(cond).append(") ->\n");
        sb.append(indent(visit(ctx.block(0))));
        if (ctx.block().size() > 1) {
            sb.append(":: else ->\n");
            sb.append(indent(visit(ctx.block(1))));
        } else {
            sb.append(":: else -> skip;\n");
        }
        sb.append("fi\n");

        return sb.toString();
    }


    @Override
    public String visitWhileStmt(HashParser.WhileStmtContext ctx) {
        String label = "loopStartNo_" + (++loopCounter); //promela don't allow to use . in label name
        continueLabels.push(label);
        String cond = visit(ctx.expr());
        String body = visit(ctx.block());
        continueLabels.pop();
        StringBuilder sb = new StringBuilder();
        sb.append(label).append(":\n");
        sb.append("do\n");
        sb.append(":: (").append(cond).append(") ->\n");
        sb.append(indent(body));
        sb.append(":: else -> break\n");
        sb.append("od\n");
        return sb.toString();
    }

    @Override
    public String visitBreakStmt(HashParser.BreakStmtContext ctx) {
        return "break;\n";
    }

    @Override
    public String visitContinueStmt(HashParser.ContinueStmtContext ctx) {
        if (continueLabels.isEmpty()) {
            return "";
        }
        return "goto " + continueLabels.peek() + ";\n";
    }

    @Override
    public String visitForStmt(HashParser.ForStmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        String updateLabel = "loopUpdate_" + (++loopCounter);
        continueLabels.push(updateLabel);
        // init
        if (ctx.forInit() != null) {
            String init = visit(ctx.forInit());
            if (init != null && !init.isEmpty()) {
                sb.append(init);
            }
        }
        String condition = (ctx.expr() != null) ? visit(ctx.expr()) : "true";
        String body = visit(ctx.block());
        sb.append("do\n");
        sb.append(":: (").append(condition).append(") ->\n");
        // body
        sb.append(indent(body));
        // update label
        sb.append(updateLabel).append(":\n");
        // update
        if (ctx.forUpdate() != null) {
            String update = visit(ctx.forUpdate());
            if (update != null && !update.isEmpty()) {
                sb.append(indent(update));
            } else {
                sb.append("    skip;\n");
            }
        } else {
            sb.append("    skip;\n");
        }
        sb.append(":: else -> break\n");
        sb.append("od\n");
        continueLabels.pop();
        return sb.toString();
    }

    @Override
    public String visitForInit(HashParser.ForInitContext ctx) {
        String result;

        if (ctx.varDeclNoSemi() != null) {
            result = visit(ctx.varDeclNoSemi());
        } else if (ctx.assignment() != null) {
            result = visit(ctx.assignment());
        } else {
            result = visit(ctx.incDecExpr());
        }

        if (result == null || result.isEmpty()) {
            return "";
        }

        return result + ";\n";
    }

    @Override
    public String visitForUpdate(HashParser.ForUpdateContext ctx) {
        if (ctx.assignment() != null)
            return visit(ctx.assignment()) + ";\n";
        return visit(ctx.incDecExpr()) + ";\n";
    }

    @Override
    public String visitVarDeclNoSemi(HashParser.VarDeclNoSemiContext ctx) {
        String type = ctx.typeName().getText();
        String name = ctx.ID().getText();
        String promelaType = mapType(type);
        if (promelaType.isEmpty()) {
            return "";
        }
        if (ctx.expr() != null) {
            String value = visit(ctx.expr());
            return promelaType + " " + name + " = " + value;
        } else {
            return promelaType + " " + name;
        }
    }

    @Override
    public String visitIncDecExpr(HashParser.IncDecExprContext ctx) {
        String result = ctx.lvalue().getText();

        if (ctx.postfixIncDec() != null)
            if (ctx.postfixIncDec().PLUS_PLUS() != null) {
                result += " = " + result + " + 1";
            } else {
                result += " = " + result + " - 1";
            }
        else {
            if (ctx.PLUS_PLUS() != null) {
                result += " = " + result + " + 1";
            } else {
                result += " = " + result + " - 1";
            }
        }
        return result;
    }

    //try catch stmt
    public String visitTryStmt(HashParser.TryStmtContext ctx) {
        StringBuilder sb = new StringBuilder();

        String errFlag = "errFlag_" + (++exceptionCounter);//or can use exception name in catch
        sb.append("bool ").append(errFlag).append(" = false;\n");
        sb.append(visit(ctx.block()));

        sb.append("if\n");
        sb.append(":: ( ").append(errFlag).append(" ) ->\n");
        sb.append(indent(visit(ctx.catchClause(0))));//just one exception
        sb.append(":: else -> skip\n");
        sb.append("fi\n");

        return sb.toString();
    }

    @Override
    public String visitCatchClause(HashParser.CatchClauseContext ctx) {
        return visit(ctx.block());
    }
    @Override
    public String visitPrintStmt(HashParser.PrintStmtContext ctx) {
        String value = visit(ctx.expr());
        return "printf(\"%d\\n\", " + value + ");\n";
    }
    @Override
    public String visitSwitchStmt(HashParser.SwitchStmtContext ctx) {
        String switchExpr = visit(ctx.expr());
        StringBuilder sb = new StringBuilder();
        sb.append("if\n");
        for (var c : ctx.caseBlock()) {
            String caseValue = visit(c.expr());
            sb.append(":: (")
                    .append(switchExpr)
                    .append(" == ")
                    .append(caseValue)
                    .append(") ->\n");
            sb.append(indent(visit(c.block())));
        }
        if (ctx.defaultBlock() != null) {
            sb.append(":: else ->\n");
            sb.append(indent(visit(ctx.defaultBlock().block())));
        } else {
            sb.append(":: else -> skip;\n");
        }
        sb.append("fi\n");
        return sb.toString();
    }


    //helper
    private String indent(String code) {//this has so many usage in block translation so here is the function :>
        StringBuilder out = new StringBuilder();

        for (String line : code.split("\n")) {
            if (!line.isBlank()) {
                out.append("    ").append(line);
            }
            out.append("\n");
        }

        return out.toString();
    }

    private boolean isTopLevelVarDecl(HashParser.TopLevelDeclContext ctx) {
        return ctx.statement() != null && ctx.statement().varDecl() != null;
    }

    private boolean isSimpleIncDecText(String text) {
        text = text.replaceAll("\\s+", "");

        return text.matches("[a-z][a-zA-Z0-9_]*\\+\\+")
                || text.matches("[a-z][a-zA-Z0-9_]*--")
                || text.matches("\\+\\+[a-z][a-zA-Z0-9_]*")
                || text.matches("--[a-z][a-zA-Z0-9_]*");
    }

    private String getIncDecVarName(String text) {
        text = text.replaceAll("\\s+", "");

        if (text.endsWith("++") || text.endsWith("--")) {
            return text.substring(0, text.length() - 2);
        }

        if (text.startsWith("++") || text.startsWith("--")) {
            return text.substring(2);
        }

        return text;
    }

    private boolean isIncrement(String text) {
        return text.contains("++");
    }

    private boolean isPrefixIncDec(String text) {
        text = text.replaceAll("\\s+", "");
        return text.startsWith("++") || text.startsWith("--");
    }

    private String incDecUpdate(String varName, boolean increment) {
        if (increment) {
            return varName + " = " + varName + " + 1";
        } else {
            return varName + " = " + varName + " - 1";
        }
    }
    private String expandPower(String base, int exponent) {
        if (exponent == 0) {
            return "1";
        }

        if (exponent == 1) {
            return base;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < exponent; i++) {
            if (i > 0) {
                sb.append(" * ");
            }
            sb.append("(").append(base).append(")");
        }
        sb.append(")");
        return sb.toString();
    }
}