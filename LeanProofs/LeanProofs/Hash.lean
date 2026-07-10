abbrev Var := String
abbrev State := Var -> Int

/-
  Expressions of a small Hash subset.
  We model numbers, variables, addition, multiplication,
  less-than comparison, and equality comparison.
-/
inductive Expr where
  | num : Int -> Expr
  | var : Var -> Expr
  | add : Expr -> Expr -> Expr
  | mul : Expr -> Expr -> Expr
  | lt : Expr -> Expr -> Expr
  | equal : Expr -> Expr -> Expr

/-
  Statements of a small Hash subset.
  This is enough for the operational semantics part:
  assignment, sequence, if/else, and while.
-/
inductive Stmt where
  | assign : Var -> Expr -> Stmt
  | seq : Stmt -> Stmt -> Stmt
  | ifElse : Expr -> Stmt -> Stmt -> Stmt
  | while : Expr -> Stmt -> Stmt

/-
  Expression evaluation.
  Boolean values are represented as integers:
    true  = 1
    false = 0
-/
def evalExpr (e : Expr) (s : State) : Int :=
  match e with
  | Expr.num n => n
  | Expr.var x => s x
  | Expr.add e1 e2 => evalExpr e1 s + evalExpr e2 s
  | Expr.mul e1 e2 => evalExpr e1 s * evalExpr e2 s
  | Expr.lt e1 e2 =>
      if evalExpr e1 s < evalExpr e2 s then 1 else 0
  | Expr.equal e1 e2 =>
      if evalExpr e1 s = evalExpr e2 s then 1 else 0

/-
  Updating a state:
  update s x v is the same state as s,
  except that x now has value v.
-/
def update (s : State) (x : Var) (v : Int) : State :=
  fun y => if y = x then v else s y

/-
  Big-step operational semantics.

  BigStep S s sFinal means:
  statement S starts in state s and finishes in state sFinal.
-/
inductive BigStep : Stmt -> State -> State -> Prop where

  | assign {x : Var} {e : Expr} {s : State} :
      BigStep
        (Stmt.assign x e)
        s
        (update s x (evalExpr e s))

  | seq {S1 S2 : Stmt} {s sMid sFinal : State} :
      BigStep S1 s sMid ->
      BigStep S2 sMid sFinal ->
      BigStep (Stmt.seq S1 S2) s sFinal

  | ifTrue {b : Expr} {S1 S2 : Stmt} {s sFinal : State} :
      evalExpr b s ≠ 0 ->
      BigStep S1 s sFinal ->
      BigStep (Stmt.ifElse b S1 S2) s sFinal

  | ifFalse {b : Expr} {S1 S2 : Stmt} {s sFinal : State} :
      evalExpr b s = 0 ->
      BigStep S2 s sFinal ->
      BigStep (Stmt.ifElse b S1 S2) s sFinal

  | whileFalse {b : Expr} {body : Stmt} {s : State} :
      evalExpr b s = 0 ->
      BigStep (Stmt.while b body) s s

  | whileTrue {b : Expr} {body : Stmt} {s sMid sFinal : State} :
      evalExpr b s ≠ 0 ->
      BigStep body s sMid ->
      BigStep (Stmt.while b body) sMid sFinal ->
      BigStep (Stmt.while b body) s sFinal

/-
  Loop Invariant Theorem.

  Let P be a predicate over states.

  If:
    1. P holds before the loop starts.
    2. Whenever the loop condition is true,
       executing the body preserves P.

  Then:
    P holds after the whole while loop finishes.
-/
theorem loopInvariant
    {b : Expr}
    {body : Stmt}
    {P : State -> Prop}
    (bodyPreservesInvariant :
      ∀ s s1,
        P s ->
        evalExpr b s ≠ 0 ->
        BigStep body s s1 ->
        P s1)
    :
    ∀ s sFinal,
      P s ->
      BigStep (Stmt.while b body) s sFinal ->
      P sFinal := by

  intro s sFinal hP hRun

  have aux :
      ∀ {S : Stmt} {s sFinal : State},
        BigStep S s sFinal ->
        S = Stmt.while b body ->
        P s ->
        P sFinal := by

    intro S s0 s1 h

    induction h with

    | assign =>
        intro hEq
        cases hEq

    | seq hFirst hSecond ihFirst ihSecond =>
        intro hEq
        cases hEq

    | ifTrue hCond hThen ih =>
        intro hEq
        cases hEq

    | ifFalse hCond hElse ih =>
        intro hEq
        cases hEq

    | whileFalse hCond =>
        intro hEq hInv
        cases hEq
        exact hInv

    | whileTrue hCond hBody hRest ihBody ihRest =>
        intro hEq hInv
        cases hEq

        have hInvAfterBody : P _ :=
          bodyPreservesInvariant _ _ hInv hCond hBody

        exact ihRest rfl hInvAfterBody

  exact aux hRun rfl hP

  #check BigStep
  #check loopInvariant