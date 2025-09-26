package com.example.mycompose.repository.entity;

public class PresHuaJiaEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "PresHuaJiaEntity{" +
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
        private String prescription_id;
        private String pay_no;
        private String price;

        @Override
        public String toString() {
            return "DataBean{" +
                    "prescription_id='" + prescription_id + '\'' +
                    ", pay_no='" + pay_no + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }

        public String getPrescription_id() {
            return prescription_id;
        }

        public void setPrescription_id(String prescription_id) {
            this.prescription_id = prescription_id;
        }

        public String getPay_no() {
            return pay_no;
        }

        public void setPay_no(String pay_no) {
            this.pay_no = pay_no;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
