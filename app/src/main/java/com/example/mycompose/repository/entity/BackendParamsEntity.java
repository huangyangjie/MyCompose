package com.example.mycompose.repository.entity;

public class BackendParamsEntity {


    private Integer code;
    private String message;
    private DataBean data;

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
        private String isCanDownLoad;

        public String getIsCanDownLoad() {
            return isCanDownLoad;
        }

        public void setIsCanDownLoad(String isCanDownLoad) {
            this.isCanDownLoad = isCanDownLoad;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "isCanDownLoad='" + isCanDownLoad + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BackendParamsEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
