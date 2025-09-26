package com.example.mycompose.repository.entity;

public class PayOrderResultEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "PayOrderResultEntity{" +
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

        @Override
        public String toString() {
            return "DataBean{" +
                    "pay_status=" + pay_status +
                    ", iih_pay_status=" + iih_pay_status +
                    ", out_trade_no='" + out_trade_no + '\'' +
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

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }
    }
}
