import LeanProofs.Basic

def Expr.freeVars : Expr -> List Var
  | Expr.num _     => []
  | Expr.var x     => [x]
  | Expr.add e1 e2 => e1.freeVars ++ e2.freeVars
  | Expr.lt  e1 e2 => e1.freeVars ++ e2.freeVars

def Stmt.freeVars : Stmt -> List Var
  | Stmt.assign x e      => x :: e.freeVars
  | Stmt.seq S1 S2       => S1.freeVars ++ S2.freeVars
  | Stmt.ifElse b S1 S2  => b.freeVars ++ S1.freeVars ++ S2.freeVars
  | Stmt.while b body    => b.freeVars ++ body.freeVars

def Agree (vs : List Var) (s1 s2 : State) : Prop :=
  forall x, List.Mem x vs -> s1 x = s2 x

theorem agree_subset {vs vs' : List Var} {s1 s2 : State}
    (hsub : forall x, List.Mem x vs' -> List.Mem x vs) (h : Agree vs s1 s2) : Agree vs' s1 s2 :=
  fun x hx => h x (hsub x hx)

theorem exprCoincidence {e : Expr} {s1 s2 : State} :
    Agree e.freeVars s1 s2 -> evalExpr e s1 = evalExpr e s2 := by
  induction e with
  | num n =>
      intro _
      rfl
  | var x =>
      intro h
      exact h x (List.mem_cons.mpr (Or.inl rfl))
  | add e1 e2 ih1 ih2 =>
      intro h
      have h1 : Agree e1.freeVars s1 s2 :=
        agree_subset (fun y hy => List.mem_append.mpr (Or.inl hy)) h
      have h2 : Agree e2.freeVars s1 s2 :=
        agree_subset (fun y hy => List.mem_append.mpr (Or.inr hy)) h
      show evalExpr e1 s1 + evalExpr e2 s1 = evalExpr e1 s2 + evalExpr e2 s2
      rw [ih1 h1, ih2 h2]
  | lt e1 e2 ih1 ih2 =>
      intro h
      have h1 : Agree e1.freeVars s1 s2 :=
        agree_subset (fun y hy => List.mem_append.mpr (Or.inl hy)) h
      have h2 : Agree e2.freeVars s1 s2 :=
        agree_subset (fun y hy => List.mem_append.mpr (Or.inr hy)) h
      show (if evalExpr e1 s1 < evalExpr e2 s1 then (1 : Int) else 0)
         = (if evalExpr e1 s2 < evalExpr e2 s2 then (1 : Int) else 0)
      rw [ih1 h1, ih2 h2]

theorem coincidence_aux {S : Stmt} {s1 s1' : State}
    (hstep : BigStep S s1 s1') :
    forall (vs : List Var) (s2 : State),
      (forall x, List.Mem x S.freeVars -> List.Mem x vs) ->
      Agree vs s1 s2 ->
      Exists (fun s2' => BigStep S s2 s2' ∧ Agree vs s1' s2') := by
  induction hstep with
  | assign =>
      rename_i x e s
      intro vs s2 hsub hagree
      have hx : List.Mem x vs := hsub x (List.mem_cons.mpr (Or.inl rfl))
      have he : forall y, List.Mem y e.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_cons.mpr (Or.inr hy))
      have hagree_e : Agree e.freeVars s s2 := agree_subset he hagree
      have hval : evalExpr e s = evalExpr e s2 := exprCoincidence hagree_e
      refine Exists.intro (update s2 x (evalExpr e s2)) (And.intro BigStep.assign ?_)
      intro y hy
      by_cases hxy : y = x
      · subst hxy
        simp [update, hval]
      · simp only [update, hxy]
        exact hagree y hy

  | seq hstep1 hstep2 ih1 ih2 =>
      rename_i S1 S2 s sMid sFinal
      intro vs s2 hsub hagree
      have hsub1 : forall y, List.Mem y S1.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inl hy))
      have hsub2 : forall y, List.Mem y S2.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inr hy))
      obtain ⟨sMid', hstepMid, hagreeMid⟩ := ih1 vs s2 hsub1 hagree
      obtain ⟨s2', hstepFinal, hagreeFinal⟩ := ih2 vs sMid' hsub2 hagreeMid
      exact Exists.intro s2' (And.intro (BigStep.seq hstepMid hstepFinal) hagreeFinal)

  | ifTrue hb hstep ih =>
      rename_i b S1 S2 s sFinal
      intro vs s2 hsub hagree
      have hsubb : forall y, List.Mem y b.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inl (List.mem_append.mpr (Or.inl hy))))
      have hsub1 : forall y, List.Mem y S1.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inl (List.mem_append.mpr (Or.inr hy))))
      have hagreeb : Agree b.freeVars s s2 := agree_subset hsubb hagree
      have hbval : evalExpr b s = evalExpr b s2 := exprCoincidence hagreeb
      have hb2 : evalExpr b s2 ≠ 0 := by rw [← hbval]; exact hb
      obtain ⟨s2', hstep2, hagree2⟩ := ih vs s2 hsub1 hagree
      exact Exists.intro s2' (And.intro (BigStep.ifTrue hb2 hstep2) hagree2)

  | ifFalse hb hstep ih =>
      rename_i b S1 S2 s sFinal
      intro vs s2 hsub hagree
      have hsubb : forall y, List.Mem y b.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inl (List.mem_append.mpr (Or.inl hy))))
      have hsub2 : forall y, List.Mem y S2.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inr hy))
      have hagreeb : Agree b.freeVars s s2 := agree_subset hsubb hagree
      have hbval : evalExpr b s = evalExpr b s2 := exprCoincidence hagreeb
      have hb2 : evalExpr b s2 = 0 := by rw [← hbval]; exact hb
      obtain ⟨s2', hstep2, hagree2⟩ := ih vs s2 hsub2 hagree
      exact Exists.intro s2' (And.intro (BigStep.ifFalse hb2 hstep2) hagree2)

  | whileFalse hb =>
      rename_i b body s
      intro vs s2 hsub hagree
      have hsubb : forall y, List.Mem y b.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inl hy))
      have hagreeb : Agree b.freeVars s s2 := agree_subset hsubb hagree
      have hbval : evalExpr b s = evalExpr b s2 := exprCoincidence hagreeb
      have hb2 : evalExpr b s2 = 0 := by rw [← hbval]; exact hb
      exact Exists.intro s2 (And.intro (BigStep.whileFalse hb2) hagree)

  | whileTrue hb hstep1 hstep2 ih1 ih2 =>
      rename_i b body s sMid sFinal
      intro vs s2 hsub hagree
      have hsubb : forall y, List.Mem y b.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inl hy))
      have hsubbody : forall y, List.Mem y body.freeVars -> List.Mem y vs :=
        fun y hy => hsub y (List.mem_append.mpr (Or.inr hy))
      have hagreeb : Agree b.freeVars s s2 := agree_subset hsubb hagree
      have hbval : evalExpr b s = evalExpr b s2 := exprCoincidence hagreeb
      have hb2 : evalExpr b s2 ≠ 0 := by rw [← hbval]; exact hb
      obtain ⟨sMid', hstepBody, hagreeMid⟩ := ih1 vs s2 hsubbody hagree
      obtain ⟨s2', hstepWhile, hagreeFinal⟩ := ih2 vs sMid' hsub hagreeMid
      exact Exists.intro s2' (And.intro (BigStep.whileTrue hb2 hstepBody hstepWhile) hagreeFinal)

theorem stateEquivalence {S : Stmt} {s1 s2 s1' : State}
    (hagree : Agree S.freeVars s1 s2)
    (hstep : BigStep S s1 s1') :
    Exists (fun s2' => BigStep S s2 s2' ∧ Agree S.freeVars s1' s2') :=
  coincidence_aux hstep S.freeVars s2 (fun _ hy => hy) hagree

#check stateEquivalence