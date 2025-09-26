package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class MyFoucusSVDoctorEntity2 {

    private Integer code;
    private String message;
    private DataBean data;

    public static  class DataBean{
        List<MyFoucusSVDoctorEntity.DataBean> list;

        public List<MyFoucusSVDoctorEntity.DataBean> getList() {
            return list;
        }

        public DataBean setList(List<MyFoucusSVDoctorEntity.DataBean> list) {
            this.list = list;
            return this;
        }
    }
    @Override
    public String toString() {
        return "MyFoucusSVDoctorEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public MyFoucusSVDoctorEntity2 setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public MyFoucusSVDoctorEntity2 setMessage(String message) {
        this.message = message;
        return this;
    }

    public DataBean getData() {
        return data;
    }

    public MyFoucusSVDoctorEntity2 setData(DataBean data) {
        this.data = data;
        return this;
    }
}
