// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HashParser}.
 */
public interface HashListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HashParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HashParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HashParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void enterPackageDecl(HashParser.PackageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void exitPackageDecl(HashParser.PackageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(HashParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(HashParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(HashParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(HashParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#namePart}.
	 * @param ctx the parse tree
	 */
	void enterNamePart(HashParser.NamePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#namePart}.
	 * @param ctx the parse tree
	 */
	void exitNamePart(HashParser.NamePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDecl(HashParser.TopLevelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDecl(HashParser.TopLevelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(HashParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(HashParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(HashParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(HashParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(HashParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(HashParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(HashParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(HashParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#varDeclNoSemi}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclNoSemi(HashParser.VarDeclNoSemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#varDeclNoSemi}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclNoSemi(HashParser.VarDeclNoSemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(HashParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(HashParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(HashParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(HashParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(HashParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(HashParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(HashParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(HashParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(HashParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(HashParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(HashParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(HashParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HashParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HashParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HashParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HashParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(HashParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(HashParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HashParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HashParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(HashParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(HashParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(HashParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(HashParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(HashParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(HashParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(HashParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(HashParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(HashParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(HashParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(HashParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(HashParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(HashParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(HashParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(HashParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(HashParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(HashParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(HashParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBlock(HashParser.DefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBlock(HashParser.DefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(HashParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(HashParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(HashParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(HashParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(HashParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(HashParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(HashParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(HashParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(HashParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(HashParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(HashParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(HashParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(HashParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(HashParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(HashParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(HashParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#throwStmt}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmt(HashParser.ThrowStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#throwStmt}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmt(HashParser.ThrowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#throwTarget}.
	 * @param ctx the parse tree
	 */
	void enterThrowTarget(HashParser.ThrowTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#throwTarget}.
	 * @param ctx the parse tree
	 */
	void exitThrowTarget(HashParser.ThrowTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(HashParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(HashParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(HashParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(HashParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#exceptionCreation}.
	 * @param ctx the parse tree
	 */
	void enterExceptionCreation(HashParser.ExceptionCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#exceptionCreation}.
	 * @param ctx the parse tree
	 */
	void exitExceptionCreation(HashParser.ExceptionCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreation(HashParser.ObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreation(HashParser.ObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(HashParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(HashParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HashParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HashParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(HashParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(HashParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(HashParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(HashParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(HashParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(HashParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(HashParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(HashParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(HashParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(HashParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(HashParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(HashParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(HashParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(HashParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(HashParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(HashParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(HashParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(HashParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void enterPostfixPart(HashParser.PostfixPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void exitPostfixPart(HashParser.PostfixPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#postfixIncDec}.
	 * @param ctx the parse tree
	 */
	void enterPostfixIncDec(HashParser.PostfixIncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#postfixIncDec}.
	 * @param ctx the parse tree
	 */
	void exitPostfixIncDec(HashParser.PostfixIncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#incDecExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncDecExpr(HashParser.IncDecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#incDecExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncDecExpr(HashParser.IncDecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(HashParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(HashParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HashParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HashParser.LiteralContext ctx);
}