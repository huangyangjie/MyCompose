package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class DischargeRecordEntity {


    @SerializedName("code")
    private Integer code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<DataDTO> data;

    public Integer getCode() {
        return code;
    }

    public DischargeRecordEntity setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DischargeRecordEntity setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public DischargeRecordEntity setData(List<DataDTO> data) {
        this.data = data;
        return this;
    }

    public static class DataDTO {
        @SerializedName("id_ent")
        private String idEnt;
        @SerializedName("patient_name")
        private String patientName;
        @SerializedName("patient_id")
        private String patientId;
        @SerializedName("code_pat")
        private String codePat;
        @SerializedName("pat_type")
        private String patType;

        public String getIdEnt() {
            return idEnt;
        }

        public DataDTO setIdEnt(String idEnt) {
            this.idEnt = idEnt;
            return this;
        }

        public String getPatientName() {
            return patientName;
        }

        public DataDTO setPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public String getPatientId() {
            return patientId;
        }

        public DataDTO setPatientId(String patientId) {
            this.patientId = patientId;
            return this;
        }

        public String getCodePat() {
            return codePat;
        }

        public DataDTO setCodePat(String codePat) {
            this.codePat = codePat;
            return this;
        }

        public String getPatType() {
            return patType;
        }

        public DataDTO setPatType(String patType) {
            this.patType = patType;
            return this;
        }

        public String getPatTypeName() {
            return patTypeName;
        }

        public DataDTO setPatTypeName(String patTypeName) {
            this.patTypeName = patTypeName;
            return this;
        }

        public String getCodeAmrIp() {
            return codeAmrIp;
        }

        public DataDTO setCodeAmrIp(String codeAmrIp) {
            this.codeAmrIp = codeAmrIp;
            return this;
        }

        public String getTimesIp() {
            return timesIp;
        }

        public DataDTO setTimesIp(String timesIp) {
            this.timesIp = timesIp;
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

        public String getDtAcpt() {
            return dtAcpt;
        }

        public DataDTO setDtAcpt(String dtAcpt) {
            this.dtAcpt = dtAcpt;
            return this;
        }

        public String getDtEnd() {
            return dtEnd;
        }

        public DataDTO setDtEnd(String dtEnd) {
            this.dtEnd = dtEnd;
            return this;
        }

        public List<String> getMailData() {
            return mailData;
        }

        public DataDTO setMailData(List<String> mailData) {
            this.mailData = mailData;
            return this;
        }

        @SerializedName("pat_type_name")
        private String patTypeName;
        @SerializedName("code_amr_ip")
        private String codeAmrIp;
        @SerializedName("times_ip")
        private String timesIp;
        @SerializedName("admis_dep")
        private String admisDep;
        @SerializedName("admis_ward")
        private String admisWard;
        @SerializedName("dt_acpt")
        private String dtAcpt;
        @SerializedName("dt_end")
        private String dtEnd;
        @SerializedName("mailData")
        private List<String> mailData;
    }
}
