package com.example.mycompose.repository.entity;

public class AlternateRegEntity {

    public int code;
    public String message;
    public DataBean data;

    @Override
    public String toString() {
        return "AlternateRegEntity{" +
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
        public String id_sch;
        public String name_srvtp;
        public String dept_name;
        public String doctor_name;
        public String dt_sch;
        public String day_of_week;
        public String name_dayslottp;
        public String price;

        @Override
        public String toString() {
            return "DataBean{" +
                    "id_sch='" + id_sch + '\'' +
                    ", name_srvtp='" + name_srvtp + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", day_of_week='" + day_of_week + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }

        public String getId_sch() {
            return id_sch;
        }

        public void setId_sch(String id_sch) {
            this.id_sch = id_sch;
        }

        public String getName_srvtp() {
            return name_srvtp;
        }

        public void setName_srvtp(String name_srvtp) {
            this.name_srvtp = name_srvtp;
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

        public String getDay_of_week() {
            return day_of_week;
        }

        public void setDay_of_week(String day_of_week) {
            this.day_of_week = day_of_week;
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
    }
}
