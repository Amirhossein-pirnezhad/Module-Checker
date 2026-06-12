// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HashParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HashVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HashParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HashParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#packageDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDecl(HashParser.PackageDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(HashParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(HashParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#namePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamePart(HashParser.NamePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDecl(HashParser.TopLevelDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(HashParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(HashParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(HashParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(HashParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#varDeclNoSemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclNoSemi(HashParser.VarDeclNoSemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(HashParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#constructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecl(HashParser.ConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(HashParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(HashParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(HashParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(HashParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HashParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HashParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(HashParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(HashParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(HashParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOp(HashParser.AssignOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(HashParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(HashParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(HashParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(HashParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(HashParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(HashParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(HashParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(HashParser.DefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#tryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStmt(HashParser.TryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(HashParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(HashParser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(HashParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(HashParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(HashParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(HashParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(HashParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#throwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStmt(HashParser.ThrowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#throwTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowTarget(HashParser.ThrowTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(HashParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(HashParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#exceptionCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionCreation(HashParser.ExceptionCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#objectCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreation(HashParser.ObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(HashParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HashParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(HashParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(HashParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(HashParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(HashParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(HashParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(HashParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#powerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(HashParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(HashParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(HashParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#postfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixPart(HashParser.PostfixPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#postfixIncDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixIncDec(HashParser.PostfixIncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#incDecExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpr(HashParser.IncDecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(HashParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HashParser.LiteralContext ctx);
}