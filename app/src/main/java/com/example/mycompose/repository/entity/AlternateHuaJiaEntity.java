package com.example.mycompose.repository.entity;

public class AlternateHuaJiaEntity {


    public int code;
    public String message;
    public DataBean data;

    @Override
    public String toString() {
        return "AlternateHuaJiaEntity{" +
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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        public String id_apt;
        public String dept_name;
        public String doctor_name;
        public String dt_sch;
        public String name_dayslottp;
        public String t_b_ticks;
        public String t_e_ticks;
        public String day_of_week;
        public String price;

        @Override
        public String toString() {
            return "DataBean{" +
                    "id_apt='" + id_apt + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", t_b_ticks='" + t_b_ticks + '\'' +
                    ", t_e_ticks='" + t_e_ticks + '\'' +
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

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
