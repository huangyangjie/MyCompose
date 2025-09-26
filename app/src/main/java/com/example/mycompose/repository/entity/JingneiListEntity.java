package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JingneiListEntity {

    private int code;
    private String message;
    private List<DataDTO> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        @SerializedName("CheckDate")
        private String checkDate;
        @SerializedName("CheckType")
        private String checkType;
        @SerializedName("PatientName")
        private String patientName;
        @SerializedName("PatientSex")
        private String patientSex;
        @SerializedName("ReportContent")
        private Object reportContent;
        @SerializedName("ReportNo")
        private String reportNo;

        public String getCheckDate() {
            return checkDate;
        }

        public void setCheckDate(String checkDate) {
            this.checkDate = checkDate;
        }

        public String getCheckType() {
            return checkType;
        }

        public void setCheckType(String checkType) {
            this.checkType = checkType;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public String getPatientSex() {
            return patientSex;
        }

        public void setPatientSex(String patientSex) {
            this.patientSex = patientSex;
        }

        public Object getReportContent() {
            return reportContent;
        }

        public void setReportContent(Object reportContent) {
            this.reportContent = reportContent;
        }

        public String getReportNo() {
            return reportNo;
        }

        public void setReportNo(String reportNo) {
            this.reportNo = reportNo;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "checkDate='" + checkDate + '\'' +
                    ", checkType='" + checkType + '\'' +
                    ", patientName='" + patientName + '\'' +
                    ", patientSex='" + patientSex + '\'' +
                    ", reportContent=" + reportContent +
                    ", reportNo='" + reportNo + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "JingneiListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
