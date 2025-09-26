package com.example.mycompose.repository.entity;

import java.util.List;

public class SVSearchDoctorEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "SVSearchDoctorEntity{" +
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
        private String dept_sn;
        private String doctor_sn;
        private String doctor_name;
        private String doctor_id;
        private String dept_name;

        @Override
        public String toString() {
            return "DataBean{" +
                    "dept_sn='" + dept_sn + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    '}';
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
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

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }
    }
}
