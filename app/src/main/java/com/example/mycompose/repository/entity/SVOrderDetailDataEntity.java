package com.example.mycompose.repository.entity;

public class SVOrderDetailDataEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "SVOrderDetailDataEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String consultation_id;
        private String chat_id;
        private String out_trade_no;
        private String consultation_no;
        private String code_pat;
        private String patient_id;
        private String doctor_sn;
        private String doctor_id;
        private String createTime;
        private String dept_sn;
        private String dept_id;
        private String dept_name;
        private String pay_type;
        private String pay_type_name;
        private String order_amount;
        private String price;
        private String cancel_time;
        private String cancel_reason;
        private Integer evaluation_status;
        private String status;
        private String deadline;
        private String status_name;
        private String doctor_title;
        private String doctor_avatar;
        private String doctor_name;
        private String pay_time;
        private String rd_reason;
        private String rd_out_trade_no;
        private String real_refund_time;
        private String patient_name;
        private String patient_age;
        private String patient_sex;
        private String pat_type;
        private String pat_type_name;
        private String id_type;
        private String id_type_name;
        private String id_num;
        private String pay_method;
        private String code_srv;
        private String need_divide_tag;
        private String pre_consultation_id;

        public String getPre_consultation_id() {
            return pre_consultation_id;
        }

        public DataBean setPre_consultation_id(String pre_consultation_id) {
            this.pre_consultation_id = pre_consultation_id;
            return this;
        }

        public String getDeadline() {
            return deadline;
        }

        public void setDeadline(String deadline) {
            this.deadline = deadline;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "consultation_id='" + consultation_id + '\'' +
                    ", chat_id='" + chat_id + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", consultation_no='" + consultation_no + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", pay_type='" + pay_type + '\'' +
                    ", pay_type_name='" + pay_type_name + '\'' +
                    ", order_amount='" + order_amount + '\'' +
                    ", price='" + price + '\'' +
                    ", cancel_time='" + cancel_time + '\'' +
                    ", cancel_reason='" + cancel_reason + '\'' +
                    ", evaluation_status=" + evaluation_status +
                    ", status='" + status + '\'' +
                    ", status_name='" + status_name + '\'' +
                    ", doctor_title='" + doctor_title + '\'' +
                    ", doctor_avatar='" + doctor_avatar + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", pay_time='" + pay_time + '\'' +
                    ", rd_reason='" + rd_reason + '\'' +
                    ", rd_out_trade_no='" + rd_out_trade_no + '\'' +
                    ", real_refund_time='" + real_refund_time + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", id_type='" + id_type + '\'' +
                    ", id_type_name='" + id_type_name + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", need_divide_tag='" + need_divide_tag + '\'' +
                    '}';
        }

        public String getNeed_divide_tag() {
            return need_divide_tag;
        }

        public void setNeed_divide_tag(String need_divide_tag) {
            this.need_divide_tag = need_divide_tag;
        }

        public String getConsultation_id() {
            return consultation_id;
        }

        public void setConsultation_id(String consultation_id) {
            this.consultation_id = consultation_id;
        }

        public String getChat_id() {
            return chat_id;
        }

        public void setChat_id(String chat_id) {
            this.chat_id = chat_id;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getConsultation_no() {
            return consultation_no;
        }

        public void setConsultation_no(String consultation_no) {
            this.consultation_no = consultation_no;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getPay_type() {
            return pay_type;
        }

        public void setPay_type(String pay_type) {
            this.pay_type = pay_type;
        }

        public String getPay_type_name() {
            return pay_type_name;
        }

        public void setPay_type_name(String pay_type_name) {
            this.pay_type_name = pay_type_name;
        }

        public String getOrder_amount() {
            return order_amount;
        }

        public void setOrder_amount(String order_amount) {
            this.order_amount = order_amount;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getCancel_time() {
            return cancel_time;
        }

        public void setCancel_time(String cancel_time) {
            this.cancel_time = cancel_time;
        }

        public String getCancel_reason() {
            return cancel_reason;
        }

        public void setCancel_reason(String cancel_reason) {
            this.cancel_reason = cancel_reason;
        }

        public Integer getEvaluation_status() {
            return evaluation_status;
        }

        public void setEvaluation_status(Integer evaluation_status) {
            this.evaluation_status = evaluation_status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        public String getDoctor_title() {
            return doctor_title;
        }

        public void setDoctor_title(String doctor_title) {
            this.doctor_title = doctor_title;
        }

        public String getDoctor_avatar() {
            return doctor_avatar;
        }

        public void setDoctor_avatar(String doctor_avatar) {
            this.doctor_avatar = doctor_avatar;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getPay_time() {
            return pay_time;
        }

        public void setPay_time(String pay_time) {
            this.pay_time = pay_time;
        }

        public String getRd_reason() {
            return rd_reason;
        }

        public void setRd_reason(String rd_reason) {
            this.rd_reason = rd_reason;
        }

        public String getRd_out_trade_no() {
            return rd_out_trade_no;
        }

        public void setRd_out_trade_no(String rd_out_trade_no) {
            this.rd_out_trade_no = rd_out_trade_no;
        }

        public String getReal_refund_time() {
            return real_refund_time;
        }

        public void setReal_refund_time(String real_refund_time) {
            this.real_refund_time = real_refund_time;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getPatient_age() {
            return patient_age;
        }

        public void setPatient_age(String patient_age) {
            this.patient_age = patient_age;
        }

        public String getPatient_sex() {
            return patient_sex;
        }

        public void setPatient_sex(String patient_sex) {
            this.patient_sex = patient_sex;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public String getId_type() {
            return id_type;
        }

        public void setId_type(String id_type) {
            this.id_type = id_type;
        }

        public String getId_type_name() {
            return id_type_name;
        }

        public void setId_type_name(String id_type_name) {
            this.id_type_name = id_type_name;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
        }
    }
}
