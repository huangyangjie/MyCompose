package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class PurchaseEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "PurchaseEntity{" +
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
        private String total_amt;
        private String pres_doctor_name;
        private String pres_dept_name;
        private String pres_type;
        private String pres_type_name;
        private String patient_id;
        private String patient_name;
        private String code_ent;
        private String code_pat;
        private String times;
        private String pat_type;
        private String pat_type_name;
        private String take_status;
        private String take_status_name;
        private String way;
        private String pharmacy;
        private String take_drug_addr;
        private String name_receive;
        private String phone_receive;
        private String district_name_receive;
        private String address_receive;
        private String remark;
        private String clearing_form;
        private String deliver_fee;
        private String pay_time;
        private String out_trade_no;
        private String pay_method;
        private String sec_take_status_name;
        private String bsp_order_no;
        private String mail_no;
        private String selfFeeTag;
        private WesDrugsBean wes_drugs;
        private CnDrugsBean cn_drugs;

        public String getCode_ent() {
            return code_ent;
        }

        public void setCode_ent(String code_ent) {
            this.code_ent = code_ent;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getTimes() {
            return times;
        }

        public void setTimes(String times) {
            this.times = times;
        }

        public String getSec_take_status_name() {
            return sec_take_status_name;
        }

        public void setSec_take_status_name(String sec_take_status_name) {
            this.sec_take_status_name = sec_take_status_name;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "total_amt='" + total_amt + '\'' +
                    ", pres_doctor_name='" + pres_doctor_name + '\'' +
                    ", pres_dept_name='" + pres_dept_name + '\'' +
                    ", pres_type='" + pres_type + '\'' +
                    ", pres_type_name='" + pres_type_name + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", code_ent='" + code_ent + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", times='" + times + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", take_status='" + take_status + '\'' +
                    ", take_status_name='" + take_status_name + '\'' +
                    ", way='" + way + '\'' +
                    ", pharmacy='" + pharmacy + '\'' +
                    ", take_drug_addr='" + take_drug_addr + '\'' +
                    ", name_receive='" + name_receive + '\'' +
                    ", phone_receive='" + phone_receive + '\'' +
                    ", district_name_receive='" + district_name_receive + '\'' +
                    ", address_receive='" + address_receive + '\'' +
                    ", remark='" + remark + '\'' +
                    ", clearing_form='" + clearing_form + '\'' +
                    ", deliver_fee='" + deliver_fee + '\'' +
                    ", pay_time='" + pay_time + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    ", sec_take_status_name='" + sec_take_status_name + '\'' +
                    ", bsp_order_no='" + bsp_order_no + '\'' +
                    ", mail_no='" + mail_no + '\'' +
                    ", selfFeeTag='" + selfFeeTag + '\'' +
                    ", wes_drugs=" + wes_drugs +
                    ", cn_drugs=" + cn_drugs +
                    '}';
        }

        public String getSelfFeeTag() {
            if(TextUtils.isEmpty(selfFeeTag)){
                return "error";
            }else{
                return selfFeeTag;
            }
        }

        public void setSelfFeeTag(String selfFeeTag) {
            this.selfFeeTag = selfFeeTag;
        }

        public String getBsp_order_no() {
            return bsp_order_no;
        }

        public void setBsp_order_no(String bsp_order_no) {
            this.bsp_order_no = bsp_order_no;
        }

        public String getMail_no() {
            return mail_no;
        }

        public void setMail_no(String mail_no) {
            this.mail_no = mail_no;
        }

        public String getPres_type() {
            return pres_type;
        }

        public void setPres_type(String pres_type) {
            this.pres_type = pres_type;
        }

        public String getPres_type_name() {
            return pres_type_name;
        }

        public void setPres_type_name(String pres_type_name) {
            this.pres_type_name = pres_type_name;
        }

        public String getPay_time() {
            return pay_time;
        }

        public void setPay_time(String pay_time) {
            this.pay_time = pay_time;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }

        public String getTotal_amt() {
            return total_amt;
        }

        public void setTotal_amt(String total_amt) {
            this.total_amt = total_amt;
        }

        public String getPres_doctor_name() {
            return pres_doctor_name;
        }

        public void setPres_doctor_name(String pres_doctor_name) {
            this.pres_doctor_name = pres_doctor_name;
        }

        public String getPres_dept_name() {
            return pres_dept_name;
        }

        public void setPres_dept_name(String pres_dept_name) {
            this.pres_dept_name = pres_dept_name;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public Object getTake_status() {
            return take_status;
        }

        public String getTake_status_name() {
            return take_status_name;
        }

        public void setTake_status_name(String take_status_name) {
            this.take_status_name = take_status_name;
        }

        public void setTake_status(String take_status) {
            this.take_status = take_status;
        }

        public String getWay() {
            return way;
        }

        public void setWay(String way) {
            this.way = way;
        }

        public String getPharmacy() {
            return pharmacy;
        }

        public void setPharmacy(String pharmacy) {
            this.pharmacy = pharmacy;
        }

        public String getTake_drug_addr() {
            return take_drug_addr;
        }

        public void setTake_drug_addr(String take_drug_addr) {
            this.take_drug_addr = take_drug_addr;
        }

        public String getName_receive() {
            return name_receive;
        }

        public void setName_receive(String name_receive) {
            this.name_receive = name_receive;
        }

        public String getPhone_receive() {
            return phone_receive;
        }

        public void setPhone_receive(String phone_receive) {
            this.phone_receive = phone_receive;
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

        public String getClearing_form() {
            return clearing_form;
        }

        public void setClearing_form(String clearing_form) {
            this.clearing_form = clearing_form;
        }

        public String getDeliver_fee() {
            return deliver_fee;
        }

        public void setDeliver_fee(String deliver_fee) {
            this.deliver_fee = deliver_fee;
        }

        public WesDrugsBean getWes_drugs() {
            return wes_drugs;
        }

        public void setWes_drugs(WesDrugsBean wes_drugs) {
            this.wes_drugs = wes_drugs;
        }

        public CnDrugsBean getCn_drugs() {
            return cn_drugs;
        }

        public void setCn_drugs(CnDrugsBean cn_drugs) {
            this.cn_drugs = cn_drugs;
        }

        public static class WesDrugsBean {
            private List<DrugsBean> drugs;
            private String amt;
            private Integer count;

            public List<DrugsBean> getDrugs() {
                return drugs;
            }

            public void setDrugs(List<DrugsBean> drugs) {
                this.drugs = drugs;
            }

            public String getAmt() {
                return amt;
            }

            public void setAmt(String amt) {
                this.amt = amt;
            }

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
            }

            public static class DrugsBean {
                private String prescription_id;
                private String drug_code;
                private String drug_name;
                private String drug_cate;
                private String drug_spec;
                private String unit_price;
                private String drug_qty;
                private String name_unit_pkgsp;

                public String getPrescription_id() {
                    return prescription_id;
                }

                public void setPrescription_id(String prescription_id) {
                    this.prescription_id = prescription_id;
                }

                public String getDrug_code() {
                    return drug_code;
                }

                public void setDrug_code(String drug_code) {
                    this.drug_code = drug_code;
                }

                public String getDrug_name() {
                    return drug_name;
                }

                public void setDrug_name(String drug_name) {
                    this.drug_name = drug_name;
                }

                public String getDrug_cate() {
                    return drug_cate;
                }

                public void setDrug_cate(String drug_cate) {
                    this.drug_cate = drug_cate;
                }

                public String getDrug_spec() {
                    return drug_spec;
                }

                public void setDrug_spec(String drug_spec) {
                    this.drug_spec = drug_spec;
                }

                public String getUnit_price() {
                    return unit_price;
                }

                public void setUnit_price(String unit_price) {
                    this.unit_price = unit_price;
                }

                public String getDrug_qty() {
                    return drug_qty;
                }

                public void setDrug_qty(String drug_qty) {
                    this.drug_qty = drug_qty;
                }

                public String getName_unit_pkgsp() {
                    return name_unit_pkgsp;
                }

                public void setName_unit_pkgsp(String name_unit_pkgsp) {
                    this.name_unit_pkgsp = name_unit_pkgsp;
                }
            }
        }

        public static class CnDrugsBean {
            private List<DrugsBean> drugs;
            private String amt;
            private Integer count;

            public List<DrugsBean> getDrugs() {
                return drugs;
            }

            public void setDrugs(List<DrugsBean> drugs) {
                this.drugs = drugs;
            }

            public String getAmt() {
                return amt;
            }

            public void setAmt(String amt) {
                this.amt = amt;
            }

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
            }

            public static class DrugsBean {
                private String prescription_id;
                private String drug_code;
                private String drug_name;
                private String drug_cate;
                private String drug_spec;
                private String unit_price;
                private String drug_qty;
                private String name_unit_pkgsp;

                public String getPrescription_id() {
                    return prescription_id;
                }

                public void setPrescription_id(String prescription_id) {
                    this.prescription_id = prescription_id;
                }

                public String getDrug_code() {
                    return drug_code;
                }

                public void setDrug_code(String drug_code) {
                    this.drug_code = drug_code;
                }

                public String getDrug_name() {
                    return drug_name;
                }

                public void setDrug_name(String drug_name) {
                    this.drug_name = drug_name;
                }

                public String getDrug_cate() {
                    return drug_cate;
                }

                public void setDrug_cate(String drug_cate) {
                    this.drug_cate = drug_cate;
                }

                public String getDrug_spec() {
                    return drug_spec;
                }

                public void setDrug_spec(String drug_spec) {
                    this.drug_spec = drug_spec;
                }

                public String getUnit_price() {
                    return unit_price;
                }

                public void setUnit_price(String unit_price) {
                    this.unit_price = unit_price;
                }

                public String getDrug_qty() {
                    return drug_qty;
                }

                public void setDrug_qty(String drug_qty) {
                    this.drug_qty = drug_qty;
                }

                public String getName_unit_pkgsp() {
                    return name_unit_pkgsp;
                }

                public void setName_unit_pkgsp(String name_unit_pkgsp) {
                    this.name_unit_pkgsp = name_unit_pkgsp;
                }
            }
        }
    }
}
