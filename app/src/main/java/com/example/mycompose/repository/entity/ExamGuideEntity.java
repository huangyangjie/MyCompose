package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

public class ExamGuideEntity {


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
        private String code_pat;
        private String pat_name;
        private String pat_sex;
        private String pat_age;
        private String pat_id_num;
        private String submit_date;
        private String dept_name;
        private String doctor_name;
        private String major_said;
        private String primary_diagnosis;
        private String minor_diagnosis;
        private String sign_img;
        @SerializedName("Name_srv")
        private String name_srv;
        @SerializedName("Price")
        private String price;
        private String no_applyform;
        private String name_dep_mp;

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPat_name() {
            return pat_name;
        }

        public void setPat_name(String pat_name) {
            this.pat_name = pat_name;
        }

        public String getPat_sex() {
            return pat_sex;
        }

        public void setPat_sex(String pat_sex) {
            this.pat_sex = pat_sex;
        }

        public String getPat_age() {
            return pat_age;
        }

        public void setPat_age(String pat_age) {
            this.pat_age = pat_age;
        }

        public String getPat_id_num() {
            return pat_id_num;
        }

        public void setPat_id_num(String pat_id_num) {
            this.pat_id_num = pat_id_num;
        }

        public String getSubmit_date() {
            return submit_date;
        }

        public void setSubmit_date(String submit_date) {
            this.submit_date = submit_date;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getMajor_said() {
            return major_said;
        }

        public void setMajor_said(String major_said) {
            this.major_said = major_said;
        }

        public String getPrimary_diagnosis() {
            return primary_diagnosis;
        }

        public void setPrimary_diagnosis(String primary_diagnosis) {
            this.primary_diagnosis = primary_diagnosis;
        }

        public String getMinor_diagnosis() {
            return minor_diagnosis;
        }

        public void setMinor_diagnosis(String minor_diagnosis) {
            this.minor_diagnosis = minor_diagnosis;
        }

        public String getSign_img() {
            return sign_img;
        }

        public void setSign_img(String sign_img) {
            this.sign_img = sign_img;
        }

        public String getName_srv() {
            return name_srv;
        }

        public void setName_srv(String name_srv) {
            this.name_srv = name_srv;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getNo_applyform() {
            return no_applyform;
        }

        public void setNo_applyform(String no_applyform) {
            this.no_applyform = no_applyform;
        }

        public String getName_dep_mp() {
            return name_dep_mp;
        }

        public void setName_dep_mp(String name_dep_mp) {
            this.name_dep_mp = name_dep_mp;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "code_pat='" + code_pat + '\'' +
                    ", pat_name='" + pat_name + '\'' +
                    ", pat_sex='" + pat_sex + '\'' +
                    ", pat_age='" + pat_age + '\'' +
                    ", pat_id_num='" + pat_id_num + '\'' +
                    ", submit_date='" + submit_date + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", major_said='" + major_said + '\'' +
                    ", primary_diagnosis='" + primary_diagnosis + '\'' +
                    ", minor_diagnosis='" + minor_diagnosis + '\'' +
                    ", sign_img='" + sign_img + '\'' +
                    ", name_srv='" + name_srv + '\'' +
                    ", price='" + price + '\'' +
                    ", no_applyform='" + no_applyform + '\'' +
                    ", name_dep_mp='" + name_dep_mp + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ExamGuideEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
