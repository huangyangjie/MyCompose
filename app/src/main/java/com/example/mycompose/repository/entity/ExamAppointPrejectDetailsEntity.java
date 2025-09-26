package com.example.mycompose.repository.entity;

public class ExamAppointPrejectDetailsEntity {


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
        private String patient_name;
        private String patient_sex;
        private String patient_age;
        private String code_pat;
        private String name_dep_or;
        private String dt_effe;
        private String name_srv_exam;
        private String appoint_date;
        private String st_et;
        private String apt_source;
        private String status_name;
        private String status;
        private String attention;
        private String no_applyform;

        public void setNo_applyform(String no_applyform) {
            this.no_applyform = no_applyform;
        }

        public String getNo_applyform() {
            return no_applyform;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getPatient_sex() {
            return patient_sex;
        }

        public void setPatient_sex(String patient_sex) {
            this.patient_sex = patient_sex;
        }

        public String getPatient_age() {
            return patient_age;
        }

        public void setPatient_age(String patient_age) {
            this.patient_age = patient_age;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getName_dep_or() {
            return name_dep_or;
        }

        public void setName_dep_or(String name_dep_or) {
            this.name_dep_or = name_dep_or;
        }

        public String getDt_effe() {
            return dt_effe;
        }

        public void setDt_effe(String dt_effe) {
            this.dt_effe = dt_effe;
        }

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

        public String getApt_source() {
            return apt_source;
        }

        public void setApt_source(String apt_source) {
            this.apt_source = apt_source;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getAttention() {
            return attention;
        }

        public void setAttention(String attention) {
            this.attention = attention;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "patient_name='" + patient_name + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", name_dep_or='" + name_dep_or + '\'' +
                    ", dt_effe='" + dt_effe + '\'' +
                    ", name_srv_exam='" + name_srv_exam + '\'' +
                    ", appoint_date='" + appoint_date + '\'' +
                    ", st_et='" + st_et + '\'' +
                    ", apt_source='" + apt_source + '\'' +
                    ", status_name='" + status_name + '\'' +
                    ", status='" + status + '\'' +
                    ", attention='" + attention + '\'' +
                    ", no_applyform='" + no_applyform + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AtpDataDetailsEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
