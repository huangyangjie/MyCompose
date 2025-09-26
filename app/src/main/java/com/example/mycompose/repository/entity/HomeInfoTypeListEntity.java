package com.example.mycompose.repository.entity;

import java.util.List;

public class HomeInfoTypeListEntity {

    private int code;
    private String message;
    private List<DataDTO> data;

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

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        private String type_code;
        private String type_name;

        public String getType_code() {
            return type_code;
        }

        public void setType_code(String type_code) {
            this.type_code = type_code;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "type_code='" + type_code + '\'' +
                    ", type_name='" + type_name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HomeInfoTypeListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
