package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HospitalizationExpenseseEntity {

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
        private String id_ent;
        private String code_pat;
        private String times_ip;
        private String code_amr_ip;
        private String pay_no;
        private String amt_st;
        private String amt_prepay;
        private List<PrepayInfoListDTO> prepay_info_list;
        private List<chargeList> hp_info_list;
        private String amt_self_pay;

        public List<chargeList> getHp_info_list() {
            return hp_info_list;
        }

        public DataDTO setHp_info_list(List<chargeList> hp_info_list) {
            this.hp_info_list = hp_info_list;
            return this;
        }

        private String amt_refund;
        private List<ChangeListDTO> change_list;

        public String getId_ent() {
            return id_ent;
        }

        public void setId_ent(String id_ent) {
            this.id_ent = id_ent;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getTimes_ip() {
            return times_ip;
        }

        public void setTimes_ip(String times_ip) {
            this.times_ip = times_ip;
        }

        public String getCode_amr_ip() {
            return code_amr_ip;
        }

        public void setCode_amr_ip(String code_amr_ip) {
            this.code_amr_ip = code_amr_ip;
        }

        public String getPay_no() {
            return pay_no;
        }

        public void setPay_no(String pay_no) {
            this.pay_no = pay_no;
        }

        public String getAmt_st() {
            return amt_st;
        }

        public void setAmt_st(String amt_st) {
            this.amt_st = amt_st;
        }

        public String getAmt_prepay() {
            return amt_prepay;
        }

        public void setAmt_prepay(String amt_prepay) {
            this.amt_prepay = amt_prepay;
        }

        public List<PrepayInfoListDTO> getPrepay_info_list() {
            return prepay_info_list;
        }

        public void setPrepay_info_list(List<PrepayInfoListDTO> prepay_info_list) {
            this.prepay_info_list = prepay_info_list;
        }

        public String getAmt_self_pay() {
            return amt_self_pay;
        }

        public void setAmt_self_pay(String amt_self_pay) {
            this.amt_self_pay = amt_self_pay;
        }

        public String getAmt_refund() {
            return amt_refund;
        }

        public void setAmt_refund(String amt_refund) {
            this.amt_refund = amt_refund;
        }

        public List<ChangeListDTO> getChange_list() {
            return change_list;
        }

        public void setChange_list(List<ChangeListDTO> change_list) {
            this.change_list = change_list;
        }

        public static class PrepayInfoListDTO {
            private String amt;
            private String sd_pm;
            private String name_pm;
            private String out_trade_no;
            private String dt_pay;

            public String getOut_trade_no() {
                return out_trade_no;
            }

            public void setOut_trade_no(String out_trade_no) {
                this.out_trade_no = out_trade_no;
            }

            public String getDt_pay() {
                return dt_pay;
            }

            public void setDt_pay(String dt_pay) {
                this.dt_pay = dt_pay;
            }

            public String getAmt() {
                return amt;
            }

            public void setAmt(String amt) {
                this.amt = amt;
            }

            public String getSd_pm() {
                return sd_pm;
            }

            public void setSd_pm(String sd_pm) {
                this.sd_pm = sd_pm;
            }

            public String getName_pm() {
                return name_pm;
            }

            public void setName_pm(String name_pm) {
                this.name_pm = name_pm;
            }

            @Override
            public String toString() {
                return "PrepayInfoListDTO{" +
                        "amt='" + amt + '\'' +
                        ", sd_pm='" + sd_pm + '\'' +
                        ", name_pm='" + name_pm + '\'' +
                        ", out_trade_no='" + out_trade_no + '\'' +
                        ", dt_pay='" + dt_pay + '\'' +
                        '}';
            }
        }

        public static class chargeList {


            @SerializedName("amt")
            public String amt;
            @SerializedName("sd_pm")
            public String sdPm;
            @SerializedName("name_pm")
            public String namePm;

            public String getAmt() {
                return amt;
            }

            public chargeList setAmt(String amt) {
                this.amt = amt;
                return this;
            }

            public String getSdPm() {
                return sdPm;
            }

            public chargeList setSdPm(String sdPm) {
                this.sdPm = sdPm;
                return this;
            }

            public String getNamePm() {
                return namePm;
            }

            public chargeList setNamePm(String namePm) {
                this.namePm = namePm;
                return this;
            }
        }

        public static class ChangeListDTO {
            private String Sd_pm;
            private String Amt;
            private String Paymodenode;
            private String Bankno;

            public String getSd_pm() {
                return Sd_pm;
            }

            public void setSd_pm(String sd_pm) {
                Sd_pm = sd_pm;
            }

            public String getAmt() {
                return Amt;
            }

            public void setAmt(String amt) {
                Amt = amt;
            }

            public String getPaymodenode() {
                return Paymodenode;
            }

            public void setPaymodenode(String paymodenode) {
                Paymodenode = paymodenode;
            }

            public String getBankno() {
                return Bankno;
            }

            public void setBankno(String bankno) {
                Bankno = bankno;
            }

            @Override
            public String toString() {
                return "ChangeListDTO{" +
                        "Sd_pm='" + Sd_pm + '\'' +
                        ", Amt='" + Amt + '\'' +
                        ", Paymodenode='" + Paymodenode + '\'' +
                        ", Bankno='" + Bankno + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "id_ent='" + id_ent + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", times_ip='" + times_ip + '\'' +
                    ", code_amr_ip='" + code_amr_ip + '\'' +
                    ", pay_no='" + pay_no + '\'' +
                    ", amt_st='" + amt_st + '\'' +
                    ", amt_prepay='" + amt_prepay + '\'' +
                    ", prepay_info_list=" + prepay_info_list +
                    ", amt_self_pay='" + amt_self_pay + '\'' +
                    ", amt_refund='" + amt_refund + '\'' +
                    ", change_list=" + change_list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HospitalizationExpenseseEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
