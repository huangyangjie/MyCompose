package com.example.mycompose.repository.entity;

public class SatisfactionSurverySubmitEntity {

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
        private String evaluate_pri;
        private String evaluate_type;

        public String getEvaluate_pri() {
            return evaluate_pri;
        }

        public void setEvaluate_pri(String evaluate_pri) {
            this.evaluate_pri = evaluate_pri;
        }

        public String getEvaluate_type() {
            return evaluate_type;
        }

        public void setEvaluate_type(String evaluate_type) {
            this.evaluate_type = evaluate_type;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "evaluate_pri='" + evaluate_pri + '\'' +
                    ", evaluate_type='" + evaluate_type + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SatisfactionSurverySubmitEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
