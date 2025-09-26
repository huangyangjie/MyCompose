package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MaterialListEntity {


    @SerializedName("code")
    public Integer code;

    public Integer getCode() {
        return code;
    }

    public MaterialListEntity setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public MaterialListEntity setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public MaterialListEntity setData(List<DataDTO> data) {
        this.data = data;
        return this;
    }

    @SerializedName("message")
    public String message;
    @SerializedName("data")
    public List<DataDTO> data;

    public static class DataDTO {
        @SerializedName("order_no")
        public String orderNo;
        @SerializedName("patient_name")
        public String patientName;
        @SerializedName("admis_dep")
        public String admisDep;
        public String createTime;

        public String getCreateTime() {
            return createTime;
        }

        public DataDTO setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public DataDTO setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }

        public String getPatientName() {
            return patientName;
        }

        public DataDTO setPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public String getAdmisDep() {
            return admisDep;
        }

        public DataDTO setAdmisDep(String admisDep) {
            this.admisDep = admisDep;
            return this;
        }

        public String getAdmisWard() {
            return admisWard;
        }

        public DataDTO setAdmisWard(String admisWard) {
            this.admisWard = admisWard;
            return this;
        }

        public String getDtEnd() {
            return dtEnd;
        }

        public DataDTO setDtEnd(String dtEnd) {
            this.dtEnd = dtEnd;
            return this;
        }

        public String getMailNo() {
            return mailNo;
        }

        public DataDTO setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }

        public String getBspOrderNo() {
            return bspOrderNo;
        }

        public DataDTO setBspOrderNo(String bspOrderNo) {
            this.bspOrderNo = bspOrderNo;
            return this;
        }

        @SerializedName("admis_ward")
        public String admisWard;
        @SerializedName("dt_end")
        public String dtEnd;
        @SerializedName("mail_no")
        public String mailNo;
        @SerializedName("bsp_order_no")
        public String bspOrderNo;
    }
}
