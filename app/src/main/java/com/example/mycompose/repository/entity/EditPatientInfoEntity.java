package com.example.mycompose.repository.entity;

import android.text.TextUtils;

public class EditPatientInfoEntity {
    String patient_id = "";
    String country_code = "";
    String country_name = "";
    String nation_code = "";
    String nation_name = "";
    String marital_code = "";
    String marital_name = "";
    String occup_code = "";
    String occup_name = "";
    String work_unit = "";
    String addr_home = "";
    String code_homearea = "";
    String homearea_name = "";
    String addr_now = "";
    String code_nowarea = "";
    String nowarea_name = "";
    String name_patcont = "";
    String tel_patcont = "";
    String code_pat;
    String curaddr_zipcode;

    @Override
    public String toString() {
        return "EditPatientInfoEntity{" +
                "patient_id='" + patient_id + '\'' +
                ", country_code='" + country_code + '\'' +
                ", country_name='" + country_name + '\'' +
                ", nation_code='" + nation_code + '\'' +
                ", nation_name='" + nation_name + '\'' +
                ", marital_code='" + marital_code + '\'' +
                ", marital_name='" + marital_name + '\'' +
                ", occup_code='" + occup_code + '\'' +
                ", occup_name='" + occup_name + '\'' +
                ", work_unit='" + work_unit + '\'' +
                ", addr_home='" + addr_home + '\'' +
                ", code_homearea='" + code_homearea + '\'' +
                ", homearea_name='" + homearea_name + '\'' +
                ", addr_now='" + addr_now + '\'' +
                ", code_nowarea='" + code_nowarea + '\'' +
                ", nowarea_name='" + nowarea_name + '\'' +
                ", name_patcont='" + name_patcont + '\'' +
                ", tel_patcont='" + tel_patcont + '\'' +
                ", code_pat='" + code_pat + '\'' +
                ", curaddr_zipcode='" + curaddr_zipcode + '\'' +
                '}';
    }

    public String getCuraddr_zipcode() {
        return curaddr_zipcode;
    }

    public void setCuraddr_zipcode(String curaddr_zipcode) {
        this.curaddr_zipcode = curaddr_zipcode;
    }

    public String getCode_pat() {
        return code_pat;
    }

    public EditPatientInfoEntity setCode_pat(String code_pat) {
        this.code_pat = code_pat;
        return this;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
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

    public String getAddr_home() {
        return addr_home;
    }

    public void setAddr_home(String addr_home) {
        this.addr_home = addr_home;
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

    public String getAddr_now() {
        return addr_now;
    }

    public void setAddr_now(String addr_now) {
        this.addr_now = addr_now;
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

    public String getName_patcont() {
        return TextUtils.isEmpty(name_patcont)?"":name_patcont;
    }

    public void setName_patcont(String name_patcont) {
        this.name_patcont = name_patcont;
    }


    public String getTel_patcont() {
        return TextUtils.isEmpty(tel_patcont)?"":tel_patcont;

    }

    public void setTel_patcont(String tel_patcont) {
        this.tel_patcont = tel_patcont;
    }
}
