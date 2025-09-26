package com.example.mycompose.repository.entity;

import java.util.Arrays;

public class SVCreateOrderParamEntity {
    public String consultation_id;
    public String patient_id;
    public String code_pat;
    public String doctor_id;
    public String doctor_sn;
    public String doctor_name;
    public String dept_sn;
    public String dept_id;
    public String dept_name;
    public String aim;
    public String pay_type;
    public String disease_code;
    public String disease_name;
    public String condition_desc;
    public String[] desc_imgs;
    public String pat_type;
    public String pat_type_name;
    public String order_amount;
    public String pre_consultation_id;

    public String getPre_consultation_id() {
        return pre_consultation_id;
    }

    public SVCreateOrderParamEntity setPre_consultation_id(String pre_consultation_id) {
        this.pre_consultation_id = pre_consultation_id;
        return this;
    }

    @Override
    public String toString() {
        return "SVCreateOrderParamEntity{" +
                "consultation_id='" + consultation_id + '\'' +
                ", patient_id='" + patient_id + '\'' +
                ", code_pat='" + code_pat + '\'' +
                ", doctor_id='" + doctor_id + '\'' +
                ", doctor_sn='" + doctor_sn + '\'' +
                ", doctor_name='" + doctor_name + '\'' +
                ", dept_sn='" + dept_sn + '\'' +
                ", dept_id='" + dept_id + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", aim='" + aim + '\'' +
                ", pay_type='" + pay_type + '\'' +
                ", disease_code='" + disease_code + '\'' +
                ", disease_name='" + disease_name + '\'' +
                ", condition_desc='" + condition_desc + '\'' +
                ", desc_imgs=" + Arrays.toString(desc_imgs) +
                ", pat_type='" + pat_type + '\'' +
                ", pat_type_name='" + pat_type_name + '\'' +
                ", order_amount='" + order_amount + '\'' +
                '}';
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

    public String getConsultation_id() {
        return consultation_id;
    }

    public void setConsultation_id(String consultation_id) {
        this.consultation_id = consultation_id;
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

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getDisease_code() {
        return disease_code;
    }

    public void setDisease_code(String disease_code) {
        this.disease_code = disease_code;
    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public String getCondition_desc() {
        return condition_desc;
    }

    public void setCondition_desc(String condition_desc) {
        this.condition_desc = condition_desc;
    }

    public String[] getDesc_imgs() {
        return desc_imgs;
    }

    public void setDesc_imgs(String[] desc_imgs) {
        this.desc_imgs = desc_imgs;
    }

    public String getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(String order_amount) {
        this.order_amount = order_amount;
    }
}
