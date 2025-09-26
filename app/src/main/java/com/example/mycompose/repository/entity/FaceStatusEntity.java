package com.example.mycompose.repository.entity;

public class FaceStatusEntity {


    public int code;
    public String message;
    public DataBean data;

    @Override
    public String toString() {
        return "FaceStatusEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
        public int isNeedFace;

        @Override
        public String toString() {
            return "DataBean{" +
                    "isNeedFace=" + isNeedFace +
                    '}';
        }

        public int getIsNeedFace() {
            return isNeedFace;
        }

        public void setIsNeedFace(int isNeedFace) {
            this.isNeedFace = isNeedFace;
        }
    }
}
