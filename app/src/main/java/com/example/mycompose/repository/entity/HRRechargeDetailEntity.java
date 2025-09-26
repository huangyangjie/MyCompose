package com.example.mycompose.repository.entity;

public class HRRechargeDetailEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "HRRechargeDetailEntity{" +
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

        @Override
        public String toString() {
            return "DataBean{" +
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
}
