package com.example.mycompose.repository.entity;

public class AlternateOrderPayStatusEntity {


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
        private int pay_status;
        private int iih_pay_status;
        private String out_trade_no;
        private String dept_name;
        private String doctor_name;
        private String name_srvtp;
        private String dt_sch;
        private String day_of_week;
        private String name_dayslottp;
        private String price;

        public int getPay_status() {
            return pay_status;
        }

        public void setPay_status(int pay_status) {
            this.pay_status = pay_status;
        }

        public int getIih_pay_status() {
            return iih_pay_status;
        }

        public void setIih_pay_status(int iih_pay_status) {
            this.iih_pay_status = iih_pay_status;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
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

        @Override
        public String toString() {
            return "DataDTO{" +
                    "pay_status=" + pay_status +
                    ", iih_pay_status=" + iih_pay_status +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", name_srvtp='" + name_srvtp + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", day_of_week='" + day_of_week + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AlternateOrderPayStatusEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
