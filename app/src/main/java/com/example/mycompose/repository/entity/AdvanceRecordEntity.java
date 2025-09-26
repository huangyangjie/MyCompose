package com.example.mycompose.repository.entity;

import java.util.List;

public class AdvanceRecordEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "AdvanceRecordEntity{" +
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String record_id;
        private String tp_pay;
        private String io_flag;
        private String status;
        private String status_name;
        private String pay_method;
        private String amount;
        private String record_time;


        private String pay_time;
        private String fee;
        private String fee_type;
        private String platform;

        @Override
        public String toString() {
            return "DataBean{" +
                    "record_id='" + record_id + '\'' +
                    ", tp_pay='" + tp_pay + '\'' +
                    ", io_flag='" + io_flag + '\'' +
                    ", status='" + status + '\'' +
                    ", status_name='" + status_name + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    ", amount='" + amount + '\'' +
                    ", record_time='" + record_time + '\'' +
                    ", pay_time='" + pay_time + '\'' +
                    ", fee='" + fee + '\'' +
                    ", fee_type='" + fee_type + '\'' +
                    ", platform='" + platform + '\'' +
                    '}';
        }

        public String getPay_time() {
            return pay_time;
        }

        public void setPay_time(String pay_time) {
            this.pay_time = pay_time;
        }

        public String getFee() {
            return fee;
        }

        public void setFee(String fee) {
            this.fee = fee;
        }

        public String getFee_type() {
            return fee_type;
        }

        public void setFee_type(String fee_type) {
            this.fee_type = fee_type;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getRecord_id() {
            return record_id;
        }

        public void setRecord_id(String record_id) {
            this.record_id = record_id;
        }

        public String getTp_pay() {
            return tp_pay;
        }

        public void setTp_pay(String tp_pay) {
            this.tp_pay = tp_pay;
        }

        public String getIo_flag() {
            return io_flag;
        }

        public void setIo_flag(String io_flag) {
            this.io_flag = io_flag;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getRecord_time() {
            return record_time;
        }

        public void setRecord_time(String record_time) {
            this.record_time = record_time;
        }
    }
}
