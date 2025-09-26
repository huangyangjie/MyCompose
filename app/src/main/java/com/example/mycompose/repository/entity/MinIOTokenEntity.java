package com.example.mycompose.repository.entity;

public class MinIOTokenEntity {

    private Integer code;
    private String message;
    private String data;

    private String key;
    private String realPath;

    @Override
    public String toString() {
        return "QiNiuTokenEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                ", key='" + key + '\'' +
                ", realPath='" + realPath + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getData() {
        return data;
    }

    public String getToken() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String getRealPath() {
        return realPath;
    }

    public void setRealPath(String realPath) {
        this.realPath = realPath;
    }
}
