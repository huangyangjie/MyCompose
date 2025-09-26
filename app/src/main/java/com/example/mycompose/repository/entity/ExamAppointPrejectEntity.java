package com.example.mycompose.repository.entity;

import java.util.List;

public class ExamAppointPrejectEntity {

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
        private String patient_id;
        private String code_pat;
        private String patient_name;
        private String patient_sex;
        private String patient_age;
        private String no_applyform;
        private String code_srv_exam;
        private String name_srv_exam;
        private String dt_effe;
        private String code_dep_mp;
        private String name_dep_mp;
        private String code_dep_or;
        private String name_dep_or;
        private String tip;
        private String status;
        private String status_name;
        private String apt_time;
        private String appoint_id;

        public void setAppoint_id(String appoint_id) {
            this.appoint_id = appoint_id;
        }

        public String getAppoint_id() {
            return appoint_id;
        }

        public void setApt_time(String apt_time) {
            this.apt_time = apt_time;
        }

        public String getApt_time() {
            return apt_time;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
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

        public String getNo_applyform() {
            return no_applyform;
        }

        public void setNo_applyform(String no_applyform) {
            this.no_applyform = no_applyform;
        }

        public String getCode_srv_exam() {
            return code_srv_exam;
        }

        public void setCode_srv_exam(String code_srv_exam) {
            this.code_srv_exam = code_srv_exam;
        }

        public String getName_srv_exam() {
            return name_srv_exam;
        }

        public void setName_srv_exam(String name_srv_exam) {
            this.name_srv_exam = name_srv_exam;
        }

        public String getDt_effe() {
            return dt_effe;
        }

        public void setDt_effe(String dt_effe) {
            this.dt_effe = dt_effe;
        }

        public String getCode_dep_mp() {
            return code_dep_mp;
        }

        public void setCode_dep_mp(String code_dep_mp) {
            this.code_dep_mp = code_dep_mp;
        }

        public String getName_dep_mp() {
            return name_dep_mp;
        }

        public void setName_dep_mp(String name_dep_mp) {
            this.name_dep_mp = name_dep_mp;
        }

        public String getCode_dep_or() {
            return code_dep_or;
        }

        public void setCode_dep_or(String code_dep_or) {
            this.code_dep_or = code_dep_or;
        }

        public String getName_dep_or() {
            return name_dep_or;
        }

        public void setName_dep_or(String name_dep_or) {
            this.name_dep_or = name_dep_or;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "patient_id='" + patient_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", no_applyform='" + no_applyform + '\'' +
                    ", code_srv_exam='" + code_srv_exam + '\'' +
                    ", name_srv_exam='" + name_srv_exam + '\'' +
                    ", dt_effe='" + dt_effe + '\'' +
                    ", code_dep_mp='" + code_dep_mp + '\'' +
                    ", name_dep_mp='" + name_dep_mp + '\'' +
                    ", code_dep_or='" + code_dep_or + '\'' +
                    ", name_dep_or='" + name_dep_or + '\'' +
                    ", tip='" + tip + '\'' +
                    ", status='" + status + '\'' +
                    ", status_name='" + status_name + '\'' +
                    ", apt_time='" + apt_time + '\'' +
                    ", appoint_id='" + appoint_id + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ExamAppointPrejectEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
