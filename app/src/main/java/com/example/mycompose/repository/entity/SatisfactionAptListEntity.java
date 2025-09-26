package com.example.mycompose.repository.entity;

import java.util.List;

public class SatisfactionAptListEntity {

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
        private String evaluate_type;
        private String doctor_name;
        private String dept_name;
        private String job_title;
        private String dt_sch;
        private String name_dayslottp;
        private String chltp_name;
        private String createTime;
        private String price;
        private String visit_flag_name;
        private String pat_type;
        private String patient_id;
        private String patient_name;
        private String id_num;
        private String phone;
        private String patient_age;
        private String patient_sex;
        private int tg_evaluated;

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getEvaluate_type() {
            return evaluate_type;
        }

        public void setEvaluate_type(String evaluate_type) {
            this.evaluate_type = evaluate_type;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getJob_title() {
            return job_title;
        }

        public void setJob_title(String job_title) {
            this.job_title = job_title;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
        }

        public String getName_dayslottp() {
            return name_dayslottp;
        }

        public void setName_dayslottp(String name_dayslottp) {
            this.name_dayslottp = name_dayslottp;
        }

        public String getChltp_name() {
            return chltp_name;
        }

        public void setChltp_name(String chltp_name) {
            this.chltp_name = chltp_name;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getVisit_flag_name() {
            return visit_flag_name;
        }

        public void setVisit_flag_name(String visit_flag_name) {
            this.visit_flag_name = visit_flag_name;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
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

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPatient_age() {
            return patient_age;
        }

        public void setPatient_age(String patient_age) {
            this.patient_age = patient_age;
        }

        public String getPatient_sex() {
            return patient_sex;
        }

        public void setPatient_sex(String patient_sex) {
            this.patient_sex = patient_sex;
        }

        public int getTg_evaluated() {
            return tg_evaluated;
        }

        public void setTg_evaluated(int tg_evaluated) {
            this.tg_evaluated = tg_evaluated;
        }


        @Override
        public String toString() {
            return "DataDTO{" +
                    "id_apt='" + id_apt + '\'' +
                    ", evaluate_type='" + evaluate_type + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", job_title='" + job_title + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", chltp_name='" + chltp_name + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", price='" + price + '\'' +
                    ", visit_flag_name='" + visit_flag_name + '\'' +
                    ", pat_type=" + pat_type +
                    ", patient_id=" + patient_id +
                    ", patient_name='" + patient_name + '\'' +
                    ", id_num=" + id_num +
                    ", phone='" + phone + '\'' +
                    ", patient_age=" + patient_age +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", tg_evaluated=" + tg_evaluated +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SatisfactionAptListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
