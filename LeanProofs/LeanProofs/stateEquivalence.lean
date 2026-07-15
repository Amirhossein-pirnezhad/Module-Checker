import LeanProofs.Basic

-- Option 3: State Equivalence (Coincidence Lemma)

-- Free variables of an expression.
def freeVarsExpr (e : Expr) (x : Var) : Prop :=
  match e with
  | Expr.num _ => False
  | Expr.var y => x = y
  | Expr.add e1 e2 => freeVarsExpr e1 x ∨ freeVarsExpr e2 x
  | Expr.lt e1 e2 => freeVarsExpr e1 x ∨ freeVarsExpr e2 x

-- Free variables of a statement.
def freeVars (S : Stmt) (x : Var) : Prop :=
  match S with
  | Stmt.assign y e => x = y ∨ freeVarsExpr e x
  | Stmt.seq S1 S2 => freeVars S1 x ∨ freeVars S2 x
  | Stmt.ifElse b S1 S2 => freeVarsExpr b x ∨ freeVars S1 x ∨ freeVars S2 x
  | Stmt.while b S => freeVarsExpr b x ∨ freeVars S x

-- Helper lemma: the value of an expression only depends on its free variables.
theorem exprAgree : forall e s1 s2,
    (forall x, freeVarsExpr e x -> s1 x = s2 x) ->
    evalExpr e s1 = evalExpr e s2 := by
  intro e
  induction e with
  | num n => intro s1 s2 _; rfl
  | var x => intro s1 s2 h; exact h x rfl
  | add e1 e2 ih1 ih2 =>
      intro s1 s2 h
      have h1 : forall x, freeVarsExpr e1 x -> s1 x = s2 x :=
        fun x hx => h x (Or.inl hx)
      have h2 : forall x, freeVarsExpr e2 x -> s1 x = s2 x :=
        fun x hx => h x (Or.inr hx)
      simp [evalExpr, ih1 s1 s2 h1, ih2 s1 s2 h2]
  | lt e1 e2 ih1 ih2 =>
      intro s1 s2 h
      have h1 : forall x, freeVarsExpr e1 x -> s1 x = s2 x :=
        fun x hx => h x (Or.inl hx)
      have h2 : forall x, freeVarsExpr e2 x -> s1 x = s2 x :=
        fun x hx => h x (Or.inr hx)
      simp [evalExpr, ih1 s1 s2 h1, ih2 s1 s2 h2]

-- Helper lemma: any variable NOT in freeVars(S) is left unchanged by executing S.
theorem unassignedUnchanged : forall S s s' x,
    BigStep S s s' -> ¬ freeVars S x -> s x = s' x := by
  intro S s s' x hbig
  induction hbig with
  | assign =>
    intro hx
    unfold update
    rename_i y e s_curr
    by_cases hxy : x = y
    · exact absurd (Or.inl hxy) hx
    · simp [hxy]
  | seq hb1 hb2 ih1 ih2 =>
    intro hx
    rename_i S1 S2 s_start s_mid s_end
    have hx1 : ¬ freeVars S1 x := fun h => hx (Or.inl h)
    have hx2 : ¬ freeVars S2 x := fun h => hx (Or.inr h)
    have e1 := ih1 hx1
    have e2 := ih2 hx2
    rw [e1, e2]
  | ifTrue hb hbody ih =>
    intro hx
    rename_i b S1 S2 s_curr s_end
    have hx1 : ¬ freeVars S1 x := fun h => hx (Or.inr (Or.inl h))
    exact ih hx1
  | ifFalse hb hbody ih =>
    intro hx
    rename_i b S1 S2 s_curr s_end
    have hx2 : ¬ freeVars S2 x := fun h => hx (Or.inr (Or.inr h))
    exact ih hx2
  | whileFalse hb =>
    intro _
    rfl
  | whileTrue hb hbody hrest ih1 ih2 =>
    intro hx
    rename_i b body s_start s_mid s_end
    have hxS : ¬ freeVars body x := fun h => hx (Or.inr h)
    have e1 := ih1 hxS
    have e2 := ih2 hx
    rw [e1, e2]

