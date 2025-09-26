package com.example.mycompose.repository.entity;

public class OPPItem {
    public OPPItem(String Code_apply){
        this.Code_apply = Code_apply;
    }
    public String Code_apply;

    public String getCode_apply() {
        return Code_apply;
    }

    public void setCode_apply(String code_apply) {
        Code_apply = code_apply;
    }

    @Override
    public String toString() {
        return "OPPItem{" +
                "Code_apply='" + Code_apply + '\'' +
                '}';
    }
}
