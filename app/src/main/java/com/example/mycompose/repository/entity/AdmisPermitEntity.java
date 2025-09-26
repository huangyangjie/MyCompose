package com.example.mycompose.repository.entity;

import java.util.List;

public class AdmisPermitEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "AdmisPermitEntity{" +
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
        private String patient_name;
        private String patient_id;
        private String code_pat;
        private String pat_type_name;
        private String pat_type;
        private String id_aptip;
        private String admis_status;
        private String admis_status_name;
        private String admis_dep;
        private String admis_ward;
        private String dt_insert;
        private String registration_id;
        private String reg_status;
        private String reg_status_name;

        public String getReg_status() {
            return reg_status;
        }

        public void setReg_status(String reg_status) {
            this.reg_status = reg_status;
        }

        public String getReg_status_name() {
            return reg_status_name;
        }

        public void setReg_status_name(String reg_status_name) {
            this.reg_status_name = reg_status_name;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "patient_name='" + patient_name + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", id_aptip='" + id_aptip + '\'' +
                    ", admis_status='" + admis_status + '\'' +
                    ", admis_status_name='" + admis_status_name + '\'' +
                    ", admis_dep='" + admis_dep + '\'' +
                    ", admis_ward='" + admis_ward + '\'' +
                    ", dt_insert='" + dt_insert + '\'' +
                    ", registration_id='" + registration_id + '\'' +
                    ", reg_status='" + reg_status + '\'' +
                    ", reg_status_name='" + reg_status_name + '\'' +
                    ", code_amr_ip='" + code_amr_ip + '\'' +
                    ", times_ip='" + times_ip + '\'' +
                    ", detailInfo=" + detailInfo +
                    '}';
        }

        //住院充值的字段
        private String code_amr_ip;
        private String times_ip;
        private DetailInfoBean detailInfo;

        public static class DetailInfoBean {
            private String inp_recharge_id;
            private String code_ent;
            private String patient_name;
            private String code_amr_ip;
            private String times_ip;
            private String admis_dep;
            private String admis_ward;
            private String dt_acpt;
            private String total_days;
            private String name_emp_phy;
            private String name_emp_nur;
            private String Name_bed;
            private String dt_end;


            public void setDt_end(String dt_end) {
                this.dt_end = dt_end;
            }

            public String getDt_end() {
                return dt_end;
            }

            public void setName_bed(String name_bed) {
                Name_bed = name_bed;
            }

            public String getName_bed() {
                return Name_bed;
            }

            @Override
            public String toString() {
                return "DetailInfoBean{" +
                        "inp_recharge_id='" + inp_recharge_id + '\'' +
                        ", code_ent='" + code_ent + '\'' +
                        ", patient_name='" + patient_name + '\'' +
                        ", code_amr_ip='" + code_amr_ip + '\'' +
                        ", times_ip='" + times_ip + '\'' +
                        ", admis_dep='" + admis_dep + '\'' +
                        ", admis_ward='" + admis_ward + '\'' +
                        ", dt_acpt='" + dt_acpt + '\'' +
                        ", total_days='" + total_days + '\'' +
                        ", name_emp_phy='" + name_emp_phy + '\'' +
                        ", name_emp_nur='" + name_emp_nur + '\'' +
                        ", Name_bed='" + Name_bed + '\'' +
                        ", dt_end='" + dt_end + '\'' +
                        '}';
            }

            public String getInp_recharge_id() {
                return inp_recharge_id;
            }

            public void setInp_recharge_id(String inp_recharge_id) {
                this.inp_recharge_id = inp_recharge_id;
            }

            public String getCode_ent() {
                return code_ent;
            }

            public void setCode_ent(String code_ent) {
                this.code_ent = code_ent;
            }

            public String getPatient_name() {
                return patient_name;
            }

            public void setPatient_name(String patient_name) {
                this.patient_name = patient_name;
            }

            public String getCode_amr_ip() {
                return code_amr_ip;
            }

            public void setCode_amr_ip(String code_amr_ip) {
                this.code_amr_ip = code_amr_ip;
            }

            public String getTimes_ip() {
                return times_ip;
            }

            public void setTimes_ip(String times_ip) {
                this.times_ip = times_ip;
            }

            public String getAdmis_dep() {
                return admis_dep;
            }

            public void setAdmis_dep(String admis_dep) {
                this.admis_dep = admis_dep;
            }

            public String getAdmis_ward() {
                return admis_ward;
            }

            public void setAdmis_ward(String admis_ward) {
                this.admis_ward = admis_ward;
            }

            public String getDt_acpt() {
                return dt_acpt;
            }

            public void setDt_acpt(String dt_acpt) {
                this.dt_acpt = dt_acpt;
            }

            public String getTotal_days() {
                return total_days;
            }

            public void setTotal_days(String total_days) {
                this.total_days = total_days;
            }

            public String getName_emp_phy() {
                return name_emp_phy;
            }

            public void setName_emp_phy(String name_emp_phy) {
                this.name_emp_phy = name_emp_phy;
            }

            public String getName_emp_nur() {
                return name_emp_nur;
            }

            public void setName_emp_nur(String name_emp_nur) {
                this.name_emp_nur = name_emp_nur;
            }
        }

        public String getCode_amr_ip() {
            return code_amr_ip;
        }

        public void setCode_amr_ip(String code_amr_ip) {
            this.code_amr_ip = code_amr_ip;
        }

        public String getTimes_ip() {
            return times_ip;
        }

        public void setTimes_ip(String times_ip) {
            this.times_ip = times_ip;
        }

        public DetailInfoBean getDetailInfo() {
            return detailInfo;
        }

        public void setDetailInfo(DetailInfoBean detailInfo) {
            this.detailInfo = detailInfo;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getRegistration_id() {
            return registration_id;
        }

        public void setRegistration_id(String registration_id) {
            this.registration_id = registration_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public String getId_aptip() {
            return id_aptip;
        }

        public void setId_aptip(String id_aptip) {
            this.id_aptip = id_aptip;
        }

        public String getAdmis_status() {
            return admis_status;
        }

        public void setAdmis_status(String admis_status) {
            this.admis_status = admis_status;
        }

        public String getAdmis_status_name() {
            return admis_status_name;
        }

        public void setAdmis_status_name(String admis_status_name) {
            this.admis_status_name = admis_status_name;
        }

        public String getAdmis_dep() {
            return admis_dep;
        }

        public void setAdmis_dep(String admis_dep) {
            this.admis_dep = admis_dep;
        }

        public String getAdmis_ward() {
            return admis_ward;
        }

        public void setAdmis_ward(String admis_ward) {
            this.admis_ward = admis_ward;
        }

        public String getDt_insert() {
            return dt_insert;
        }

        public void setDt_insert(String dt_insert) {
            this.dt_insert = dt_insert;
        }
    }
}
