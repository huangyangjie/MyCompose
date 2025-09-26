package com.example.mycompose.repository.entity;

public class ServerStopNoticeEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "ServerStopNoticeEntity{" +
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
        private Boolean is_stop;
        private String tag;

        @Override
        public String toString() {
            return "DataBean{" +
                    "is_stop=" + is_stop +
                    ", tag='" + tag + '\'' +
                    '}';
        }

        public Boolean getIs_stop() {
            return is_stop;
        }

        public void setIs_stop(Boolean is_stop) {
            this.is_stop = is_stop;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
