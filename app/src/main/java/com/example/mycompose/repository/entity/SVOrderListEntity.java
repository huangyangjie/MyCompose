package com.example.mycompose.repository.entity;

import java.util.List;

public class SVOrderListEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "SVOrderListEntity{" +
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String consultation_id;
        private String out_trade_no;
        private String pay_type;
        private String pay_type_name;
        private String consultation_no;
        private String code_pat;
        private String patient_id;
        private String doctor_sn;
        private String doctor_id;
        private String doctor_title;
        private String doctor_avatar;
        private String doctor_name;
        private String dept_id;
        private String dept_sn;
        private String dept_name;
        private String createTime;
        private String status;
        private String status_name;
        private String price;
        private Integer evaluation_status;
        private String patient_name;
        private String pat_type;
        private String pat_type_name;
        private String order_amount;
        private String code_srv;
        private String chat_id;
        private String id_num;
        private String need_divide_tag;

        public String getOrder_amount() {
            return order_amount;
        }

        public void setOrder_amount(String order_amount) {
            this.order_amount = order_amount;
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
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", pay_type='" + pay_type + '\'' +
                    ", pay_type_name='" + pay_type_name + '\'' +
                    ", consultation_no='" + consultation_no + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", doctor_title='" + doctor_title + '\'' +
                    ", doctor_avatar='" + doctor_avatar + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", status='" + status + '\'' +
                    ", status_name='" + status_name + '\'' +
                    ", price='" + price + '\'' +
                    ", evaluation_status=" + evaluation_status +
                    ", patient_name='" + patient_name + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", order_amount='" + order_amount + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", chat_id='" + chat_id + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", need_divide_tag='" + need_divide_tag + '\'' +
                    '}';
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
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

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
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

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
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

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public Integer getEvaluation_status() {
            return evaluation_status;
        }

        public void setEvaluation_status(Integer evaluation_status) {
            this.evaluation_status = evaluation_status;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
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

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
        }
    }
}
