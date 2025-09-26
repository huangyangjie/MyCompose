package com.example.mycompose.repository.entity;

import java.util.List;

public class SatisfactionInhospitalListEntity {

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
        private String id_ent;
        private String evaluate_type;
        private int tg_evaluated;
        private String patient_name;
        private String patient_sex;
        private String patient_age;
        private String phone;
        private String id_num;
        private String patient_id;
        private String code_pat;
        private String pat_type_name;
        private String admis_status_name;
        private String admis_dep;
        private String admis_ward;
        private String dt_acpt;
        private String pat_type;


        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getPat_type() {
            return pat_type;
        }

        public String getId_ent() {
            return id_ent;
        }

        public void setId_ent(String id_ent) {
            this.id_ent = id_ent;
        }

        public String getEvaluate_type() {
            return evaluate_type;
        }

        public void setEvaluate_type(String evaluate_type) {
            this.evaluate_type = evaluate_type;
        }

        public int getTg_evaluated() {
            return tg_evaluated;
        }

        public void setTg_evaluated(int tg_evaluated) {
            this.tg_evaluated = tg_evaluated;
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

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
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

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public String getAdmis_status_name() {
            return admis_status_name;
        }

        public void setAdmis_status_name(String admis_status_name) {
            this.admis_status_name = admis_status_name;
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

        public String getDt_acpt() {
            return dt_acpt;
        }

        public void setDt_acpt(String dt_acpt) {
            this.dt_acpt = dt_acpt;
        }


        @Override
        public String toString() {
            return "DataDTO{" +
                    "id_ent='" + id_ent + '\'' +
                    ", evaluate_type='" + evaluate_type + '\'' +
                    ", tg_evaluated=" + tg_evaluated +
                    ", patient_name='" + patient_name + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", phone='" + phone + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", admis_status_name='" + admis_status_name + '\'' +
                    ", admis_dep='" + admis_dep + '\'' +
                    ", admis_ward='" + admis_ward + '\'' +
                    ", dt_acpt='" + dt_acpt + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SatisfactionInhospitalListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
