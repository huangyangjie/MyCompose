package com.example.mycompose.repository.entity;

public class BaseEntity2<T> {

    private Integer code;
    private String message;

    private T data;

    public Integer getCode() {
        return code;
    }

    public BaseEntity2<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BaseEntity2<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public BaseEntity2<T> setData(T data) {
        this.data = data;
        return this;
    }
}
