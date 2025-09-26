package com.example.mycompose.repository.http

import com.example.mycompose.repository.entity.AdditionRecordListEntity
import com.example.mycompose.repository.entity.AddressEntity
import com.example.mycompose.repository.entity.AddressListEntity
import com.example.mycompose.repository.entity.AdmisPermitDetailInfoEntity
import com.example.mycompose.repository.entity.AdmisPermitEntity
import com.example.mycompose.repository.entity.AdvanceRecordDetailInfoEntity
import com.example.mycompose.repository.entity.AdvanceRecordEntity
import com.example.mycompose.repository.entity.AlternateHuaJiaEntity
import com.example.mycompose.repository.entity.AlternateListEntity
import com.example.mycompose.repository.entity.AlternateOrderPayStatusEntity
import com.example.mycompose.repository.entity.AlternatePayOrderInfoEntity
import com.example.mycompose.repository.entity.AlternateRecordDetailEntity
import com.example.mycompose.repository.entity.AlternateRegEntity
import com.example.mycompose.repository.entity.AlternateStatusEntity
import com.example.mycompose.repository.entity.AtpDataListEntity
import com.example.mycompose.repository.entity.AtpDataSubmitEntity
import com.example.mycompose.repository.entity.AtpTimeListEntity
import com.example.mycompose.repository.entity.BackendParamsEntity
import com.example.mycompose.repository.entity.BannerItemDetailInfoEntity
import com.example.mycompose.repository.entity.BannerListEntity
import com.example.mycompose.repository.entity.BaseEntity
import com.example.mycompose.repository.entity.BaseEntity2
import com.example.mycompose.repository.entity.BindingWechatEntity
import com.example.mycompose.repository.entity.CancelEntity
import com.example.mycompose.repository.entity.CancelRefundEntity
import com.example.mycompose.repository.entity.ChangePhoneEntity
import com.example.mycompose.repository.entity.ChannelListEntity
import com.example.mycompose.repository.entity.CommonEntity
import com.example.mycompose.repository.entity.ConfirmSettleEntity
import com.example.mycompose.repository.entity.ContactTypeEntity
import com.example.mycompose.repository.entity.CountryEntity
import com.example.mycompose.repository.entity.CreatePatientEntity
import com.example.mycompose.repository.entity.DeletePatientEntity
import com.example.mycompose.repository.entity.DeptInfoEntity
import com.example.mycompose.repository.entity.DeptProfessionEntity
import com.example.mycompose.repository.entity.DeptmentListEntity
import com.example.mycompose.repository.entity.DischargeRecordEntity
import com.example.mycompose.repository.entity.DoctorEvaluationEntity
import com.example.mycompose.repository.entity.DoctorInfoEntity
import com.example.mycompose.repository.entity.DoctorSchedulesEntity
import com.example.mycompose.repository.entity.DrugDetailEntity
import com.example.mycompose.repository.entity.DrugListEntity
import com.example.mycompose.repository.entity.DrugListEntity2
import com.example.mycompose.repository.entity.EditPatientResultEntity
import com.example.mycompose.repository.entity.ElectronicListEntity
import com.example.mycompose.repository.entity.ExamAppointPrejectDetailsEntity
import com.example.mycompose.repository.entity.ExamAppointPrejectEntity
import com.example.mycompose.repository.entity.ExamGuideEntity
import com.example.mycompose.repository.entity.ExamUnPaidDetailEntity
import com.example.mycompose.repository.entity.ExpertConsultEntity
import com.example.mycompose.repository.entity.FaceRecognitionEntity
import com.example.mycompose.repository.entity.FaceStatusEntity
import com.example.mycompose.repository.entity.FamilyRoleEntity
import com.example.mycompose.repository.entity.FeatureDeptEntity
import com.example.mycompose.repository.entity.FeedBackDetailEntity
import com.example.mycompose.repository.entity.FeedBackHistoryEntity
import com.example.mycompose.repository.entity.FocusDoctorEntity
import com.example.mycompose.repository.entity.FollowAimEntity
import com.example.mycompose.repository.entity.FollowDiseaseEntity
import com.example.mycompose.repository.entity.ForgetPasswordEntity
import com.example.mycompose.repository.entity.GuaHaoDoctorListByDateEntity
import com.example.mycompose.repository.entity.GuaHaoDoctorListEntity
import com.example.mycompose.repository.entity.GuaHaoDoctorScheduleEntity
import com.example.mycompose.repository.entity.GuaHaoRecordDetailEntity
import com.example.mycompose.repository.entity.GuaHaoRecordListEntity
import com.example.mycompose.repository.entity.GuaHaoSearhDoctorEntity
import com.example.mycompose.repository.entity.HRRechargeDetailEntity
import com.example.mycompose.repository.entity.HasEvaluateInfoEntity
import com.example.mycompose.repository.entity.HelpCenterDataEntity
import com.example.mycompose.repository.entity.HelpCenterListDataEntity
import com.example.mycompose.repository.entity.HelpCenterListItemDataEntity
import com.example.mycompose.repository.entity.HistoryEntity
import com.example.mycompose.repository.entity.HomeHospitalInfoEntity
import com.example.mycompose.repository.entity.HomeInfoContentListEntity
import com.example.mycompose.repository.entity.HomeInfoDetailEntity
import com.example.mycompose.repository.entity.HomeInfoEntity
import com.example.mycompose.repository.entity.HomeInfoTypeListEntity
import com.example.mycompose.repository.entity.HomeMenuEntity
import com.example.mycompose.repository.entity.HomePageSearchEntity
import com.example.mycompose.repository.entity.HospitalAmtCostEntity
import com.example.mycompose.repository.entity.HospitalGuideEntity
import com.example.mycompose.repository.entity.HospitalListEntity
import com.example.mycompose.repository.entity.HospitalizationExpenseseEntity
import com.example.mycompose.repository.entity.HotDoctorEntity
import com.example.mycompose.repository.entity.HuaJiaEntity
import com.example.mycompose.repository.entity.IMMessageListEntity
import com.example.mycompose.repository.entity.IdCardTypeListEntity
import com.example.mycompose.repository.entity.InpatientRechargeBalanceEntity
import com.example.mycompose.repository.entity.InspectGuideEntity
import com.example.mycompose.repository.entity.JingneiListEntity
import com.example.mycompose.repository.entity.JobStatusEntity
import com.example.mycompose.repository.entity.LimitParamEntity
import com.example.mycompose.repository.entity.LockRegisteredEntity
import com.example.mycompose.repository.entity.LoginEntity
import com.example.mycompose.repository.entity.LogisticsInfoEntity
import com.example.mycompose.repository.entity.MaritalStatusEntity
import com.example.mycompose.repository.entity.MaterialListEntity
import com.example.mycompose.repository.entity.MedListEntity
import com.example.mycompose.repository.entity.MedicalHistoryEntity
import com.example.mycompose.repository.entity.MedicationDetailEntity
import com.example.mycompose.repository.entity.MessageCenterDetailItemListEntity
import com.example.mycompose.repository.entity.MessageCenterListEntity
import com.example.mycompose.repository.entity.MinIOTokenEntity
import com.example.mycompose.repository.entity.ModifyPasswordEntity
import com.example.mycompose.repository.entity.MyFoucusSVDoctorEntity
import com.example.mycompose.repository.entity.MyFoucusSVDoctorEntity2
import com.example.mycompose.repository.entity.NationEntity
import com.example.mycompose.repository.entity.NoticeEntity
import com.example.mycompose.repository.entity.OccupationEntity
import com.example.mycompose.repository.entity.OutPatientPaymenPayInfoEntity
import com.example.mycompose.repository.entity.OutpatientPaymentHuaJiaEntity
import com.example.mycompose.repository.entity.OutpatientPaymentOrderStatusEntity
import com.example.mycompose.repository.entity.OutpatientPaymentPayOrderEntity
import com.example.mycompose.repository.entity.PatientDetailInfoEntity
import com.example.mycompose.repository.entity.PatientListEntity
import com.example.mycompose.repository.entity.PatientRegDataEntity
import com.example.mycompose.repository.entity.PayCnfmCodeEntity
import com.example.mycompose.repository.entity.PayOrderInfoEntity
import com.example.mycompose.repository.entity.PreconsultationEntity
import com.example.mycompose.repository.entity.PresCheckPayOrderEntity
import com.example.mycompose.repository.entity.PresHuaJiaEntity
import com.example.mycompose.repository.entity.PresPayOrderEntity
import com.example.mycompose.repository.entity.PresSplitDetailEntity
import com.example.mycompose.repository.entity.PresSplitResultEntity
import com.example.mycompose.repository.entity.PrescriptionListEntity
import com.example.mycompose.repository.entity.PrivatePassWordEntity
import com.example.mycompose.repository.entity.PurchaseEntity
import com.example.mycompose.repository.entity.QrPayStatusEntity
import com.example.mycompose.repository.entity.QueryBindingWechatEntity
import com.example.mycompose.repository.entity.QueryOrderEntity
import com.example.mycompose.repository.entity.QueryOrderPayStatusEntity
import com.example.mycompose.repository.entity.QueryPatientInfoEntity
import com.example.mycompose.repository.entity.QueueQueryEntity
import com.example.mycompose.repository.entity.RefreshTokenEntity
import com.example.mycompose.repository.entity.RefundEntity
import com.example.mycompose.repository.entity.RegDetailEntity
import com.example.mycompose.repository.entity.ReportDetailEntity
import com.example.mycompose.repository.entity.ReportListEntity
import com.example.mycompose.repository.entity.SVCreateOrderEntity
import com.example.mycompose.repository.entity.SVDeptListEntity
import com.example.mycompose.repository.entity.SVDoctorInfoEntity
import com.example.mycompose.repository.entity.SVDoctorListEntity
import com.example.mycompose.repository.entity.SVHuaJiaEntity
import com.example.mycompose.repository.entity.SVOrderDetailDataEntity
import com.example.mycompose.repository.entity.SVOrderListEntity
import com.example.mycompose.repository.entity.SVOrderStatusEntity
import com.example.mycompose.repository.entity.SVPayOrderEntity
import com.example.mycompose.repository.entity.SVSearchDoctorEntity
import com.example.mycompose.repository.entity.SatisfactionAptListEntity
import com.example.mycompose.repository.entity.SatisfactionEvaluateDetialsEntity
import com.example.mycompose.repository.entity.SatisfactionEvaluateTypeEntity
import com.example.mycompose.repository.entity.SatisfactionInhospitalListEntity
import com.example.mycompose.repository.entity.SatisfactionSurverySubmitEntity
import com.example.mycompose.repository.entity.SelfDischargeListEntity
import com.example.mycompose.repository.entity.SelfpayListEntity
import com.example.mycompose.repository.entity.SendIMMessageEntity
import com.example.mycompose.repository.entity.ServerStopNoticeEntity
import com.example.mycompose.repository.entity.ServiceFeedbackListEntity
import com.example.mycompose.repository.entity.ServiceFeedbackResultDetailEntity
import com.example.mycompose.repository.entity.SetDefaultPatientEntity
import com.example.mycompose.repository.entity.SfPlaceEntity
import com.example.mycompose.repository.entity.SortOpsEntity
import com.example.mycompose.repository.entity.StopVisitListEntity
import com.example.mycompose.repository.entity.SubmitPurchaseEntity
import com.example.mycompose.repository.entity.TXFaceIdEntity
import com.example.mycompose.repository.entity.TiJianEntity
import com.example.mycompose.repository.entity.UnPaidDetailEntity
import com.example.mycompose.repository.entity.UnPaidListEntity
import com.example.mycompose.repository.entity.UnbindingWechatEntity
import com.example.mycompose.repository.entity.UpdateInfoEntity
import com.example.mycompose.repository.entity.VerifyCodeEntity
import com.example.mycompose.repository.entity.VisitEntity
import com.example.mycompose.repository.entity.WeChatUserBean
import com.example.mycompose.repository.entity.WithDrawIMMessageEntity
import com.example.mycompose.repository.entity.YBAnalysisEntity
import com.example.mycompose.repository.entity.zyClDetaileEntity
import com.founder.internet.healthcare.repository.entity.BusinessCardEntity
import com.founder.internet.healthcare.repository.entity.OnlineReplaceEntity
import com.founder.internet.healthcare.repository.entity.OrignalPhoneEntity
import com.founder.internet.healthcare.repository.entity.PathologyEntity
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    //登录
    @POST("/v1/comm/login")
    suspend fun loginPost(@Body requestBody: RequestBody?): Response<LoginEntity?>?

    //登出
    @POST("/v1/comm/logout")
    suspend fun logoutPost(@Body requestBody: RequestBody?): Response<CommonEntity?>?

    //发送验证码
    @POST("/comm/vc/trigger")
    suspend fun sendVerifyCode(@Body requestBody: RequestBody?): Response<VerifyCodeEntity?>?

    //获取微信用户数据
    @POST("/comm/wechat/code-exchange-userinfo")
    suspend fun getWechatCode(@Body requestBody: RequestBody?): Response<WeChatUserBean?>?

    //忘记密码
    @POST("/v1/comm/forget/password")
    suspend fun postNewPassword(@Body requestBody: RequestBody?): Response<ForgetPasswordEntity?>?

    //修改密码
    @POST("/v1/comm/modify/password")
    suspend fun postModifyPassword(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ModifyPasswordEntity?>?

    //刷新token
    @POST("/comm/refresh/token")
    suspend fun refreshToken(@Body requestBody: RequestBody?): Response<RefreshTokenEntity?>?

    // 获取证件类型
    @POST("/comm/dic/zj_type")
    suspend fun getIdCardTypeList(@Body requestBody: RequestBody?): Response<IdCardTypeListEntity?>?

    // 获取民族列表
    @POST("/comm/dic/nation")
    suspend fun getNationList(@Body requestBody: RequestBody?): Response<NationEntity?>?

    // 获取婚姻状况
    @POST("/comm/dic/marital_status")
    suspend fun getMaritalStatusList(@Body requestBody: RequestBody?): Response<MaritalStatusEntity?>?

    // 获取职业
    @POST("/comm/dic/occupation")
    suspend fun getOccupationList(@Body requestBody: RequestBody?): Response<OccupationEntity?>?

    // 获取联系人关系类型
    @POST("/comm/dic/contact_type")
    suspend fun getContactList(@Body requestBody: RequestBody?): Response<ContactTypeEntity?>?

    // 获取亲属身份
    @POST("/comm/dic/family_role")
    suspend fun getFamilyRole(@Body requestBody: RequestBody?): Response<FamilyRoleEntity?>?

    // 获取省市区数据
    @POST("/comm/dic/area")
    suspend fun getAddressList(@Body requestBody: RequestBody?): Response<AddressEntity?>?

    // 获取国家数据
    @POST("/comm/dic/country")
    suspend fun getCountryEntityList(@Body requestBody: RequestBody?): Response<CountryEntity?>?

    // 新建就诊人
    @POST("/v1/p_app/pat/create")
    suspend fun postCreatePatient(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CreatePatientEntity?>?

    // 绑定就诊人
    @POST("/v1/p_app/pat/bind")
    suspend fun postBindingPatient(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CreatePatientEntity?>?

    // 没有手机号 绑定就诊人
    @POST("/v1/p_app/pat/bind_with_face_reco")
    suspend fun postBindingPatientNoPhone(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CreatePatientEntity?>?

    // 查询就诊人信息
    @POST("/v1/p_app/pat/info")
    suspend fun getPatientInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PatientDetailInfoEntity?>?


    // 查询就诊人信息
    @POST("/v1/p_app/pat/query/lastest_info")
    suspend fun getLastPatientInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PatientDetailInfoEntity?>?


    // 修改就诊人信息
    @POST("/v1/p_app/pat/edit")
    suspend fun postNewPatientInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<EditPatientResultEntity?>?


    // 就诊人列表
    @POST("/v1/p_app/pat/list")
    suspend fun getPatientList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PatientListEntity?>?

    // 查询就诊人是否存在
    @POST("/v1/p_app/pat/query")
    suspend fun QueryPatientInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryPatientInfoEntity?>?

    @POST("/minio/token")
    suspend fun getMinIOToken(@Body requestBody: RequestBody?): Response<MinIOTokenEntity?>?

    @Multipart
    @POST("/minio/upload")
    suspend fun uploadImages(@Part partLis: MutableList<MultipartBody.Part?>?): Response<ResponseBody?>?

    // 单纯人脸识别
    @POST("/v1/p_app/pat/face_recognition")
    suspend fun getFaceRecognition(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FaceRecognitionEntity?>?

    // 在线建档人脸识别
    @POST("/v1/p_app/pat/pat_face_recognition")
    suspend fun getBookBuildFaceRecognition(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FaceRecognitionEntity?>?

    //删除就诊人
    @POST("/v1/p_app/pat/del")
    suspend fun postDeletePatient(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DeletePatientEntity?>?

    //设置默认就诊人
    @POST("/v1/p_app/pat/set/default")
    suspend fun postSetDefaultPatient(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SetDefaultPatientEntity?>?

    // 科室列表
    @POST("/v1/p_app/sche_dept/list")
    suspend fun getDeptmentList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DeptmentListEntity?>?

    // 挂号科室停机维护
    @POST("/comm/system_maintain/scheduledept")
    suspend fun getServerStopInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ServerStopNoticeEntity?>?

    // 挂号科室停机维护
    @POST("/comm/system_maintain/limit_param")
    suspend fun getBackendParams(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BackendParamsEntity?>?

    // 挂号左侧医生列表 按医生挂号
    @POST("/v1/p_app/sche_info/doc/left_doc_list")
    suspend fun getDoctorList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<GuaHaoDoctorListEntity?>?

    // 挂号左侧医生列表 按日期挂号
    @POST("/v1/p_app/sche_info/day/left_doc_list")
    suspend fun getDoctorListByDate(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<GuaHaoDoctorListByDateEntity?>?

    //右侧医生数据
    @POST("/v1/p_app/sche_info/right_doc_sche")
    suspend fun getDoctorScheduleInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<GuaHaoDoctorScheduleEntity?>?

    //医生介绍
    @POST("/v1/p_app/doctor/info")
    suspend fun getDoctorDetailInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DoctorInfoEntity?>?

    //获取号段
    @POST("/v1/p_app/sche_info/num_section")
    suspend fun getDoctorSchedulesData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DoctorSchedulesEntity?>?

    //预约渠道
    @POST("/v1/p_app/apt/channel")
    suspend fun getGuaHaoChannelList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ChannelListEntity?>?

    //获取挂号记录
    @POST("/v1/p_app/apt/record")
    suspend fun getGuaHaoRecordList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<GuaHaoRecordListEntity?>?

    //预问诊开关
    @POST("/comm/system_maintain/limit_param")
    suspend fun getLimitParam(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<LimitParamEntity?>?

    //获取挂号记录详情
    @POST("/v1/p_app/apt/record_info")
    suspend fun getGuaHaoRecordDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<GuaHaoRecordDetailEntity?>?

    //锁号
    @POST("/v1/p_app/apt/reg")
    suspend fun postLockRegistered(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<LockRegisteredEntity?>?

    //还号（取消挂号未缴费）
    @POST("/v1/p_app/apt/cancel")
    suspend fun postCancelRegistered(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CancelEntity?>?

    //在线取号
    @POST("/v1/p_app/apt/aptcfm")
    suspend fun postTakeNubmerOnLine(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //退号退费
    @POST("/v1/p_app/apt_trade/refund")
    suspend fun postRefundRegistered(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<RefundEntity?>?

    //预约挂号 生成微信 支付宝支付订单
    @POST("/v1/p_app/apt_trade/unifiedorder")
    suspend fun postCreatePayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayOrderInfoEntity?>?

    //住院服务 生成订单
    @POST("/v1/p_app/advance_trade/unifiedorder")
    suspend fun postCreateHRPayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OutpatientPaymentPayOrderEntity?>?

    //住院充值 生成订单
    @POST("/v1/p_app/inp_recharge_trade/unifiedorder")
    suspend fun postCreateHRRechargePayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OutpatientPaymentPayOrderEntity?>?

    //划价
    @POST("/v1/p_app/apt/charge")
    suspend fun postHuaJia(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HuaJiaEntity?>?

    //查询支付订单
    @POST("/v1/p_app/apt_trade/queryorder")
    suspend fun queryPayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryOrderPayStatusEntity?>?

    //查询住院服务支付订单
    @POST("/v1/p_app/advance_trade/queryorder")
    suspend fun queryHRPayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryOrderPayStatusEntity?>?

    //查询住院充值支付订单
    @POST("/v1/p_app/inp_recharge_trade/queryorder")
    suspend fun queryHRRechargePayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryOrderPayStatusEntity?>?

    //校验隐私密码
    @POST("/v1/p_app/pat/check/priv_pwd")
    suspend fun postCheckPrivatePWD(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PrivatePassWordEntity?>?

    //忘记隐私密码
    @POST("/v1/p_app/pat/forget/priv_pwd")
    suspend fun postForgetPWD(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PrivatePassWordEntity?>?

    //设置隐私保护密码 首次
    @POST("/v1/p_app/pat/open/privacy")
    suspend fun postSetPrivatePWD(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PrivatePassWordEntity?>?

    //更新隐私保护状态
    @POST("/v1/p_app/pat/update/priv_status")
    suspend fun postUpdatePrivatePWDStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PrivatePassWordEntity?>?

    //更新隐私密码
    @POST("/v1/p_app/pat/update/priv_pwd")
    suspend fun postChangePrivatePWD(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PrivatePassWordEntity?>?

    //检查报告列表
    @POST("/v2/p_app/report/inspect/list")
    suspend fun queryJianChaList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ReportListEntity?>?

    //检查报告详情
    @POST("/v2/p_app/report/inspect/detail")
    suspend fun queryJianChaDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ReportDetailEntity?>?

    //检验报告列表
    @POST("/v1/p_app/report/lab/list")
    suspend fun queryJianYanList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ReportListEntity?>?

    //检验报告详情
    //    @POST("/v1/p_app/report/lab/detail")
    @POST("/v1/p_app/report/lab/info")
    suspend fun queryJianYanDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ReportDetailEntity?>?


    //电子检查单待缴费列表
    @POST("/v1/p_app/outpatient/ith_unpaid_exam_list")
    suspend fun getUnpaidExamList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidListEntity?>?


    //电子检查单未缴费详情
    @POST("/v1/p_app/outpatient/ith_unpaid_exam_detail")
    suspend fun getExamUnpaidDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ExamUnPaidDetailEntity?>?

    //电子检查单已缴费列表
    @POST("/v1/p_app/outpatient/ith_paid_exam_list")
    suspend fun getPaidExamList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidListEntity?>?

    //电子检查单已缴费详情
    @POST("/v1/p_app/outpatient/ith_paid_exam_detail")
    suspend fun getExamPaidTestDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ExamUnPaidDetailEntity?>?

    //检查电子导诊单
    @POST("/v1/p_app/consultation_exam/appl_form")
    suspend fun queryExamApplForm(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ExamGuideEntity?>?


    //检查点卡片消息确认支付状态
    @POST("/v1/p_app/consultation_exam/qr_pay_status")
    suspend fun queryExamQrPayStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QrPayStatusEntity?>?

    //电子检验单列表
    @POST("/v1/p_app/outpatient/ith_unpaid_test_list")
    suspend fun getUnpaidTestList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidListEntity?>?


    //电子检验单未缴费详情
    @POST("/v1/p_app/outpatient/ith_unpaid_test_detail")
    suspend fun getInspectUnpaidDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidDetailEntity?>?


    //检验点卡片消息确认支付状态
    @POST("/v1/p_app/consultation_test/qr_pay_status")
    suspend fun queryQrPayStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QrPayStatusEntity?>?


    //检验电子导诊单
    @POST("/v1/p_app/consultation_test/appl_form")
    suspend fun queryApplForm(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<InspectGuideEntity?>?


    //电子检验单已缴费列表
    @POST("/v1/p_app/outpatient/ith_paid_test_list")
    suspend fun getPaidTestList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidListEntity?>?


    //电子检验单已缴费详情
    @POST("/v1/p_app/outpatient/ith_paid_test_detail")
    suspend fun getPaidTestDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidDetailEntity?>?


    //门诊未缴费列表
    @POST("/v1/p_app/outpatient/unpaid_list")
    suspend fun getUnpaidList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidListEntity?>?

    //门诊未缴费详情
    @POST("/v1/p_app/outpatient/unpaid_detail")
    suspend fun getUnpaidDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidDetailEntity?>?

    //门诊退费列表
    @POST("/v1/p_app/outpatient/refund_list")
    suspend fun getRefundOPList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidListEntity?>?

    //门诊退费详情
    @POST("/v1/p_app/outpatient/refund_detail")
    suspend fun getRefundOPDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidDetailEntity?>?


    //门诊已缴费列表
    @POST("/v1/p_app/outpatient/paid_list")
    suspend fun getPaidList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidListEntity?>?

    //门诊已缴费详情
    @POST("/v1/p_app/outpatient/paid_detail")
    suspend fun getPaidDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnPaidDetailEntity?>?

    //门诊缴费 划价
    @POST("/v1/p_app/out_trade/charge")
    suspend fun postOutpatientPaymentHuaJia(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OutpatientPaymentHuaJiaEntity?>?

    //门诊缴费 下订单
    @POST("/v1/p_app/out_trade/unifiedorder")
    suspend fun postOutpatientPaymentCreatePayOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayOrderInfoEntity?>?

    //门诊缴费 订单支付状态查询
    @POST("/v1/p_app/out_trade/queryorder")
    suspend fun queryOutpatientPaymentPayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OutpatientPaymentOrderStatusEntity?>?

    //门诊缴费 查询订单支付信息
    @POST("/v1/p_app/out_trade/payinfo")
    suspend fun queryOutpatientPaymentPaymentDetailInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OutPatientPaymenPayInfoEntity?>?

    //获取动态提示、通知消息内容
    @POST("/v1/sa_prompt/content")
    suspend fun getNoticeData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<NoticeEntity?>?

    //获取更新通知接口
    @POST("/v1/sa_app_version/info")
    suspend fun getUpdateInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UpdateInfoEntity?>?

    //获取院区列表
    @POST("/v1/sa_hospital_area/list")
    suspend fun getHospitalList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HospitalListEntity?>?

    //查询微信绑定状态
    @POST("/v1/p_app/user/query_bind_status")
    suspend fun queryBindingWechatStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryBindingWechatEntity?>?

    //绑定微信
    @POST("/v1/p_app/user/bind_wechat_in_my")
    suspend fun bindingWechat(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BindingWechatEntity?>?

    //解除绑定微信
    @POST("/v1/p_app/user/unbind_wechat_in_my")
    suspend fun unbindingWechat(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<UnbindingWechatEntity?>?

    //复诊科室列表
    @POST("/v1/p_app/follow_dept/list")
    suspend fun getSVDeptListData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVDeptListEntity?>?

    //复诊医生列表
    @POST("/v1/p_app/follow_doctor/list")
    suspend fun getSVDDoctorListData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVDoctorListEntity?>?

    //复诊医生列表职称排序选项
    @POST("/v1/p_app/follow_doctor/title_sort_ops")
    suspend fun queryTitleSortOps(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SortOpsEntity?>?

    //复诊医生列表综合排序选项
    @POST("/v1/p_app/follow_doctor/comp_sort_ops")
    suspend fun queryCompSortOps(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SortOpsEntity?>?

    //复诊医生搜索
    @POST("/v1/p_app/follow_doctor/search")
    suspend fun getSVDoctorSearchData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVSearchDoctorEntity?>?

    //复诊医生主页信息
    @POST("/v1/p_app/follow_doctor/doctor_home")
    suspend fun getSVDoctorInfoData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVDoctorInfoEntity?>?

    //关注和取消复诊医生
    @POST("/v1/p_app/follow_doctor/focus")
    suspend fun focusSVDoctor(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FocusDoctorEntity?>?

    //关注的复诊医生
    @POST("/v1/p_app/follow_doctor/my_focused_doctor")
    suspend fun myFocusSVDoctorList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MyFoucusSVDoctorEntity?>?

    //医生评价消息列表
    @POST("/v1/consultation/evaluate/doctor_evaluation")
    suspend fun getSVDoctorEvaluationDatas(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DoctorEvaluationEntity?>?

    //本次咨询目的list
    @POST("/v1/p_app/consult/follow_aim")
    suspend fun getFollowAimDatas(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FollowAimEntity?>?

    //疾病名称list
    @POST("/v1/p_app/consult/follow_disease")
    suspend fun getFollowDiseaseDatas(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FollowDiseaseEntity?>?

    //创建复诊信息
    @POST("/v2/p_app/consult/follow_submit")
    suspend fun postCreateSVOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVCreateOrderEntity?>?

    //医保分解
    @POST("/v1/p_app/consult/follow_yb_analyze")
    suspend fun postYBAnalysis(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<YBAnalysisEntity?>?

    //医保分解
    @POST("/v1/p_app/consult/follow_patient")
    suspend fun postReadYiBaoKa(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //注销账号
    @POST("/v1/p_app/user/cancellation")
    suspend fun postCancellation(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //在线复诊 划价
    @POST("/v1/p_app/consult/follow_charge")
    suspend fun postSVHuaJia(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVHuaJiaEntity?>?

    //在线复诊 下订单
    @POST("/v1/p_app/consult_trade/unifiedorder")
    suspend fun postSVCreatePayOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVPayOrderEntity?>?

    //在线复诊 订单列表
    @POST("/v1/p_app/consult/my_follow_order")
    suspend fun getSVOrderListData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVOrderListEntity?>?

    //在线复诊 订单支付状态查询
    @POST("/v1/p_app/consult_trade/queryorder")
    suspend fun querySVPayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVOrderStatusEntity?>?

    //在线复诊 订单详情
    @POST("/v1/p_app/consult/follow_order_info")
    suspend fun getSVOrderDetailData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVOrderDetailDataEntity?>?

    //在线复诊 取消咨询订单
    @POST("/v1/p_app/consult/follow_cancel")
    suspend fun postCancelSVOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SVOrderDetailDataEntity?>?

    //专家咨询列表
    @POST("/v1/p_app/consult/expert_consult")
    suspend fun getExpertConsultList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ExpertConsultEntity?>?

    //聊天列表数据
    @POST("/v1/chat_msg/message_list")
    suspend fun getMessageList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<IMMessageListEntity?>?

    //发送聊天消息
    @POST("/v1/chat_msg/send_msg")
    suspend fun sendMessage(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SendIMMessageEntity?>?

    //撤回聊天消息
    @POST("/v1/chat_msg/revoke_msg")
    suspend fun withdrawMessage(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<WithDrawIMMessageEntity?>?

    //更新 语音已读状态
    @POST("/v1/chat_msg/audio_read")
    suspend fun postAudioReadStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //结束咨询订单
    @POST("/v1/p_app/consult/close")
    suspend fun postFinishZiXunOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //提交意见反馈
    @POST("/v1/comm/feedback/submit")
    suspend fun postFeedBackContent(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //意见反馈历史记录
    @POST("/v1/comm/feedback/history")
    suspend fun getFeedBackHistoryData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FeedBackHistoryEntity?>?

    //意见反馈详情
    @POST("/v1/comm/feedback/info")
    suspend fun getFeedBackDetailData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FeedBackDetailEntity?>?

    //物流地址列表
    @POST("/deliver/address/list")
    suspend fun getDeliverAddressList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AddressListEntity?>?

    //修改物流地址
    @POST("/deliver/address/update")
    suspend fun postModifyAddress(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //添加物流地址
    @POST("/deliver/address/add")
    suspend fun postAddAddress(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //删除物流地址
    @POST("/deliver/address/del")
    suspend fun postDeleteAddress(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //设置默认物流地址
    @POST("/deliver/address/setdef")
    suspend fun postSetDefaultAddress(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //我的处方列表
    @POST("/v1/p_app/prescription/list")
    suspend fun getPrescriptionListData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PrescriptionListEntity?>?

    //处方 订单详情
    @POST("/v1/p_app/prescription/purchase")
    suspend fun getPrescriptionOrderDetailData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PurchaseEntity?>?

    //处方 缴费后 订单详情
    @POST("/v1/p_app/prescription/view_purchase_order")
    suspend fun getPrescriptionOrderDetailPaymentDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PurchaseEntity?>?

    //处方提示语
    @POST("/comm/system_maintain/limit_param")
    suspend fun postLimitParam(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //处方 提交订单
    @POST("/v1/p_app/prescription/submit_purchase_way")
    suspend fun postSubmitPurchaseWay(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SubmitPurchaseEntity?>?

    //获取banner
    @GET("/v1/sa_banner/list")
    suspend fun getBannerList(@Header("Authorization") token: String?): Response<BannerListEntity?>?

    //获取banner详情
    @POST("/v1/sa_banner/info")
    suspend fun getBannerItemDetailInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BannerItemDetailInfoEntity?>?

    //获取首页健康资讯
    @GET("/v1/sa_infomation/home")
    suspend fun getHomeInfoData(@Header("Authorization") token: String?): Response<HomeInfoEntity?>?

    //获取首页健康资讯,咨询类型列表
    @GET("/v1/sa_infomation/type/list")
    suspend fun getHomeInfoTypeList(@Header("Authorization") token: String?): Response<HomeInfoTypeListEntity?>?

    //获取首页健康资讯内容列表
    @POST("/v1/sa_infomation/list")
    suspend fun getHomeInfoList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HomeInfoContentListEntity?>?

    //获取首页功能按钮列表
    @POST("/v1/app/menu/home/category")
    suspend fun getHomeCategoryList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HomeMenuEntity?>?


    //获取首页健康资讯详情
    @POST("/v1/sa_infomation/info")
    suspend fun getHomeInfoDetailData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HomeInfoDetailEntity?>?

    //获取医院中心信息
    @GET("/v1/sa_hospital_area/info")
    suspend fun getHomeHospitalInfoData(@Header("Authorization") token: String?): Response<HomeHospitalInfoEntity?>?

    //获取医院中心信息
    @POST("/v1/app/menu/list")
    suspend fun getHomeMenuData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HomeMenuEntity?>?

    //处方划价
    @POST("/v1/p_app/prescription/charge")
    suspend fun postPresHuaJia(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PresHuaJiaEntity?>?

    //处方生成支付订单
    @POST("/v1/p_app/prescription_trade/unifiedorder")
    suspend fun postPresCreatePayOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PresPayOrderEntity?>?

    //处方支付结果查询
    @POST("/v1/p_app/prescription_trade/queryorder")
    suspend fun postPresCheckPayOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PresCheckPayOrderEntity?>?

    //处方物流接口 病案邮寄
    @POST("/v1/p_app/discharge_data/sf_routes")
    suspend fun postSFRoutesBA(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<LogisticsInfoEntity?>?

    //处方物流接口 处方邮寄
    @POST("/v1/p_app/prescription/sf_routes")
    suspend fun postSFRoutes(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<LogisticsInfoEntity?>?

    //处方分方
    @POST("/v1/p_app/prescription/split_result")
    suspend fun postPresSplitResult(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PresSplitResultEntity?>?

    //处方分方详情
    @POST("/v1/p_app/prescription/split_detail")
    suspend fun postPresSplitDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PresSplitDetailEntity?>?

    //首页医生搜索
    @POST("/v1/p_app/home_page/search")
    suspend fun postHomePageSearch(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HomePageSearchEntity?>?

    @POST("/v1/p_app/doctor/search")
    suspend fun postGuaHaoPageSearch(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<GuaHaoSearhDoctorEntity?>?

    //帮助中心（主页列表）
    @POST("/v1/p_app/help_center/home")
    suspend fun getHelpCenterData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HelpCenterDataEntity?>?

    //帮助中心（列表）
    @POST("/v1/p_app/help_center/list")
    suspend fun getHelpCenterListData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HelpCenterListDataEntity?>?

    //帮助中心（问题详情）
    @POST("/v1/p_app/help_center/detail")
    suspend fun getHelpCenterListItemData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HelpCenterListItemDataEntity?>?

    //停诊医生列表
    @POST("/v1/p_app/hospital_center/stop_visit_list")
    suspend fun getStopVisitListData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<StopVisitListEntity?>?

    //临床科室
    @GET("/v1/sa_department/feature")
    suspend fun getFeatureDeptList(@Header("Authorization") token: String?): Response<FeatureDeptEntity?>? //临床科室

    @POST("/v1/sa_department/info")
    suspend fun getDeptInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DeptInfoEntity?>?

    //出诊医生
    @GET("/v1/sa_doctor/hot")
    suspend fun getHotDoctorList(@Header("Authorization") token: String?): Response<HotDoctorEntity?>?

    //住院许可证列表
    @POST("/v1/p_app/inpatient_pre_reg/query_admis_permit")
    suspend fun getAdmisPermitList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdmisPermitEntity?>?

    //住院充值许可证列表
    @POST("/v1/p_app/inpatient_recharge/permit")
    suspend fun getRechargePermitList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdmisPermitEntity?>?

    //住院充值许可证详情
    @POST("/v1/p_app/inpatient_recharge/permit_info")
    suspend fun getRechargePermitDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HRRechargeDetailEntity?>?

    //查看住院许可证信息
    @POST("/v1/p_app/inpatient_pre_reg/permit_info")
    suspend fun getAdmisPermitDetailInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdmisPermitDetailInfoEntity?>?

    //住院费用查询列表
    @POST("/v1/p_app/inpatient_recharge/permit_cost")
    suspend fun getPermitCostList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdmisPermitEntity?>?

    //住院费用查询详情的住院信息
    @POST("/v1/p_app/inpatient_recharge/amt_cost")
    suspend fun getAmtCost(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HospitalAmtCostEntity?>?

    //住院费用查询详情的住院费用项目
    @POST("/v1/p_app/inpatient_recharge/balance")
    suspend fun getInpatientRechargeBalance(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<InpatientRechargeBalanceEntity?>?

    //工作状态
    @POST("/comm/dic/job_status")
    suspend fun getJobStatusDataList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<JobStatusEntity?>?

    //联系人关系
    @POST("/comm/dic/contact_type")
    suspend fun getContactTypeList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ContactTypeEntity?>?

    //查看住院许可证编辑信息
    @POST("/v1/p_app/inpatient_pre_reg/reg_detail")
    suspend fun getRegDetailData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<RegDetailEntity?>?

    //填写住院许可证编辑信息
    @POST("/v1/p_app/inpatient_pre_reg/register")
    suspend fun postPatientRegData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PatientRegDataEntity?>?

    //编辑住院许可证编辑信息
    @POST("/v1/p_app/inpatient_pre_reg/reg_edit")
    suspend fun postEditPatientRegData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PatientRegDataEntity?>?

    //预缴费记录列表
    @POST("/v1/p_app/inpatient_pre_reg/advance_record")
    suspend fun getAdvanceRecordList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdvanceRecordEntity?>?

    //住院充值缴费记录列表
    @POST("/v1/p_app/inpatient_recharge/pay_record")
    suspend fun getRechargeRecordList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdvanceRecordEntity?>?

    //住院充值缴费记录详情
    @POST("/v1/p_app/inpatient_recharge/pay_detail")
    suspend fun getRechargeRecordDetailInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdvanceRecordDetailInfoEntity?>?

    //预缴费记录详情
    @POST("/v1/p_app/inpatient_pre_reg/advance_record_info")
    suspend fun getAdvanceRecordDetailInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdvanceRecordDetailInfoEntity?>?

    //预缴费退款
    @POST("/v1/p_app/inpatient_pre_reg/advance_appli_rd")
    suspend fun postAdvanceRAppliRD(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //取消申请退款
    @POST("/v1/p_app/inpatient_pre_reg/advance_appli_rd_cancel")
    suspend fun postCancelAdvanceRAppliRD(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CancelRefundEntity?>?

    //提交医生评价
    @POST("/v1/consultation/evaluate/pat/add")
    suspend fun postDoctorEvaluate(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //获取医生评价
    @POST("/v1/consultation/evaluate/info")
    suspend fun getDoctorEvaluateInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HasEvaluateInfoEntity?>?

    //消息中心列表
    @POST("/v1/chat/push_message_user/list")
    suspend fun getMessageCenterList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MessageCenterListEntity?>?

    //消息全部接收或关闭
    @POST("/v1/chat/push_message_user/whole_on_off")
    suspend fun postMessageCenterOnOff(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //消息中心详情列表信息
    @POST("/v1/chat/push_message/list")
    suspend fun postMessageCenterDetailItemList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MessageCenterDetailItemListEntity?>?

    //服务反馈列表
    @POST("/v1/p_app/srv_feedback/to_list")
    suspend fun getServiceFeedbackList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ServiceFeedbackListEntity?>?

    //服务反馈记录
    @POST("/v1/p_app/srv_feedback/record")
    suspend fun getServiceFeedbackHistoryList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ServiceFeedbackListEntity?>?

    //服务反馈原因
    @POST("/v1/p_app/srv_feedback/reason")
    suspend fun getServiceFeedbackReasonList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FollowAimEntity?>?

    //服务反馈提交
    @POST("/v1/p_app/srv_feedback/submit")
    suspend fun postServiceFeedbackResult(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //服务反馈详情
    @POST("/v1/p_app/srv_feedback/info")
    suspend fun getServiceFeedbackResultDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ServiceFeedbackResultDetailEntity?>?

    //取消服务反馈
    @POST("/v1/p_app/srv_feedback/cancel_apl")
    suspend fun cancelServiceFeedback(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //你是不是在找
    @POST("/v1/p_app/prescription/recommend_drug")
    suspend fun getDrugRecommendList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DrugListEntity?>?

    //获取搜索药品结果
    @POST("/v1/d_app/prescription/drug_query")
    suspend fun getDrugList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DrugListEntity2?>?

    //获取药品信息
    @POST("/v1/d_app/prescription/drug_info")
    suspend fun getDrugDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DrugDetailEntity?>?

    //门诊病历
    @POST("/v1/d_app/medical/med_list")
    suspend fun queryMedListData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MedListEntity?>?

    //体检
    @POST("/v1/p_app/pat/physical_page")
    suspend fun queryTiJianUrl(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<TiJianEntity?>?

    //首页消息小红点
    @POST("/v1/chat/push_message_user/unread_count")
    suspend fun getUnreadCount(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //云胶片
    @POST("/v1/p_app/cloud_film")
    suspend fun queryCloudFilm(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //可预约检查列表
    @POST("/v1/p_app/exam_appoint/items")
    suspend fun queryExamAppointPreject(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ExamAppointPrejectEntity?>?

    //已预约检查列表
    @POST("/v1/p_app/exam_appoint/apted")
    suspend fun queryExamAppointApted(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ExamAppointPrejectEntity?>?

    //已预约检查详情
    @POST("/v1/p_app/exam_appoint/apted_detail")
    suspend fun queryExamAppointApDetails(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ExamAppointPrejectDetailsEntity?>?

    //预约检查提交
    @POST("/v1/p_app/exam_appoint/make_apt")
    suspend fun queryExamAppointSubmit(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AtpDataSubmitEntity?>?

    //预约检查取消
    @POST("/v1/p_app/exam_appoint/cancel_apt")
    suspend fun queryExamAppointCancel(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //预约检查日期列表
    @POST("/v1/p_app/exam_appoint/apt_date_list")
    suspend fun queryExamAppointAptDateList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AtpDataListEntity?>?

    //预约检查时间列表
    @POST("/v1/p_app/exam_appoint/apt_time_list")
    suspend fun queryExamAppointAptTimeList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AtpTimeListEntity?>?

    //药品说明
    @POST("/v1/p_app/phhcwsi/info")
    suspend fun queryPhhcwsiInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //候诊查询
    @POST("/v1/p_app/queue_query")
    suspend fun queryQueueData(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueueQueryEntity?>?

    //电生理报告
    @POST("/v1/p_app/report/electrophy/list")
    suspend fun queryElectrophyList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ReportListEntity?>?

    //境内报告
    @POST("/v1/p_app/report/endoscope/list")
    suspend fun queryEndoscopeList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<JingneiListEntity?>?

    @POST("/v1/p_app/report/pathology/list")
    suspend fun queryPathologyList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PathologyEntity?>?

    //境内报告详情
    @POST("/v1/p_app/report/endoscope/detail")
    suspend fun queryJianNeiDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ReportDetailEntity?>?


    //出院带药列表
    @POST("/v1/p_app/inpatient_recharge/permit_medication")
    suspend fun queryPermitMedicationList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdmisPermitEntity?>?

    //出院带药详情
    @POST("/v1/p_app/inpatient_pre_reg/medication")
    suspend fun queryPermitMedicationDetails(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MedicationDetailEntity?>?


    //导诊跳转挂号自费科室接口
    @POST("/v1/p_app/sche_dept/selfpay_list")
    suspend fun querySelfpayList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SelfpayListEntity?>?

    //挂号获取移动支付确认页授权码
    @POST("/v1/p_app/apt/ybmpay/get_pay_cnfm_code")
    suspend fun getPayCnfmCode(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayCnfmCodeEntity?>?

    //挂号获取移动支付退款页授权码
    @POST("/v1/p_app/apt/ybmpay/get_refund_code")
    suspend fun getRefundCode(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayCnfmCodeEntity?>?

    //门诊缴费获取移动支付确认页授权码
    @POST("/v1/p_app/outpatient/ybmpay/get_pay_cnfm_code")
    suspend fun getoutpatientPayCnfmCode(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayCnfmCodeEntity?>?

    //获取医保凭证二维码
    @POST("/comm/yb_mpay/get_ec_code")
    suspend fun getEcCode(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayCnfmCodeEntity?>?

    //满意度评价挂号记录列表
    @POST("/v1/p_app/satisfaction/apt_list")
    suspend fun querySatisfactionAptList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SatisfactionAptListEntity?>?

    //满意度评价的住院列表
    @POST("/v1/p_app/satisfaction/inhospital_list")
    suspend fun querySatisfactionInhospitalList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SatisfactionInhospitalListEntity?>?

    //满意度评价问题
    @POST("/v1/p_app/satisfaction/evaluate_type")
    suspend fun querySatisfactionEvaluateTypeList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SatisfactionEvaluateTypeEntity?>?

    //满意度评价提交
    @POST("/v1/p_app/satisfaction/submit")
    suspend fun satisfactionSubmit(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SatisfactionSurverySubmitEntity?>?

    //满意度评价详情
    @POST("/v1/p_app/satisfaction/view_evaluate")
    suspend fun satisfactionDetails(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SatisfactionEvaluateDetialsEntity?>?

    //电子发票
    @POST("/v1/p_app/electronic/list")
    suspend fun queryElectronicList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ElectronicListEntity?>?

    //处方支付获取医保授权码接口
    @POST("/v2/p_app/prescription/ybmpay/get_pay_cnfm_code")
    suspend fun queryPrescriptionPayCnfmCode(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayCnfmCodeEntity?>?

    //医保处方提交订单
    @POST("/v2/p_app/prescription/submit_purchase_way")
    suspend fun postPreSubmitPurchaseWay(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SubmitPurchaseEntity?>?

    //医保处方查询支付订单
    @POST("/v2/p_app/prescription/queryorder")
    suspend fun queryPrePayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryOrderEntity?>?

    //物流下单接口
    @POST("/v2/p_app/prescription/sf_purchase_order")
    suspend fun sfPurchaseOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<PayCnfmCodeEntity?>?

    //查询顺丰物流地址
    @POST("/v2/p_app/prescription/query_sf_place")
    suspend fun querySfPlace(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SfPlaceEntity?>?

    //智能陪诊
    @POST("/accompany/get_access_url")
    suspend fun getAccUrl(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //智能导诊单
    @POST("/v1/p_app/outpatient/hospital_guide")
    suspend fun getHospitalGuide(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HospitalGuideEntity?>?

    @POST("/v1/p_app/pat/vip_face_pass")
    suspend fun checkFaceStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<FaceStatusEntity?>?

    @POST("/v1/app/tencent-face/face-id")
    suspend fun getTXFaceId(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<TXFaceIdEntity?>?

    //    查询自助出院住院证列表
    @POST("/v1/p_app/self_discharge/hospitalization_permit_list")
    suspend fun querySelfDischargeList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<SelfDischargeListEntity?>?

    // 查询自助住院住院费用
    @POST("/v1/p_app/self_discharge/hospitalization_expenses")
    suspend fun queryHospitalizationExpenses(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<HospitalizationExpenseseEntity?>?

    // 自助出院住院费用确认结算
    @POST("/v1/p_app/self_discharge/confirm_settle")
    suspend fun confirmSettle(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ConfirmSettleEntity?>?

    //出院补缴费用 生成订单
    @POST("/v1/p_app/self_discharge_trade/unifiedorder")
    suspend fun postSelfDischargeTradePayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OutpatientPaymentPayOrderEntity?>?

    //查询出院补缴费用订单
    @POST("/v1/p_app/self_discharge_trade/queryorder")
    suspend fun querySelfDischargeTradePayOrderStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryOrderPayStatusEntity?>?

    //查询出院申请退费
    @POST("/v1/p_app/self_discharge/apply_refund")
    suspend fun submitApplyRefund(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?


    //自助出院费用清单和入院证明
    @POST("/v1/p_app/self_discharge/hospitalization_cost_list")
    suspend fun hospitalizationCostList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?


    //出院材料邮寄接口:申请订单列表
    @POST("/v1/p_app/discharge_data/post_order_list")
    suspend fun zyPostOrderList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MaterialListEntity?>?

    //出院材料邮寄接口:住院证列表
    @POST("/v1/p_app/discharge_data/hospitalization_permit_list")
    suspend fun zyHospitalizationPermitList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DischargeRecordEntity?>?


    //出院材料邮寄接口:提交订单
    @POST("/v1/p_app/discharge_data/create_post_order")
    suspend fun zyCreatePostOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //出院材料邮寄接口:查看订单
    @POST("/v1/p_app/discharge_data/view_order")
    suspend fun zyViewOrder(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<zyClDetaileEntity?>?

    //出院材料邮寄接口:查看顺丰物流路由信息
    @POST("/v1/p_app/discharge_data/sf_routes")
    suspend fun zySfRoutes(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?


    //修改患者手机号
    @POST("/v1/p_app/pat/modify_mob")
    suspend fun modify_mob(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //修改患者更多信息
    @POST("/v1/p_app/pat/edit")
    suspend fun modify_pat(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?


    //1、非实名建档接口:
    @POST("/v1/p_app/pat/non_real_name/create")
    suspend fun postCreatePatientNotFace(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CreatePatientEntity?>?

    //修改患者手机号2
    @POST("/v1/p_app/pat/modify_iih_mob")
    suspend fun modify_iih_mob(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?

    //关注 取消关注
    @POST("/v1/p_app/appoint_doctor/focus")
    suspend fun fous(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity?>?


    //关注医生列表
    @POST("/v1/p_app/appoint_doctor/my_focused_doctor")
    suspend fun fousdoctor(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MyFoucusSVDoctorEntity2?>?


    //关注医生总数
    @POST("/v1/p_app/appoint_doctor/total")
    suspend fun fousdoctortotal(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<MutableMap<String?, Any?>?>?


    //挂号记录增加其他预约渠道查询功能
    @POST("/v1/p_app/apt/other/record")
    suspend fun otherRecord(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<GuaHaoRecordListEntity?>?

    //候补记录状态列表
    @POST("/v1/p_app/apt_alternate/alternate_status")
    suspend fun getAlternateStatus(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AlternateStatusEntity?>?

    //候补记录状态列表
    @POST("/v1/p_app/apt_alternate/record")
    suspend fun getAlternateList(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AlternateListEntity?>?

    //提交候补订单
    @POST("/v1/p_app/apt_alternate/reg")
    suspend fun postAlternateReg(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AlternateRegEntity?>?

    //获取候补记录详情
    @POST("/v1/p_app/apt_alternate/record_info")
    suspend fun getAlternateRecordDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AlternateRecordDetailEntity?>?

    //取消候补
    @POST("/v1/p_app/apt_alternate/cancel")
    suspend fun postCancelAlternate(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CancelEntity?>?

    @POST("/v1/p_app/apt_alternate/charge")
    suspend fun postAlternateHuaJia(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AlternateHuaJiaEntity?>?

    //查询支付订单
    @POST("/v1/p_app/apt_alternate_trade/queryorder")
    suspend fun queryAlternatePayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AlternateOrderPayStatusEntity?>?

    //预约挂号 生成微信 支付宝支付订单
    @POST("/v1/p_app/apt_alternate_trade/unifiedorder")
    suspend fun postCreateAlternatePayOrderInfo(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AlternatePayOrderInfoEntity?>?

    @POST("/v1/p_app/user/change_phone")
    suspend fun changePhone(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<ChangePhoneEntity?>?

    @POST("/v1/p_app/pat/original_phone")
    suspend fun getOriginalPhone(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OrignalPhoneEntity?>?

    @POST("/v1/p_app/pat/online_replace")
    suspend fun getOnlineReplace(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<OnlineReplaceEntity?>?

    // 医生二维码介绍页面
    @POST("/v1/d_app/home_page/business_card")
    suspend fun queryBusinessCard(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BusinessCardEntity?>?

    // 复诊加号记录
    @POST("/v1/p_app/consultation_appoint/record")
    suspend fun queryConsulationAppointRecord(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<AdditionRecordListEntity?>?

    // 取消复诊加号
    @POST("/v1/p_app/consultation_appoint/reg_cancel")
    suspend fun cancleConsulationAppoint(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<CommonEntity?>?

    //获取kong zi du
    @POST("/v1/p_app/sche_dept/profession")
    suspend fun getDeptProfession(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<DeptProfessionEntity?>?

    //.患者端首页就诊信息提醒
    @POST("/v1/p_app/apt/visit_info_remind")
    suspend fun visit_info(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<VisitEntity?>?

    //预约挂号医保支付状态查询  pay_status=1 表示支付成功  0表示失败
    @POST("/v1/p_app/insurance/appointment/query_status")
    suspend fun feeQuery(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryOrderPayStatusEntity?>?

    //门诊缴费医保支付状态查询：  pay_status=1 表示支付成功  0表示失败
    @POST("/v1/p_app/insurance/outpatient/query_status")
    suspend fun insurancefeeQuery(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<QueryOrderPayStatusEntity?>?


    //生成预问诊id:
    @POST("/v1/p_app/consult/gen/pre_consultation_id")
    suspend fun GetPreconsultation_id(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity2<PreconsultationEntity?>?>?


    //历史病情：
    @POST("/v1/p_app/consult/historical/illness")
    suspend fun GetHistoryIllness(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity2<MutableList<HistoryEntity?>?>?>?


    //查看历史病情详情：
    @POST("/v1/p_app/consult/view/illness/info")
    suspend fun GetHistoryIllnessDetail(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity2<PreconsultationEntity?>?>?


    //医生端开处方，查询患者填写的病史
    @POST("/v1/d_app/prescription/medical_history")
    suspend fun medical_history(@Header("Authorization") token: String?, @Body requestBody: RequestBody?): Response<BaseEntity2<MedicalHistoryEntity?>?>?

}