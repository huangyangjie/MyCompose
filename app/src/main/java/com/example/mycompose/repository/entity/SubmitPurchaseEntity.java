package com.example.mycompose.repository.entity;

public class SubmitPurchaseEntity {

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
        private String prescription_id;

        public String getPrescription_id() {
            return prescription_id;
        }

        public void setPrescription_id(String prescription_id) {
            this.prescription_id = prescription_id;
        }
    }
}
