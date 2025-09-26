package com.example.mycompose.repository.entity;

public class QueryOrderPayStatusEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "QueryOrderPayStatusEntity{" +
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
        private Integer pay_status;
        private Integer iih_pay_status;
        private String out_trade_no;
        private String dept_name;
        private String doctor_name;
        private String name_srvtp;
        private String dt_sch;
        private String time_ent;
        private String price;

        private String registration_id;
        private String patient_name;
        private String patient_age;
        private String patient_sex;
        private String amt;
        private String amt_capital;
        private String pay_method;
        private String code_amr_ip;
        private String day_of_week;
        private String name_dayslottp;
        private String t_b_ticks;
        private String t_e_ticks;



        private String code_ent;
        private String times_ip;
        private String code_pat;
        private String patient_id;
        private String inp_recharge_id;
        private String fee;
        private String notice;
        private String tip;
        private String location;

        public String getLocation() {
            return location;
        }

        public DataBean setLocation(String location) {
            this.location = location;
            return this;
        }

        public void setPatient_sex(String patient_sex) {
            this.patient_sex = patient_sex;
        }

        public String getPatient_sex() {
            return patient_sex;
        }

        public void setPatient_age(String patient_age) {
            this.patient_age = patient_age;
        }

        public String getPatient_age() {
            return patient_age;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }

        public String getCode_ent() {
            return code_ent;
        }

        public void setCode_ent(String code_ent) {
            this.code_ent = code_ent;
        }

        public String getTimes_ip() {
            return times_ip;
        }

        public void setTimes_ip(String times_ip) {
            this.times_ip = times_ip;
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

        public String getInp_recharge_id() {
            return inp_recharge_id;
        }

        public void setInp_recharge_id(String inp_recharge_id) {
            this.inp_recharge_id = inp_recharge_id;
        }

        public String getFee() {
            return fee;
        }

        public void setFee(String fee) {
            this.fee = fee;
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

        public String getCode_amr_ip() {
            return code_amr_ip;
        }

        public void setCode_amr_ip(String code_amr_ip) {
            this.code_amr_ip = code_amr_ip;
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

        public String getTime_ent() {
            return time_ent;
        }

        public void setTime_ent(String time_ent) {
            this.time_ent = time_ent;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public Integer getPay_status() {
            return pay_status;
        }

        public void setPay_status(Integer pay_status) {
            this.pay_status = pay_status;
        }

        public Integer getIih_pay_status() {
            return iih_pay_status;
        }

        public void setIih_pay_status(Integer iih_pay_status) {
            this.iih_pay_status = iih_pay_status;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "pay_status=" + pay_status +
                    ", iih_pay_status=" + iih_pay_status +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", name_srvtp='" + name_srvtp + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", time_ent='" + time_ent + '\'' +
                    ", price='" + price + '\'' +
                    ", registration_id='" + registration_id + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", amt='" + amt + '\'' +
                    ", amt_capital='" + amt_capital + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    ", code_amr_ip='" + code_amr_ip + '\'' +
                    ", day_of_week='" + day_of_week + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", t_b_ticks='" + t_b_ticks + '\'' +
                    ", t_e_ticks='" + t_e_ticks + '\'' +
                    ", code_ent='" + code_ent + '\'' +
                    ", times_ip='" + times_ip + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", inp_recharge_id='" + inp_recharge_id + '\'' +
                    ", fee='" + fee + '\'' +
                    ", notice='" + notice + '\'' +
                    ", tip='" + tip + '\'' +
                    '}';
        }

        public String getRegistration_id() {
            return registration_id;
        }

        public void setRegistration_id(String registration_id) {
            this.registration_id = registration_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getAmt() {
            return amt;
        }

        public void setAmt(String amt) {
            this.amt = amt;
        }

        public String getAmt_capital() {
            return amt_capital;
        }

        public void setAmt_capital(String amt_capital) {
            this.amt_capital = amt_capital;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }
    }
}
