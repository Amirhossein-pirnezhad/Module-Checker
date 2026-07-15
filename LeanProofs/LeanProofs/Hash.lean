import LeanProofs.Basic
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
     forall s s1,
        P s ->
        evalExpr b s ≠ 0 ->
        BigStep body s s1 ->
        P s1)
    :
    forall s sFinal,
      P s ->
      BigStep (Stmt.while b body) s sFinal ->
      P sFinal := by

  intro s sFinal hP hRun

  have aux :
      forall {S : Stmt} {s sFinal : State},
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