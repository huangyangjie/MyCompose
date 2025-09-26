package com.example.mycompose.repository.entity;

public class HistoryEntity {


    private String pre_consultation_id;
    private String create_time;
    private String major_said;
    private String present_hi;
    private String past_hi;
    private String allergy_hi;
    private String personal_hi;
    private Object doctor_name;
    private Object dept_name;

    public String getPre_consultation_id() {
        return pre_consultation_id;
    }

    public void setPre_consultation_id(String pre_consultation_id) {
        this.pre_consultation_id = pre_consultation_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getMajor_said() {
        return major_said;
    }

    public void setMajor_said(String major_said) {
        this.major_said = major_said;
    }

    public String getPresent_hi() {
        return present_hi;
    }

    public void setPresent_hi(String present_hi) {
        this.present_hi = present_hi;
    }

    public String getPast_hi() {
        return past_hi;
    }

    public void setPast_hi(String past_hi) {
        this.past_hi = past_hi;
    }

    public String getAllergy_hi() {
        return allergy_hi;
    }

    public void setAllergy_hi(String allergy_hi) {
        this.allergy_hi = allergy_hi;
    }

    public String getPersonal_hi() {
        return personal_hi;
    }

    public void setPersonal_hi(String personal_hi) {
        this.personal_hi = personal_hi;
    }

    public Object getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(Object doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Object getDept_name() {
        return dept_name;
    }

    public void setDept_name(Object dept_name) {
        this.dept_name = dept_name;
    }
}
