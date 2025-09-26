package com.example.mycompose.repository.entity;

public class GuidanceDoctorEntity {
    private String channel;
    private String docId;
    private String docName;
    private String docLevelName;
    private String docDesc;
    private String deptId;
    private String docRegDeptId;
    private String deptName;
    private String hosId;
    private String hosAddr;
    private String hosName;
    private double hosLatitude;
    private double hosLongitude;
    private String hosGrade;
    private String hosGradeDesc;
    private String doctorTypeName;
    private String docSpecial;
    private String docPhoto;
    private String docDisease;
    private String deptCoreId;
    private String docExtend;
    private String registerType;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocLevelName() {
        return docLevelName;
    }

    public void setDocLevelName(String docLevelName) {
        this.docLevelName = docLevelName;
    }

    public String getDocDesc() {
        return docDesc;
    }

    public void setDocDesc(String docDesc) {
        this.docDesc = docDesc;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDocRegDeptId() {
        return docRegDeptId;
    }

    public void setDocRegDeptId(String docRegDeptId) {
        this.docRegDeptId = docRegDeptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHosId() {
        return hosId;
    }

    public void setHosId(String hosId) {
        this.hosId = hosId;
    }

    public String getHosAddr() {
        return hosAddr;
    }

    public void setHosAddr(String hosAddr) {
        this.hosAddr = hosAddr;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public double getHosLatitude() {
        return hosLatitude;
    }

    public void setHosLatitude(double hosLatitude) {
        this.hosLatitude = hosLatitude;
    }

    public double getHosLongitude() {
        return hosLongitude;
    }

    public void setHosLongitude(double hosLongitude) {
        this.hosLongitude = hosLongitude;
    }

    public String getHosGrade() {
        return hosGrade;
    }

    public void setHosGrade(String hosGrade) {
        this.hosGrade = hosGrade;
    }

    public String getHosGradeDesc() {
        return hosGradeDesc;
    }

    public void setHosGradeDesc(String hosGradeDesc) {
        this.hosGradeDesc = hosGradeDesc;
    }

    public String getDoctorTypeName() {
        return doctorTypeName;
    }

    public void setDoctorTypeName(String doctorTypeName) {
        this.doctorTypeName = doctorTypeName;
    }

    public String getDocSpecial() {
        return docSpecial;
    }

    public void setDocSpecial(String docSpecial) {
        this.docSpecial = docSpecial;
    }

    public String getDocPhoto() {
        return docPhoto;
    }

    public void setDocPhoto(String docPhoto) {
        this.docPhoto = docPhoto;
    }

    public String getDocDisease() {
        return docDisease;
    }

    public void setDocDisease(String docDisease) {
        this.docDisease = docDisease;
    }

    public String getDeptCoreId() {
        return deptCoreId;
    }

    public void setDeptCoreId(String deptCoreId) {
        this.deptCoreId = deptCoreId;
    }

    public String getDocExtend() {
        return docExtend;
    }

    public void setDocExtend(String docExtend) {
        this.docExtend = docExtend;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    @Override
    public String toString() {
        return "GuidanceDoctorEntity{" +
                "channel='" + channel + '\'' +
                ", docId='" + docId + '\'' +
                ", docName='" + docName + '\'' +
                ", docLevelName='" + docLevelName + '\'' +
                ", docDesc='" + docDesc + '\'' +
                ", deptId='" + deptId + '\'' +
                ", docRegDeptId='" + docRegDeptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", hosId='" + hosId + '\'' +
                ", hosAddr='" + hosAddr + '\'' +
                ", hosName='" + hosName + '\'' +
                ", hosLatitude=" + hosLatitude +
                ", hosLongitude=" + hosLongitude +
                ", hosGrade='" + hosGrade + '\'' +
                ", hosGradeDesc='" + hosGradeDesc + '\'' +
                ", doctorTypeName='" + doctorTypeName + '\'' +
                ", docSpecial='" + docSpecial + '\'' +
                ", docPhoto='" + docPhoto + '\'' +
                ", docDisease='" + docDisease + '\'' +
                ", deptCoreId='" + deptCoreId + '\'' +
                ", docExtend='" + docExtend + '\'' +
                ", registerType='" + registerType + '\'' +
                '}';
    }
}
