package com.example.mycompose.repository.entity;

import java.util.List;

public class SelfpayListEntity {
    private Integer code;
    private String message;
    private List<DataBean> data;

    public static class DataBean {
        private String dept_sn;
        private String dept_name;

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

        @Override
        public String toString() {
            return "DataBean{" +
                    "dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    '}';
        }
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


    @Override
    public String toString() {
        return "SelfpayListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
