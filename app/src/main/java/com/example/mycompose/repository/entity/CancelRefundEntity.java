package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

public class CancelRefundEntity {

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
        @SerializedName("Id_paypat")
        private String id_paypat;
        @SerializedName("Eu_refundaply")
        private String eu_refundaply;
        @SerializedName("Eu_status")
        private String eu_status;

        public String getId_paypat() {
            return id_paypat;
        }

        public void setId_paypat(String id_paypat) {
            this.id_paypat = id_paypat;
        }

        public String getEu_refundaply() {
            return eu_refundaply;
        }

        public void setEu_refundaply(String eu_refundaply) {
            this.eu_refundaply = eu_refundaply;
        }

        public String getEu_status() {
            return eu_status;
        }

        public void setEu_status(String eu_status) {
            this.eu_status = eu_status;
        }
    }
}
