package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;
import java.util.Locale;

public class AddressListEntity {
    //物流地址
    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "AddressListEntity{" +
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
        private String id;
        private String createTime;
        private String updateTime;
        private String user_id;
        private String name;
        private String phone;
        private String address;
        private String district;
        private String district_name;
        private String p_code;
        private String c_code;
        private String a_code;
        private Integer is_default;

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", updateTime='" + updateTime + '\'' +
                    ", user_id='" + user_id + '\'' +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", address='" + address + '\'' +
                    ", district='" + district + '\'' +
                    ", district_name='" + district_name + '\'' +
                    ", p_code='" + p_code + '\'' +
                    ", c_code='" + c_code + '\'' +
                    ", a_code='" + a_code + '\'' +
                    ", is_default=" + is_default +
                    '}';
        }

        public String getDistrict_name() {
            return district_name;
        }

        public void setDistrict_name(String district_name) {
            this.district_name = district_name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
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

        public String getPhone() {
           if (TextUtils.isEmpty(phone)) {
               return  "";
           }
            return phone;
        }
        public String getPhoneWithX() {
            if (TextUtils.isEmpty(phone)) {
                return  "";
            }
            if (phone.length()==11){
                return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
            }
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public Integer getIs_default() {
            return is_default;
        }

        public void setIs_default(Integer is_default) {
            this.is_default = is_default;
        }

        public String getP_code() {
            return p_code;
        }

        public void setP_code(String p_code) {
            this.p_code = p_code;
        }

        public String getC_code() {
            return c_code;
        }

        public void setC_code(String c_code) {
            this.c_code = c_code;
        }

        public String getA_code() {
            return a_code;
        }

        public void setA_code(String a_code) {
            this.a_code = a_code;
        }
    }
}
