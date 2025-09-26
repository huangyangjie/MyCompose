package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class zyClDetaileEntity {


    @SerializedName("code")
    public Integer code;

    public Integer getCode() {
        return code;
    }

    public zyClDetaileEntity setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public zyClDetaileEntity setMessage(String message) {
        this.message = message;
        return this;
    }

    public DataDTO getData() {
        return data;
    }

    public zyClDetaileEntity setData(DataDTO data) {
        this.data = data;
        return this;
    }

    @SerializedName("message")
    public String message;
    @SerializedName("data")
    public DataDTO data;

    public static class DataDTO {
        @SerializedName("admis_dep")
        public String admisDep;
        @SerializedName("admis_ward")
        public String admisWard;
        @SerializedName("code_amr_ip")
        public String codeAmrIp;
        @SerializedName("dt_acpt")
        public String dtAcpt;
        @SerializedName("dt_end")
        public String dtEnd;
        @SerializedName("mail_data")
        public String mailData;
        @SerializedName("remark")
        public String remark;
        @SerializedName("name_receive")
        public String nameReceive;
        @SerializedName("phone_receive")
        public String phoneReceive;

        public String getAdmisDep() {
            return admisDep;
        }

        public DataDTO setAdmisDep(String admisDep) {
            this.admisDep = admisDep;
            return this;
        }

        public String getAdmisWard() {
            return admisWard;
        }

        public DataDTO setAdmisWard(String admisWard) {
            this.admisWard = admisWard;
            return this;
        }

        public String getCodeAmrIp() {
            return codeAmrIp;
        }

        public DataDTO setCodeAmrIp(String codeAmrIp) {
            this.codeAmrIp = codeAmrIp;
            return this;
        }

        public String getDtAcpt() {
            return dtAcpt;
        }

        public DataDTO setDtAcpt(String dtAcpt) {
            this.dtAcpt = dtAcpt;
            return this;
        }

        public String getDtEnd() {
            return dtEnd;
        }

        public DataDTO setDtEnd(String dtEnd) {
            this.dtEnd = dtEnd;
            return this;
        }

        public String getMailData() {
            return mailData;
        }

        public DataDTO setMailData(String mailData) {
            this.mailData = mailData;
            return this;
        }

        public String getRemark() {
            return remark;
        }

        public DataDTO setRemark(String remark) {
            this.remark = remark;
            return this;
        }

        public String getNameReceive() {
            return nameReceive;
        }

        public DataDTO setNameReceive(String nameReceive) {
            this.nameReceive = nameReceive;
            return this;
        }

        public String getPhoneReceive() {

            if (TextUtils.isEmpty(phoneReceive)) {
                return  "";
            }
            if (phoneReceive.length()==11){
                return phoneReceive.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
            }
            return phoneReceive;
        }

        public DataDTO setPhoneReceive(String phoneReceive) {
            this.phoneReceive = phoneReceive;
            return this;
        }

        public String getDistrictNameReceive() {
            return districtNameReceive;
        }

        public DataDTO setDistrictNameReceive(String districtNameReceive) {
            this.districtNameReceive = districtNameReceive;
            return this;
        }

        public String getAddressReceive() {
            return addressReceive;
        }

        public DataDTO setAddressReceive(String addressReceive) {
            this.addressReceive = addressReceive;
            return this;
        }

        public String getDeliverFee() {
            return deliverFee;
        }

        public DataDTO setDeliverFee(String deliverFee) {
            this.deliverFee = deliverFee;
            return this;
        }

        public String getMailNo() {
            return mailNo;
        }

        public DataDTO setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }

        public String getBspOrderNo() {
            return bspOrderNo;
        }

        public DataDTO setBspOrderNo(String bspOrderNo) {
            this.bspOrderNo = bspOrderNo;
            return this;
        }

        @SerializedName("district_name_receive")
        public String districtNameReceive;
        @SerializedName("address_receive")
        public String addressReceive;
        @SerializedName("deliver_fee")
        public String deliverFee;
        @SerializedName("mail_no")
        public String mailNo;
        @SerializedName("bsp_order_no")
        public String bspOrderNo;
    }
}
