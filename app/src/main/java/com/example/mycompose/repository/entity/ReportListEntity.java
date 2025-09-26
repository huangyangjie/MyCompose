package com.example.mycompose.repository.entity;

import java.util.List;

public class ReportListEntity {
    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "ReportListEntity{" +
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
        private String report_sn;
        private String report_name;
        private String report_time;
        private String pdfbase64;
        private String pdf_path;


        public void setPdf_path(String pdf_path) {
            this.pdf_path = pdf_path;
        }

        public String getPdf_path() {
            return pdf_path;
        }

        public void setPdfbase64(String pdfbase64) {
            this.pdfbase64 = pdfbase64;
        }

        public String getPdfbase64() {
            return pdfbase64;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "report_sn='" + report_sn + '\'' +
                    ", report_name='" + report_name + '\'' +
                    ", report_time='" + report_time + '\'' +
                    ", pdfbase64='" + pdfbase64 + '\'' +
                    ", pdf_path='" + pdf_path + '\'' +
                    '}';
        }

        public String getReport_sn() {
            return report_sn;
        }

        public void setReport_sn(String report_sn) {
            this.report_sn = report_sn;
        }

        public String getReport_name() {
            return report_name;
        }

        public void setReport_name(String report_name) {
            this.report_name = report_name;
        }

        public String getReport_time() {
            return report_time;
        }

        public void setReport_time(String report_time) {
            this.report_time = report_time;
        }
    }
}
