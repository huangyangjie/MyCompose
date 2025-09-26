package com.example.mycompose.repository.entity;

import java.util.List;

public class ServiceFeedbackListEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "ServiceFeedbackListEntity{" +
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
        private String chat_id;
        private String out_trade_no;
        private String status;
        private String feedback_time;
        private String status_name;
        private String doctor_id;
        private String doctor_name;
        private String user_id;
        private String patient_id;
        private String patient_name;
        private String feedback_no;
        private String dept_id;
        private String dept_sn;
        private String consult_e_time;
        private String pay_fee;
        private Integer can;

        @Override
        public String toString() {
            return "DataBean{" +
                    "consultation_id='" + consultation_id + '\'' +
                    ", chat_id='" + chat_id + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", status='" + status + '\'' +
                    ", feedback_time='" + feedback_time + '\'' +
                    ", status_name='" + status_name + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", user_id='" + user_id + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", feedback_no='" + feedback_no + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", consult_e_time='" + consult_e_time + '\'' +
                    ", pay_fee='" + pay_fee + '\'' +
                    ", can=" + can +
                    '}';
        }

        public String getFeedback_no() {
            return feedback_no;
        }

        public void setFeedback_no(String feedback_no) {
            this.feedback_no = feedback_no;
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

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
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

        public String getConsult_e_time() {
            return consult_e_time;
        }

        public void setConsult_e_time(String consult_e_time) {
            this.consult_e_time = consult_e_time;
        }

        public String getPay_fee() {
            return pay_fee;
        }

        public void setPay_fee(String pay_fee) {
            this.pay_fee = pay_fee;
        }

        public Integer getCan() {
            return can;
        }

        public void setCan(Integer can) {
            this.can = can;
        }

        public String getFeedback_time() {
            return feedback_time;
        }

        public void setFeedback_time(String feedback_time) {
            this.feedback_time = feedback_time;
        }
    }
}
