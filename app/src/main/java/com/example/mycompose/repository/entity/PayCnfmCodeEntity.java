package com.example.mycompose.repository.entity;

public class PayCnfmCodeEntity {

    private int code;
    private String message;
    private DataDTO data;

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

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        private String pageAuthCode;
        private String transId;
        private String sceneId;
        private String reg_no;

        public String getReg_no() {
            return reg_no;
        }

        public DataDTO setReg_no(String reg_no) {
            this.reg_no = reg_no;
            return this;
        }

        public String getSceneId() {
            return sceneId;
        }

        public void setSceneId(String sceneId) {
            this.sceneId = sceneId;
        }

        public String getTransId() {
            return transId;
        }

        public void setTransId(String transId) {
            this.transId = transId;
        }

        public String getPageAuthCode() {
            return pageAuthCode;
        }

        public void setPageAuthCode(String pageAuthCode) {
            this.pageAuthCode = pageAuthCode;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "pageAuthCode='" + pageAuthCode + '\'' +
                    ", transId='" + transId + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PayCnfmCodeEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
