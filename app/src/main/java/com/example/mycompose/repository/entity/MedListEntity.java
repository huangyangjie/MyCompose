package com.example.mycompose.repository.entity;

import java.util.List;

public class MedListEntity {
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
        private String Id_emr;
        private String Dt_rd;
        private String Name_emr;
        private String Pdf_emr;

        public String getId_emr() {
            return Id_emr;
        }

        public void setId_emr(String id_emr) {
            Id_emr = id_emr;
        }

        public String getDt_rd() {
            return Dt_rd;
        }

        public void setDt_rd(String dt_rd) {
            Dt_rd = dt_rd;
        }

        public String getName_emr() {
            return Name_emr;
        }

        public void setName_emr(String name_emr) {
            Name_emr = name_emr;
        }

        public String getPdf_emr() {
            return Pdf_emr;
        }

        public void setPdf_emr(String pdf_emr) {
            Pdf_emr = pdf_emr;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "Id_emr='" + Id_emr + '\'' +
                    ", Dt_rd='" + Dt_rd + '\'' +
                    ", Name_emr='" + Name_emr + '\'' +
                    ", Pdf_emr='" + Pdf_emr + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MedListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
