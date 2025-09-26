package com.example.mycompose.repository.entity;

import android.text.TextUtils;



import java.util.ArrayList;
import java.util.List;

public class HomePageSearchEntity {

    private Integer code;
    private String message;
    private HomeInfoEntity.DataBean data;

    @Override
    public String toString() {
        return "HomePageSearchEntity{" +
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


}
