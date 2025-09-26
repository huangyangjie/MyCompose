package com.example.mycompose.repository.entity;

import java.util.List;

public class HelpCenterListDataEntity {

    private Integer code;
    private String message;
    private List<HelpCenterDataEntity.DataBean.ListBean> data;

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

    public List<HelpCenterDataEntity.DataBean.ListBean> getData() {
        return data;
    }

    public void setData(List<HelpCenterDataEntity.DataBean.ListBean> data) {
        this.data = data;
    }
}
