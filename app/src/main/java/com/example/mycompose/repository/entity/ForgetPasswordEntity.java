package com.example.mycompose.repository.entity;

public class ForgetPasswordEntity {
    public int code;
    public String message;

    @Override
    public String toString() {
        return "ForgetPasswordEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

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
}
