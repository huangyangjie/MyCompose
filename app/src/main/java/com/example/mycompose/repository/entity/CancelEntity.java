package com.example.mycompose.repository.entity;

public class CancelEntity {

    private Integer code;
    private String message;

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
        return "CancelEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
