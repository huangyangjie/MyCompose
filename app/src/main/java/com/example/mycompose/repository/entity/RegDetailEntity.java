package com.example.mycompose.repository.entity;

public class RegDetailEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "RegDetailEntity{" +
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
        private String registration_id;
        private String id_aptip;
        private String sd_referalsrc;
        private String code_dep_op;
        private String name_dep_op;
        private String code_pat;
        private String code_emp_phy_op;
        private String name_emp_phy_op;
        private String admis_dep_sn;
        private String admis_dep;
        private String admis_ward_sn;
        private String admis_ward;
        private String code_didef_op;
        private String name_didef_op;
        private String code_patca;
        private String amt_deposit;
        private String name_cont_phy;
        private String contact_tel_dep;
        private String dt_insert;
        private String admis_status;
        private String patient_id;
        private String patient_name;
        private String sex;
        private String birthday;
        private String id_type;
        private String id_type_name;
        private String id_num;
        private String marital_code;
        private String marital_name;
        private String patient_phone;
        private String country_code;
        private String country_name;
        private String native_code;
        private String native_name;
        private String nation_code;
        private String nation_name;
        private String place_birth_code;
        private String place_birth_name;
        private String occup_code;
        private String occup_name;
        private String work_unit;
        private String job_status_code;
        private String job_status_name;
        private String residence_code;
        private String residence_name;
        private String residence_addr;
        private String curaddr_code;
        private String curaddr_name;
        private String curaddr_detail;
        private String curaddr_zipcode;
        private String curaddr_tel;
        private String tem_curaddr_code;
        private String tem_curaddr_name;
        private String tem_curaddr_detail;
        private String cont_name;
        private String cont_rel_code;
        private String cont_rel_name;
        private String cont_tel;
        private String age;
        private String pat_type;

        @Override
        public String toString() {
            return "DataBean{" +
                    "registration_id='" + registration_id + '\'' +
                    ", id_aptip='" + id_aptip + '\'' +
                    ", sd_referalsrc='" + sd_referalsrc + '\'' +
                    ", code_dep_op='" + code_dep_op + '\'' +
                    ", name_dep_op='" + name_dep_op + '\'' +
                    ", code_emp_phy_op='" + code_emp_phy_op + '\'' +
                    ", name_emp_phy_op='" + name_emp_phy_op + '\'' +
                    ", admis_dep_sn='" + admis_dep_sn + '\'' +
                    ", admis_dep='" + admis_dep + '\'' +
                    ", admis_ward_sn='" + admis_ward_sn + '\'' +
                    ", admis_ward='" + admis_ward + '\'' +
                    ", code_didef_op='" + code_didef_op + '\'' +
                    ", name_didef_op='" + name_didef_op + '\'' +
                    ", code_patca='" + code_patca + '\'' +
                    ", amt_deposit='" + amt_deposit + '\'' +
                    ", name_cont_phy='" + name_cont_phy + '\'' +
                    ", contact_tel_dep='" + contact_tel_dep + '\'' +
                    ", dt_insert='" + dt_insert + '\'' +
                    ", admis_status='" + admis_status + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", id_type='" + id_type + '\'' +
                    ", id_type_name='" + id_type_name + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", marital_code='" + marital_code + '\'' +
                    ", marital_name='" + marital_name + '\'' +
                    ", patient_phone='" + patient_phone + '\'' +
                    ", country_code='" + country_code + '\'' +
                    ", country_name='" + country_name + '\'' +
                    ", native_code='" + native_code + '\'' +
                    ", native_name='" + native_name + '\'' +
                    ", nation_code='" + nation_code + '\'' +
                    ", nation_name='" + nation_name + '\'' +
                    ", place_birth_code='" + place_birth_code + '\'' +
                    ", place_birth_name='" + place_birth_name + '\'' +
                    ", occup_code='" + occup_code + '\'' +
                    ", occup_name='" + occup_name + '\'' +
                    ", work_unit='" + work_unit + '\'' +
                    ", job_status_code='" + job_status_code + '\'' +
                    ", job_status_name='" + job_status_name + '\'' +
                    ", residence_code='" + residence_code + '\'' +
                    ", residence_name='" + residence_name + '\'' +
                    ", residence_addr='" + residence_addr + '\'' +
                    ", curaddr_code='" + curaddr_code + '\'' +
                    ", curaddr_name='" + curaddr_name + '\'' +
                    ", curaddr_detail='" + curaddr_detail + '\'' +
                    ", curaddr_zipcode='" + curaddr_zipcode + '\'' +
                    ", curaddr_tel='" + curaddr_tel + '\'' +
                    ", tem_curaddr_code='" + tem_curaddr_code + '\'' +
                    ", tem_curaddr_name='" + tem_curaddr_name + '\'' +
                    ", tem_curaddr_detail='" + tem_curaddr_detail + '\'' +
                    ", cont_name='" + cont_name + '\'' +
                    ", cont_rel_code='" + cont_rel_code + '\'' +
                    ", cont_rel_name='" + cont_rel_name + '\'' +
                    ", cont_tel='" + cont_tel + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }

        public String getRegistration_id() {
            return registration_id;
        }

        public void setRegistration_id(String registration_id) {
            this.registration_id = registration_id;
        }

        public String getId_aptip() {
            return id_aptip;
        }

        public void setId_aptip(String id_aptip) {
            this.id_aptip = id_aptip;
        }

        public String getSd_referalsrc() {
            return sd_referalsrc;
        }

        public void setSd_referalsrc(String sd_referalsrc) {
            this.sd_referalsrc = sd_referalsrc;
        }

        public String getCode_dep_op() {
            return code_dep_op;
        }

        public void setCode_dep_op(String code_dep_op) {
            this.code_dep_op = code_dep_op;
        }

        public String getName_dep_op() {
            return name_dep_op;
        }

        public void setName_dep_op(String name_dep_op) {
            this.name_dep_op = name_dep_op;
        }

        public String getCode_emp_phy_op() {
            return code_emp_phy_op;
        }

        public void setCode_emp_phy_op(String code_emp_phy_op) {
            this.code_emp_phy_op = code_emp_phy_op;
        }

        public String getName_emp_phy_op() {
            return name_emp_phy_op;
        }

        public void setName_emp_phy_op(String name_emp_phy_op) {
            this.name_emp_phy_op = name_emp_phy_op;
        }

        public String getAdmis_dep_sn() {
            return admis_dep_sn;
        }

        public void setAdmis_dep_sn(String admis_dep_sn) {
            this.admis_dep_sn = admis_dep_sn;
        }

        public String getAdmis_dep() {
            return admis_dep;
        }

        public void setAdmis_dep(String admis_dep) {
            this.admis_dep = admis_dep;
        }

        public String getAdmis_ward_sn() {
            return admis_ward_sn;
        }

        public void setAdmis_ward_sn(String admis_ward_sn) {
            this.admis_ward_sn = admis_ward_sn;
        }

        public String getAdmis_ward() {
            return admis_ward;
        }

        public void setAdmis_ward(String admis_ward) {
            this.admis_ward = admis_ward;
        }

        public String getCode_didef_op() {
            return code_didef_op;
        }

        public void setCode_didef_op(String code_didef_op) {
            this.code_didef_op = code_didef_op;
        }

        public String getName_didef_op() {
            return name_didef_op;
        }

        public void setName_didef_op(String name_didef_op) {
            this.name_didef_op = name_didef_op;
        }

        public String getCode_patca() {
            return code_patca;
        }

        public void setCode_patca(String code_patca) {
            this.code_patca = code_patca;
        }

        public String getAmt_deposit() {
            return amt_deposit;
        }

        public void setAmt_deposit(String amt_deposit) {
            this.amt_deposit = amt_deposit;
        }

        public String getName_cont_phy() {
            return name_cont_phy;
        }

        public void setName_cont_phy(String name_cont_phy) {
            this.name_cont_phy = name_cont_phy;
        }

        public String getContact_tel_dep() {
            return contact_tel_dep;
        }

        public void setContact_tel_dep(String contact_tel_dep) {
            this.contact_tel_dep = contact_tel_dep;
        }

        public String getDt_insert() {
            return dt_insert;
        }

        public void setDt_insert(String dt_insert) {
            this.dt_insert = dt_insert;
        }

        public String getAdmis_status() {
            return admis_status;
        }

        public void setAdmis_status(String admis_status) {
            this.admis_status = admis_status;
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

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getId_type() {
            return id_type;
        }

        public void setId_type(String id_type) {
            this.id_type = id_type;
        }

        public String getId_type_name() {
            return id_type_name;
        }

        public void setId_type_name(String id_type_name) {
            this.id_type_name = id_type_name;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getMarital_code() {
            return marital_code;
        }

        public void setMarital_code(String marital_code) {
            this.marital_code = marital_code;
        }

        public String getMarital_name() {
            return marital_name;
        }

        public void setMarital_name(String marital_name) {
            this.marital_name = marital_name;
        }

        public String getPatient_phone() {
            return patient_phone;
        }

        public void setPatient_phone(String patient_phone) {
            this.patient_phone = patient_phone;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public String getNative_code() {
            return native_code;
        }

        public void setNative_code(String native_code) {
            this.native_code = native_code;
        }

        public String getNative_name() {
            return native_name;
        }

        public void setNative_name(String native_name) {
            this.native_name = native_name;
        }

        public String getNation_code() {
            return nation_code;
        }

        public void setNation_code(String nation_code) {
            this.nation_code = nation_code;
        }

        public String getNation_name() {
            return nation_name;
        }

        public void setNation_name(String nation_name) {
            this.nation_name = nation_name;
        }

        public String getPlace_birth_code() {
            return place_birth_code;
        }

        public void setPlace_birth_code(String place_birth_code) {
            this.place_birth_code = place_birth_code;
        }

        public String getPlace_birth_name() {
            return place_birth_name;
        }

        public void setPlace_birth_name(String place_birth_name) {
            this.place_birth_name = place_birth_name;
        }

        public String getOccup_code() {
            return occup_code;
        }

        public void setOccup_code(String occup_code) {
            this.occup_code = occup_code;
        }

        public String getOccup_name() {
            return occup_name;
        }

        public void setOccup_name(String occup_name) {
            this.occup_name = occup_name;
        }

        public String getWork_unit() {
            return work_unit;
        }

        public void setWork_unit(String work_unit) {
            this.work_unit = work_unit;
        }

        public String getJob_status_code() {
            return job_status_code;
        }

        public void setJob_status_code(String job_status_code) {
            this.job_status_code = job_status_code;
        }

        public String getJob_status_name() {
            return job_status_name;
        }

        public void setJob_status_name(String job_status_name) {
            this.job_status_name = job_status_name;
        }

        public String getResidence_code() {
            return residence_code;
        }

        public void setResidence_code(String residence_code) {
            this.residence_code = residence_code;
        }

        public String getResidence_name() {
            return residence_name;
        }

        public void setResidence_name(String residence_name) {
            this.residence_name = residence_name;
        }

        public String getResidence_addr() {
            return residence_addr;
        }

        public void setResidence_addr(String residence_addr) {
            this.residence_addr = residence_addr;
        }

        public String getCuraddr_code() {
            return curaddr_code;
        }

        public void setCuraddr_code(String curaddr_code) {
            this.curaddr_code = curaddr_code;
        }

        public String getCuraddr_name() {
            return curaddr_name;
        }

        public void setCuraddr_name(String curaddr_name) {
            this.curaddr_name = curaddr_name;
        }

        public String getCuraddr_detail() {
            return curaddr_detail;
        }

        public void setCuraddr_detail(String curaddr_detail) {
            this.curaddr_detail = curaddr_detail;
        }

        public String getCuraddr_zipcode() {
            return curaddr_zipcode;
        }

        public void setCuraddr_zipcode(String curaddr_zipcode) {
            this.curaddr_zipcode = curaddr_zipcode;
        }

        public String getCuraddr_tel() {
            return curaddr_tel;
        }

        public void setCuraddr_tel(String curaddr_tel) {
            this.curaddr_tel = curaddr_tel;
        }

        public String getTem_curaddr_code() {
            return tem_curaddr_code;
        }

        public void setTem_curaddr_code(String tem_curaddr_code) {
            this.tem_curaddr_code = tem_curaddr_code;
        }

        public String getTem_curaddr_name() {
            return tem_curaddr_name;
        }

        public void setTem_curaddr_name(String tem_curaddr_name) {
            this.tem_curaddr_name = tem_curaddr_name;
        }

        public String getTem_curaddr_detail() {
            return tem_curaddr_detail;
        }

        public void setTem_curaddr_detail(String tem_curaddr_detail) {
            this.tem_curaddr_detail = tem_curaddr_detail;
        }

        public String getCont_name() {
            return cont_name;
        }

        public void setCont_name(String cont_name) {
            this.cont_name = cont_name;
        }

        public String getCont_rel_code() {
            return cont_rel_code;
        }

        public void setCont_rel_code(String cont_rel_code) {
            this.cont_rel_code = cont_rel_code;
        }

        public String getCont_rel_name() {
            return cont_rel_name;
        }

        public void setCont_rel_name(String cont_rel_name) {
            this.cont_rel_name = cont_rel_name;
        }

        public String getCont_tel() {
            return cont_tel;
        }

        public void setCont_tel(String cont_tel) {
            this.cont_tel = cont_tel;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }
    }
}
