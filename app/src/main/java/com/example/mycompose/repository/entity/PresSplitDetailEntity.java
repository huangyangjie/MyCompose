package com.example.mycompose.repository.entity;

import java.util.List;

public class PresSplitDetailEntity {


    private Integer code;
    private String message;
    private DataBean data;

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
        private String prescription_id;
        private String pres_status;
        private String pres_status_name;
        private String create_date;
        private String pres_dept_name;
        private String primary_diagnosis;
        private String deputy_diagnosis;
        private String patient_name;
        private String patient_sex;
        private String patient_age;
        private String patient_id_num;
        private String pres_type_name;
        private String pres_doctor_name;
        private String audit_doctor_name;
        private String pres_doctor_sign_img;
        private String audit_doctor_sign_img;
        private String remark;
        private List<DrugsBean> drugs;
        private String title;
        private String code_pat;

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPrescription_id() {
            return prescription_id;
        }

        public void setPrescription_id(String prescription_id) {
            this.prescription_id = prescription_id;
        }

        public String getPres_status() {
            return pres_status;
        }

        public void setPres_status(String pres_status) {
            this.pres_status = pres_status;
        }

        public String getPres_status_name() {
            return pres_status_name;
        }

        public void setPres_status_name(String pres_status_name) {
            this.pres_status_name = pres_status_name;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public String getPres_dept_name() {
            return pres_dept_name;
        }

        public void setPres_dept_name(String pres_dept_name) {
            this.pres_dept_name = pres_dept_name;
        }

        public String getPrimary_diagnosis() {
            return primary_diagnosis;
        }

        public void setPrimary_diagnosis(String primary_diagnosis) {
            this.primary_diagnosis = primary_diagnosis;
        }

        public String getDeputy_diagnosis() {
            return deputy_diagnosis;
        }

        public void setDeputy_diagnosis(String deputy_diagnosis) {
            this.deputy_diagnosis = deputy_diagnosis;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getPatient_sex() {
            return patient_sex;
        }

        public void setPatient_sex(String patient_sex) {
            this.patient_sex = patient_sex;
        }

        public String getPatient_age() {
            return patient_age;
        }

        public void setPatient_age(String patient_age) {
            this.patient_age = patient_age;
        }

        public String getPatient_id_num() {
            return patient_id_num;
        }

        public void setPatient_id_num(String patient_id_num) {
            this.patient_id_num = patient_id_num;
        }

        public String getPres_type_name() {
            return pres_type_name;
        }

        public void setPres_type_name(String pres_type_name) {
            this.pres_type_name = pres_type_name;
        }

        public String getPres_doctor_name() {
            return pres_doctor_name;
        }

        public void setPres_doctor_name(String pres_doctor_name) {
            this.pres_doctor_name = pres_doctor_name;
        }

        public String getAudit_doctor_name() {
            return audit_doctor_name;
        }

        public void setAudit_doctor_name(String audit_doctor_name) {
            this.audit_doctor_name = audit_doctor_name;
        }

        public String getPres_doctor_sign_img() {
            return pres_doctor_sign_img;
        }

        public void setPres_doctor_sign_img(String pres_doctor_sign_img) {
            this.pres_doctor_sign_img = pres_doctor_sign_img;
        }

        public String getAudit_doctor_sign_img() {
            return audit_doctor_sign_img;
        }

        public void setAudit_doctor_sign_img(String audit_doctor_sign_img) {
            this.audit_doctor_sign_img = audit_doctor_sign_img;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public List<DrugsBean> getDrugs() {
            return drugs;
        }

        public void setDrugs(List<DrugsBean> drugs) {
            this.drugs = drugs;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public static class DrugsBean {
            private String drug_code;
            private String drug_name;
            private String drug_spec;
            private String drug_qty;
            private String name_unit_pkgsp;
            private String usage_way_name;
            private String days;
            private String frequency_name;
            private String entrust;
            private String bolus_dose;
            private String name_unit_med;
            private String c_tag;
            private String indiction_tag;

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

            public String getDrug_spec() {
                return drug_spec;
            }

            public void setDrug_spec(String drug_spec) {
                this.drug_spec = drug_spec;
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

            public String getUsage_way_name() {
                return usage_way_name;
            }

            public void setUsage_way_name(String usage_way_name) {
                this.usage_way_name = usage_way_name;
            }

            public String getDays() {
                return days;
            }

            public void setDays(String days) {
                this.days = days;
            }

            public String getFrequency_name() {
                return frequency_name;
            }

            public void setFrequency_name(String frequency_name) {
                this.frequency_name = frequency_name;
            }

            public String getEntrust() {
                return entrust;
            }

            public void setEntrust(String entrust) {
                this.entrust = entrust;
            }

            public String getBolus_dose() {
                return bolus_dose;
            }

            public void setBolus_dose(String bolus_dose) {
                this.bolus_dose = bolus_dose;
            }

            public String getName_unit_med() {
                return name_unit_med;
            }

            public void setName_unit_med(String name_unit_med) {
                this.name_unit_med = name_unit_med;
            }

            public String getC_tag() {
                return c_tag;
            }

            public void setC_tag(String c_tag) {
                this.c_tag = c_tag;
            }

            public String getIndiction_tag() {
                return indiction_tag;
            }

            public void setIndiction_tag(String indiction_tag) {
                this.indiction_tag = indiction_tag;
            }
        }
    }
}
