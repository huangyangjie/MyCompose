package com.example.mycompose.repository.entity;

public class SfPlaceEntity {

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
        private String prescription_no;
        private String total_amt;
        private String name;
        private String id_type;
        private String id_num;
        private String phone;
        private String p_code_receive;
        private String c_code_receive;
        private String a_code_receive;
        private String phone_receive;
        private String name_receive;
        private String district_name_receive;
        private String address_receive;
        private String remark;
        private Object user_id_type;
        private Object user_id_num;

        public String getPrescription_no() {
            return prescription_no;
        }

        public void setPrescription_no(String prescription_no) {
            this.prescription_no = prescription_no;
        }

        public String getTotal_amt() {
            return total_amt;
        }

        public void setTotal_amt(String total_amt) {
            this.total_amt = total_amt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId_type() {
            return id_type;
        }

        public void setId_type(String id_type) {
            this.id_type = id_type;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getP_code_receive() {
            return p_code_receive;
        }

        public void setP_code_receive(String p_code_receive) {
            this.p_code_receive = p_code_receive;
        }

        public String getC_code_receive() {
            return c_code_receive;
        }

        public void setC_code_receive(String c_code_receive) {
            this.c_code_receive = c_code_receive;
        }

        public String getA_code_receive() {
            return a_code_receive;
        }

        public void setA_code_receive(String a_code_receive) {
            this.a_code_receive = a_code_receive;
        }

        public String getPhone_receive() {
            return phone_receive;
        }

        public void setPhone_receive(String phone_receive) {
            this.phone_receive = phone_receive;
        }

        public String getName_receive() {
            return name_receive;
        }

        public void setName_receive(String name_receive) {
            this.name_receive = name_receive;
        }

        public String getDistrict_name_receive() {
            return district_name_receive;
        }

        public void setDistrict_name_receive(String district_name_receive) {
            this.district_name_receive = district_name_receive;
        }

        public String getAddress_receive() {
            return address_receive;
        }

        public void setAddress_receive(String address_receive) {
            this.address_receive = address_receive;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Object getUser_id_type() {
            return user_id_type;
        }

        public void setUser_id_type(Object user_id_type) {
            this.user_id_type = user_id_type;
        }

        public Object getUser_id_num() {
            return user_id_num;
        }

        public void setUser_id_num(Object user_id_num) {
            this.user_id_num = user_id_num;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "prescription_no='" + prescription_no + '\'' +
                    ", total_amt='" + total_amt + '\'' +
                    ", name='" + name + '\'' +
                    ", id_type='" + id_type + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", phone='" + phone + '\'' +
                    ", p_code_receive='" + p_code_receive + '\'' +
                    ", c_code_receive='" + c_code_receive + '\'' +
                    ", a_code_receive='" + a_code_receive + '\'' +
                    ", phone_receive='" + phone_receive + '\'' +
                    ", name_receive='" + name_receive + '\'' +
                    ", district_name_receive='" + district_name_receive + '\'' +
                    ", address_receive='" + address_receive + '\'' +
                    ", remark='" + remark + '\'' +
                    ", user_id_type=" + user_id_type +
                    ", user_id_num=" + user_id_num +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SfPlaceEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
