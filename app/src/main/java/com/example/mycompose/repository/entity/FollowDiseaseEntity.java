package com.example.mycompose.repository.entity;

import java.util.List;

public class FollowDiseaseEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

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
        private String disease_code;
        private String disease_name;

        public String getDisease_code() {
            return disease_code;
        }

        public void setDisease_code(String disease_code) {
            this.disease_code = disease_code;
        }

        public String getDisease_name() {
            return disease_name;
        }

        public void setDisease_name(String disease_name) {
            this.disease_name = disease_name;
        }
    }
}
