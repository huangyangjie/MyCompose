package com.example.mycompose.repository.entity;

public class WithDrawIMMessageEntity {

    private Integer code;
    private String message;
    private int postion;
    private String msg_uuid;

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }

    public String getMsg_uuid() {
        return msg_uuid;
    }

    public void setMsg_uuid(String msg_uuid) {
        this.msg_uuid = msg_uuid;
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
