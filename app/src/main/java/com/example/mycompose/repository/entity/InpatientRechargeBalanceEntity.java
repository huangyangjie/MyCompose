package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InpatientRechargeBalanceEntity {
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
        private String code_pat;
        private String patient_name;
        private String sex;
        private String Name_dep;
        private String Status_ip;
        private String Dt_entry;
        private String Name_bed;
        private String Amt_total;
        private String Amt_prepay;
        private String Amt_balance;
        private String Fg_st;
        private List<PayInfosDTO> payInfos;

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getName_dep() {
            return Name_dep;
        }

        public void setName_dep(String name_dep) {
            Name_dep = name_dep;
        }

        public String getStatus_ip() {
            return Status_ip;
        }

        public void setStatus_ip(String status_ip) {
            Status_ip = status_ip;
        }

        public String getDt_entry() {
            return Dt_entry;
        }

        public void setDt_entry(String dt_entry) {
            Dt_entry = dt_entry;
        }

        public String getName_bed() {
            return Name_bed;
        }

        public void setName_bed(String name_bed) {
            Name_bed = name_bed;
        }

        public String getAmt_total() {
            return Amt_total;
        }

        public void setAmt_total(String amt_total) {
            Amt_total = amt_total;
        }

        public String getAmt_prepay() {
            return Amt_prepay;
        }

        public void setAmt_prepay(String amt_prepay) {
            Amt_prepay = amt_prepay;
        }

        public String getAmt_balance() {
            return Amt_balance;
        }

        public void setAmt_balance(String amt_balance) {
            Amt_balance = amt_balance;
        }

        public String getFg_st() {
            return Fg_st;
        }

        public void setFg_st(String fg_st) {
            Fg_st = fg_st;
        }

        public List<PayInfosDTO> getPayInfos() {
            return payInfos;
        }

        public void setPayInfos(List<PayInfosDTO> payInfos) {
            this.payInfos = payInfos;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "code_pat='" + code_pat + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", Name_dep='" + Name_dep + '\'' +
                    ", Status_ip='" + Status_ip + '\'' +
                    ", Dt_entry='" + Dt_entry + '\'' +
                    ", Name_bed='" + Name_bed + '\'' +
                    ", Amt_total='" + Amt_total + '\'' +
                    ", Amt_prepay='" + Amt_prepay + '\'' +
                    ", Amt_balance='" + Amt_balance + '\'' +
                    ", Fg_st='" + Fg_st + '\'' +
                    ", payInfos=" + payInfos +
                    '}';
        }

        public static class PayInfosDTO {
            private String Code_inc;
            private String Name_pm;
            private String Status_amt;
            private String Dt_trade;
            private String Amt;

            public String getCode_inc() {
                return Code_inc;
            }

            public void setCode_inc(String code_inc) {
                Code_inc = code_inc;
            }

            public String getName_pm() {
                return Name_pm;
            }

            public void setName_pm(String name_pm) {
                Name_pm = name_pm;
            }

            public String getStatus_amt() {
                return Status_amt;
            }

            public void setStatus_amt(String status_amt) {
                Status_amt = status_amt;
            }

            public String getDt_trade() {
                return Dt_trade;
            }

            public void setDt_trade(String dt_trade) {
                Dt_trade = dt_trade;
            }

            public String getAmt() {
                return Amt;
            }

            public void setAmt(String amt) {
                Amt = amt;
            }

            @Override
            public String toString() {
                return "PayInfosDTO{" +
                        "Code_inc='" + Code_inc + '\'' +
                        ", Name_pm='" + Name_pm + '\'' +
                        ", Status_amt='" + Status_amt + '\'' +
                        ", Dt_trade='" + Dt_trade + '\'' +
                        ", Amt='" + Amt + '\'' +
                        '}';
            }
        }
    }

    @Override
    public String toString() {
        return "HospitalAmtCostEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
