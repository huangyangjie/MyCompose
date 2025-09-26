package com.example.mycompose.repository.entity;

public class HuaJiaEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "HuaJiaEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String id_apt;
        private String apt_id;
        private String phone;
        private String id_num;
        private String reserve_code;
        private String code_pat;
        private String dept_sn;
        private String dept_name;
        private String doctor_sn;
        private String doctor_name;
        private String name_dayslottp;
        private String name_srvtp;
        private String dt_sch;
        private String t_b_ticks;
        private String t_e_ticks;
        private String op_place;
        private String day_of_week;
        private String price;

        @Override
        public String toString() {
            return "DataBean{" +
                    "id_apt='" + id_apt + '\'' +
                    ", apt_id='" + apt_id + '\'' +
                    ", phone='" + phone + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", reserve_code='" + reserve_code + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", name_srvtp='" + name_srvtp + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", t_b_ticks='" + t_b_ticks + '\'' +
                    ", t_e_ticks='" + t_e_ticks + '\'' +
                    ", op_place='" + op_place + '\'' +
                    ", day_of_week='" + day_of_week + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getApt_id() {
            return apt_id;
        }

        public void setApt_id(String apt_id) {
            this.apt_id = apt_id;
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

        public String getReserve_code() {
            return reserve_code;
        }

        public void setReserve_code(String reserve_code) {
            this.reserve_code = reserve_code;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
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

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getName_dayslottp() {
            return name_dayslottp;
        }

        public void setName_dayslottp(String name_dayslottp) {
            this.name_dayslottp = name_dayslottp;
        }

        public String getName_srvtp() {
            return name_srvtp;
        }

        public void setName_srvtp(String name_srvtp) {
            this.name_srvtp = name_srvtp;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
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

        public String getOp_place() {
            return op_place;
        }

        public void setOp_place(String op_place) {
            this.op_place = op_place;
        }

        public String getDay_of_week() {
            return day_of_week;
        }

        public void setDay_of_week(String day_of_week) {
            this.day_of_week = day_of_week;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
