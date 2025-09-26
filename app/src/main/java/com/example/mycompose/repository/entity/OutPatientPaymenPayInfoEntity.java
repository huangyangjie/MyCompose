package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

public class OutPatientPaymenPayInfoEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "OutPatientPaymenPayInfoEntity{" +
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
        private String createTime;
        private String outpatient_id;
        private String out_trade_no;
        private String code_pat;
        private String trade_no;
        private String pay_time;
        private String status;
        private String patient_id_num;
        private String iih_pat_type;
        private String pat_type_name;
        private String user_id;
        private String dt_effe;
        private String name;
        private String pay_no;
        private String amt_ent;
        private String pay_method;
        private String price;
        private String jf_type_name;

        public String getDt_effe() {
            return dt_effe;
        }

        public void setDt_effe(String dt_effe) {
            this.dt_effe = dt_effe;
        }

        public String getJf_type_name() {
            return jf_type_name;
        }

        public void setJf_type_name(String jf_type_name) {
            this.jf_type_name = jf_type_name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getOutpatient_id() {
            return outpatient_id;
        }

        public void setOutpatient_id(String outpatient_id) {
            this.outpatient_id = outpatient_id;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getTrade_no() {
            return trade_no;
        }

        public void setTrade_no(String trade_no) {
            this.trade_no = trade_no;
        }

        public String getPay_time() {
            return pay_time;
        }

        public void setPay_time(String pay_time) {
            this.pay_time = pay_time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPatient_id_num() {
            return patient_id_num;
        }

        public void setPatient_id_num(String patient_id_num) {
            this.patient_id_num = patient_id_num;
        }

        public String getIih_pat_type() {
            return iih_pat_type;
        }

        public void setIih_pat_type(String iih_pat_type) {
            this.iih_pat_type = iih_pat_type;
        }

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPay_no() {
            return pay_no;
        }

        public void setPay_no(String pay_no) {
            this.pay_no = pay_no;
        }

        public String getAmt_ent() {
            return amt_ent;
        }

        public void setAmt_ent(String amt_ent) {
            this.amt_ent = amt_ent;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "createTime='" + createTime + '\'' +
                    ", outpatient_id='" + outpatient_id + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", trade_no='" + trade_no + '\'' +
                    ", pay_time='" + pay_time + '\'' +
                    ", status='" + status + '\'' +
                    ", patient_id_num='" + patient_id_num + '\'' +
                    ", iih_pat_type='" + iih_pat_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", user_id='" + user_id + '\'' +
                    ", dt_effe='" + dt_effe + '\'' +
                    ", name='" + name + '\'' +
                    ", pay_no='" + pay_no + '\'' +
                    ", amt_ent='" + amt_ent + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    ", price='" + price + '\'' +
                    ", jf_type_name='" + jf_type_name + '\'' +
                    '}';
        }
    }

}
