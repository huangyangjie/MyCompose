package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UnPaidListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "UnPaidListEntity{" +
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
        private List<PayInfoDTO> PayInfo;
        private String Code_ent;
        private String Id_stoep;
        private String Code_enttp;
        private String Times_op;
        private String Amt_ent;
        private String Dt_acpt;
        private String code_pat;
        private String Dtst;
        private String patient_name;
        private String doctor_avatar;
        private String Code_dep_or;
        private String Name_dep_or;
        private String Code_emp_or;
        private String Name_emp_or;
        private String yb_channel;
        private String dt_channel;
        private String pat_type;

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        @SerializedName("tg_selfpay")
        private int tg_selfPay;


        public String getDt_channel() {
            return dt_channel;
        }

        public void setDt_channel(String dt_channel) {
            this.dt_channel = dt_channel;
        }

        public String getDtst() {
            return Dtst;
        }
        public String getDtstTime() {
            return TextUtils.isEmpty(Dtst)?"":Dtst.length()>16?Dtst.substring(0,16):Dtst;
        }

        public DataBean setDtst(String dtst) {
            Dtst = dtst;
            return this;
        }

        public void setTg_selfPay(int tg_selfPay) {
            this.tg_selfPay = tg_selfPay;
        }

        public int getTg_selfPay() {
            return tg_selfPay;
        }

        private String outpatient_id;
        private String Dt_effe;

        public void setYb_channel(String yb_channel) {
            this.yb_channel = yb_channel;
        }

        public String getYb_channel() {
            return yb_channel;
        }

        public void setPayInfo(List<PayInfoDTO> payInfo) {
            PayInfo = payInfo;
        }

        public List<PayInfoDTO> getPayInfo() {
            return PayInfo;
        }

        public String getOutpatient_id() {
            return outpatient_id;
        }

        public void setOutpatient_id(String outpatient_id) {
            this.outpatient_id = outpatient_id;
        }

        public String getDt_effe() {
            return Dt_effe;
        }

        public void setDt_effe(String dt_effe) {
            Dt_effe = dt_effe;
        }

        public String getId_stoep() {
            return Id_stoep;
        }

        public void setId_stoep(String id_stoep) {
            Id_stoep = id_stoep;
        }

        public String getCode_ent() {
            return Code_ent;
        }

        public void setCode_ent(String code_ent) {
            Code_ent = code_ent;
        }

        public String getCode_enttp() {
            return Code_enttp;
        }

        public void setCode_enttp(String code_enttp) {
            Code_enttp = code_enttp;
        }

        public String getTimes_op() {
            return Times_op;
        }

        public void setTimes_op(String times_op) {
            Times_op = times_op;
        }

        public String getAmt_ent() {
            return Amt_ent;
        }

        public void setAmt_ent(String amt_ent) {
            Amt_ent = amt_ent;
        }

        public String getDt_acpt() {
            return Dt_acpt;
        }

        public void setDt_acpt(String dt_acpt) {
            Dt_acpt = dt_acpt;
        }

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

        public String getDoctor_avatar() {
            return doctor_avatar;
        }

        public void setDoctor_avatar(String doctor_avatar) {
            this.doctor_avatar = doctor_avatar;
        }

        public String getCode_dep_or() {
            return Code_dep_or;
        }

        public void setCode_dep_or(String code_dep_or) {
            Code_dep_or = code_dep_or;
        }

        public String getName_dep_or() {
            return Name_dep_or;
        }

        public void setName_dep_or(String name_dep_or) {
            Name_dep_or = name_dep_or;
        }

        public String getCode_emp_or() {
            return Code_emp_or;
        }

        public void setCode_emp_or(String code_emp_or) {
            Code_emp_or = code_emp_or;
        }

        public String getName_emp_or() {
            return Name_emp_or;
        }

        public void setName_emp_or(String name_emp_or) {
            Name_emp_or = name_emp_or;
        }


        @Override
        public String toString() {
            return "DataBean{" +
                    "PayInfo=" + PayInfo +
                    ", Code_ent='" + Code_ent + '\'' +
                    ", Id_stoep='" + Id_stoep + '\'' +
                    ", Code_enttp='" + Code_enttp + '\'' +
                    ", Times_op='" + Times_op + '\'' +
                    ", Amt_ent='" + Amt_ent + '\'' +
                    ", Dt_acpt='" + Dt_acpt + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", Dtst='" + Dtst + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", doctor_avatar='" + doctor_avatar + '\'' +
                    ", Code_dep_or='" + Code_dep_or + '\'' +
                    ", Name_dep_or='" + Name_dep_or + '\'' +
                    ", Code_emp_or='" + Code_emp_or + '\'' +
                    ", Name_emp_or='" + Name_emp_or + '\'' +
                    ", yb_channel='" + yb_channel + '\'' +
                    ", dt_channel='" + dt_channel + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", tg_selfPay=" + tg_selfPay +
                    ", outpatient_id='" + outpatient_id + '\'' +
                    ", Dt_effe='" + Dt_effe + '\'' +
                    '}';
        }

        public static class PayInfoDTO {
            private String Paymoney;
            private String Paymentmethod;
            private String PaymentmethodName;

            public String getPaymoney() {
                return Paymoney;
            }

            public void setPaymoney(String paymoney) {
                Paymoney = paymoney;
            }

            public String getPaymentmethod() {
                return Paymentmethod;
            }

            public void setPaymentmethod(String paymentmethod) {
                Paymentmethod = paymentmethod;
            }

            public String getPaymentmethodName() {
                return PaymentmethodName;
            }

            public void setPaymentmethodName(String paymentmethodName) {
                PaymentmethodName = paymentmethodName;
            }

            @Override
            public String toString() {
                return "PayInfoDTO{" +
                        "Paymoney='" + Paymoney + '\'' +
                        ", Paymentmethod='" + Paymentmethod + '\'' +
                        ", PaymentmethodName='" + PaymentmethodName + '\'' +
                        '}';
            }
        }
    }
}
