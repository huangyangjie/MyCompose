package com.example.mycompose.repository.entity;

public class GuidanceDocExtendEntity {
    private String location;
    private String codeSrvtp;
    private String parentDeptId;
    private String parentDeptName;
    private String doctorSn;


    public void setDoctorSn(String doctorSn) {
        this.doctorSn = doctorSn;
    }

    public String getDoctorSn() {
        return doctorSn;
    }

    public void setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName;
    }

    public String getParentDeptName() {
        return parentDeptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCodeSrvtp() {
        return codeSrvtp;
    }

    public void setCodeSrvtp(String codeSrvtp) {
        this.codeSrvtp = codeSrvtp;
    }

    public String getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    @Override
    public String toString() {
        return "GuidanceDocExtendEntity{" +
                "location='" + location + '\'' +
                ", codeSrvtp='" + codeSrvtp + '\'' +
                ", parentDeptId='" + parentDeptId + '\'' +
                ", parentDeptName='" + parentDeptName + '\'' +
                ", doctorSn='" + doctorSn + '\'' +
                '}';
    }
}
