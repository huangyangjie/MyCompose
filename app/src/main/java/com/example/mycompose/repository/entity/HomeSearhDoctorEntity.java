package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeSearhDoctorEntity {

    public int code;
    public String message;
    public List<DataBean> data;

    @Override
    public String toString() {
        return "HomeSearhDoctorEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        public String area_code;
        public String parent_sn;
        public String doctor_sn;
        @SerializedName("Code_srvtp")
        public String code_srvtp;
        @SerializedName("Name_srvtp")
        public String name_srvtp;
        @SerializedName("Name_srv")
        public String name_srv;
        public String doctor_name;
        public String dept_sn;
        public String dept_name;
        @SerializedName("Name_emptitle")
        public String name_emptitle;
        public String avatar;
        @SerializedName("Doc_speciality")
        public String doc_speciality;
        @SerializedName("Name_subdep")
        public String name_subdep;
        @SerializedName("Desc_subdep")
        public String desc_subdep;

        @Override
        public String toString() {
            return "DataBean{" +
                    "area_code='" + area_code + '\'' +
                    ", parent_sn='" + parent_sn + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", code_srvtp='" + code_srvtp + '\'' +
                    ", name_srvtp='" + name_srvtp + '\'' +
                    ", name_srv='" + name_srv + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", name_emptitle='" + name_emptitle + '\'' +
                    ", avatar='" + avatar + '\'' +
                    ", doc_speciality='" + doc_speciality + '\'' +
                    ", name_subdep='" + name_subdep + '\'' +
                    ", desc_subdep='" + desc_subdep + '\'' +
                    '}';
        }

        public String getArea_code() {
            return area_code;
        }

        public void setArea_code(String area_code) {
            this.area_code = area_code;
        }

        public String getParent_sn() {
            return parent_sn;
        }

        public void setParent_sn(String parent_sn) {
            this.parent_sn = parent_sn;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getCode_srvtp() {
            return code_srvtp;
        }

        public void setCode_srvtp(String code_srvtp) {
            this.code_srvtp = code_srvtp;
        }

        public String getName_srvtp() {
            return name_srvtp;
        }

        public void setName_srvtp(String name_srvtp) {
            this.name_srvtp = name_srvtp;
        }

        public String getName_srv() {
            return name_srv;
        }

        public void setName_srv(String name_srv) {
            this.name_srv = name_srv;
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

        public String getName_emptitle() {
            return name_emptitle;
        }

        public void setName_emptitle(String name_emptitle) {
            this.name_emptitle = name_emptitle;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getDoc_speciality() {
            return doc_speciality;
        }

        public void setDoc_speciality(String doc_speciality) {
            this.doc_speciality = doc_speciality;
        }

        public String getName_subdep() {
            return name_subdep;
        }

        public void setName_subdep(String name_subdep) {
            this.name_subdep = name_subdep;
        }

        public String getDesc_subdep() {
            return desc_subdep;
        }

        public void setDesc_subdep(String desc_subdep) {
            this.desc_subdep = desc_subdep;
        }
    }
}
