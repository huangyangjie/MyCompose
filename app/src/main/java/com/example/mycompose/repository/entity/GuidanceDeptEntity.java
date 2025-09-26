package com.example.mycompose.repository.entity;

import java.util.List;

public class GuidanceDeptEntity {

    private int isToday;
    private String onlineDeptUrl;
    private String hosGrade;
    private String hosName;
    private String hosId;
    private String deptId;
    private String deptName;
    private String deptDesc;
    private String deptCoreId;
    private String deptCoreName;
    private Object deptCoreDesc;
    private String deptSystem;
    private String regType;
    private List<?> disease;
    private List<String> symptom;
    private Object registerUrls;
    private Object rankOrder;
    private String deptExtend;
    private String registerType;
    private long thirdPatientId;
    private String sessionid;

    public int getIsToday() {
        return isToday;
    }

    public void setIsToday(int isToday) {
        this.isToday = isToday;
    }

    public String getOnlineDeptUrl() {
        return onlineDeptUrl;
    }

    public void setOnlineDeptUrl(String onlineDeptUrl) {
        this.onlineDeptUrl = onlineDeptUrl;
    }

    public String getHosGrade() {
        return hosGrade;
    }

    public void setHosGrade(String hosGrade) {
        this.hosGrade = hosGrade;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getHosId() {
        return hosId;
    }

    public void setHosId(String hosId) {
        this.hosId = hosId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public String getDeptCoreId() {
        return deptCoreId;
    }

    public void setDeptCoreId(String deptCoreId) {
        this.deptCoreId = deptCoreId;
    }

    public String getDeptCoreName() {
        return deptCoreName;
    }

    public void setDeptCoreName(String deptCoreName) {
        this.deptCoreName = deptCoreName;
    }

    public Object getDeptCoreDesc() {
        return deptCoreDesc;
    }

    public void setDeptCoreDesc(Object deptCoreDesc) {
        this.deptCoreDesc = deptCoreDesc;
    }

    public String getDeptSystem() {
        return deptSystem;
    }

    public void setDeptSystem(String deptSystem) {
        this.deptSystem = deptSystem;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public List<?> getDisease() {
        return disease;
    }

    public void setDisease(List<?> disease) {
        this.disease = disease;
    }

    public List<String> getSymptom() {
        return symptom;
    }

    public void setSymptom(List<String> symptom) {
        this.symptom = symptom;
    }

    public Object getRegisterUrls() {
        return registerUrls;
    }

    public void setRegisterUrls(Object registerUrls) {
        this.registerUrls = registerUrls;
    }

    public Object getRankOrder() {
        return rankOrder;
    }

    public void setRankOrder(Object rankOrder) {
        this.rankOrder = rankOrder;
    }

    public String getDeptExtend() {
        return deptExtend;
    }

    public void setDeptExtend(String deptExtend) {
        this.deptExtend = deptExtend;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public long getThirdPatientId() {
        return thirdPatientId;
    }

    public void setThirdPatientId(long thirdPatientId) {
        this.thirdPatientId = thirdPatientId;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    @Override
    public String toString() {
        return "GuidanceDeptEntity{" +
                "isToday=" + isToday +
                ", onlineDeptUrl='" + onlineDeptUrl + '\'' +
                ", hosGrade='" + hosGrade + '\'' +
                ", hosName='" + hosName + '\'' +
                ", hosId='" + hosId + '\'' +
                ", deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptDesc='" + deptDesc + '\'' +
                ", deptCoreId='" + deptCoreId + '\'' +
                ", deptCoreName='" + deptCoreName + '\'' +
                ", deptCoreDesc=" + deptCoreDesc +
                ", deptSystem='" + deptSystem + '\'' +
                ", regType='" + regType + '\'' +
                ", disease=" + disease +
                ", symptom=" + symptom +
                ", registerUrls=" + registerUrls +
                ", rankOrder=" + rankOrder +
                ", deptExtend='" + deptExtend + '\'' +
                ", registerType='" + registerType + '\'' +
                ", thirdPatientId=" + thirdPatientId +
                ", sessionid='" + sessionid + '\'' +
                '}';
    }
}
