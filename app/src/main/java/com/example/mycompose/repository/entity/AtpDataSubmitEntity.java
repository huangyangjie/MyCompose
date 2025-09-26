package com.example.mycompose.repository.entity;

public class AtpDataSubmitEntity {

    private int code;
    private String message;
    private DataDTO data;

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

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        private String name_srv_exam;
        private String appoint_date;
        private String st_et;
        private String apt_aource;

        public String getName_srv_exam() {
            return name_srv_exam;
        }

        public void setName_srv_exam(String name_srv_exam) {
            this.name_srv_exam = name_srv_exam;
        }

        public String getAppoint_date() {
            return appoint_date;
        }

        public void setAppoint_date(String appoint_date) {
            this.appoint_date = appoint_date;
        }

        public String getSt_et() {
            return st_et;
        }

        public void setSt_et(String st_et) {
            this.st_et = st_et;
        }

        public String getApt_aource() {
            return apt_aource;
        }

        public void setApt_aource(String apt_aource) {
            this.apt_aource = apt_aource;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "name_srv_exam='" + name_srv_exam + '\'' +
                    ", appoint_date='" + appoint_date + '\'' +
                    ", st_et='" + st_et + '\'' +
                    ", apt_aource='" + apt_aource + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AtpDataSubmitEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
