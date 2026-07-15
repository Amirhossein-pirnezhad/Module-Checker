// Lean compiler output
// Module: LeanProofs.exprDeterminism
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
LEAN_EXPORT lean_object* lp_LeanProofs___private_LeanProofs_exprDeterminism_0__evalExpr_match__1_splitter___redArg(lean_object*, lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs___private_LeanProofs_exprDeterminism_0__evalExpr_match__1_splitter(lean_object*, lean_object*, lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs___private_LeanProofs_exprDeterminism_0__evalExpr_match__1_splitter___redArg(lean_object* v_e_1_, lean_object* v_h__1_2_, lean_object* v_h__2_3_, lean_object* v_h__3_4_, lean_object* v_h__4_5_){
_start:
{
switch(lean_obj_tag(v_e_1_))
{
case 0:
{
lean_object* v_a_6_; lean_object* v___x_7_; 
lean_dec(v_h__4_5_);
lean_dec(v_h__3_4_);
lean_dec(v_h__2_3_);
v_a_6_ = lean_ctor_get(v_e_1_, 0);
lean_inc(v_a_6_);
lean_dec_ref_known(v_e_1_, 1);
v___x_7_ = lean_apply_1(v_h__1_2_, v_a_6_);
return v___x_7_;
}
case 1:
{
lean_object* v_a_8_; lean_object* v___x_9_; 
lean_dec(v_h__4_5_);
lean_dec(v_h__3_4_);
lean_dec(v_h__1_2_);
v_a_8_ = lean_ctor_get(v_e_1_, 0);
lean_inc_ref(v_a_8_);
lean_dec_ref_known(v_e_1_, 1);
v___x_9_ = lean_apply_1(v_h__2_3_, v_a_8_);
return v___x_9_;
}
case 2:
{
lean_object* v_a_10_; lean_object* v_a_11_; lean_object* v___x_12_; 
lean_dec(v_h__4_5_);
lean_dec(v_h__2_3_);
lean_dec(v_h__1_2_);
v_a_10_ = lean_ctor_get(v_e_1_, 0);
lean_inc_ref(v_a_10_);
v_a_11_ = lean_ctor_get(v_e_1_, 1);
lean_inc_ref(v_a_11_);
lean_dec_ref_known(v_e_1_, 2);
v___x_12_ = lean_apply_2(v_h__3_4_, v_a_10_, v_a_11_);
return v___x_12_;
}
default: 
{
lean_object* v_a_13_; lean_object* v_a_14_; lean_object* v___x_15_; 
lean_dec(v_h__3_4_);
lean_dec(v_h__2_3_);
lean_dec(v_h__1_2_);
v_a_13_ = lean_ctor_get(v_e_1_, 0);
lean_inc_ref(v_a_13_);
v_a_14_ = lean_ctor_get(v_e_1_, 1);
lean_inc_ref(v_a_14_);
lean_dec_ref_known(v_e_1_, 2);
v___x_15_ = lean_apply_2(v_h__4_5_, v_a_13_, v_a_14_);
return v___x_15_;
}
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs___private_LeanProofs_exprDeterminism_0__evalExpr_match__1_splitter(lean_object* v_motive_16_, lean_object* v_e_17_, lean_object* v_h__1_18_, lean_object* v_h__2_19_, lean_object* v_h__3_20_, lean_object* v_h__4_21_){
_start:
{
switch(lean_obj_tag(v_e_17_))
{
case 0:
{
lean_object* v_a_22_; lean_object* v___x_23_; 
lean_dec(v_h__4_21_);
lean_dec(v_h__3_20_);
lean_dec(v_h__2_19_);
v_a_22_ = lean_ctor_get(v_e_17_, 0);
lean_inc(v_a_22_);
lean_dec_ref_known(v_e_17_, 1);
v___x_23_ = lean_apply_1(v_h__1_18_, v_a_22_);
return v___x_23_;
}
case 1:
{
lean_object* v_a_24_; lean_object* v___x_25_; 
lean_dec(v_h__4_21_);
lean_dec(v_h__3_20_);
lean_dec(v_h__1_18_);
v_a_24_ = lean_ctor_get(v_e_17_, 0);
lean_inc_ref(v_a_24_);
lean_dec_ref_known(v_e_17_, 1);
v___x_25_ = lean_apply_1(v_h__2_19_, v_a_24_);
return v___x_25_;
}
case 2:
{
lean_object* v_a_26_; lean_object* v_a_27_; lean_object* v___x_28_; 
lean_dec(v_h__4_21_);
lean_dec(v_h__2_19_);
lean_dec(v_h__1_18_);
v_a_26_ = lean_ctor_get(v_e_17_, 0);
lean_inc_ref(v_a_26_);
v_a_27_ = lean_ctor_get(v_e_17_, 1);
lean_inc_ref(v_a_27_);
lean_dec_ref_known(v_e_17_, 2);
v___x_28_ = lean_apply_2(v_h__3_20_, v_a_26_, v_a_27_);
return v___x_28_;
}
default: 
{
lean_object* v_a_29_; lean_object* v_a_30_; lean_object* v___x_31_; 
lean_dec(v_h__3_20_);
lean_dec(v_h__2_19_);
lean_dec(v_h__1_18_);
v_a_29_ = lean_ctor_get(v_e_17_, 0);
lean_inc_ref(v_a_29_);
v_a_30_ = lean_ctor_get(v_e_17_, 1);
lean_inc_ref(v_a_30_);
lean_dec_ref_known(v_e_17_, 2);
v___x_31_ = lean_apply_2(v_h__4_21_, v_a_29_, v_a_30_);
return v___x_31_;
}
}
}
}
lean_object* initialize_Init(uint8_t builtin);
lean_object* initialize_Init(uint8_t builtin);
lean_object* initialize_LeanProofs_LeanProofs_Basic(uint8_t builtin);
static bool _G_initialized = false;
LEAN_EXPORT lean_object* initialize_LeanProofs_LeanProofs_exprDeterminism(uint8_t builtin) {
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
