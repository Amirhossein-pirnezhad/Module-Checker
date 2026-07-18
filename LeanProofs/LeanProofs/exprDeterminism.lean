import LeanProofs.Basic

inductive EvalExpr : Expr -> State -> Int -> Prop
  | num : forall n s, EvalExpr (Expr.num n) s n
  | var : forall x s, EvalExpr (Expr.var x) s (s x)
  | add : forall e1 e2 s v1 v2,
      EvalExpr e1 s v1 -> EvalExpr e2 s v2 ->
      EvalExpr (Expr.add e1 e2) s (v1 + v2)
  | lt : forall e1 e2 s v1 v2,
      EvalExpr e1 s v1 -> EvalExpr e2 s v2 ->
      EvalExpr (Expr.lt e1 e2) s (if v1 < v2 then 1 else 0)

/-
  Expression Determinism Theorem.

  If an expression evaluates to two values under the same state,
  those values must be equal.

  Since evalExpr is a total function, we re-define expression evaluation
  as an inductive relation (EvalExpr) and prove that this relation is deterministic.
-/
theorem exprDeterminism : forall e s v1 v2,
    EvalExpr e s v1 -> EvalExpr e s v2 -> v1 = v2 := by

  intro e s v1 v2 h1 h2

  induction h1 generalizing v2 with

  | num n s =>
      cases h2
      rfl

  | var x s =>
      cases h2
      rfl

  | add e1 e2 s va vb _ _ iha ihb =>
      cases h2 with
      | add _ _ _ _ _ h2a h2b =>
          have ea := iha _ h2a
          have eb := ihb _ h2b
          rw [ea, eb]

  | lt e1 e2 s va vb _ _ iha ihb =>
      cases h2 with
      | lt _ _ _ _ _ h2a h2b =>
          have ea := iha _ h2a
          have eb := ihb _ h2b
          rw [ea, eb]

#check exprDeterminism