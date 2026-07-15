// Lean compiler output
// Module: LeanProofs.Basic
// Imports: public import Init public meta import Init
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
uint8_t lean_string_dec_eq(lean_object*, lean_object*);
lean_object* lean_nat_to_int(lean_object*);
lean_object* lean_int_add(lean_object*, lean_object*);
uint8_t lean_int_dec_lt(lean_object*, lean_object*);
static const lean_string_object lp_LeanProofs_hello___closed__0_value = {.m_header = {.m_rc = 0, .m_cs_sz = 0, .m_other = 0, .m_tag = 249}, .m_size = 6, .m_capacity = 6, .m_length = 5, .m_data = "world"};
static const lean_object* lp_LeanProofs_hello___closed__0 = (const lean_object*)&lp_LeanProofs_hello___closed__0_value;
LEAN_EXPORT const lean_object* lp_LeanProofs_hello = (const lean_object*)&lp_LeanProofs_hello___closed__0_value;
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorIdx(lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorIdx___boxed(lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorElim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorElim(lean_object*, lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorElim___boxed(lean_object*, lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_num_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_num_elim(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_var_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_var_elim(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_add_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_add_elim(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_lt_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_lt_elim(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorIdx(lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorIdx___boxed(lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorElim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorElim(lean_object*, lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorElim___boxed(lean_object*, lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_assign_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_assign_elim(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_seq_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_seq_elim(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ifElse_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ifElse_elim(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_while_elim___redArg(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_while_elim(lean_object*, lean_object*, lean_object*, lean_object*);
static lean_once_cell_t lp_LeanProofs_evalExpr___closed__0_once = LEAN_ONCE_CELL_INITIALIZER;
static lean_object* lp_LeanProofs_evalExpr___closed__0;
static lean_once_cell_t lp_LeanProofs_evalExpr___closed__1_once = LEAN_ONCE_CELL_INITIALIZER;
static lean_object* lp_LeanProofs_evalExpr___closed__1;
LEAN_EXPORT lean_object* lp_LeanProofs_evalExpr(lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_update(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_update___boxed(lean_object*, lean_object*, lean_object*, lean_object*);
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorIdx(lean_object* v_x_3_){
_start:
{
switch(lean_obj_tag(v_x_3_))
{
case 0:
{
lean_object* v___x_4_; 
v___x_4_ = lean_unsigned_to_nat(0u);
return v___x_4_;
}
case 1:
{
lean_object* v___x_5_; 
v___x_5_ = lean_unsigned_to_nat(1u);
return v___x_5_;
}
case 2:
{
lean_object* v___x_6_; 
v___x_6_ = lean_unsigned_to_nat(2u);
return v___x_6_;
}
default: 
{
lean_object* v___x_7_; 
v___x_7_ = lean_unsigned_to_nat(3u);
return v___x_7_;
}
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorIdx___boxed(lean_object* v_x_8_){
_start:
{
lean_object* v_res_9_; 
v_res_9_ = lp_LeanProofs_Expr_ctorIdx(v_x_8_);
lean_dec_ref(v_x_8_);
return v_res_9_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorElim___redArg(lean_object* v_t_10_, lean_object* v_k_11_){
_start:
{
switch(lean_obj_tag(v_t_10_))
{
case 0:
{
lean_object* v_a_12_; lean_object* v___x_13_; 
v_a_12_ = lean_ctor_get(v_t_10_, 0);
lean_inc(v_a_12_);
lean_dec_ref_known(v_t_10_, 1);
v___x_13_ = lean_apply_1(v_k_11_, v_a_12_);
return v___x_13_;
}
case 1:
{
lean_object* v_a_14_; lean_object* v___x_15_; 
v_a_14_ = lean_ctor_get(v_t_10_, 0);
lean_inc_ref(v_a_14_);
lean_dec_ref_known(v_t_10_, 1);
v___x_15_ = lean_apply_1(v_k_11_, v_a_14_);
return v___x_15_;
}
default: 
{
lean_object* v_a_16_; lean_object* v_a_17_; lean_object* v___x_18_; 
v_a_16_ = lean_ctor_get(v_t_10_, 0);
lean_inc_ref(v_a_16_);
v_a_17_ = lean_ctor_get(v_t_10_, 1);
lean_inc_ref(v_a_17_);
lean_dec_ref(v_t_10_);
v___x_18_ = lean_apply_2(v_k_11_, v_a_16_, v_a_17_);
return v___x_18_;
}
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorElim(lean_object* v_motive_19_, lean_object* v_ctorIdx_20_, lean_object* v_t_21_, lean_object* v_h_22_, lean_object* v_k_23_){
_start:
{
lean_object* v___x_24_; 
v___x_24_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_21_, v_k_23_);
return v___x_24_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_ctorElim___boxed(lean_object* v_motive_25_, lean_object* v_ctorIdx_26_, lean_object* v_t_27_, lean_object* v_h_28_, lean_object* v_k_29_){
_start:
{
lean_object* v_res_30_; 
v_res_30_ = lp_LeanProofs_Expr_ctorElim(v_motive_25_, v_ctorIdx_26_, v_t_27_, v_h_28_, v_k_29_);
lean_dec(v_ctorIdx_26_);
return v_res_30_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_num_elim___redArg(lean_object* v_t_31_, lean_object* v_num_32_){
_start:
{
lean_object* v___x_33_; 
v___x_33_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_31_, v_num_32_);
return v___x_33_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_num_elim(lean_object* v_motive_34_, lean_object* v_t_35_, lean_object* v_h_36_, lean_object* v_num_37_){
_start:
{
lean_object* v___x_38_; 
v___x_38_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_35_, v_num_37_);
return v___x_38_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_var_elim___redArg(lean_object* v_t_39_, lean_object* v_var_40_){
_start:
{
lean_object* v___x_41_; 
v___x_41_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_39_, v_var_40_);
return v___x_41_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_var_elim(lean_object* v_motive_42_, lean_object* v_t_43_, lean_object* v_h_44_, lean_object* v_var_45_){
_start:
{
lean_object* v___x_46_; 
v___x_46_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_43_, v_var_45_);
return v___x_46_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_add_elim___redArg(lean_object* v_t_47_, lean_object* v_add_48_){
_start:
{
lean_object* v___x_49_; 
v___x_49_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_47_, v_add_48_);
return v___x_49_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_add_elim(lean_object* v_motive_50_, lean_object* v_t_51_, lean_object* v_h_52_, lean_object* v_add_53_){
_start:
{
lean_object* v___x_54_; 
v___x_54_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_51_, v_add_53_);
return v___x_54_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_lt_elim___redArg(lean_object* v_t_55_, lean_object* v_lt_56_){
_start:
{
lean_object* v___x_57_; 
v___x_57_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_55_, v_lt_56_);
return v___x_57_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Expr_lt_elim(lean_object* v_motive_58_, lean_object* v_t_59_, lean_object* v_h_60_, lean_object* v_lt_61_){
_start:
{
lean_object* v___x_62_; 
v___x_62_ = lp_LeanProofs_Expr_ctorElim___redArg(v_t_59_, v_lt_61_);
return v___x_62_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorIdx(lean_object* v_x_63_){
_start:
{
switch(lean_obj_tag(v_x_63_))
{
case 0:
{
lean_object* v___x_64_; 
v___x_64_ = lean_unsigned_to_nat(0u);
return v___x_64_;
}
case 1:
{
lean_object* v___x_65_; 
v___x_65_ = lean_unsigned_to_nat(1u);
return v___x_65_;
}
case 2:
{
lean_object* v___x_66_; 
v___x_66_ = lean_unsigned_to_nat(2u);
return v___x_66_;
}
default: 
{
lean_object* v___x_67_; 
v___x_67_ = lean_unsigned_to_nat(3u);
return v___x_67_;
}
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorIdx___boxed(lean_object* v_x_68_){
_start:
{
lean_object* v_res_69_; 
v_res_69_ = lp_LeanProofs_Stmt_ctorIdx(v_x_68_);
lean_dec_ref(v_x_68_);
return v_res_69_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorElim___redArg(lean_object* v_t_70_, lean_object* v_k_71_){
_start:
{
if (lean_obj_tag(v_t_70_) == 2)
{
lean_object* v_a_72_; lean_object* v_a_73_; lean_object* v_a_74_; lean_object* v___x_75_; 
v_a_72_ = lean_ctor_get(v_t_70_, 0);
lean_inc_ref(v_a_72_);
v_a_73_ = lean_ctor_get(v_t_70_, 1);
lean_inc_ref(v_a_73_);
v_a_74_ = lean_ctor_get(v_t_70_, 2);
lean_inc_ref(v_a_74_);
lean_dec_ref_known(v_t_70_, 3);
v___x_75_ = lean_apply_3(v_k_71_, v_a_72_, v_a_73_, v_a_74_);
return v___x_75_;
}
else
{
lean_object* v_a_76_; lean_object* v_a_77_; lean_object* v___x_78_; 
v_a_76_ = lean_ctor_get(v_t_70_, 0);
lean_inc_ref(v_a_76_);
v_a_77_ = lean_ctor_get(v_t_70_, 1);
lean_inc_ref(v_a_77_);
lean_dec_ref(v_t_70_);
v___x_78_ = lean_apply_2(v_k_71_, v_a_76_, v_a_77_);
return v___x_78_;
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorElim(lean_object* v_motive_79_, lean_object* v_ctorIdx_80_, lean_object* v_t_81_, lean_object* v_h_82_, lean_object* v_k_83_){
_start:
{
lean_object* v___x_84_; 
v___x_84_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_81_, v_k_83_);
return v___x_84_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ctorElim___boxed(lean_object* v_motive_85_, lean_object* v_ctorIdx_86_, lean_object* v_t_87_, lean_object* v_h_88_, lean_object* v_k_89_){
_start:
{
lean_object* v_res_90_; 
v_res_90_ = lp_LeanProofs_Stmt_ctorElim(v_motive_85_, v_ctorIdx_86_, v_t_87_, v_h_88_, v_k_89_);
lean_dec(v_ctorIdx_86_);
return v_res_90_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_assign_elim___redArg(lean_object* v_t_91_, lean_object* v_assign_92_){
_start:
{
lean_object* v___x_93_; 
v___x_93_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_91_, v_assign_92_);
return v___x_93_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_assign_elim(lean_object* v_motive_94_, lean_object* v_t_95_, lean_object* v_h_96_, lean_object* v_assign_97_){
_start:
{
lean_object* v___x_98_; 
v___x_98_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_95_, v_assign_97_);
return v___x_98_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_seq_elim___redArg(lean_object* v_t_99_, lean_object* v_seq_100_){
_start:
{
lean_object* v___x_101_; 
v___x_101_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_99_, v_seq_100_);
return v___x_101_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_seq_elim(lean_object* v_motive_102_, lean_object* v_t_103_, lean_object* v_h_104_, lean_object* v_seq_105_){
_start:
{
lean_object* v___x_106_; 
v___x_106_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_103_, v_seq_105_);
return v___x_106_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ifElse_elim___redArg(lean_object* v_t_107_, lean_object* v_ifElse_108_){
_start:
{
lean_object* v___x_109_; 
v___x_109_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_107_, v_ifElse_108_);
return v___x_109_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_ifElse_elim(lean_object* v_motive_110_, lean_object* v_t_111_, lean_object* v_h_112_, lean_object* v_ifElse_113_){
_start:
{
lean_object* v___x_114_; 
v___x_114_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_111_, v_ifElse_113_);
return v___x_114_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_while_elim___redArg(lean_object* v_t_115_, lean_object* v_while_116_){
_start:
{
lean_object* v___x_117_; 
v___x_117_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_115_, v_while_116_);
return v___x_117_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_Stmt_while_elim(lean_object* v_motive_118_, lean_object* v_t_119_, lean_object* v_h_120_, lean_object* v_while_121_){
_start:
{
lean_object* v___x_122_; 
v___x_122_ = lp_LeanProofs_Stmt_ctorElim___redArg(v_t_119_, v_while_121_);
return v___x_122_;
}
}
static lean_object* _init_lp_LeanProofs_evalExpr___closed__0(void){
_start:
{
lean_object* v___x_123_; lean_object* v___x_124_; 
v___x_123_ = lean_unsigned_to_nat(0u);
v___x_124_ = lean_nat_to_int(v___x_123_);
return v___x_124_;
}
}
static lean_object* _init_lp_LeanProofs_evalExpr___closed__1(void){
_start:
{
lean_object* v___x_125_; lean_object* v___x_126_; 
v___x_125_ = lean_unsigned_to_nat(1u);
v___x_126_ = lean_nat_to_int(v___x_125_);
return v___x_126_;
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_evalExpr(lean_object* v_e_127_, lean_object* v_s_128_){
_start:
{
switch(lean_obj_tag(v_e_127_))
{
case 0:
{
lean_object* v_a_129_; 
lean_dec_ref(v_s_128_);
v_a_129_ = lean_ctor_get(v_e_127_, 0);
lean_inc(v_a_129_);
lean_dec_ref_known(v_e_127_, 1);
return v_a_129_;
}
case 1:
{
lean_object* v_a_130_; lean_object* v___x_131_; 
v_a_130_ = lean_ctor_get(v_e_127_, 0);
lean_inc_ref(v_a_130_);
lean_dec_ref_known(v_e_127_, 1);
v___x_131_ = lean_apply_1(v_s_128_, v_a_130_);
return v___x_131_;
}
case 2:
{
lean_object* v_a_132_; lean_object* v_a_133_; lean_object* v___x_134_; lean_object* v___x_135_; lean_object* v___x_136_; 
v_a_132_ = lean_ctor_get(v_e_127_, 0);
lean_inc_ref(v_a_132_);
v_a_133_ = lean_ctor_get(v_e_127_, 1);
lean_inc_ref(v_a_133_);
lean_dec_ref_known(v_e_127_, 2);
lean_inc_ref(v_s_128_);
v___x_134_ = lp_LeanProofs_evalExpr(v_a_132_, v_s_128_);
v___x_135_ = lp_LeanProofs_evalExpr(v_a_133_, v_s_128_);
v___x_136_ = lean_int_add(v___x_134_, v___x_135_);
lean_dec(v___x_135_);
lean_dec(v___x_134_);
return v___x_136_;
}
default: 
{
lean_object* v_a_137_; lean_object* v_a_138_; lean_object* v___x_139_; lean_object* v___x_140_; uint8_t v___x_141_; 
v_a_137_ = lean_ctor_get(v_e_127_, 0);
lean_inc_ref(v_a_137_);
v_a_138_ = lean_ctor_get(v_e_127_, 1);
lean_inc_ref(v_a_138_);
lean_dec_ref_known(v_e_127_, 2);
lean_inc_ref(v_s_128_);
v___x_139_ = lp_LeanProofs_evalExpr(v_a_137_, v_s_128_);
v___x_140_ = lp_LeanProofs_evalExpr(v_a_138_, v_s_128_);
v___x_141_ = lean_int_dec_lt(v___x_139_, v___x_140_);
lean_dec(v___x_140_);
lean_dec(v___x_139_);
if (v___x_141_ == 0)
{
lean_object* v___x_142_; 
v___x_142_ = lean_obj_once(&lp_LeanProofs_evalExpr___closed__0, &lp_LeanProofs_evalExpr___closed__0_once, _init_lp_LeanProofs_evalExpr___closed__0);
return v___x_142_;
}
else
{
lean_object* v___x_143_; 
v___x_143_ = lean_obj_once(&lp_LeanProofs_evalExpr___closed__1, &lp_LeanProofs_evalExpr___closed__1_once, _init_lp_LeanProofs_evalExpr___closed__1);
return v___x_143_;
}
}
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_update(lean_object* v_s_144_, lean_object* v_x_145_, lean_object* v_v_146_, lean_object* v_y_147_){
_start:
{
uint8_t v___x_148_; 
v___x_148_ = lean_string_dec_eq(v_y_147_, v_x_145_);
if (v___x_148_ == 0)
{
lean_object* v___x_149_; 
v___x_149_ = lean_apply_1(v_s_144_, v_y_147_);
return v___x_149_;
}
else
{
lean_dec_ref(v_y_147_);
lean_dec_ref(v_s_144_);
lean_inc(v_v_146_);
return v_v_146_;
}
}
}
LEAN_EXPORT lean_object* lp_LeanProofs_update___boxed(lean_object* v_s_150_, lean_object* v_x_151_, lean_object* v_v_152_, lean_object* v_y_153_){
_start:
{
lean_object* v_res_154_; 
v_res_154_ = lp_LeanProofs_update(v_s_150_, v_x_151_, v_v_152_, v_y_153_);
lean_dec(v_v_152_);
lean_dec_ref(v_x_151_);
return v_res_154_;
}
}
lean_object* initialize_Init(uint8_t builtin);
lean_object* initialize_Init(uint8_t builtin);
static bool _G_initialized = false;
LEAN_EXPORT lean_object* initialize_LeanProofs_LeanProofs_Basic(uint8_t builtin) {
lean_object * res;
if (_G_initialized) return lean_io_result_mk_ok(lean_box(0));
_G_initialized = true;
res = initialize_Init(builtin);
if (lean_io_result_is_error(res)) return res;
lean_dec_ref(res);
res = initialize_Init(builtin);
if (lean_io_result_is_error(res)) return res;
lean_dec_ref(res);
return lean_io_result_mk_ok(lean_box(0));
}
#ifdef __cplusplus
}
#endif
