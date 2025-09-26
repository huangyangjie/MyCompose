package com.example.mycompose.repository.entity;

public class SendIMMessageEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "SendIMMessageEntity{" +
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
        private String msgKey;
        private String send_time;
        private String msg_uuid;

        public String getMsgKey() {
            return msgKey;
        }

        public void setMsgKey(String msgKey) {
            this.msgKey = msgKey;
        }

        public String getSend_time() {
            return send_time;
        }

        public void setSend_time(String send_time) {
            this.send_time = send_time;
        }

        public String getMsg_uuid() {
            return msg_uuid;
        }

        public void setMsg_uuid(String msg_uuid) {
            this.msg_uuid = msg_uuid;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "msgKey='" + msgKey + '\'' +
                    ", send_time='" + send_time + '\'' +
                    '}';
        }
    }
}
