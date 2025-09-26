package com.example.mycompose.repository.entity;

import java.util.List;

public class FeedBackDetailEntity {


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
        private String content_type;
        private String content;
        private List<String> images;
        private String phone_model;
        private String app_version;
        private List<String> reply_images;
        private Integer reply_status;
        private String createTime;
        private String reply_time;
        private String reply_content;

        public String getContent_type() {
            return content_type;
        }

        public void setContent_type(String content_type) {
            this.content_type = content_type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public String getPhone_model() {
            return phone_model;
        }

        public void setPhone_model(String phone_model) {
            this.phone_model = phone_model;
        }

        public String getApp_version() {
            return app_version;
        }

        public void setApp_version(String app_version) {
            this.app_version = app_version;
        }

        public List<String> getReply_images() {
            return reply_images;
        }

        public void setReply_images(List<String> reply_images) {
            this.reply_images = reply_images;
        }

        public Integer getReply_status() {
            return reply_status;
        }

        public void setReply_status(Integer reply_status) {
            this.reply_status = reply_status;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getReply_time() {
            return reply_time;
        }

        public void setReply_time(String reply_time) {
            this.reply_time = reply_time;
        }

        public String getReply_content() {
            return reply_content;
        }

        public void setReply_content(String reply_content) {
            this.reply_content = reply_content;
        }
    }
}
