package com.example.mycompose.repository.entity;

public class CodeImage {

    public int type ;// 1 为二维码  2 为条形码
    public String  code;
    public String title;

    public int getType() {
        return type;
    }

    public CodeImage setType(int type) {
        this.type = type;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CodeImage setCode(String code) {
        this.code = code;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CodeImage setTitle(String title) {
        this.title = title;
        return this;
    }
}
