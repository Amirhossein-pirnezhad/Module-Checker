import org.antlr.v4.tool.Grammar;

import java.util.ArrayDeque;
import java.util.Deque;

public class HashToPromela extends HashBaseVisitor<String> {
    private int loopCounter = 0;
    private final Deque<String> continueLabels = new ArrayDeque<>();

    @Override
    public String visitProgram(HashParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append("active proctype main() {\n");

        for (var decl : ctx.topLevelDecl()) {
            String result = visit(decl);
            sb.append(indent(result));
        }

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

        if (varDecl.expr() != null) {
            String value = visit(varDecl.expr());//visit expression
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

            sb.append(" ");
            sb.append(operation);
            sb.append(" ");
            sb.append(visit(ctx.powerExpr(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitPowerExpr(HashParser.PowerExprContext ctx) {
        String left = visit(ctx.unaryExpr());

        if (ctx.powerExpr() == null)
            return left;

        return "pow(" + left + ", " + visit(ctx.powerExpr()) + ")";
        //for this I can't find the actual operation in promela and I just trust gpt :))
    }

    @Override
    public String visitUnaryExpr(HashParser.UnaryExprContext ctx) {
        if (ctx.postfixExpr() != null)
            return visit(ctx.postfixExpr());

        String op = ctx.getChild(0).getText();
        return op + visit(ctx.unaryExpr());
    }

    @Override
    public String visitPostfixExpr(HashParser.PostfixExprContext ctx) {
        String result = visit(ctx.primaryExpr());

        if (ctx.postfixIncDec() != null)//ignore the in declaration
            if (ctx.postfixIncDec() != null) {
                if (ctx.postfixIncDec().PLUS_PLUS() != null) {
                    result += " = " + result + " + 1";
                } else {
                    result += " = " + result + " - 1";
                }
                result = "(" + result + ")";
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

    private String mapType(String hashType) {
        switch (hashType) {
            case "adad":
                return "int";
            case "boole":
                return "bool";
            case "matn":
                return "string";
            case "harf":
                return "char";
            case "ashari":
                return "float";
            default:
                return "int";
        }
    }

    @Override
    public String visitStatement(HashParser.StatementContext ctx) {
        if (ctx.block() != null) return visit(ctx.block());
        if (ctx.varDecl() != null) return visit(ctx.varDecl());
        if (ctx.assignmentStmt() != null) return visit(ctx.assignmentStmt());
        if (ctx.ifStmt() != null) return visit(ctx.ifStmt());
        if (ctx.whileStmt() != null) return visit(ctx.whileStmt());
        if (ctx.forStmt() != null) return visit(ctx.forStmt());
        if (ctx.breakStmt() != null) return visit(ctx.breakStmt());
        if (ctx.continueStmt() != null) return visit(ctx.continueStmt());
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

        String startLabel = "loopStart_" + (++loopCounter);

        continueLabels.push(startLabel);

        if (ctx.forInit() != null) {
            sb.append(visit(ctx.forInit()));
        }

        String condition = (ctx.expr() != null) ? visit(ctx.expr()) : "true";
        String body = visit(ctx.block());
        sb.append(startLabel).append(":\n").append("do\n").
                append(":: (").append(condition).append(") ->\n");

        sb.append(indent(body));

        if (ctx.forUpdate() != null) {
            sb.append(visit(ctx.forUpdate()));
        }

        sb.append("\n").append(":: else -> break\n").append("od\n");

        continueLabels.pop();
        return sb.toString();
    }

    @Override
    public String visitForInit(HashParser.ForInitContext ctx) {
        if (ctx.varDeclNoSemi() != null)
            return visit(ctx.varDeclNoSemi()) + ";\n";

        if (ctx.assignment() != null)
            return visit(ctx.assignment()) + ";\n";

        return visit(ctx.incDecExpr()) + ";\n";
    }

    @Override
    public String visitForUpdate(HashParser.ForUpdateContext ctx) {
        if (ctx.assignment() != null)
            return visit(ctx.assignment()) + ";\n";
        return visit(ctx.incDecExpr()) + ";\n";
    }

    @Override
    public String visitVarDeclNoSemi(HashParser.VarDeclNoSemiContext ctx){
        String type = ctx.typeName().getText();
        String name = ctx.ID().getText();

        String promelaType = mapType(type);

        if (ctx.expr() != null) {
            String value = visit(ctx.expr());//visit expression
            return promelaType + " " + name + " = " + value;
        } else {
            return promelaType + " " + name;
        }
    }

    @Override
    public String visitIncDecExpr(HashParser.IncDecExprContext ctx){
        String result = ctx.lvalue().getText();

        if (ctx.postfixIncDec() != null)
            if (ctx.postfixIncDec().PLUS_PLUS() != null){
                result += " = " + result + " + 1";
            }else{
                result += " = " + result + " - 1";
            }
        else{
            if (ctx.PLUS_PLUS() != null){
                result += " = " + result + " + 1";
            }
            else{
                result += " = " + result + " - 1";
            }
        }
        return result;
    }
}


