// Lean compiler output
// Module: LeanProofs.stateEquivalence
// Imports: public import Init public meta import Init public import LeanProofs.Basic
#include <lean/lean.h>
#if defined(__clang__)
#pragma clang diagnostic ignored "-Wunused-parameter"
#pragma clang diagnostic ignored "-Wunused-label"
#elif defined(__GNUC__) && !defined(__CLANG__)
#pragma GCC diagnostic ignored "-Wunused-parameter"
#pragma GCC diagnostic ignored "-Wunused-label"
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif
#ifdef __cplusplus
extern "C" {
#endif
lean_object* l_List_appendTR___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_freeVars(lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_freeVars___boxed(lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_freeVars(lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_freeVars(lean_object* v_x_1_){
_start:
{
lean_object* v_e1_3_; lean_object* v_e2_4_; 
switch(lean_obj_tag(v_x_1_))
{
case 0:
{
lean_object* v___x_8_; 
v___x_8_ = lean_box(0);
return v___x_8_;
}
case 1:
{
lean_object* v_a_9_; lean_object* v___x_10_; lean_object* v___x_11_; 
v_a_9_ = lean_ctor_get(v_x_1_, 0);
v___x_10_ = lean_box(0);
lean_inc_ref(v_a_9_);
v___x_11_ = lean_alloc_ctor(1, 2, 0);
lean_ctor_set(v___x_11_, 0, v_a_9_);
lean_ctor_set(v___x_11_, 1, v___x_10_);
return v___x_11_;
}
default: 
{
lean_object* v_a_12_; lean_object* v_a_13_; 
v_a_12_ = lean_ctor_get(v_x_1_, 0);
v_a_13_ = lean_ctor_get(v_x_1_, 1);
v_e1_3_ = v_a_12_;
v_e2_4_ = v_a_13_;
goto v___jp_2_;
}
}
v___jp_2_:
{
lean_object* v___x_5_; lean_object* v___x_6_; lean_object* v___x_7_; 
v___x_5_ = lp_LeanProofs_Expr_freeVars(v_e1_3_);
v___x_6_ = lp_LeanProofs_Expr_freeVars(v_e2_4_);
v___x_7_ = l_List_appendTR___redArg(v___x_5_, v___x_6_);
return v___x_7_;
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_freeVars___boxed(lean_object* v_x_14_){
_start:
{
lean_object* v_res_15_; 
v_res_15_ = lp_LeanProofs_Expr_freeVars(v_x_14_);
lean_dec_ref(v_x_14_);
return v_res_15_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_freeVars(lean_object* v_x_16_){
_start:
{
switch(lean_obj_tag(v_x_16_))
{
case 0:
{
lean_object* v_a_17_; lean_object* v_a_18_; lean_object* v___x_20_; uint8_t v_isShared_21_; uint8_t v_isSharedCheck_26_; 
v_a_17_ = lean_ctor_get(v_x_16_, 0);
v_a_18_ = lean_ctor_get(v_x_16_, 1);
v_isSharedCheck_26_ = !lean_is_exclusive(v_x_16_);
if (v_isSharedCheck_26_ == 0)
{
v___x_20_ = v_x_16_;
v_isShared_21_ = v_isSharedCheck_26_;
goto v_resetjp_19_;
}
else
{
lean_inc(v_a_18_);
lean_inc(v_a_17_);
lean_dec(v_x_16_);
v___x_20_ = lean_box(0);
v_isShared_21_ = v_isSharedCheck_26_;
goto v_resetjp_19_;
}
v_resetjp_19_:
{
lean_object* v___x_22_; lean_object* v___x_24_; 
v___x_22_ = lp_LeanProofs_Expr_freeVars(v_a_18_);
lean_dec_ref(v_a_18_);
if (v_isShared_21_ == 0)
{
lean_ctor_set_tag(v___x_20_, 1);
lean_ctor_set(v___x_20_, 1, v___x_22_);
v___x_24_ = v___x_20_;
goto v_reusejp_23_;
}
else
{
lean_object* v_reuseFailAlloc_25_; 
v_reuseFailAlloc_25_ = lean_alloc_ctor(1, 2, 0);
lean_ctor_set(v_reuseFailAlloc_25_, 0, v_a_17_);
lean_ctor_set(v_reuseFailAlloc_25_, 1, v___x_22_);
v___x_24_ = v_reuseFailAlloc_25_;
goto v_reusejp_23_;
}
v_reusejp_23_:
{
return v___x_24_;
}
}
}
case 1:
{
lean_object* v_a_27_; lean_object* v_a_28_; lean_object* v___x_29_; lean_object* v___x_30_; lean_object* v___x_31_; 
v_a_27_ = lean_ctor_get(v_x_16_, 0);
lean_inc_ref(v_a_27_);
v_a_28_ = lean_ctor_get(v_x_16_, 1);
lean_inc_ref(v_a_28_);
lean_dec_ref_known(v_x_16_, 2);
v___x_29_ = lp_LeanProofs_Stmt_freeVars(v_a_27_);
v___x_30_ = lp_LeanProofs_Stmt_freeVars(v_a_28_);
v___x_31_ = l_List_appendTR___redArg(v___x_29_, v___x_30_);
return v___x_31_;
}
case 2:
{
lean_object* v_a_32_; lean_object* v_a_33_; lean_object* v_a_34_; lean_object* v___x_35_; lean_object* v___x_36_; lean_object* v___x_37_; lean_object* v___x_38_; lean_object* v___x_39_; 
v_a_32_ = lean_ctor_get(v_x_16_, 0);
lean_inc_ref(v_a_32_);
v_a_33_ = lean_ctor_get(v_x_16_, 1);
lean_inc_ref(v_a_33_);
v_a_34_ = lean_ctor_get(v_x_16_, 2);
lean_inc_ref(v_a_34_);
lean_dec_ref_known(v_x_16_, 3);
v___x_35_ = lp_LeanProofs_Expr_freeVars(v_a_32_);
lean_dec_ref(v_a_32_);
v___x_36_ = lp_LeanProofs_Stmt_freeVars(v_a_33_);
v___x_37_ = l_List_appendTR___redArg(v___x_35_, v___x_36_);
v___x_38_ = lp_LeanProofs_Stmt_freeVars(v_a_34_);
v___x_39_ = l_List_appendTR___redArg(v___x_37_, v___x_38_);
return v___x_39_;
}
default: 
{
lean_object* v_a_40_; lean_object* v_a_41_; lean_object* v___x_42_; lean_object* v___x_43_; lean_object* v___x_44_; 
v_a_40_ = lean_ctor_get(v_x_16_, 0);
lean_inc_ref(v_a_40_);
v_a_41_ = lean_ctor_get(v_x_16_, 1);
lean_inc_ref(v_a_41_);
lean_dec_ref_known(v_x_16_, 2);
v___x_42_ = lp_LeanProofs_Expr_freeVars(v_a_40_);
lean_dec_ref(v_a_40_);
v___x_43_ = lp_LeanProofs_Stmt_freeVars(v_a_41_);
v___x_44_ = l_List_appendTR___redArg(v___x_42_, v___x_43_);
return v___x_44_;
}
}
}
}
lean_object* initialize_Init(uint8_t builtin);
lean_object* initialize_Init(uint8_t builtin);
lean_object* initialize_LeanProofs_LeanProofs_Basic(uint8_t builtin);
static bool _G_initialized = false;
LEAN_EXPORT lean_object* initialize_LeanProofs_LeanProofs_stateEquivalence(uint8_t builtin) {
lean_object * res;
if (_G_initialized) return lean_io_result_mk_ok(lean_box(0));
_G_initialized = true;
res = initialize_Init(builtin);
if (lean_io_result_is_error(res)) return res;
lean_dec_ref(res);
res = initialize_Init(builtin);
if (lean_io_result_is_error(res)) return res;
lean_dec_ref(res);
res = initialize_LeanProofs_LeanProofs_Basic(builtin);
if (lean_io_result_is_error(res)) return res;
lean_dec_ref(res);
return lean_io_result_mk_ok(lean_box(0));
}
#ifdef __cplusplus
}
#endif
