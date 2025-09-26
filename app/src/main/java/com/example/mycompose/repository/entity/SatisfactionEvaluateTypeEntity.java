package com.example.mycompose.repository.entity;

import java.util.List;

public class SatisfactionEvaluateTypeEntity {

    private int code;
    private String message;
    private List<DataDTO> data;

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

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        private int sequence;
        private String code;
        private String content;
        private String score = "0";


        public void setScore(String score) {
            this.score = score;
        }

        public String getScore() {
            return score;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "sequence=" + sequence +
                    ", code='" + code + '\'' +
                    ", content='" + content + '\'' +
                    ", score='" + score + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SatisfactionEvaluateTypeEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
