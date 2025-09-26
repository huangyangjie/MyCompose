package com.example.mycompose.repository.entity;

public class EditPatientRegDataEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "PatientRegDataEntity{" +
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
        private String patient_id;
        private String registration_id;
        private String amt_deposit;
        private String yjj_status;
        private String reg_status;

        @Override
        public String toString() {
            return "DataBean{" +
                    "patient_id='" + patient_id + '\'' +
                    ", registration_id='" + registration_id + '\'' +
                    ", amt_deposit='" + amt_deposit + '\'' +
                    ", yjj_status='" + yjj_status + '\'' +
                    ", reg_status='" + reg_status + '\'' +
                    '}';
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getRegistration_id() {
            return registration_id;
        }

        public void setRegistration_id(String registration_id) {
            this.registration_id = registration_id;
        }

        public String getAmt_deposit() {
            return amt_deposit;
        }

        public void setAmt_deposit(String amt_deposit) {
            this.amt_deposit = amt_deposit;
        }

        public String getYjj_status() {
            return yjj_status;
        }

        public void setYjj_status(String yjj_status) {
            this.yjj_status = yjj_status;
        }

        public String getReg_status() {
            return reg_status;
        }

        public void setReg_status(String reg_status) {
            this.reg_status = reg_status;
        }
    }
}
