package com.example.mycompose.repository.entity;

import java.util.List;

public class IdCardTypeListEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "IdCardTypeListEntity{" +
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
        private String code;
        private String name;
        private String py_code;

        @Override
        public String toString() {
            return "DataBean{" +
                    "code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    ", py_code='" + py_code + '\'' +
                    '}';
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPy_code() {
            return py_code;
        }

        public void setPy_code(String py_code) {
            this.py_code = py_code;
        }
    }
}
