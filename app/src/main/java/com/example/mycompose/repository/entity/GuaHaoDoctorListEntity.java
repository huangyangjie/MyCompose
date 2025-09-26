package com.example.mycompose.repository.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GuaHaoDoctorListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "GuaHaoDoctorListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
        @SerializedName("Code_srvtp")
        private String code_srvtp;
        @SerializedName("Name_srvtp")
        private String name_srvtp;
        private List<DoctorsBean> doctors;

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

        public List<DoctorsBean> getDoctors() {
            return doctors;
        }

        public void setDoctors(List<DoctorsBean> doctors) {
            this.doctors = doctors;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "code_srvtp='" + code_srvtp + '\'' +
                    ", name_srvtp='" + name_srvtp + '\'' +
                    ", doctors=" + doctors +
                    '}';
        }

        public static class DoctorsBean {
            private String doctor_sn;
            @SerializedName("Code_srvtp")
            private String code_srvtp;
            @SerializedName("Name_srvtp")
            private String name_srvtp;
            private String doctor_name;
            private String dept_sn;
            private String dept_name;
            private String dept_introduction;
            @SerializedName("Name_emptitle")
            private String name_emptitle;
            @SerializedName("Doc_speciality")
            private String doc_speciality;
            private Integer can_tag;
            private Integer night_tag;

            @Override
            public String toString() {
                return "DoctorsBean{" +
                        "doctor_sn='" + doctor_sn + '\'' +
                        ", code_srvtp='" + code_srvtp + '\'' +
                        ", name_srvtp='" + name_srvtp + '\'' +
                        ", doctor_name='" + doctor_name + '\'' +
                        ", dept_sn='" + dept_sn + '\'' +
                        ", dept_name='" + dept_name + '\'' +
                        ", dept_introduction='" + dept_introduction + '\'' +
                        ", name_emptitle='" + name_emptitle + '\'' +
                        ", doc_speciality='" + doc_speciality + '\'' +
                        ", can_tag=" + can_tag +
                        ", night_tag=" + night_tag +
                        '}';
            }

            public String getDept_introduction() {
                return dept_introduction;
            }

            public void setDept_introduction(String dept_introduction) {
                this.dept_introduction = dept_introduction;
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

            public String getDoc_speciality() {
                return doc_speciality;
            }

            public void setDoc_speciality(String doc_speciality) {
                this.doc_speciality = doc_speciality;
            }

            public Integer getCan_tag() {
                return can_tag;
            }

            public void setCan_tag(Integer can_tag) {
                this.can_tag = can_tag;
            }

            public Integer getNight_tag() {
                return night_tag;
            }

            public void setNight_tag(Integer night_tag) {
                this.night_tag = night_tag;
            }
        }
    }
}
