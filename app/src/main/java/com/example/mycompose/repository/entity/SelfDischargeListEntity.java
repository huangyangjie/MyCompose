package com.example.mycompose.repository.entity;

import java.util.List;

public class SelfDischargeListEntity {

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
        private String patient_name;
        private String patient_id;
        private String code_pat;
        private String pat_type;
        private String pat_type_name;
        private String code_amr_ip;
        private String times_ip;
        private String admis_dep;
        private String admis_ward;
        private String total_days;
        private String name_bed;
        private String dt_acpt;
        private String dt_end;
        private String name_emp_phy;
        private String name_emp_nur;
        private String fg_settle;
        private String fg_settle_name;

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
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

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public String getCode_amr_ip() {
            return code_amr_ip;
        }

        public void setCode_amr_ip(String code_amr_ip) {
            this.code_amr_ip = code_amr_ip;
        }

        public String getTimes_ip() {
            return times_ip;
        }

        public void setTimes_ip(String times_ip) {
            this.times_ip = times_ip;
        }

        public String getAdmis_dep() {
            return admis_dep;
        }

        public void setAdmis_dep(String admis_dep) {
            this.admis_dep = admis_dep;
        }

        public String getAdmis_ward() {
            return admis_ward;
        }

        public void setAdmis_ward(String admis_ward) {
            this.admis_ward = admis_ward;
        }

        public String getTotal_days() {
            return total_days;
        }

        public void setTotal_days(String total_days) {
            this.total_days = total_days;
        }

        public String getName_bed() {
            return name_bed;
        }

        public void setName_bed(String name_bed) {
            this.name_bed = name_bed;
        }

        public String getDt_acpt() {
            return dt_acpt;
        }

        public void setDt_acpt(String dt_acpt) {
            this.dt_acpt = dt_acpt;
        }

        public String getDt_end() {
            return dt_end;
        }

        public void setDt_end(String dt_end) {
            this.dt_end = dt_end;
        }

        public String getName_emp_phy() {
            return name_emp_phy;
        }

        public void setName_emp_phy(String name_emp_phy) {
            this.name_emp_phy = name_emp_phy;
        }

        public String getName_emp_nur() {
            return name_emp_nur;
        }

        public void setName_emp_nur(String name_emp_nur) {
            this.name_emp_nur = name_emp_nur;
        }

        public String getFg_settle() {
            return fg_settle;
        }

        public void setFg_settle(String fg_settle) {
            this.fg_settle = fg_settle;
        }

        public String getFg_settle_name() {
            return fg_settle_name;
        }

        public void setFg_settle_name(String fg_settle_name) {
            this.fg_settle_name = fg_settle_name;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "patient_name='" + patient_name + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", code_amr_ip='" + code_amr_ip + '\'' +
                    ", times_ip='" + times_ip + '\'' +
                    ", admis_dep='" + admis_dep + '\'' +
                    ", admis_ward='" + admis_ward + '\'' +
                    ", total_days='" + total_days + '\'' +
                    ", name_bed='" + name_bed + '\'' +
                    ", dt_acpt='" + dt_acpt + '\'' +
                    ", dt_end='" + dt_end + '\'' +
                    ", name_emp_phy='" + name_emp_phy + '\'' +
                    ", name_emp_nur='" + name_emp_nur + '\'' +
                    ", fg_settle='" + fg_settle + '\'' +
                    ", fg_settle_name='" + fg_settle_name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SelfDischargeListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
