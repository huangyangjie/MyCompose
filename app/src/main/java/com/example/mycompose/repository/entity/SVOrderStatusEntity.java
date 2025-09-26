package com.example.mycompose.repository.entity;

public class SVOrderStatusEntity {


    private Integer code;
    private String message;
    private DataBean data;

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
        private Integer pay_status;
        private Integer iih_pay_status;
        private String out_trade_no;
        private String chat_id;
        private String doctor_im_account;
        private String doctor_id;
        private String patient_name;
        private String code_pat;
        private String doctor_name;
        private String patient_id;

        @Override
        public String toString() {
            return "DataBean{" +
                    "pay_status=" + pay_status +
                    ", iih_pay_status=" + iih_pay_status +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", chat_id='" + chat_id + '\'' +
                    ", doctor_im_account='" + doctor_im_account + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    '}';
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public Integer getPay_status() {
            return pay_status;
        }

        public void setPay_status(Integer pay_status) {
            this.pay_status = pay_status;
        }

        public Integer getIih_pay_status() {
            return iih_pay_status;
        }

        public void setIih_pay_status(Integer iih_pay_status) {
            this.iih_pay_status = iih_pay_status;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getChat_id() {
            return chat_id;
        }

        public void setChat_id(String chat_id) {
            this.chat_id = chat_id;
        }

        public String getDoctor_im_account() {
            return doctor_im_account;
        }

        public void setDoctor_im_account(String doctor_im_account) {
            this.doctor_im_account = doctor_im_account;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
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
    }

    @Override
    public String toString() {
        return "SVOrderStatusEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
