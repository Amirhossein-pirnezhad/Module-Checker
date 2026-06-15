import org.antlr.v4.tool.Grammar;

public class HashToPromela extends HashBaseVisitor<String> {

    @Override
    public String visitProgram(HashParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append("active proctype main() {\n");

        for(var decl : ctx.topLevelDecl()) {
            String result = visit(decl);
            if (result != null && !result.isEmpty()) {
                sb.append("    ").append(result);
            }
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
    public String visitVarDecl(HashParser.VarDeclContext varDecl){
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
            result += ctx.postfixIncDec().getText();

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
        switch(hashType) {
            case "adad": return "int";
            case "boole": return "bool";
            case "matn": return "string";
            case "harf": return "char";
            case "ashari": return "float";
            default: return "int";
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
}
