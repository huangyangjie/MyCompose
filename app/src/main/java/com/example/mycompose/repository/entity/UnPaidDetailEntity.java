package com.example.mycompose.repository.entity;


import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UnPaidDetailEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "UnPaidDetailEntity{" +
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
        @SerializedName("Code_apply")
        private String code_apply;
        @SerializedName("Sd_srvtp")
        private String sd_srvtp;
        private String total_amount;
        @SerializedName("Sd_srvtp_name")
        private String sd_srvtp_name;
        @SerializedName("Id_or")
        private String id_or;
        @SerializedName("Name_or")
        private String name_or;
        @SerializedName("Dt_effe")
        private String dt_effe;
        @SerializedName("Amt_pres")
        private String amt_pres;
        private String execute_dept_name;
        private String execute_dept_code;
        private List<PresitmsBean> presitms;
      

        @Override
        public String toString() {
            return "DataBean{" +
                    "code_apply='" + code_apply + '\'' +
                    ", sd_srvtp='" + sd_srvtp + '\'' +
                    ", total_amount='" + total_amount + '\'' +
                    ", sd_srvtp_name='" + sd_srvtp_name + '\'' +
                    ", id_or='" + id_or + '\'' +
                    ", name_or='" + name_or + '\'' +
                    ", dt_effe='" + dt_effe + '\'' +
                    ", amt_pres='" + amt_pres + '\'' +
                    ", execute_dept_name='" + execute_dept_name + '\'' +
                    ", execute_dept_code='" + execute_dept_code + '\'' +
                    ", presitms=" + presitms +
                    '}';
        }

        public String getCode_apply() {
            return code_apply;
        }

        public void setCode_apply(String code_apply) {
            this.code_apply = code_apply;
        }

        public String getSd_srvtp() {
            return sd_srvtp;
        }

        public void setSd_srvtp(String sd_srvtp) {
            this.sd_srvtp = sd_srvtp;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }

        public String getSd_srvtp_name() {
            if(TextUtils.isEmpty(sd_srvtp_name)){
                return "";
            }else{
                return sd_srvtp_name;
            }
        }

        public void setSd_srvtp_name(String sd_srvtp_name) {
            this.sd_srvtp_name = sd_srvtp_name;
        }

        public String getId_or() {
            return id_or;
        }

        public void setId_or(String id_or) {
            this.id_or = id_or;
        }

        public String getName_or() {
            return name_or;
        }

        public void setName_or(String name_or) {
            this.name_or = name_or;
        }

        public String getDt_effe() {
            return dt_effe;
        }

        public void setDt_effe(String dt_effe) {
            this.dt_effe = dt_effe;
        }

        public String getAmt_pres() {
            return amt_pres;
        }

        public void setAmt_pres(String amt_pres) {
            this.amt_pres = amt_pres;
        }

        public String getExecute_dept_name() {
            return execute_dept_name;
        }

        public void setExecute_dept_name(String execute_dept_name) {
            this.execute_dept_name = execute_dept_name;
        }

        public String getExecute_dept_code() {
            return execute_dept_code;
        }

        public void setExecute_dept_code(String execute_dept_code) {
            this.execute_dept_code = execute_dept_code;
        }

        public List<PresitmsBean> getPresitms() {
            return presitms;
        }

        public void setPresitms(List<PresitmsBean> presitms) {
            this.presitms = presitms;
        }

        public static class PresitmsBean {
            @SerializedName("Code_srv")
            private String code_srv;
            @SerializedName("Name_srv")
            private String name_srv;
            @SerializedName("Sd_srvtp")
            private String sd_srvtp;
            @SerializedName("Name_srvu")
            private String name_srvu;
            @SerializedName("Price")
            private String price;
            @SerializedName("Quan")
            private String quan;
            @SerializedName("Code_dep_mp")
            private String code_dep_mp;
            @SerializedName("Name_dep_mp")
            private String name_dep_mp;
            @SerializedName("Amt")
            private String amt;
            @SerializedName("Dt_or")
            private String dt_or;
            @SerializedName("Name_or")
            private String name_or;
            @SerializedName("Id_or")
            private String id_or;
            @SerializedName("Code_enttp")
            private String code_enttp;
            @SerializedName("Name_srv_cimedkind")
            private String name_srv_cimedkind;
            @SerializedName("Code_srv_cimedkind")
            private String code_srv_cimedkind;
            private String drug_code;
            private String Code_mm;

            public void setCode_mm(String code_mm) {
                Code_mm = code_mm;
            }

            public String getCode_mm() {
                return Code_mm;
            }

            @Override
            public String toString() {
                return "PresitmsBean{" +
                        "code_srv='" + code_srv + '\'' +
                        ", name_srv='" + name_srv + '\'' +
                        ", sd_srvtp='" + sd_srvtp + '\'' +
                        ", name_srvu='" + name_srvu + '\'' +
                        ", price='" + price + '\'' +
                        ", quan='" + quan + '\'' +
                        ", code_dep_mp='" + code_dep_mp + '\'' +
                        ", name_dep_mp='" + name_dep_mp + '\'' +
                        ", amt='" + amt + '\'' +
                        ", dt_or='" + dt_or + '\'' +
                        ", name_or='" + name_or + '\'' +
                        ", id_or='" + id_or + '\'' +
                        ", code_enttp='" + code_enttp + '\'' +
                        ", name_srv_cimedkind='" + name_srv_cimedkind + '\'' +
                        ", code_srv_cimedkind='" + code_srv_cimedkind + '\'' +
                        ", drug_code='" + drug_code + '\'' +
                        ", Code_mm='" + Code_mm + '\'' +
                        '}';
            }

            public void setDrug_code(String drug_code) {
                this.drug_code = drug_code;
            }

            public String getDrug_code() {
                return drug_code;
            }

            public String getCode_srv() {
                return code_srv;
            }

            public void setCode_srv(String code_srv) {
                this.code_srv = code_srv;
            }

            public String getName_srv() {
                return name_srv;
            }

            public void setName_srv(String name_srv) {
                this.name_srv = name_srv;
            }

            public String getSd_srvtp() {
                return sd_srvtp;
            }

            public void setSd_srvtp(String sd_srvtp) {
                this.sd_srvtp = sd_srvtp;
            }

            public String getName_srvu() {
                return name_srvu;
            }

            public void setName_srvu(String name_srvu) {
                this.name_srvu = name_srvu;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getQuan() {
                return quan;
            }

            public void setQuan(String quan) {
                this.quan = quan;
            }

            public String getCode_dep_mp() {
                return code_dep_mp;
            }

            public void setCode_dep_mp(String code_dep_mp) {
                this.code_dep_mp = code_dep_mp;
            }

            public String getName_dep_mp() {
                return name_dep_mp;
            }

            public void setName_dep_mp(String name_dep_mp) {
                this.name_dep_mp = name_dep_mp;
            }

            public String getAmt() {
                return amt;
            }

            public void setAmt(String amt) {
                this.amt = amt;
            }

            public String getDt_or() {
                return dt_or;
            }

            public void setDt_or(String dt_or) {
                this.dt_or = dt_or;
            }

            public String getName_or() {
                return name_or;
            }

            public void setName_or(String name_or) {
                this.name_or = name_or;
            }

            public String getId_or() {
                return id_or;
            }

            public void setId_or(String id_or) {
                this.id_or = id_or;
            }

            public String getCode_enttp() {
                return code_enttp;
            }

            public void setCode_enttp(String code_enttp) {
                this.code_enttp = code_enttp;
            }

            public String getName_srv_cimedkind() {
                return name_srv_cimedkind;
            }

            public void setName_srv_cimedkind(String name_srv_cimedkind) {
                this.name_srv_cimedkind = name_srv_cimedkind;
            }

            public String getCode_srv_cimedkind() {
                return code_srv_cimedkind;
            }

            public void setCode_srv_cimedkind(String code_srv_cimedkind) {
                this.code_srv_cimedkind = code_srv_cimedkind;
            }
        }

    }
}
