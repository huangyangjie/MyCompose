package com.example.mycompose.repository.entity;

public class SVCreateOrderEntity {
    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "SVCreateOrderEntity{" +
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
        private String consultation_no;
        private String patient_name;
        private String pat_type;
        private String pay_type;
        private String pat_type_name;
        private String pay_type_name;
        private String doctor_id;
        private String doctor_sn;
        private String doctor_name;
        private String doctor_title;
        private String code_srv;
        private String dept_sn;
        private String dept_id;
        private String dept_name;
        private String patient_id;
        private String code_pat;
        private String patient_age;
        private String patient_sex;
        private String order_amount;
        private String need_divide_flag;
        private String total_fee;
        private String now_fee;
        private String jijin_fee;
        private String chat_id;
        private String person_acount_pay;
        private String createTime;
        private String need_divide_tag;

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getNeed_divide_tag() {
            return need_divide_tag;
        }

        public void setNeed_divide_tag(String need_divide_tag) {
            this.need_divide_tag = need_divide_tag;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "consultation_id='" + consultation_id + '\'' +
                    ", consultation_no='" + consultation_no + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", pay_type='" + pay_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", pay_type_name='" + pay_type_name + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", doctor_title='" + doctor_title + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", order_amount='" + order_amount + '\'' +
                    ", need_divide_flag='" + need_divide_flag + '\'' +
                    ", total_fee='" + total_fee + '\'' +
                    ", now_fee='" + now_fee + '\'' +
                    ", jijin_fee='" + jijin_fee + '\'' +
                    ", chat_id='" + chat_id + '\'' +
                    ", person_acount_pay='" + person_acount_pay + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", need_divide_tag='" + need_divide_tag + '\'' +
                    '}';
        }

        public String getChat_id() {
            return chat_id;
        }

        public void setChat_id(String chat_id) {
            this.chat_id = chat_id;
        }

        public String getConsultation_id() {
            return consultation_id;
        }

        public void setConsultation_id(String consultation_id) {
            this.consultation_id = consultation_id;
        }

        public String getConsultation_no() {
            return consultation_no;
        }

        public void setConsultation_no(String consultation_no) {
            this.consultation_no = consultation_no;
        }

        public String getPat_type() {
            return pat_type;
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

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getDoctor_title() {
            return doctor_title;
        }

        public void setDoctor_title(String doctor_title) {
            this.doctor_title = doctor_title;
        }

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
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

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
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

        public String getOrder_amount() {
            return order_amount;
        }

        public void setOrder_amount(String order_amount) {
            this.order_amount = order_amount;
        }

        public String getNeed_divide_flag() {
            return need_divide_flag;
        }

        public void setNeed_divide_flag(String need_divide_flag) {
            this.need_divide_flag = need_divide_flag;
        }

        public String getTotal_fee() {
            return total_fee;
        }

        public void setTotal_fee(String total_fee) {
            this.total_fee = total_fee;
        }

        public String getNow_fee() {
            return now_fee;
        }

        public void setNow_fee(String now_fee) {
            this.now_fee = now_fee;
        }

        public String getJijin_fee() {
            return jijin_fee;
        }

        public void setJijin_fee(String jijin_fee) {
            this.jijin_fee = jijin_fee;
        }

        public String getPerson_acount_pay() {
            return person_acount_pay;
        }

        public void setPerson_acount_pay(String person_acount_pay) {
            this.person_acount_pay = person_acount_pay;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }
    }
}
