package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class BannerListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "BannerListEntity{" +
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String name;
        private String content;
        private String new_url;
        private String qiniu_url;
        private Integer weight;
        private String type;
        private String id;

        @Override
        public String toString() {
            return "DataBean{" +
                    "name='" + name + '\'' +
                    ", content='" + content + '\'' +
                    ", new_url='" + new_url + '\'' +
                    ", qiniu_url='" + qiniu_url + '\'' +
                    ", weight=" + weight +
                    ", type='" + type + '\'' +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getNew_url() {
            return new_url;
        }

        public void setNew_url(String new_url) {
            this.new_url = new_url;
        }

        public String getQiniu_url() {
            if(TextUtils.isEmpty(qiniu_url)){
                return "";
            }else{
                return qiniu_url+"?imageMogr2/auto-orient/format/jpg/blur/1x0/quality/50";
            }
        }


        public void setQiniu_url(String qiniu_url) {
            this.qiniu_url = qiniu_url;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
