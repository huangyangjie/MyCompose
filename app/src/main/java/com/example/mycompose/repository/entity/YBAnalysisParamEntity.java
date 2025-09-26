package com.example.mycompose.repository.entity;

public class YBAnalysisParamEntity {
    String consultation_id;
    String consultation_no;
    String pay_type;
    String pay_type_name;
    String doctor_id;
    String doctor_sn;
    String doctor_name;
    String doctor_title;
    String dept_sn;
    String dept_id;
    String dept_name;
    String patient_id;
    String code_pat;
    String patient_age;
    String patient_sex;
    String order_amount;
    String code_srv;

    public String getCode_srv() {
        return code_srv;
    }

    public void setCode_srv(String code_srv) {
        this.code_srv = code_srv;
    }

    @Override
    public String toString() {
        return "YBAnalysisParamEntity{" +
                "consultation_id='" + consultation_id + '\'' +
                ", consultation_no='" + consultation_no + '\'' +
                ", pay_type='" + pay_type + '\'' +
                ", pay_type_name='" + pay_type_name + '\'' +
                ", doctor_id='" + doctor_id + '\'' +
                ", doctor_sn='" + doctor_sn + '\'' +
                ", doctor_name='" + doctor_name + '\'' +
                ", doctor_title='" + doctor_title + '\'' +
                ", dept_sn='" + dept_sn + '\'' +
                ", dept_id='" + dept_id + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", patient_id='" + patient_id + '\'' +
                ", code_pat='" + code_pat + '\'' +
                ", patient_age='" + patient_age + '\'' +
                ", patient_sex='" + patient_sex + '\'' +
                ", order_amount='" + order_amount + '\'' +
                ", code_srv='" + code_srv + '\'' +
                '}';
    }

    public String getConsultation_id() {
        return consultation_id;
    }

    public void setConsultation_id(String consultation_id) {
        this.consultation_id = consultation_id;
    }

    public String getConsultation_no() {
        return consultation_no;
    }

    public void setConsultation_no(String consultation_no) {
        this.consultation_no = consultation_no;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getPay_type_name() {
        return pay_type_name;
    }

    public void setPay_type_name(String pay_type_name) {
        this.pay_type_name = pay_type_name;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
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

    public String getDoctor_title() {
        return doctor_title;
    }

    public void setDoctor_title(String doctor_title) {
        this.doctor_title = doctor_title;
    }

    public String getDept_sn() {
        return dept_sn;
    }

    public void setDept_sn(String dept_sn) {
        this.dept_sn = dept_sn;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
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

    public String getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(String patient_age) {
        this.patient_age = patient_age;
    }

    public String getPatient_sex() {
        return patient_sex;
    }

    public void setPatient_sex(String patient_sex) {
        this.patient_sex = patient_sex;
    }

    public String getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(String order_amount) {
        this.order_amount = order_amount;
    }
}
