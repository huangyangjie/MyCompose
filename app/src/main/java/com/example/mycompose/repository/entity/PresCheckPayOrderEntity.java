package com.example.mycompose.repository.entity;

public class PresCheckPayOrderEntity {


    private Integer code;
    private String message;
    private DataBean data;

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
        private int pay_status;
        private int iih_pay_status;
        private String out_trade_no;
        private String prescription_id;

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

        public String getPrescription_id() {
            return prescription_id;
        }

        public void setPrescription_id(String prescription_id) {
            this.prescription_id = prescription_id;
        }
    }
}
