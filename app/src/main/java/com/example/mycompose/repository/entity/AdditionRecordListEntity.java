package com.example.mycompose.repository.entity;

import java.util.List;

public class AdditionRecordListEntity {


    public int code;
    public String message;
    public List<DataBean> data;

    @Override
    public String toString() {
        return "AdditionRecordListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        public String createTime;
        public String id_apt;
        public String visit_flag;
        public String visit_flag_name;
        public String dt_sch;
        public String name_srvtp;
        public String name_srv;
        public String name_dayslottp;
        public String price;
        public String dept_name;
        public String doctor_name;
        public String t_b_ticks;
        public String t_e_ticks;
        public String patient_name;
        public String chltp_name;
        public String apt_id;

        @Override
        public String toString() {
            return "DataBean{" +
                    "createTime='" + createTime + '\'' +
                    ", id_apt='" + id_apt + '\'' +
                    ", visit_flag='" + visit_flag + '\'' +
                    ", visit_flag_name='" + visit_flag_name + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", name_srvtp='" + name_srvtp + '\'' +
                    ", name_srv='" + name_srv + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", price='" + price + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", t_b_ticks='" + t_b_ticks + '\'' +
                    ", t_e_ticks='" + t_e_ticks + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", chltp_name='" + chltp_name + '\'' +
                    ", apt_id='" + apt_id + '\'' +
                    '}';
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getVisit_flag() {
            return visit_flag;
        }

        public void setVisit_flag(String visit_flag) {
            this.visit_flag = visit_flag;
        }

        public String getVisit_flag_name() {
            return visit_flag_name;
        }

        public void setVisit_flag_name(String visit_flag_name) {
            this.visit_flag_name = visit_flag_name;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
        }

        public String getName_srvtp() {
            return name_srvtp;
        }

        public void setName_srvtp(String name_srvtp) {
            this.name_srvtp = name_srvtp;
        }

        public String getName_srv() {
            return name_srv;
        }

        public void setName_srv(String name_srv) {
            this.name_srv = name_srv;
        }

        public String getName_dayslottp() {
            return name_dayslottp;
        }

        public void setName_dayslottp(String name_dayslottp) {
            this.name_dayslottp = name_dayslottp;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
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

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getChltp_name() {
            return chltp_name;
        }

        public void setChltp_name(String chltp_name) {
            this.chltp_name = chltp_name;
        }

        public String getApt_id() {
            return apt_id;
        }

        public void setApt_id(String apt_id) {
            this.apt_id = apt_id;
        }
    }
}
