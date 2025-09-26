package com.example.mycompose.repository.entity;

public class BuildPatientInfoEntity {
    String verifyCode;
    String phone;
    String pat_type;
    String name;
    String sex;
    String id_type;
    String id_type_name;
    String id_num;
    String code_hp;
    String code_card;
    String work_unit;
    String occup_code;
    String occup_name;
    String country_code;
    String country_name;
    String marital_code;
    String marital_name;
    String nation_code;
    String nation_name;
    String code_homearea;
    String homearea_name;
    String addr_home;
    String code_nowarea;
    String nowarea_name;
    String curaddr_zipcode;

    String addr_now;
    String name_patcont;
    String tel_patcont;
    String birthday;
    String liveRate;//活体得分
    String similarity;//相似度得分

    String code_pat;
    String patient_id;
    String code_rel;
    String sd_fmrole;
    String addr_patcont;
    String idtp_patcont;
    String idno_patcont;

    public String getCode_rel() {
        return code_rel;
    }

    public void setCode_rel(String code_rel) {
        this.code_rel = code_rel;
    }

    public String getSd_fmrole() {
        return sd_fmrole;
    }

    public void setSd_fmrole(String sd_fmrole) {
        this.sd_fmrole = sd_fmrole;
    }

    public String getAddr_patcont() {
        return addr_patcont;
    }

    public void setAddr_patcont(String addr_patcont) {
        this.addr_patcont = addr_patcont;
    }

    public String getIdtp_patcont() {
        return idtp_patcont;
    }

    public void setIdtp_patcont(String idtp_patcont) {
        this.idtp_patcont = idtp_patcont;
    }

    public String getIdno_patcont() {
        return idno_patcont;
    }

    public void setIdno_patcont(String idno_patcont) {
        this.idno_patcont = idno_patcont;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public BuildPatientInfoEntity setPatient_id(String patient_id) {
        this.patient_id = patient_id;
        return this;
    }

    public String getCode_pat() {
        return code_pat;
    }

    public BuildPatientInfoEntity setCode_pat(String code_pat) {
        this.code_pat = code_pat;
        return this;
    }

    @Override
    public String toString() {
        return "BuildPatientInfoEntity{" +
                "verifyCode='" + verifyCode + '\'' +
                ", phone='" + phone + '\'' +
                ", pat_type='" + pat_type + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id_type='" + id_type + '\'' +
                ", id_type_name='" + id_type_name + '\'' +
                ", id_num='" + id_num + '\'' +
                ", code_hp='" + code_hp + '\'' +
                ", code_card='" + code_card + '\'' +
                ", work_unit='" + work_unit + '\'' +
                ", occup_code='" + occup_code + '\'' +
                ", occup_name='" + occup_name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", country_name='" + country_name + '\'' +
                ", marital_code='" + marital_code + '\'' +
                ", marital_name='" + marital_name + '\'' +
                ", nation_code='" + nation_code + '\'' +
                ", nation_name='" + nation_name + '\'' +
                ", code_homearea='" + code_homearea + '\'' +
                ", homearea_name='" + homearea_name + '\'' +
                ", addr_home='" + addr_home + '\'' +
                ", code_nowarea='" + code_nowarea + '\'' +
                ", nowarea_name='" + nowarea_name + '\'' +
                ", curaddr_zipcode='" + curaddr_zipcode + '\'' +
                ", addr_now='" + addr_now + '\'' +
                ", name_patcont='" + name_patcont + '\'' +
                ", tel_patcont='" + tel_patcont + '\'' +
                ", birthday='" + birthday + '\'' +
                ", liveRate='" + liveRate + '\'' +
                ", similarity='" + similarity + '\'' +
                ", code_pat='" + code_pat + '\'' +
                ", patient_id='" + patient_id + '\'' +
                '}';
    }

    public String getCuraddr_zipcode() {
        return curaddr_zipcode;
    }

    public void setCuraddr_zipcode(String curaddr_zipcode) {
        this.curaddr_zipcode = curaddr_zipcode;
    }

    public String getLiveRate() {
        return liveRate;
    }

    public void setLiveRate(String liveRate) {
        this.liveRate = liveRate;
    }

    public String getSimilarity() {
        return similarity;
    }

    public void setSimilarity(String similarity) {
        this.similarity = similarity;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPat_type() {
        return pat_type;
    }

    public void setPat_type(String pat_type) {
        this.pat_type = pat_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getCode_hp() {
        return code_hp;
    }

    public void setCode_hp(String code_hp) {
        this.code_hp = code_hp;
    }

    public String getCode_card() {
        return code_card;
    }

    public void setCode_card(String code_card) {
        this.code_card = code_card;
    }

    public String getWork_unit() {
        return work_unit;
    }

    public void setWork_unit(String work_unit) {
        this.work_unit = work_unit;
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

    public String getCode_homearea() {
        return code_homearea;
    }

    public void setCode_homearea(String code_homearea) {
        this.code_homearea = code_homearea;
    }

    public String getHomearea_name() {
        return homearea_name;
    }

    public void setHomearea_name(String homearea_name) {
        this.homearea_name = homearea_name;
    }

    public String getAddr_home() {
        return addr_home;
    }

    public void setAddr_home(String addr_home) {
        this.addr_home = addr_home;
    }

    public String getCode_nowarea() {
        return code_nowarea;
    }

    public void setCode_nowarea(String code_nowarea) {
        this.code_nowarea = code_nowarea;
    }

    public String getNowarea_name() {
        return nowarea_name;
    }

    public void setNowarea_name(String nowarea_name) {
        this.nowarea_name = nowarea_name;
    }

    public String getAddr_now() {
        return addr_now;
    }

    public void setAddr_now(String addr_now) {
        this.addr_now = addr_now;
    }

    public String getName_patcont() {
        return name_patcont;
    }

    public void setName_patcont(String name_patcont) {
        this.name_patcont = name_patcont;
    }

    public String getTel_patcont() {
        return tel_patcont;
    }

    public void setTel_patcont(String tel_patcont) {
        this.tel_patcont = tel_patcont;
    }
}
