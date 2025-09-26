package com.example.mycompose.repository.http;

import com.example.mycompose.repository.entity.AdditionRecordListEntity;
import com.example.mycompose.repository.entity.AddressEntity;
import com.example.mycompose.repository.entity.AddressListEntity;
import com.example.mycompose.repository.entity.AdmisPermitDetailInfoEntity;
import com.example.mycompose.repository.entity.AdmisPermitEntity;
import com.example.mycompose.repository.entity.AdvanceRecordDetailInfoEntity;
import com.example.mycompose.repository.entity.AdvanceRecordEntity;
import com.example.mycompose.repository.entity.AlternateHuaJiaEntity;
import com.example.mycompose.repository.entity.AlternateListEntity;
import com.example.mycompose.repository.entity.AlternateOrderPayStatusEntity;
import com.example.mycompose.repository.entity.AlternatePayOrderInfoEntity;
import com.example.mycompose.repository.entity.AlternateRecordDetailEntity;
import com.example.mycompose.repository.entity.AlternateRegEntity;
import com.example.mycompose.repository.entity.AlternateStatusEntity;
import com.example.mycompose.repository.entity.AtpDataListEntity;
import com.example.mycompose.repository.entity.AtpDataSubmitEntity;
import com.example.mycompose.repository.entity.AtpTimeListEntity;
import com.example.mycompose.repository.entity.BackendParamsEntity;
import com.example.mycompose.repository.entity.BannerItemDetailInfoEntity;
import com.example.mycompose.repository.entity.BannerListEntity;
import com.example.mycompose.repository.entity.BaseEntity;
import com.example.mycompose.repository.entity.BaseEntity2;
import com.example.mycompose.repository.entity.BindingWechatEntity;
import com.example.mycompose.repository.entity.CancelEntity;
import com.example.mycompose.repository.entity.CancelRefundEntity;
import com.example.mycompose.repository.entity.ChangePhoneEntity;
import com.example.mycompose.repository.entity.ChannelListEntity;
import com.example.mycompose.repository.entity.CommonEntity;
import com.example.mycompose.repository.entity.ConfirmSettleEntity;
import com.example.mycompose.repository.entity.ContactTypeEntity;
import com.example.mycompose.repository.entity.CountryEntity;
import com.example.mycompose.repository.entity.CreatePatientEntity;
import com.example.mycompose.repository.entity.DeletePatientEntity;
import com.example.mycompose.repository.entity.DeptInfoEntity;
import com.example.mycompose.repository.entity.DeptProfessionEntity;
import com.example.mycompose.repository.entity.DeptmentListEntity;
import com.example.mycompose.repository.entity.DischargeRecordEntity;
import com.example.mycompose.repository.entity.DoctorEvaluationEntity;
import com.example.mycompose.repository.entity.DoctorInfoEntity;
import com.example.mycompose.repository.entity.DoctorSchedulesEntity;
import com.example.mycompose.repository.entity.DrugDetailEntity;
import com.example.mycompose.repository.entity.DrugListEntity;
import com.example.mycompose.repository.entity.DrugListEntity2;
import com.example.mycompose.repository.entity.EditPatientResultEntity;
import com.example.mycompose.repository.entity.ElectronicListEntity;
import com.example.mycompose.repository.entity.ExamAppointPrejectDetailsEntity;
import com.example.mycompose.repository.entity.ExamAppointPrejectEntity;
import com.example.mycompose.repository.entity.ExamGuideEntity;
import com.example.mycompose.repository.entity.ExamUnPaidDetailEntity;
import com.example.mycompose.repository.entity.ExpertConsultEntity;
import com.example.mycompose.repository.entity.FaceRecognitionEntity;
import com.example.mycompose.repository.entity.FaceStatusEntity;
import com.example.mycompose.repository.entity.FamilyRoleEntity;
import com.example.mycompose.repository.entity.FeatureDeptEntity;
import com.example.mycompose.repository.entity.FeedBackDetailEntity;
import com.example.mycompose.repository.entity.FeedBackHistoryEntity;
import com.example.mycompose.repository.entity.FocusDoctorEntity;
import com.example.mycompose.repository.entity.FollowAimEntity;
import com.example.mycompose.repository.entity.FollowDiseaseEntity;
import com.example.mycompose.repository.entity.ForgetPasswordEntity;
import com.example.mycompose.repository.entity.GuaHaoDoctorListByDateEntity;
import com.example.mycompose.repository.entity.GuaHaoDoctorListEntity;
import com.example.mycompose.repository.entity.GuaHaoDoctorScheduleEntity;
import com.example.mycompose.repository.entity.GuaHaoRecordDetailEntity;
import com.example.mycompose.repository.entity.GuaHaoRecordListEntity;
import com.example.mycompose.repository.entity.GuaHaoSearhDoctorEntity;
import com.example.mycompose.repository.entity.HRRechargeDetailEntity;
import com.example.mycompose.repository.entity.HasEvaluateInfoEntity;
import com.example.mycompose.repository.entity.HelpCenterDataEntity;
import com.example.mycompose.repository.entity.HelpCenterListDataEntity;
import com.example.mycompose.repository.entity.HelpCenterListItemDataEntity;
import com.example.mycompose.repository.entity.HistoryEntity;
import com.example.mycompose.repository.entity.HomeHospitalInfoEntity;
import com.example.mycompose.repository.entity.HomeInfoContentListEntity;
import com.example.mycompose.repository.entity.HomeInfoDetailEntity;
import com.example.mycompose.repository.entity.HomeInfoEntity;
import com.example.mycompose.repository.entity.HomeInfoTypeListEntity;
import com.example.mycompose.repository.entity.HomeMenuEntity;
import com.example.mycompose.repository.entity.HomePageSearchEntity;
import com.example.mycompose.repository.entity.HospitalAmtCostEntity;
import com.example.mycompose.repository.entity.HospitalGuideEntity;
import com.example.mycompose.repository.entity.HospitalListEntity;
import com.example.mycompose.repository.entity.HospitalizationExpenseseEntity;
import com.example.mycompose.repository.entity.HotDoctorEntity;
import com.example.mycompose.repository.entity.HuaJiaEntity;
import com.example.mycompose.repository.entity.IMMessageListEntity;
import com.example.mycompose.repository.entity.IdCardTypeListEntity;
import com.example.mycompose.repository.entity.InpatientRechargeBalanceEntity;
import com.example.mycompose.repository.entity.InspectGuideEntity;
import com.example.mycompose.repository.entity.JingneiListEntity;
import com.example.mycompose.repository.entity.JobStatusEntity;
import com.example.mycompose.repository.entity.LimitParamEntity;
import com.example.mycompose.repository.entity.LockRegisteredEntity;
import com.example.mycompose.repository.entity.LoginEntity;
import com.example.mycompose.repository.entity.LogisticsInfoEntity;
import com.example.mycompose.repository.entity.MaritalStatusEntity;
import com.example.mycompose.repository.entity.MaterialListEntity;
import com.example.mycompose.repository.entity.MedListEntity;
import com.example.mycompose.repository.entity.MedicalHistoryEntity;
import com.example.mycompose.repository.entity.MedicationDetailEntity;
import com.example.mycompose.repository.entity.MessageCenterDetailItemListEntity;
import com.example.mycompose.repository.entity.MessageCenterListEntity;
import com.example.mycompose.repository.entity.MinIOTokenEntity;
import com.example.mycompose.repository.entity.ModifyPasswordEntity;
import com.example.mycompose.repository.entity.MyFoucusSVDoctorEntity;
import com.example.mycompose.repository.entity.MyFoucusSVDoctorEntity2;
import com.example.mycompose.repository.entity.NationEntity;
import com.example.mycompose.repository.entity.NoticeEntity;
import com.example.mycompose.repository.entity.OccupationEntity;
import com.example.mycompose.repository.entity.OutPatientPaymenPayInfoEntity;
import com.example.mycompose.repository.entity.OutpatientPaymentHuaJiaEntity;
import com.example.mycompose.repository.entity.OutpatientPaymentOrderStatusEntity;
import com.example.mycompose.repository.entity.OutpatientPaymentPayOrderEntity;
import com.example.mycompose.repository.entity.PatientDetailInfoEntity;
import com.example.mycompose.repository.entity.PatientListEntity;
import com.example.mycompose.repository.entity.PatientRegDataEntity;
import com.example.mycompose.repository.entity.PayCnfmCodeEntity;
import com.example.mycompose.repository.entity.PayOrderInfoEntity;
import com.example.mycompose.repository.entity.PreconsultationEntity;
import com.example.mycompose.repository.entity.PresCheckPayOrderEntity;
import com.example.mycompose.repository.entity.PresHuaJiaEntity;
import com.example.mycompose.repository.entity.PresPayOrderEntity;
import com.example.mycompose.repository.entity.PresSplitDetailEntity;
import com.example.mycompose.repository.entity.PresSplitResultEntity;
import com.example.mycompose.repository.entity.PrescriptionListEntity;
import com.example.mycompose.repository.entity.PrivatePassWordEntity;
import com.example.mycompose.repository.entity.PurchaseEntity;
import com.example.mycompose.repository.entity.QrPayStatusEntity;
import com.example.mycompose.repository.entity.QueryBindingWechatEntity;
import com.example.mycompose.repository.entity.QueryOrderEntity;
import com.example.mycompose.repository.entity.QueryOrderPayStatusEntity;
import com.example.mycompose.repository.entity.QueryPatientInfoEntity;
import com.example.mycompose.repository.entity.QueueQueryEntity;
import com.example.mycompose.repository.entity.RefreshTokenEntity;
import com.example.mycompose.repository.entity.RefundEntity;
import com.example.mycompose.repository.entity.RegDetailEntity;
import com.example.mycompose.repository.entity.ReportDetailEntity;
import com.example.mycompose.repository.entity.ReportListEntity;
import com.example.mycompose.repository.entity.SVCreateOrderEntity;
import com.example.mycompose.repository.entity.SVDeptListEntity;
import com.example.mycompose.repository.entity.SVDoctorInfoEntity;
import com.example.mycompose.repository.entity.SVDoctorListEntity;
import com.example.mycompose.repository.entity.SVHuaJiaEntity;
import com.example.mycompose.repository.entity.SVOrderDetailDataEntity;
import com.example.mycompose.repository.entity.SVOrderListEntity;
import com.example.mycompose.repository.entity.SVOrderStatusEntity;
import com.example.mycompose.repository.entity.SVPayOrderEntity;
import com.example.mycompose.repository.entity.SVSearchDoctorEntity;
import com.example.mycompose.repository.entity.SatisfactionAptListEntity;
import com.example.mycompose.repository.entity.SatisfactionEvaluateDetialsEntity;
import com.example.mycompose.repository.entity.SatisfactionEvaluateTypeEntity;
import com.example.mycompose.repository.entity.SatisfactionInhospitalListEntity;
import com.example.mycompose.repository.entity.SatisfactionSurverySubmitEntity;
import com.example.mycompose.repository.entity.SelfDischargeListEntity;
import com.example.mycompose.repository.entity.SelfpayListEntity;
import com.example.mycompose.repository.entity.SendIMMessageEntity;
import com.example.mycompose.repository.entity.ServerStopNoticeEntity;
import com.example.mycompose.repository.entity.ServiceFeedbackListEntity;
import com.example.mycompose.repository.entity.ServiceFeedbackResultDetailEntity;
import com.example.mycompose.repository.entity.SetDefaultPatientEntity;
import com.example.mycompose.repository.entity.SfPlaceEntity;
import com.example.mycompose.repository.entity.SortOpsEntity;
import com.example.mycompose.repository.entity.StopVisitListEntity;
import com.example.mycompose.repository.entity.SubmitPurchaseEntity;
import com.example.mycompose.repository.entity.TXFaceIdEntity;
import com.example.mycompose.repository.entity.TiJianEntity;
import com.example.mycompose.repository.entity.UnPaidDetailEntity;
import com.example.mycompose.repository.entity.UnPaidListEntity;
import com.example.mycompose.repository.entity.UnbindingWechatEntity;
import com.example.mycompose.repository.entity.UpdateInfoEntity;
import com.example.mycompose.repository.entity.VerifyCodeEntity;
import com.example.mycompose.repository.entity.VisitEntity;
import com.example.mycompose.repository.entity.WeChatUserBean;
import com.example.mycompose.repository.entity.WithDrawIMMessageEntity;
import com.example.mycompose.repository.entity.YBAnalysisEntity;
import com.example.mycompose.repository.entity.zyClDetaileEntity;
import com.founder.internet.healthcare.repository.entity.BusinessCardEntity;
import com.founder.internet.healthcare.repository.entity.OnlineReplaceEntity;
import com.founder.internet.healthcare.repository.entity.OrignalPhoneEntity;
import com.founder.internet.healthcare.repository.entity.PathologyEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ca\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ8\u0010\f\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ8\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ@\u0010$\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010%\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ$\u0010\'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J0\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u000109\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010;\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ$\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010?\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010@J0\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ$\u0010C\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010D\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J0\u0010E\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010D\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ$\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010G\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J0\u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010I\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010K\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010M\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010O\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010Q\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010S\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010U\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010W\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010[\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010]\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010^\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010_\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010`\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010a\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010e\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010e\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010h\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010i\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ$\u0010j\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010k\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J$\u0010l\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010m\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010@J0\u0010n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010o\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010p\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010q\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010s\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010u\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010v\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010w\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010x\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010y\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010{\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010|\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010}\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ0\u0010~\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u007f\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0080\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0082\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u0084\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010@J&\u0010\u0086\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0087\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010@J2\u0010\u0088\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008a\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u008c\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010@J2\u0010\u008e\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008f\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0091\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0092\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u0093\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010@J&\u0010\u0095\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0096\u0001\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J2\u0010\u0097\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0098\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0099\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009b\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009d\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009e\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009f\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a0\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00a1\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a2\u0001\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J2\u0010\u00a3\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a4\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a5\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a6\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00a7\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a8\u0001\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J&\u0010\u00a9\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00aa\u0001\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J2\u0010\u00ab\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00ad\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ae\u0001\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J2\u0010\u00af\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b0\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b1\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b2\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b3\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b4\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b6\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b7\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b8\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b9\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009e\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ba\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00bb\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00bc\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00bd\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00be\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00bf\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c0\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c1\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c2\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c1\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c3\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c4\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00c5\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00c6\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00c7\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00c8\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c9\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ca\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00cb\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00cc\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00cd\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ce\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00cf\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d0\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d1\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d2\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d3\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d4\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d5\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d6\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d7\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d8\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d9\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00da\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00db\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00dc\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00dd\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00de\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00df\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00de\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00e0\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010s\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e1\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e2\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e3\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e4\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e5\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e6\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e7\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e8\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e9\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ea\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00eb\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ec\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ed\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00ee\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ef\u0001\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J1\u0010\u00f0\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00f1\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00f2\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00f3\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00f4\u0001\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J%\u0010\u00f5\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J:\u0010\u00f6\u0001\u001a\u0015\u0012\u000f\u0012\r\u0012\u0007\u0012\u0005\u0018\u00010\u00f7\u0001\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00f8\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00f9\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00fa\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00fb\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00fc\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00fd\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010{\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00fe\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00ff\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0080\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0082\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u0084\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0085\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0087\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0088\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008a\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008c\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008d\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d8\u0001\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u008e\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008f\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0091\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0092\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0094\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0095\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0096\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0095\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0097\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0098\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0099\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009b\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u009d\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009e\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009f\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00a0\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a1\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a2\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00a3\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00a4\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a5\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a6\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a7\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a8\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a9\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00aa\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ab\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00ac\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ad\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ae\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00af\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b0\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00b1\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00b2\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b3\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b4\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00b5\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b6\u0002\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J2\u0010\u00b7\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b8\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b9\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ba\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00bb\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00bc\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a2\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00bd\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00be\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00bf\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c0\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c1\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c2\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c3\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c4\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c5\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c6\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c7\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c8\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00c9\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ca\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00cb\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00cc\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00cd\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ce\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00cd\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00cf\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d0\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d1\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d2\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d3\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0095\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00d4\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00d5\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d6\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00d7\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d8\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00d9\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00be\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00da\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00db\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00dc\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00dd\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00de\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00df\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e0\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e1\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e2\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e3\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e4\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e5\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00e6\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e7\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e8\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00e9\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ea\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00eb\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ec\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ed\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ee\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ef\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00f0\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00f1\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00f2\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00f3\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00f4\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00f5\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00f6\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00f7\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00f8\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00f9\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00fa\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00fb\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00fc\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00fa\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00fd\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00fe\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ff\u0002\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u0081\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u0082\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0083\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0085\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0087\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ee\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0088\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0089\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008a\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ee\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008b\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u008c\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008d\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u008f\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0091\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0092\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u0093\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0094\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0095\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u0096\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u0097\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0098\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0099\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u009a\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009b\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009c\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009d\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u009e\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u009f\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a0\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a1\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a2\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a3\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a4\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a5\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a6\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00a7\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00a8\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00a9\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00aa\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ab\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ad\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ae\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00af\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00e8\u0002\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00b0\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b1\u0003\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J2\u0010\u00b2\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b3\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b4\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b5\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00b6\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b7\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u00b8\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00b9\u0003\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010)J1\u0010\u00ba\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00bb\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00bc\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00bd\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00be\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00bf\u0003\u0018\u00010\u00032\u0014\b\u0001\u0010\u00c0\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c1\u0003\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00c2\u0003J2\u0010\u00c3\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c4\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c5\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c6\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00c7\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00c8\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00c9\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00ca\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00cb\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ1\u0010\u00cc\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u00cd\u0003\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00ce\u0003\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u00cf\u0003"}, d2 = {"Lcom/example/mycompose/repository/http/ApiService;", "", "GetHistoryIllness", "Lretrofit2/Response;", "Lcom/example/mycompose/repository/entity/BaseEntity2;", "", "Lcom/example/mycompose/repository/entity/HistoryEntity;", "token", "", "requestBody", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetHistoryIllnessDetail", "Lcom/example/mycompose/repository/entity/PreconsultationEntity;", "GetPreconsultation_id", "QueryPatientInfo", "Lcom/example/mycompose/repository/entity/QueryPatientInfoEntity;", "bindingWechat", "Lcom/example/mycompose/repository/entity/BindingWechatEntity;", "cancelServiceFeedback", "Lcom/example/mycompose/repository/entity/CommonEntity;", "cancleConsulationAppoint", "changePhone", "Lcom/example/mycompose/repository/entity/ChangePhoneEntity;", "checkFaceStatus", "Lcom/example/mycompose/repository/entity/FaceStatusEntity;", "confirmSettle", "Lcom/example/mycompose/repository/entity/ConfirmSettleEntity;", "feeQuery", "Lcom/example/mycompose/repository/entity/QueryOrderPayStatusEntity;", "focusSVDoctor", "Lcom/example/mycompose/repository/entity/FocusDoctorEntity;", "fous", "Lcom/example/mycompose/repository/entity/BaseEntity;", "fousdoctor", "Lcom/example/mycompose/repository/entity/MyFoucusSVDoctorEntity2;", "fousdoctortotal", "", "getAccUrl", "getAddressList", "Lcom/example/mycompose/repository/entity/AddressEntity;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdmisPermitDetailInfo", "Lcom/example/mycompose/repository/entity/AdmisPermitDetailInfoEntity;", "getAdmisPermitList", "Lcom/example/mycompose/repository/entity/AdmisPermitEntity;", "getAdvanceRecordDetailInfo", "Lcom/example/mycompose/repository/entity/AdvanceRecordDetailInfoEntity;", "getAdvanceRecordList", "Lcom/example/mycompose/repository/entity/AdvanceRecordEntity;", "getAlternateList", "Lcom/example/mycompose/repository/entity/AlternateListEntity;", "getAlternateRecordDetail", "Lcom/example/mycompose/repository/entity/AlternateRecordDetailEntity;", "getAlternateStatus", "Lcom/example/mycompose/repository/entity/AlternateStatusEntity;", "getAmtCost", "Lcom/example/mycompose/repository/entity/HospitalAmtCostEntity;", "getBackendParams", "Lcom/example/mycompose/repository/entity/BackendParamsEntity;", "getBannerItemDetailInfo", "Lcom/example/mycompose/repository/entity/BannerItemDetailInfoEntity;", "getBannerList", "Lcom/example/mycompose/repository/entity/BannerListEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBookBuildFaceRecognition", "Lcom/example/mycompose/repository/entity/FaceRecognitionEntity;", "getContactList", "Lcom/example/mycompose/repository/entity/ContactTypeEntity;", "getContactTypeList", "getCountryEntityList", "Lcom/example/mycompose/repository/entity/CountryEntity;", "getDeliverAddressList", "Lcom/example/mycompose/repository/entity/AddressListEntity;", "getDeptInfo", "Lcom/example/mycompose/repository/entity/DeptInfoEntity;", "getDeptProfession", "Lcom/example/mycompose/repository/entity/DeptProfessionEntity;", "getDeptmentList", "Lcom/example/mycompose/repository/entity/DeptmentListEntity;", "getDoctorDetailInfo", "Lcom/example/mycompose/repository/entity/DoctorInfoEntity;", "getDoctorEvaluateInfo", "Lcom/example/mycompose/repository/entity/HasEvaluateInfoEntity;", "getDoctorList", "Lcom/example/mycompose/repository/entity/GuaHaoDoctorListEntity;", "getDoctorListByDate", "Lcom/example/mycompose/repository/entity/GuaHaoDoctorListByDateEntity;", "getDoctorScheduleInfo", "Lcom/example/mycompose/repository/entity/GuaHaoDoctorScheduleEntity;", "getDoctorSchedulesData", "Lcom/example/mycompose/repository/entity/DoctorSchedulesEntity;", "getDrugDetail", "Lcom/example/mycompose/repository/entity/DrugDetailEntity;", "getDrugList", "Lcom/example/mycompose/repository/entity/DrugListEntity2;", "getDrugRecommendList", "Lcom/example/mycompose/repository/entity/DrugListEntity;", "getEcCode", "Lcom/example/mycompose/repository/entity/PayCnfmCodeEntity;", "getExamPaidTestDetail", "Lcom/example/mycompose/repository/entity/ExamUnPaidDetailEntity;", "getExamUnpaidDetail", "getExpertConsultList", "Lcom/example/mycompose/repository/entity/ExpertConsultEntity;", "getFaceRecognition", "getFamilyRole", "Lcom/example/mycompose/repository/entity/FamilyRoleEntity;", "getFeatureDeptList", "Lcom/example/mycompose/repository/entity/FeatureDeptEntity;", "getFeedBackDetailData", "Lcom/example/mycompose/repository/entity/FeedBackDetailEntity;", "getFeedBackHistoryData", "Lcom/example/mycompose/repository/entity/FeedBackHistoryEntity;", "getFollowAimDatas", "Lcom/example/mycompose/repository/entity/FollowAimEntity;", "getFollowDiseaseDatas", "Lcom/example/mycompose/repository/entity/FollowDiseaseEntity;", "getGuaHaoChannelList", "Lcom/example/mycompose/repository/entity/ChannelListEntity;", "getGuaHaoRecordDetail", "Lcom/example/mycompose/repository/entity/GuaHaoRecordDetailEntity;", "getGuaHaoRecordList", "Lcom/example/mycompose/repository/entity/GuaHaoRecordListEntity;", "getHelpCenterData", "Lcom/example/mycompose/repository/entity/HelpCenterDataEntity;", "getHelpCenterListData", "Lcom/example/mycompose/repository/entity/HelpCenterListDataEntity;", "getHelpCenterListItemData", "Lcom/example/mycompose/repository/entity/HelpCenterListItemDataEntity;", "getHomeCategoryList", "Lcom/example/mycompose/repository/entity/HomeMenuEntity;", "getHomeHospitalInfoData", "Lcom/example/mycompose/repository/entity/HomeHospitalInfoEntity;", "getHomeInfoData", "Lcom/example/mycompose/repository/entity/HomeInfoEntity;", "getHomeInfoDetailData", "Lcom/example/mycompose/repository/entity/HomeInfoDetailEntity;", "getHomeInfoList", "Lcom/example/mycompose/repository/entity/HomeInfoContentListEntity;", "getHomeInfoTypeList", "Lcom/example/mycompose/repository/entity/HomeInfoTypeListEntity;", "getHomeMenuData", "getHospitalGuide", "Lcom/example/mycompose/repository/entity/HospitalGuideEntity;", "getHospitalList", "Lcom/example/mycompose/repository/entity/HospitalListEntity;", "getHotDoctorList", "Lcom/example/mycompose/repository/entity/HotDoctorEntity;", "getIdCardTypeList", "Lcom/example/mycompose/repository/entity/IdCardTypeListEntity;", "getInpatientRechargeBalance", "Lcom/example/mycompose/repository/entity/InpatientRechargeBalanceEntity;", "getInspectUnpaidDetail", "Lcom/example/mycompose/repository/entity/UnPaidDetailEntity;", "getJobStatusDataList", "Lcom/example/mycompose/repository/entity/JobStatusEntity;", "getLastPatientInfo", "Lcom/example/mycompose/repository/entity/PatientDetailInfoEntity;", "getLimitParam", "Lcom/example/mycompose/repository/entity/LimitParamEntity;", "getMaritalStatusList", "Lcom/example/mycompose/repository/entity/MaritalStatusEntity;", "getMessageCenterList", "Lcom/example/mycompose/repository/entity/MessageCenterListEntity;", "getMessageList", "Lcom/example/mycompose/repository/entity/IMMessageListEntity;", "getMinIOToken", "Lcom/example/mycompose/repository/entity/MinIOTokenEntity;", "getNationList", "Lcom/example/mycompose/repository/entity/NationEntity;", "getNoticeData", "Lcom/example/mycompose/repository/entity/NoticeEntity;", "getOccupationList", "Lcom/example/mycompose/repository/entity/OccupationEntity;", "getOnlineReplace", "Lcom/founder/internet/healthcare/repository/entity/OnlineReplaceEntity;", "getOriginalPhone", "Lcom/founder/internet/healthcare/repository/entity/OrignalPhoneEntity;", "getPaidDetail", "getPaidExamList", "Lcom/example/mycompose/repository/entity/UnPaidListEntity;", "getPaidList", "getPaidTestDetail", "getPaidTestList", "getPatientInfo", "getPatientList", "Lcom/example/mycompose/repository/entity/PatientListEntity;", "getPayCnfmCode", "getPermitCostList", "getPrescriptionListData", "Lcom/example/mycompose/repository/entity/PrescriptionListEntity;", "getPrescriptionOrderDetailData", "Lcom/example/mycompose/repository/entity/PurchaseEntity;", "getPrescriptionOrderDetailPaymentDetail", "getRechargePermitDetail", "Lcom/example/mycompose/repository/entity/HRRechargeDetailEntity;", "getRechargePermitList", "getRechargeRecordDetailInfo", "getRechargeRecordList", "getRefundCode", "getRefundOPDetail", "getRefundOPList", "getRegDetailData", "Lcom/example/mycompose/repository/entity/RegDetailEntity;", "getSVDDoctorListData", "Lcom/example/mycompose/repository/entity/SVDoctorListEntity;", "getSVDeptListData", "Lcom/example/mycompose/repository/entity/SVDeptListEntity;", "getSVDoctorEvaluationDatas", "Lcom/example/mycompose/repository/entity/DoctorEvaluationEntity;", "getSVDoctorInfoData", "Lcom/example/mycompose/repository/entity/SVDoctorInfoEntity;", "getSVDoctorSearchData", "Lcom/example/mycompose/repository/entity/SVSearchDoctorEntity;", "getSVOrderDetailData", "Lcom/example/mycompose/repository/entity/SVOrderDetailDataEntity;", "getSVOrderListData", "Lcom/example/mycompose/repository/entity/SVOrderListEntity;", "getServerStopInfo", "Lcom/example/mycompose/repository/entity/ServerStopNoticeEntity;", "getServiceFeedbackHistoryList", "Lcom/example/mycompose/repository/entity/ServiceFeedbackListEntity;", "getServiceFeedbackList", "getServiceFeedbackReasonList", "getServiceFeedbackResultDetail", "Lcom/example/mycompose/repository/entity/ServiceFeedbackResultDetailEntity;", "getStopVisitListData", "Lcom/example/mycompose/repository/entity/StopVisitListEntity;", "getTXFaceId", "Lcom/example/mycompose/repository/entity/TXFaceIdEntity;", "getUnpaidDetail", "getUnpaidExamList", "getUnpaidList", "getUnpaidTestList", "getUnreadCount", "getUpdateInfo", "Lcom/example/mycompose/repository/entity/UpdateInfoEntity;", "getWechatCode", "Lcom/example/mycompose/repository/entity/WeChatUserBean;", "getoutpatientPayCnfmCode", "hospitalizationCostList", "insurancefeeQuery", "loginPost", "Lcom/example/mycompose/repository/entity/LoginEntity;", "logoutPost", "medical_history", "Lcom/example/mycompose/repository/entity/MedicalHistoryEntity;", "modify_iih_mob", "modify_mob", "modify_pat", "myFocusSVDoctorList", "Lcom/example/mycompose/repository/entity/MyFoucusSVDoctorEntity;", "otherRecord", "postAddAddress", "postAdvanceRAppliRD", "postAlternateHuaJia", "Lcom/example/mycompose/repository/entity/AlternateHuaJiaEntity;", "postAlternateReg", "Lcom/example/mycompose/repository/entity/AlternateRegEntity;", "postAudioReadStatus", "postBindingPatient", "Lcom/example/mycompose/repository/entity/CreatePatientEntity;", "postBindingPatientNoPhone", "postCancelAdvanceRAppliRD", "Lcom/example/mycompose/repository/entity/CancelRefundEntity;", "postCancelAlternate", "Lcom/example/mycompose/repository/entity/CancelEntity;", "postCancelRegistered", "postCancelSVOrder", "postCancellation", "postChangePrivatePWD", "Lcom/example/mycompose/repository/entity/PrivatePassWordEntity;", "postCheckPrivatePWD", "postCreateAlternatePayOrderInfo", "Lcom/example/mycompose/repository/entity/AlternatePayOrderInfoEntity;", "postCreateHRPayOrderInfo", "Lcom/example/mycompose/repository/entity/OutpatientPaymentPayOrderEntity;", "postCreateHRRechargePayOrderInfo", "postCreatePatient", "postCreatePatientNotFace", "postCreatePayOrderInfo", "Lcom/example/mycompose/repository/entity/PayOrderInfoEntity;", "postCreateSVOrder", "Lcom/example/mycompose/repository/entity/SVCreateOrderEntity;", "postDeleteAddress", "postDeletePatient", "Lcom/example/mycompose/repository/entity/DeletePatientEntity;", "postDoctorEvaluate", "postEditPatientRegData", "Lcom/example/mycompose/repository/entity/PatientRegDataEntity;", "postFeedBackContent", "postFinishZiXunOrder", "postForgetPWD", "postGuaHaoPageSearch", "Lcom/example/mycompose/repository/entity/GuaHaoSearhDoctorEntity;", "postHomePageSearch", "Lcom/example/mycompose/repository/entity/HomePageSearchEntity;", "postHuaJia", "Lcom/example/mycompose/repository/entity/HuaJiaEntity;", "postLimitParam", "postLockRegistered", "Lcom/example/mycompose/repository/entity/LockRegisteredEntity;", "postMessageCenterDetailItemList", "Lcom/example/mycompose/repository/entity/MessageCenterDetailItemListEntity;", "postMessageCenterOnOff", "postModifyAddress", "postModifyPassword", "Lcom/example/mycompose/repository/entity/ModifyPasswordEntity;", "postNewPassword", "Lcom/example/mycompose/repository/entity/ForgetPasswordEntity;", "postNewPatientInfo", "Lcom/example/mycompose/repository/entity/EditPatientResultEntity;", "postOutpatientPaymentCreatePayOrder", "postOutpatientPaymentHuaJia", "Lcom/example/mycompose/repository/entity/OutpatientPaymentHuaJiaEntity;", "postPatientRegData", "postPreSubmitPurchaseWay", "Lcom/example/mycompose/repository/entity/SubmitPurchaseEntity;", "postPresCheckPayOrder", "Lcom/example/mycompose/repository/entity/PresCheckPayOrderEntity;", "postPresCreatePayOrder", "Lcom/example/mycompose/repository/entity/PresPayOrderEntity;", "postPresHuaJia", "Lcom/example/mycompose/repository/entity/PresHuaJiaEntity;", "postPresSplitDetail", "Lcom/example/mycompose/repository/entity/PresSplitDetailEntity;", "postPresSplitResult", "Lcom/example/mycompose/repository/entity/PresSplitResultEntity;", "postReadYiBaoKa", "postRefundRegistered", "Lcom/example/mycompose/repository/entity/RefundEntity;", "postSFRoutes", "Lcom/example/mycompose/repository/entity/LogisticsInfoEntity;", "postSFRoutesBA", "postSVCreatePayOrder", "Lcom/example/mycompose/repository/entity/SVPayOrderEntity;", "postSVHuaJia", "Lcom/example/mycompose/repository/entity/SVHuaJiaEntity;", "postSelfDischargeTradePayOrderInfo", "postServiceFeedbackResult", "postSetDefaultAddress", "postSetDefaultPatient", "Lcom/example/mycompose/repository/entity/SetDefaultPatientEntity;", "postSetPrivatePWD", "postSubmitPurchaseWay", "postTakeNubmerOnLine", "postUpdatePrivatePWDStatus", "postYBAnalysis", "Lcom/example/mycompose/repository/entity/YBAnalysisEntity;", "queryAlternatePayOrderInfo", "Lcom/example/mycompose/repository/entity/AlternateOrderPayStatusEntity;", "queryApplForm", "Lcom/example/mycompose/repository/entity/InspectGuideEntity;", "queryBindingWechatStatus", "Lcom/example/mycompose/repository/entity/QueryBindingWechatEntity;", "queryBusinessCard", "Lcom/founder/internet/healthcare/repository/entity/BusinessCardEntity;", "queryCloudFilm", "queryCompSortOps", "Lcom/example/mycompose/repository/entity/SortOpsEntity;", "queryConsulationAppointRecord", "Lcom/example/mycompose/repository/entity/AdditionRecordListEntity;", "queryElectronicList", "Lcom/example/mycompose/repository/entity/ElectronicListEntity;", "queryElectrophyList", "Lcom/example/mycompose/repository/entity/ReportListEntity;", "queryEndoscopeList", "Lcom/example/mycompose/repository/entity/JingneiListEntity;", "queryExamApplForm", "Lcom/example/mycompose/repository/entity/ExamGuideEntity;", "queryExamAppointApDetails", "Lcom/example/mycompose/repository/entity/ExamAppointPrejectDetailsEntity;", "queryExamAppointAptDateList", "Lcom/example/mycompose/repository/entity/AtpDataListEntity;", "queryExamAppointAptTimeList", "Lcom/example/mycompose/repository/entity/AtpTimeListEntity;", "queryExamAppointApted", "Lcom/example/mycompose/repository/entity/ExamAppointPrejectEntity;", "queryExamAppointCancel", "queryExamAppointPreject", "queryExamAppointSubmit", "Lcom/example/mycompose/repository/entity/AtpDataSubmitEntity;", "queryExamQrPayStatus", "Lcom/example/mycompose/repository/entity/QrPayStatusEntity;", "queryHRPayOrderInfo", "queryHRRechargePayOrderInfo", "queryHospitalizationExpenses", "Lcom/example/mycompose/repository/entity/HospitalizationExpenseseEntity;", "queryJianChaDetail", "Lcom/example/mycompose/repository/entity/ReportDetailEntity;", "queryJianChaList", "queryJianNeiDetail", "queryJianYanDetail", "queryJianYanList", "queryMedListData", "Lcom/example/mycompose/repository/entity/MedListEntity;", "queryOutpatientPaymentPayOrderInfo", "Lcom/example/mycompose/repository/entity/OutpatientPaymentOrderStatusEntity;", "queryOutpatientPaymentPaymentDetailInfo", "Lcom/example/mycompose/repository/entity/OutPatientPaymenPayInfoEntity;", "queryPathologyList", "Lcom/founder/internet/healthcare/repository/entity/PathologyEntity;", "queryPayOrderInfo", "queryPermitMedicationDetails", "Lcom/example/mycompose/repository/entity/MedicationDetailEntity;", "queryPermitMedicationList", "queryPhhcwsiInfo", "queryPrePayOrderInfo", "Lcom/example/mycompose/repository/entity/QueryOrderEntity;", "queryPrescriptionPayCnfmCode", "queryQrPayStatus", "queryQueueData", "Lcom/example/mycompose/repository/entity/QueueQueryEntity;", "querySVPayOrderInfo", "Lcom/example/mycompose/repository/entity/SVOrderStatusEntity;", "querySatisfactionAptList", "Lcom/example/mycompose/repository/entity/SatisfactionAptListEntity;", "querySatisfactionEvaluateTypeList", "Lcom/example/mycompose/repository/entity/SatisfactionEvaluateTypeEntity;", "querySatisfactionInhospitalList", "Lcom/example/mycompose/repository/entity/SatisfactionInhospitalListEntity;", "querySelfDischargeList", "Lcom/example/mycompose/repository/entity/SelfDischargeListEntity;", "querySelfDischargeTradePayOrderStatus", "querySelfpayList", "Lcom/example/mycompose/repository/entity/SelfpayListEntity;", "querySfPlace", "Lcom/example/mycompose/repository/entity/SfPlaceEntity;", "queryTiJianUrl", "Lcom/example/mycompose/repository/entity/TiJianEntity;", "queryTitleSortOps", "refreshToken", "Lcom/example/mycompose/repository/entity/RefreshTokenEntity;", "satisfactionDetails", "Lcom/example/mycompose/repository/entity/SatisfactionEvaluateDetialsEntity;", "satisfactionSubmit", "Lcom/example/mycompose/repository/entity/SatisfactionSurverySubmitEntity;", "sendMessage", "Lcom/example/mycompose/repository/entity/SendIMMessageEntity;", "sendVerifyCode", "Lcom/example/mycompose/repository/entity/VerifyCodeEntity;", "sfPurchaseOrder", "submitApplyRefund", "unbindingWechat", "Lcom/example/mycompose/repository/entity/UnbindingWechatEntity;", "uploadImages", "Lokhttp3/ResponseBody;", "partLis", "Lokhttp3/MultipartBody$Part;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visit_info", "Lcom/example/mycompose/repository/entity/VisitEntity;", "withdrawMessage", "Lcom/example/mycompose/repository/entity/WithDrawIMMessageEntity;", "zyCreatePostOrder", "zyHospitalizationPermitList", "Lcom/example/mycompose/repository/entity/DischargeRecordEntity;", "zyPostOrderList", "Lcom/example/mycompose/repository/entity/MaterialListEntity;", "zySfRoutes", "zyViewOrder", "Lcom/example/mycompose/repository/entity/zyClDetaileEntity;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.POST(value = "/v1/comm/login")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loginPost(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.LoginEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/comm/logout")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object logoutPost(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/vc/trigger")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendVerifyCode(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.VerifyCodeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/wechat/code-exchange-userinfo")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWechatCode(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.WeChatUserBean>> $completion);
    
    @retrofit2.http.POST(value = "/v1/comm/forget/password")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postNewPassword(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ForgetPasswordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/comm/modify/password")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postModifyPassword(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ModifyPasswordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/refresh/token")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshToken(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.RefreshTokenEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/zj_type")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getIdCardTypeList(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.IdCardTypeListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/nation")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNationList(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.NationEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/marital_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMaritalStatusList(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MaritalStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/occupation")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOccupationList(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.OccupationEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/contact_type")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getContactList(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ContactTypeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/family_role")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFamilyRole(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FamilyRoleEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/area")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAddressList(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AddressEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/country")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCountryEntityList(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CountryEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/create")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreatePatient(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CreatePatientEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/bind")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postBindingPatient(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CreatePatientEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/bind_with_face_reco")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postBindingPatientNoPhone(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CreatePatientEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PatientDetailInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/query/lastest_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLastPatientInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PatientDetailInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/edit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postNewPatientInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.EditPatientResultEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PatientListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/query")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object QueryPatientInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryPatientInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/minio/token")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMinIOToken(@retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MinIOTokenEntity>> $completion);
    
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "/minio/upload")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImages(@retrofit2.http.Part()
    @org.jetbrains.annotations.Nullable()
    java.util.List<okhttp3.MultipartBody.Part> partLis, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/face_recognition")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFaceRecognition(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FaceRecognitionEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/pat_face_recognition")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBookBuildFaceRecognition(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FaceRecognitionEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/del")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postDeletePatient(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DeletePatientEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/set/default")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSetDefaultPatient(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SetDefaultPatientEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/sche_dept/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDeptmentList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DeptmentListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/system_maintain/scheduledept")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServerStopInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ServerStopNoticeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/system_maintain/limit_param")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBackendParams(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BackendParamsEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/sche_info/doc/left_doc_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDoctorList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.GuaHaoDoctorListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/sche_info/day/left_doc_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDoctorListByDate(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.GuaHaoDoctorListByDateEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/sche_info/right_doc_sche")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDoctorScheduleInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.GuaHaoDoctorScheduleEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/doctor/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDoctorDetailInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DoctorInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/sche_info/num_section")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDoctorSchedulesData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DoctorSchedulesEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/channel")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGuaHaoChannelList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ChannelListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/record")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGuaHaoRecordList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.GuaHaoRecordListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/system_maintain/limit_param")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLimitParam(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.LimitParamEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/record_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGuaHaoRecordDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.GuaHaoRecordDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/reg")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postLockRegistered(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.LockRegisteredEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/cancel")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCancelRegistered(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CancelEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/aptcfm")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postTakeNubmerOnLine(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_trade/refund")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postRefundRegistered(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.RefundEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreatePayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayOrderInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/advance_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreateHRPayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.OutpatientPaymentPayOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inp_recharge_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreateHRRechargePayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.OutpatientPaymentPayOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/charge")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postHuaJia(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HuaJiaEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryPayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryOrderPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/advance_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryHRPayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryOrderPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inp_recharge_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryHRRechargePayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryOrderPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/check/priv_pwd")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCheckPrivatePWD(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PrivatePassWordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/forget/priv_pwd")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postForgetPWD(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PrivatePassWordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/open/privacy")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSetPrivatePWD(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PrivatePassWordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/update/priv_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postUpdatePrivatePWDStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PrivatePassWordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/update/priv_pwd")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postChangePrivatePWD(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PrivatePassWordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/report/inspect/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryJianChaList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ReportListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/report/inspect/detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryJianChaDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ReportDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/report/lab/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryJianYanList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ReportListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/report/lab/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryJianYanDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ReportDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_unpaid_exam_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnpaidExamList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_unpaid_exam_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExamUnpaidDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ExamUnPaidDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_paid_exam_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaidExamList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_paid_exam_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExamPaidTestDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ExamUnPaidDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consultation_exam/appl_form")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamApplForm(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ExamGuideEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consultation_exam/qr_pay_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamQrPayStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QrPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_unpaid_test_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnpaidTestList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_unpaid_test_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getInspectUnpaidDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consultation_test/qr_pay_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryQrPayStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QrPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consultation_test/appl_form")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryApplForm(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.InspectGuideEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_paid_test_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaidTestList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ith_paid_test_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaidTestDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/unpaid_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnpaidList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/unpaid_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnpaidDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/refund_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRefundOPList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/refund_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRefundOPDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/paid_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaidList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/paid_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaidDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnPaidDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/out_trade/charge")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postOutpatientPaymentHuaJia(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.OutpatientPaymentHuaJiaEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/out_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postOutpatientPaymentCreatePayOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayOrderInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/out_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryOutpatientPaymentPayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.OutpatientPaymentOrderStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/out_trade/payinfo")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryOutpatientPaymentPaymentDetailInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.OutPatientPaymenPayInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/sa_prompt/content")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNoticeData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.NoticeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/sa_app_version/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUpdateInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UpdateInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/sa_hospital_area/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHospitalList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HospitalListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/user/query_bind_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryBindingWechatStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryBindingWechatEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/user/bind_wechat_in_my")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object bindingWechat(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BindingWechatEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/user/unbind_wechat_in_my")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object unbindingWechat(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.UnbindingWechatEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_dept/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSVDeptListData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVDeptListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_doctor/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSVDDoctorListData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVDoctorListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_doctor/title_sort_ops")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryTitleSortOps(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SortOpsEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_doctor/comp_sort_ops")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryCompSortOps(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SortOpsEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_doctor/search")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSVDoctorSearchData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVSearchDoctorEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_doctor/doctor_home")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSVDoctorInfoData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVDoctorInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_doctor/focus")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object focusSVDoctor(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FocusDoctorEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/follow_doctor/my_focused_doctor")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object myFocusSVDoctorList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MyFoucusSVDoctorEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/consultation/evaluate/doctor_evaluation")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSVDoctorEvaluationDatas(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DoctorEvaluationEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/follow_aim")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFollowAimDatas(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FollowAimEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/follow_disease")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFollowDiseaseDatas(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FollowDiseaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/consult/follow_submit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreateSVOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVCreateOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/follow_yb_analyze")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postYBAnalysis(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.YBAnalysisEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/follow_patient")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postReadYiBaoKa(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/user/cancellation")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCancellation(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/follow_charge")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSVHuaJia(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVHuaJiaEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSVCreatePayOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVPayOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/my_follow_order")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSVOrderListData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVOrderListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySVPayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVOrderStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/follow_order_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSVOrderDetailData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVOrderDetailDataEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/follow_cancel")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCancelSVOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SVOrderDetailDataEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/expert_consult")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExpertConsultList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ExpertConsultEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat_msg/message_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMessageList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.IMMessageListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat_msg/send_msg")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendMessage(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SendIMMessageEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat_msg/revoke_msg")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object withdrawMessage(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.WithDrawIMMessageEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat_msg/audio_read")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postAudioReadStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/close")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postFinishZiXunOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/comm/feedback/submit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postFeedBackContent(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/comm/feedback/history")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFeedBackHistoryData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FeedBackHistoryEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/comm/feedback/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFeedBackDetailData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FeedBackDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/deliver/address/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDeliverAddressList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AddressListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/deliver/address/update")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postModifyAddress(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/deliver/address/add")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postAddAddress(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/deliver/address/del")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postDeleteAddress(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/deliver/address/setdef")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSetDefaultAddress(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPrescriptionListData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PrescriptionListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/purchase")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPrescriptionOrderDetailData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PurchaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/view_purchase_order")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPrescriptionOrderDetailPaymentDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PurchaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/system_maintain/limit_param")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postLimitParam(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/submit_purchase_way")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSubmitPurchaseWay(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SubmitPurchaseEntity>> $completion);
    
    @retrofit2.http.GET(value = "/v1/sa_banner/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBannerList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BannerListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/sa_banner/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBannerItemDetailInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BannerItemDetailInfoEntity>> $completion);
    
    @retrofit2.http.GET(value = "/v1/sa_infomation/home")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomeInfoData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomeInfoEntity>> $completion);
    
    @retrofit2.http.GET(value = "/v1/sa_infomation/type/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomeInfoTypeList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomeInfoTypeListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/sa_infomation/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomeInfoList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomeInfoContentListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/app/menu/home/category")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomeCategoryList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomeMenuEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/sa_infomation/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomeInfoDetailData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomeInfoDetailEntity>> $completion);
    
    @retrofit2.http.GET(value = "/v1/sa_hospital_area/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomeHospitalInfoData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomeHospitalInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/app/menu/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomeMenuData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomeMenuEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/charge")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postPresHuaJia(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PresHuaJiaEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postPresCreatePayOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PresPayOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postPresCheckPayOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PresCheckPayOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/discharge_data/sf_routes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSFRoutesBA(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.LogisticsInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/sf_routes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSFRoutes(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.LogisticsInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/split_result")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postPresSplitResult(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PresSplitResultEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/split_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postPresSplitDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PresSplitDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/home_page/search")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postHomePageSearch(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HomePageSearchEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/doctor/search")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postGuaHaoPageSearch(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.GuaHaoSearhDoctorEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/help_center/home")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCenterData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HelpCenterDataEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/help_center/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCenterListData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HelpCenterListDataEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/help_center/detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCenterListItemData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HelpCenterListItemDataEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/hospital_center/stop_visit_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStopVisitListData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.StopVisitListEntity>> $completion);
    
    @retrofit2.http.GET(value = "/v1/sa_department/feature")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFeatureDeptList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FeatureDeptEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/sa_department/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDeptInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DeptInfoEntity>> $completion);
    
    @retrofit2.http.GET(value = "/v1/sa_doctor/hot")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHotDoctorList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HotDoctorEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/query_admis_permit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAdmisPermitList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdmisPermitEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/permit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRechargePermitList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdmisPermitEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/permit_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRechargePermitDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HRRechargeDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/permit_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAdmisPermitDetailInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdmisPermitDetailInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/permit_cost")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPermitCostList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdmisPermitEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/amt_cost")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAmtCost(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HospitalAmtCostEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/balance")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getInpatientRechargeBalance(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.InpatientRechargeBalanceEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/job_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getJobStatusDataList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.JobStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/dic/contact_type")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getContactTypeList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ContactTypeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/reg_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRegDetailData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.RegDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/register")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postPatientRegData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PatientRegDataEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/reg_edit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postEditPatientRegData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PatientRegDataEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/advance_record")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAdvanceRecordList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdvanceRecordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/pay_record")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRechargeRecordList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdvanceRecordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/pay_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRechargeRecordDetailInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdvanceRecordDetailInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/advance_record_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAdvanceRecordDetailInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdvanceRecordDetailInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/advance_appli_rd")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postAdvanceRAppliRD(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/advance_appli_rd_cancel")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCancelAdvanceRAppliRD(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CancelRefundEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/consultation/evaluate/pat/add")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postDoctorEvaluate(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/consultation/evaluate/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDoctorEvaluateInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HasEvaluateInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat/push_message_user/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMessageCenterList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MessageCenterListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat/push_message_user/whole_on_off")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postMessageCenterOnOff(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat/push_message/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postMessageCenterDetailItemList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MessageCenterDetailItemListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/srv_feedback/to_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServiceFeedbackList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ServiceFeedbackListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/srv_feedback/record")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServiceFeedbackHistoryList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ServiceFeedbackListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/srv_feedback/reason")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServiceFeedbackReasonList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FollowAimEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/srv_feedback/submit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postServiceFeedbackResult(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/srv_feedback/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServiceFeedbackResultDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ServiceFeedbackResultDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/srv_feedback/cancel_apl")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancelServiceFeedback(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/prescription/recommend_drug")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDrugRecommendList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DrugListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/d_app/prescription/drug_query")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDrugList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DrugListEntity2>> $completion);
    
    @retrofit2.http.POST(value = "/v1/d_app/prescription/drug_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDrugDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DrugDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/d_app/medical/med_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryMedListData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MedListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/physical_page")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryTiJianUrl(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.TiJianEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/chat/push_message_user/unread_count")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnreadCount(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/cloud_film")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryCloudFilm(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/exam_appoint/items")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamAppointPreject(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ExamAppointPrejectEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/exam_appoint/apted")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamAppointApted(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ExamAppointPrejectEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/exam_appoint/apted_detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamAppointApDetails(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ExamAppointPrejectDetailsEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/exam_appoint/make_apt")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamAppointSubmit(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AtpDataSubmitEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/exam_appoint/cancel_apt")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamAppointCancel(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/exam_appoint/apt_date_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamAppointAptDateList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AtpDataListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/exam_appoint/apt_time_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryExamAppointAptTimeList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AtpTimeListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/phhcwsi/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryPhhcwsiInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/queue_query")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryQueueData(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueueQueryEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/report/electrophy/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryElectrophyList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ReportListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/report/endoscope/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryEndoscopeList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.JingneiListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/report/pathology/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryPathologyList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.founder.internet.healthcare.repository.entity.PathologyEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/report/endoscope/detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryJianNeiDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ReportDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_recharge/permit_medication")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryPermitMedicationList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdmisPermitEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/inpatient_pre_reg/medication")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryPermitMedicationDetails(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MedicationDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/sche_dept/selfpay_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySelfpayList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SelfpayListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/ybmpay/get_pay_cnfm_code")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPayCnfmCode(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayCnfmCodeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/ybmpay/get_refund_code")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRefundCode(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayCnfmCodeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/ybmpay/get_pay_cnfm_code")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getoutpatientPayCnfmCode(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayCnfmCodeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/comm/yb_mpay/get_ec_code")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEcCode(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayCnfmCodeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/satisfaction/apt_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySatisfactionAptList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SatisfactionAptListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/satisfaction/inhospital_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySatisfactionInhospitalList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SatisfactionInhospitalListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/satisfaction/evaluate_type")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySatisfactionEvaluateTypeList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SatisfactionEvaluateTypeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/satisfaction/submit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object satisfactionSubmit(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SatisfactionSurverySubmitEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/satisfaction/view_evaluate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object satisfactionDetails(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SatisfactionEvaluateDetialsEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/electronic/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryElectronicList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ElectronicListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/prescription/ybmpay/get_pay_cnfm_code")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryPrescriptionPayCnfmCode(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayCnfmCodeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/prescription/submit_purchase_way")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postPreSubmitPurchaseWay(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SubmitPurchaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/prescription/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryPrePayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/prescription/sf_purchase_order")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sfPurchaseOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.PayCnfmCodeEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v2/p_app/prescription/query_sf_place")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySfPlace(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SfPlaceEntity>> $completion);
    
    @retrofit2.http.POST(value = "/accompany/get_access_url")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAccUrl(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/outpatient/hospital_guide")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHospitalGuide(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HospitalGuideEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/vip_face_pass")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkFaceStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.FaceStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/app/tencent-face/face-id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTXFaceId(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.TXFaceIdEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/self_discharge/hospitalization_permit_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySelfDischargeList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.SelfDischargeListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/self_discharge/hospitalization_expenses")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryHospitalizationExpenses(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.HospitalizationExpenseseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/self_discharge/confirm_settle")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object confirmSettle(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ConfirmSettleEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/self_discharge_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSelfDischargeTradePayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.OutpatientPaymentPayOrderEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/self_discharge_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object querySelfDischargeTradePayOrderStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryOrderPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/self_discharge/apply_refund")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object submitApplyRefund(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/self_discharge/hospitalization_cost_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object hospitalizationCostList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/discharge_data/post_order_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object zyPostOrderList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MaterialListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/discharge_data/hospitalization_permit_list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object zyHospitalizationPermitList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DischargeRecordEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/discharge_data/create_post_order")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object zyCreatePostOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/discharge_data/view_order")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object zyViewOrder(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.zyClDetaileEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/discharge_data/sf_routes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object zySfRoutes(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/modify_mob")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object modify_mob(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/edit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object modify_pat(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/non_real_name/create")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreatePatientNotFace(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CreatePatientEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/modify_iih_mob")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object modify_iih_mob(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/appoint_doctor/focus")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fous(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/appoint_doctor/my_focused_doctor")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fousdoctor(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.MyFoucusSVDoctorEntity2>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/appoint_doctor/total")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fousdoctortotal(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.Map<java.lang.String, java.lang.Object>>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/other/record")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object otherRecord(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.GuaHaoRecordListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate/alternate_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAlternateStatus(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AlternateStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate/record")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAlternateList(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AlternateListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate/reg")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postAlternateReg(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AlternateRegEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate/record_info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAlternateRecordDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AlternateRecordDetailEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate/cancel")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCancelAlternate(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CancelEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate/charge")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postAlternateHuaJia(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AlternateHuaJiaEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate_trade/queryorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryAlternatePayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AlternateOrderPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt_alternate_trade/unifiedorder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreateAlternatePayOrderInfo(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AlternatePayOrderInfoEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/user/change_phone")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changePhone(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.ChangePhoneEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/original_phone")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOriginalPhone(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.founder.internet.healthcare.repository.entity.OrignalPhoneEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/pat/online_replace")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOnlineReplace(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.founder.internet.healthcare.repository.entity.OnlineReplaceEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/d_app/home_page/business_card")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryBusinessCard(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.founder.internet.healthcare.repository.entity.BusinessCardEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consultation_appoint/record")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryConsulationAppointRecord(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.AdditionRecordListEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consultation_appoint/reg_cancel")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancleConsulationAppoint(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.CommonEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/sche_dept/profession")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDeptProfession(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.DeptProfessionEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/apt/visit_info_remind")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object visit_info(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.VisitEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/insurance/appointment/query_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object feeQuery(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryOrderPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/insurance/outpatient/query_status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insurancefeeQuery(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.QueryOrderPayStatusEntity>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/gen/pre_consultation_id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object GetPreconsultation_id(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity2<com.example.mycompose.repository.entity.PreconsultationEntity>>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/historical/illness")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object GetHistoryIllness(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity2<java.util.List<com.example.mycompose.repository.entity.HistoryEntity>>>> $completion);
    
    @retrofit2.http.POST(value = "/v1/p_app/consult/view/illness/info")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object GetHistoryIllnessDetail(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity2<com.example.mycompose.repository.entity.PreconsultationEntity>>> $completion);
    
    @retrofit2.http.POST(value = "/v1/d_app/prescription/medical_history")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object medical_history(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mycompose.repository.entity.BaseEntity2<com.example.mycompose.repository.entity.MedicalHistoryEntity>>> $completion);
}