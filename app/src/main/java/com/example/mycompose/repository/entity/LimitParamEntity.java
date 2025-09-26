package com.example.mycompose.repository.entity;

public class LimitParamEntity {

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
        private int open_flag;

        public int getOpen_flag() {
            return open_flag;
        }

        public void setOpen_flag(int open_flag) {
            this.open_flag = open_flag;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "open_flag=" + open_flag +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "LimitParamEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
