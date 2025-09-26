package com.example.mycompose.repository.entity;

import java.util.List;

public class StopVisitListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "StopVisitListEntity{" +
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
        private String stop_visit_time;
        private String dept_name;
        private String area_name;
        private String doctor_name;
        private String name_scsrv;

        @Override
        public String toString() {
            return "DataBean{" +
                    "stop_visit_time='" + stop_visit_time + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", area_name='" + area_name + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", name_scsrv='" + name_scsrv + '\'' +
                    '}';
        }

        public String getStop_visit_time() {
            return stop_visit_time;
        }

        public void setStop_visit_time(String stop_visit_time) {
            this.stop_visit_time = stop_visit_time;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getName_scsrv() {
            return name_scsrv;
        }

        public void setName_scsrv(String name_scsrv) {
            this.name_scsrv = name_scsrv;
        }
    }
}
