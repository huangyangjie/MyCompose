package com.example.mycompose.repository.entity;

public class WXAppletEntity {
    String errCode;
    String errStr;

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrStr(String errStr) {
        this.errStr = errStr;
    }

    public String getErrStr() {
        return errStr;
    }


    @Override
    public String toString() {
        return "WXAppletEntity{" +
                "errCode='" + errCode + '\'' +
                ", errStr='" + errStr + '\'' +
                '}';
    }
}
