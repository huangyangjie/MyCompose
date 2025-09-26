package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryOrderEntity {

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
        private int pay_status;
        private DetailDataDTO detailData;

        public int getPay_status() {
            return pay_status;
        }

        public void setPay_status(int pay_status) {
            this.pay_status = pay_status;
        }

        public DetailDataDTO getDetailData() {
            return detailData;
        }

        public void setDetailData(DetailDataDTO detailData) {
            this.detailData = detailData;
        }

        public static class DetailDataDTO {
            @SerializedName("Id_stoep")
            private String id_stoep;
            @SerializedName("PayInfo")
            private List<PayInfoDTO> payInfo;
            @SerializedName("Code_ent")
            private String code_ent;
            @SerializedName("Code_enttp")
            private String code_enttp;
            @SerializedName("Times_op")
            private String times_op;
            @SerializedName("Amt_ent")
            private String amt_ent;
            @SerializedName("Dt_acpt")
            private String dt_acpt;
            @SerializedName("Dt_effe")
            private String dt_effe;
            @SerializedName("Dt_or")
            private String dt_or;
            private String code_pat;
            private String patient_name;
            private String doctor_avatar;
            @SerializedName("Code_dep_or")
            private String code_dep_or;
            @SerializedName("Name_dep_or")
            private String name_dep_or;
            @SerializedName("Code_emp_or")
            private String code_emp_or;
            @SerializedName("Name_emp_or")
            private String name_emp_or;
            private List<PresinfosDTO> presinfos;

            public String getId_stoep() {
                return id_stoep;
            }

            public void setId_stoep(String id_stoep) {
                this.id_stoep = id_stoep;
            }

            public List<PayInfoDTO> getPayInfo() {
                return payInfo;
            }

            public void setPayInfo(List<PayInfoDTO> payInfo) {
                this.payInfo = payInfo;
            }

            public String getCode_ent() {
                return code_ent;
            }

            public void setCode_ent(String code_ent) {
                this.code_ent = code_ent;
            }

            public String getCode_enttp() {
                return code_enttp;
            }

            public void setCode_enttp(String code_enttp) {
                this.code_enttp = code_enttp;
            }

            public String getTimes_op() {
                return times_op;
            }

            public void setTimes_op(String times_op) {
                this.times_op = times_op;
            }

            public String getAmt_ent() {
                return amt_ent;
            }

            public void setAmt_ent(String amt_ent) {
                this.amt_ent = amt_ent;
            }

            public String getDt_acpt() {
                return dt_acpt;
            }

            public void setDt_acpt(String dt_acpt) {
                this.dt_acpt = dt_acpt;
            }

            public String getDt_effe() {
                return dt_effe;
            }

            public void setDt_effe(String dt_effe) {
                this.dt_effe = dt_effe;
            }

            public String getDt_or() {
                return dt_or;
            }

            public void setDt_or(String dt_or) {
                this.dt_or = dt_or;
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
                return code_dep_or;
            }

            public void setCode_dep_or(String code_dep_or) {
                this.code_dep_or = code_dep_or;
            }

            public String getName_dep_or() {
                return name_dep_or;
            }

            public void setName_dep_or(String name_dep_or) {
                this.name_dep_or = name_dep_or;
            }

            public String getCode_emp_or() {
                return code_emp_or;
            }

            public void setCode_emp_or(String code_emp_or) {
                this.code_emp_or = code_emp_or;
            }

            public String getName_emp_or() {
                return name_emp_or;
            }

            public void setName_emp_or(String name_emp_or) {
                this.name_emp_or = name_emp_or;
            }

            public List<PresinfosDTO> getPresinfos() {
                return presinfos;
            }

            public void setPresinfos(List<PresinfosDTO> presinfos) {
                this.presinfos = presinfos;
            }

            public static class PayInfoDTO {
                @SerializedName("Paymoney")
                private String paymoney;
                @SerializedName("Paymentmethod")
                private String paymentmethod;
                @SerializedName("PaymentmethodName")
                private String paymentmethodName;

                public String getPaymoney() {
                    return paymoney;
                }

                public void setPaymoney(String paymoney) {
                    this.paymoney = paymoney;
                }

                public String getPaymentmethod() {
                    return paymentmethod;
                }

                public void setPaymentmethod(String paymentmethod) {
                    this.paymentmethod = paymentmethod;
                }

                public String getPaymentmethodName() {
                    return paymentmethodName;
                }

                public void setPaymentmethodName(String paymentmethodName) {
                    this.paymentmethodName = paymentmethodName;
                }

                @Override
                public String toString() {
                    return "PayInfoDTO{" +
                            "paymoney='" + paymoney + '\'' +
                            ", paymentmethod='" + paymentmethod + '\'' +
                            ", paymentmethodName='" + paymentmethodName + '\'' +
                            '}';
                }
            }

            public static class PresinfosDTO {
                @SerializedName("Code_apply")
                private String code_apply;
                @SerializedName("Amt_pres")
                private String amt_pres;
                @SerializedName("Billitms")
                private BillitmsDTO billitms;

                public String getCode_apply() {
                    return code_apply;
                }

                public void setCode_apply(String code_apply) {
                    this.code_apply = code_apply;
                }

                public String getAmt_pres() {
                    return amt_pres;
                }

                public void setAmt_pres(String amt_pres) {
                    this.amt_pres = amt_pres;
                }

                public BillitmsDTO getBillitms() {
                    return billitms;
                }

                public void setBillitms(BillitmsDTO billitms) {
                    this.billitms = billitms;
                }

                public static class BillitmsDTO {
                    @SerializedName("Billitm")
                    private List<BillitmDTO> billitm;

                    public List<BillitmDTO> getBillitm() {
                        return billitm;
                    }

                    public void setBillitm(List<BillitmDTO> billitm) {
                        this.billitm = billitm;
                    }

                    public static class BillitmDTO {
                        @SerializedName("Code_srv")
                        private String code_srv;
                        @SerializedName("Name_srv")
                        private String name_srv;
                        @SerializedName("Name_srvu")
                        private String name_srvu;
                        @SerializedName("Code_mm")
                        private String code_mm;
                        @SerializedName("Spec")
                        private String spec;
                        @SerializedName("Price")
                        private String price;
                        @SerializedName("Quan")
                        private String quan;
                        @SerializedName("Amt")
                        private String amt;
                        @SerializedName("Dt_or")
                        private String dt_or;
                        @SerializedName("Code_dep_mp")
                        private String code_dep_mp;
                        @SerializedName("Name_dep_mp")
                        private String name_dep_mp;
                        @SerializedName("Id_or")
                        private String id_or;
                        @SerializedName("Name_or")
                        private String name_or;
                        @SerializedName("Dt_effe")
                        private String dt_effe;
                        @SerializedName("Sd_srvtp")
                        private String sd_srvtp;
                        @SerializedName("Code_dep_or")
                        private String code_dep_or;
                        @SerializedName("Name_dep_or")
                        private String name_dep_or;
                        @SerializedName("Code_emp_or")
                        private String code_emp_or;
                        @SerializedName("Name_emp_or")
                        private String name_emp_or;
                        @SerializedName("Fg_acc")
                        private String fg_acc;
                        @SerializedName("Fg_additm")
                        private String fg_additm;
                        @SerializedName("Fg_susp")
                        private String fg_susp;
                        @SerializedName("Fg_hpcg")
                        private String fg_hpcg;
                        @SerializedName("Eu_srctp")
                        private String eu_srctp;

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

                        public String getName_srvu() {
                            return name_srvu;
                        }

                        public void setName_srvu(String name_srvu) {
                            this.name_srvu = name_srvu;
                        }

                        public String getCode_mm() {
                            return code_mm;
                        }

                        public void setCode_mm(String code_mm) {
                            this.code_mm = code_mm;
                        }

                        public String getSpec() {
                            return spec;
                        }

                        public void setSpec(String spec) {
                            this.spec = spec;
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

                        public String getSd_srvtp() {
                            return sd_srvtp;
                        }

                        public void setSd_srvtp(String sd_srvtp) {
                            this.sd_srvtp = sd_srvtp;
                        }

                        public String getCode_dep_or() {
                            return code_dep_or;
                        }

                        public void setCode_dep_or(String code_dep_or) {
                            this.code_dep_or = code_dep_or;
                        }

                        public String getName_dep_or() {
                            return name_dep_or;
                        }

                        public void setName_dep_or(String name_dep_or) {
                            this.name_dep_or = name_dep_or;
                        }

                        public String getCode_emp_or() {
                            return code_emp_or;
                        }

                        public void setCode_emp_or(String code_emp_or) {
                            this.code_emp_or = code_emp_or;
                        }

                        public String getName_emp_or() {
                            return name_emp_or;
                        }

                        public void setName_emp_or(String name_emp_or) {
                            this.name_emp_or = name_emp_or;
                        }

                        public String getFg_acc() {
                            return fg_acc;
                        }

                        public void setFg_acc(String fg_acc) {
                            this.fg_acc = fg_acc;
                        }

                        public String getFg_additm() {
                            return fg_additm;
                        }

                        public void setFg_additm(String fg_additm) {
                            this.fg_additm = fg_additm;
                        }

                        public String getFg_susp() {
                            return fg_susp;
                        }

                        public void setFg_susp(String fg_susp) {
                            this.fg_susp = fg_susp;
                        }

                        public String getFg_hpcg() {
                            return fg_hpcg;
                        }

                        public void setFg_hpcg(String fg_hpcg) {
                            this.fg_hpcg = fg_hpcg;
                        }

                        public String getEu_srctp() {
                            return eu_srctp;
                        }

                        public void setEu_srctp(String eu_srctp) {
                            this.eu_srctp = eu_srctp;
                        }

                        @Override
                        public String toString() {
                            return "BillitmDTO{" +
                                    "code_srv='" + code_srv + '\'' +
                                    ", name_srv='" + name_srv + '\'' +
                                    ", name_srvu='" + name_srvu + '\'' +
                                    ", code_mm='" + code_mm + '\'' +
                                    ", spec='" + spec + '\'' +
                                    ", price='" + price + '\'' +
                                    ", quan='" + quan + '\'' +
                                    ", amt='" + amt + '\'' +
                                    ", dt_or='" + dt_or + '\'' +
                                    ", code_dep_mp='" + code_dep_mp + '\'' +
                                    ", name_dep_mp='" + name_dep_mp + '\'' +
                                    ", id_or='" + id_or + '\'' +
                                    ", name_or='" + name_or + '\'' +
                                    ", dt_effe='" + dt_effe + '\'' +
                                    ", sd_srvtp='" + sd_srvtp + '\'' +
                                    ", code_dep_or='" + code_dep_or + '\'' +
                                    ", name_dep_or='" + name_dep_or + '\'' +
                                    ", code_emp_or='" + code_emp_or + '\'' +
                                    ", name_emp_or='" + name_emp_or + '\'' +
                                    ", fg_acc='" + fg_acc + '\'' +
                                    ", fg_additm='" + fg_additm + '\'' +
                                    ", fg_susp='" + fg_susp + '\'' +
                                    ", fg_hpcg='" + fg_hpcg + '\'' +
                                    ", eu_srctp='" + eu_srctp + '\'' +
                                    '}';
                        }
                    }

                    @Override
                    public String toString() {
                        return "BillitmsDTO{" +
                                "billitm=" + billitm +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "PresinfosDTO{" +
                            "code_apply='" + code_apply + '\'' +
                            ", amt_pres='" + amt_pres + '\'' +
                            ", billitms=" + billitms +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "DetailDataDTO{" +
                        "id_stoep='" + id_stoep + '\'' +
                        ", payInfo=" + payInfo +
                        ", code_ent='" + code_ent + '\'' +
                        ", code_enttp='" + code_enttp + '\'' +
                        ", times_op='" + times_op + '\'' +
                        ", amt_ent='" + amt_ent + '\'' +
                        ", dt_acpt='" + dt_acpt + '\'' +
                        ", dt_effe='" + dt_effe + '\'' +
                        ", dt_or='" + dt_or + '\'' +
                        ", code_pat='" + code_pat + '\'' +
                        ", patient_name='" + patient_name + '\'' +
                        ", doctor_avatar='" + doctor_avatar + '\'' +
                        ", code_dep_or='" + code_dep_or + '\'' +
                        ", name_dep_or='" + name_dep_or + '\'' +
                        ", code_emp_or='" + code_emp_or + '\'' +
                        ", name_emp_or='" + name_emp_or + '\'' +
                        ", presinfos=" + presinfos +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "pay_status=" + pay_status +
                    ", detailData=" + detailData +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "QueryOrderEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
