package com.example.mycompose.repository.entity;

import java.util.List;

public class VisitEntity {
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
        private String id_apt;
        private String code_pat;
        private String patient_id;
        private String patient_name;
        private String dt_sch;
        private String dept_sn;
        private String dept_name;
        private String name_dayslottp;
        private String t_b_ticks;
        private String t_e_ticks;
        private String day_of_week;
        private int remain_days;

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getName_dayslottp() {
            return name_dayslottp;
        }

        public void setName_dayslottp(String name_dayslottp) {
            this.name_dayslottp = name_dayslottp;
        }

        public String getT_b_ticks() {
            return t_b_ticks;
        }

        public void setT_b_ticks(String t_b_ticks) {
            this.t_b_ticks = t_b_ticks;
        }

        public String getT_e_ticks() {
            return t_e_ticks;
        }

        public void setT_e_ticks(String t_e_ticks) {
            this.t_e_ticks = t_e_ticks;
        }

        public String getDay_of_week() {
            return day_of_week;
        }

        public void setDay_of_week(String day_of_week) {
            this.day_of_week = day_of_week;
        }

        public int getRemain_days() {
            return remain_days;
        }

        public void setRemain_days(int remain_days) {
            this.remain_days = remain_days;
        }
    }
}
