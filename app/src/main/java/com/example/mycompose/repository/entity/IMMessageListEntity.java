package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IMMessageListEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "IMMessageListEntity{" +
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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<IMMessageEntity> list;
        private List<IMMessageEntity> temp;
        private Integer total;

        @Override
        public String toString() {
            return "DataBean{" +
                    "list=" + list +
                    ", temp=" + temp +
                    ", total=" + total +
                    '}';
        }

        public List<IMMessageEntity> getList() {
            if (temp == null) {
                temp = new ArrayList<>();
                temp.addAll(list);
            } else {
                temp.clear();
                temp.addAll(list);
            }
            Collections.reverse(temp);
            return temp;
        }

        public void setList(List<IMMessageEntity> list) {
            this.list = list;
        }

        public void addIMMessage(IMMessageEntity message) {
            list.add(0, message);
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

    }
}
