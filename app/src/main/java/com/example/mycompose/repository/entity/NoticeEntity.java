package com.example.mycompose.repository.entity;

public class NoticeEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "NoticeEntity{" +
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
        private String prompt_scene;
        private String prompt_type;
        private String prompt_content;
        private String type_name;

        @Override
        public String toString() {
            return "DataBean{" +
                    "prompt_scene='" + prompt_scene + '\'' +
                    ", prompt_type='" + prompt_type + '\'' +
                    ", prompt_content='" + prompt_content + '\'' +
                    ", type_name='" + type_name + '\'' +
                    '}';
        }

        public String getPrompt_scene() {
            return prompt_scene;
        }

        public void setPrompt_scene(String prompt_scene) {
            this.prompt_scene = prompt_scene;
        }

        public String getPrompt_type() {
            return prompt_type;
        }

        public void setPrompt_type(String prompt_type) {
            this.prompt_type = prompt_type;
        }

        public String getPrompt_content() {
            return prompt_content;
        }

        public void setPrompt_content(String prompt_content) {
            this.prompt_content = prompt_content;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }
    }
}
