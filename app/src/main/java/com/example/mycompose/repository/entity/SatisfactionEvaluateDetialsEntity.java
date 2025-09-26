package com.example.mycompose.repository.entity;

import java.util.List;

public class SatisfactionEvaluateDetialsEntity {

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
        private List<SatisfactionEvaluateTypeEntity.DataDTO> evaluate_array;

        public String getEvaluate_pri() {
            return evaluate_pri;
        }

        public void setEvaluate_pri(String evaluate_pri) {
            this.evaluate_pri = evaluate_pri;
        }

        public void setEvaluate_array(List<SatisfactionEvaluateTypeEntity.DataDTO> evaluate_array) {
            this.evaluate_array = evaluate_array;
        }

        public List<SatisfactionEvaluateTypeEntity.DataDTO> getEvaluate_array() {
            return evaluate_array;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "evaluate_pri='" + evaluate_pri + '\'' +
                    ", evaluate_array=" + evaluate_array +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SatisfactionEvaluateDetialsEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