-- Main theorem
theorem stateEquivalence : forall S s1 s2 s1',
    (forall x, freeVars S x -> s1 x = s2 x) ->
    BigStep S s1 s1' ->
    exists s2', BigStep S s2 s2' ∧ (forall x, freeVars S x -> s1' x = s2' x) := by
  intro S s1 s2 s1' hagree hbig
  induction hbig generalizing s2 with
  | assign =>
      rename_i x e s_curr
      -- s2 and hagree are already introduced by induction generalizing
      rename_i s2_inst hagree_local
      refine ⟨update s2_inst x (evalExpr e s2_inst), BigStep.assign, ?_⟩
      have he : evalExpr e s_curr = evalExpr e s2_inst :=
        exprAgree e s_curr s2_inst (fun y hy => hagree_local y (Or.inr hy))
      intro y hy
      unfold update
      by_cases hxy : y = x
      · subst hxy; simp [he]
      · simp [hxy]; exact hagree_local y hy
  | seq hb1 hb2 ih1 ih2 =>
      rename_i S1 S2 s_start s_mid s_end
      rename_i s2_inst hagree_seq
      have hagree1 : forall x, freeVars S1 x -> s_start x = s2_inst x :=
        fun x hx => hagree_seq x (Or.inl hx)
      obtain ⟨s2mid, hb2mid, hagreemid⟩ := ih1 s2_inst hagree1
      have hagree2 : forall x, freeVars S2 x -> s_mid x = s2mid x := by
        intro x hx2
        by_cases hx1 : freeVars S1 x
        · exact hagreemid x hx1
        · have u1 := unassignedUnchanged S1 s_start s_mid x hb1 hx1
          have u2 := unassignedUnchanged S1 s2_inst s2mid x hb2mid hx1
          have := hagree_seq x (Or.inr hx2)
          rw [<- u1, <- u2]
          exact this
      obtain ⟨s2', hb2', hagree'⟩ := ih2 s2mid hagree2
      refine ⟨s2', BigStep.seq hb2mid hb2', ?_⟩
      intro x hx
      exact hagree' x (Or.inr hx)
  | ifTrue hb hbody ih =>
      rename_i b S1 S2 s_curr s_end
      rename_i s2_inst hagree_if
      have hbEq : evalExpr b s2_inst ≠ 0 := by
        have hae := exprAgree b s_curr s2_inst (fun x hx => hagree_if x (Or.inl hx))
        rw [<- hae]; exact hb
      have hagree1 : forall x, freeVars S1 x -> s_curr x = s2_inst x :=
        fun x hx => hagree_if x (Or.inr (Or.inl hx))
      obtain ⟨s2', hb2', hagree'⟩ := ih s2_inst hagree1
      exact ⟨s2', BigStep.ifTrue hbEq hb2',
        fun x hx => hagree' x (Or.inr (Or.inl hx))⟩
  | ifFalse hb hbody ih =>
      rename_i b S1 S2 s_curr s_end
      rename_i s2_inst hagree_if
      have hbEq : evalExpr b s2_inst = 0 := by
        have hae := exprAgree b s_curr s2_inst (fun x hx => hagree_if x (Or.inl hx))
        rw [<- hae]; exact hb
      have hagree2 : forall x, freeVars S2 x -> s_curr x = s2_inst x :=
        fun x hx => hagree_if x (Or.inr (Or.inr hx))
      obtain ⟨s2', hb2', hagree'⟩ := ih s2_inst hagree2
      exact ⟨s2', BigStep.ifFalse hbEq hb2',
        fun x hx => hagree' x (Or.inr (Or.inr hx))⟩
  | whileFalse hb =>
      rename_i b body s_curr
      rename_i s2_inst hagree_w
      have hbEq : evalExpr b s2_inst = 0 := by
        have hae := exprAgree b s_curr s2_inst (fun x hx => hagree_w x (Or.inl hx))
        rw [<- hae]; exact hb
      exact ⟨s2_inst, BigStep.whileFalse hbEq, hagree_w⟩
  | whileTrue hb hbody hrest ih1 ih2 =>
      rename_i b body s_start s_mid s_end
      rename_i s2_inst hagree_w
      have hbEq : evalExpr b s2_inst ≠ 0 := by
        have hae := exprAgree b s_start s2_inst (fun x hx => hagree_w x (Or.inl hx))
        rw [<- hae]; exact hb
      have hagreeS : forall x, freeVars body x -> s_start x = s2_inst x :=
        fun x hx => hagree_w x (Or.inr hx)
      obtain ⟨s2mid, hb2mid, hagreemid⟩ := ih1 s2_inst hagreeS
      have hagreeRest : forall x, freeVars (Stmt.while b body) x -> s_mid x = s2mid x := by
        intro x hx
        cases hx with
        | inl hxb =>
          by_cases hxS' : freeVars body x
          · exact hagreemid x hxS'
          · have u1 := unassignedUnchanged body s_start s_mid x hbody hxS'
            have u2 := unassignedUnchanged body s2_inst s2mid x hb2mid hxS'
            have := hagree_w x (Or.inl hxb)
            rw [<- u1, <- u2]; exact this
        | inr hxS => exact hagreemid x hxS
      obtain ⟨s2', hb2', hagree'⟩ := ih2 s2mid hagreeRest
      exact ⟨s2', BigStep.whileTrue hbEq hb2mid hb2', hagree'⟩

#check stateEquivalence