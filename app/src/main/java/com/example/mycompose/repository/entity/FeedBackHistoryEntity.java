package com.example.mycompose.repository.entity;

import java.util.List;

public class FeedBackHistoryEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String content;
        private String content_type;
        private List<String> images;
        private String createTime;
        private Integer reply_status;
        private String reply_time;
        private String reply_content;
        private List<String> reply_images;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent_type() {
            return content_type;
        }

        public void setContent_type(String content_type) {
            this.content_type = content_type;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Integer getReply_status() {
            return reply_status;
        }

        public void setReply_status(Integer reply_status) {
            this.reply_status = reply_status;
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

        public List<String> getReply_images() {
            return reply_images;
        }

        public void setReply_images(List<String> reply_images) {
            try {
                this.reply_images = reply_images;
            } catch (Exception e) {
                e.printStackTrace();
                this.reply_images = null;
            }
        }
    }
}
