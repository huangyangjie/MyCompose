package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ElectronicListEntity {

    private int code;
    private String message;
    private List<DataDTO> data;

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

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        private String Inc_id;
        private String Incno;
        private String Dt_inc;
        private String Ec_inc_code;
        private String Ec_inc_checkno;
        private String Ec_url;
        private String Ec_net_url;
        private String Eu_direct;
        private String Amt;

        public String getInc_id() {
            return Inc_id;
        }

        public void setInc_id(String inc_id) {
            Inc_id = inc_id;
        }

        public String getIncno() {
            return Incno;
        }

        public void setIncno(String incno) {
            Incno = incno;
        }

        public String getDt_inc() {
            return Dt_inc;
        }

        public void setDt_inc(String dt_inc) {
            Dt_inc = dt_inc;
        }

        public String getEc_inc_code() {
            return Ec_inc_code;
        }

        public void setEc_inc_code(String ec_inc_code) {
            Ec_inc_code = ec_inc_code;
        }

        public String getEc_inc_checkno() {
            return Ec_inc_checkno;
        }

        public void setEc_inc_checkno(String ec_inc_checkno) {
            Ec_inc_checkno = ec_inc_checkno;
        }

        public String getEc_url() {
            return Ec_url;
        }

        public void setEc_url(String ec_url) {
            Ec_url = ec_url;
        }

        public String getEc_net_url() {
            return Ec_net_url;
        }

        public void setEc_net_url(String ec_net_url) {
            Ec_net_url = ec_net_url;
        }

        public String getEu_direct() {
            return Eu_direct;
        }

        public void setEu_direct(String eu_direct) {
            Eu_direct = eu_direct;
        }

        public String getAmt() {
            return Amt;
        }

        public void setAmt(String amt) {
            Amt = amt;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "Inc_id='" + Inc_id + '\'' +
                    ", Incno='" + Incno + '\'' +
                    ", Dt_inc='" + Dt_inc + '\'' +
                    ", Ec_inc_code='" + Ec_inc_code + '\'' +
                    ", Ec_inc_checkno='" + Ec_inc_checkno + '\'' +
                    ", Ec_url='" + Ec_url + '\'' +
                    ", Ec_net_url='" + Ec_net_url + '\'' +
                    ", Eu_direct='" + Eu_direct + '\'' +
                    ", Amt='" + Amt + '\'' +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "ElectronicListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
