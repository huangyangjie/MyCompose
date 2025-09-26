package com.example.mycompose.repository.entity;

public class LockNumEntity {
    String patient_id;
    String patient_name;
    String id_num;
    String phone;
    String code_pat;
    String pat_type;
    String title;

    String area_code;
    String location;

    String doctor_sn;
    String doctor_name;
    String dept_sn;
    String dept_name;
    String price;
    String Code_dayslottp;
    String Name_dayslottp;
    String Code_srvtp;
    String Name_srvtp;
    String Code_srv;
    String Name_srv;
    String Id_sch;
    String Dt_sch;
    String Id_ticks;
    String t_b_ticks;
    String t_e_ticks;

    Integer tg_selfpay;

    public Integer getTg_selfpay() {
        return tg_selfpay;
    }

    public void setTg_selfpay(Integer tg_selfpay) {
        this.tg_selfpay = tg_selfpay;
    }

    @Override
    public String toString() {
        return "LockNumEntity{" +
                "patient_id='" + patient_id + '\'' +
                ", patient_name='" + patient_name + '\'' +
                ", id_num='" + id_num + '\'' +
                ", phone='" + phone + '\'' +
                ", code_pat='" + code_pat + '\'' +
                ", pat_type='" + pat_type + '\'' +
                ", title='" + title + '\'' +
                ", area_code='" + area_code + '\'' +
                ", location='" + location + '\'' +
                ", doctor_sn='" + doctor_sn + '\'' +
                ", doctor_name='" + doctor_name + '\'' +
                ", dept_sn='" + dept_sn + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", price='" + price + '\'' +
                ", Code_dayslottp='" + Code_dayslottp + '\'' +
                ", Name_dayslottp='" + Name_dayslottp + '\'' +
                ", Code_srvtp='" + Code_srvtp + '\'' +
                ", Name_srvtp='" + Name_srvtp + '\'' +
                ", Code_srv='" + Code_srv + '\'' +
                ", Name_srv='" + Name_srv + '\'' +
                ", Id_sch='" + Id_sch + '\'' +
                ", Dt_sch='" + Dt_sch + '\'' +
                ", Id_ticks='" + Id_ticks + '\'' +
                ", t_b_ticks='" + t_b_ticks + '\'' +
                ", t_e_ticks='" + t_e_ticks + '\'' +
                ", tg_selfpay=" + tg_selfpay +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getId_num() {
        return id_num;
    }

    public void setId_num(String id_num) {
        this.id_num = id_num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode_pat() {
        return code_pat;
    }

    public void setCode_pat(String code_pat) {
        this.code_pat = code_pat;
    }

    public String getPat_type() {
        return pat_type;
    }

    public void setPat_type(String pat_type) {
        this.pat_type = pat_type;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getDoctor_sn() {
        return doctor_sn;
    }

    public void setDoctor_sn(String doctor_sn) {
        this.doctor_sn = doctor_sn;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDept_sn() {
        return dept_sn;
    }

    public void setDept_sn(String dept_sn) {
        this.dept_sn = dept_sn;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCode_dayslottp() {
        return Code_dayslottp;
    }

    public void setCode_dayslottp(String code_dayslottp) {
        Code_dayslottp = code_dayslottp;
    }

    public String getName_dayslottp() {
        return Name_dayslottp;
    }

    public void setName_dayslottp(String name_dayslottp) {
        Name_dayslottp = name_dayslottp;
    }

    public String getCode_srvtp() {
        return Code_srvtp;
    }

    public void setCode_srvtp(String code_srvtp) {
        Code_srvtp = code_srvtp;
    }

    public String getName_srvtp() {
        return Name_srvtp;
    }

    public void setName_srvtp(String name_srvtp) {
        Name_srvtp = name_srvtp;
    }

    public String getCode_srv() {
        return Code_srv;
    }

    public void setCode_srv(String code_srv) {
        Code_srv = code_srv;
    }

    public String getName_srv() {
        return Name_srv;
    }

    public void setName_srv(String name_srv) {
        Name_srv = name_srv;
    }

    public String getId_sch() {
        return Id_sch;
    }

    public void setId_sch(String id_sch) {
        Id_sch = id_sch;
    }

    public String getDt_sch() {
        return Dt_sch;
    }

    public void setDt_sch(String dt_sch) {
        Dt_sch = dt_sch;
    }

    public String getId_ticks() {
        return Id_ticks;
    }

    public void setId_ticks(String id_ticks) {
        Id_ticks = id_ticks;
    }

    public String getT_b_ticks() {
        return t_b_ticks;
    }

    public void setT_b_ticks(String t_b_ticks) {
        this.t_b_ticks = t_b_ticks;
    }

    public String getT_e_ticks() {
        return t_e_ticks;
    }

    public void setT_e_ticks(String t_e_ticks) {
        this.t_e_ticks = t_e_ticks;
    }
}
