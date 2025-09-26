package com.example.mycompose.repository.entity;

public class DeptProfessionEntity {

    private Integer code;
    private String message;
    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
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

    @Override
    public String toString() {
        return "CommonEntity{" + "code=" + code + ", message='" + message + '\'' + '}';
    }

    public class DataBean {
       private String dept_des;

        public String getDept_des() {
            return dept_des;
        }

        public void setDept_des(String dept_des) {
            this.dept_des = dept_des;
        }

        @Override
        public String toString() {
            return "DataBean{" + "dept_des='" + dept_des + '\'' + '}';
        }
    }
}
