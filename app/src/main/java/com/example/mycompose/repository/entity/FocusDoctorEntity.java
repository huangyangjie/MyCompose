package com.example.mycompose.repository.entity;

public class FocusDoctorEntity {

    private Integer code;
    private String message;
    private int flag;

    @Override
    public String toString() {
        return "FocusDoctorEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", flag=" + flag +
                '}';
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
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
}
