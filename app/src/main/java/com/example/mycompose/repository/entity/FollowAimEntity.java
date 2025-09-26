package com.example.mycompose.repository.entity;

import java.util.List;

public class FollowAimEntity {

    private Integer code;
    private String message;
    private List<String> data;

    @Override
    public String toString() {
        return "FollowAimEntity{" +
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

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
