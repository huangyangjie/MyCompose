package com.example.mycompose.repository.entity;

public class OutpatientPaymentOrderStatusEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "OutpatientPaymentOrderStatusEntity{" +
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
        private String outpatient_id;
        private String out_trade_no;
        private String amt_capital;
        private String patient_name;
        private String amt;
        private String pay_method;

        @Override
        public String toString() {
            return "DataBean{" +
                    "pay_status=" + pay_status +
                    ", iih_pay_status=" + iih_pay_status +
                    ", outpatient_id='" + outpatient_id + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", amt_capital='" + amt_capital + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", amt='" + amt + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    '}';
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

        public String getAmt_capital() {
            return amt_capital;
        }

        public void setAmt_capital(String amt_capital) {
            this.amt_capital = amt_capital;
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

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }
    }
}
