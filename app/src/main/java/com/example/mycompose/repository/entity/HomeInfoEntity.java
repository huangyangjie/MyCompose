package com.example.mycompose.repository.entity;


import com.example.mycompose.utils.LogTools;

import java.util.ArrayList;
import java.util.List;

public class HomeInfoEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "HomeInfoEntity{" +
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

    public List<List<DataBean>> getFormatData() {
        if (data.size() > 0) {
            LogTools.e("**********************:"+data.size());
            int n = data.size() / 3;
            if (data.size() % 3 > 0) {
                n = n + 1;
            }
            List<List<DataBean>> fData = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<DataBean> tempData = new ArrayList<>();
                int j = i * 3;
                try {
                    tempData.add(data.get(j));
                    tempData.add(data.get(j + 1));
                    tempData.add(data.get(j + 2));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                fData.add(tempData);
            }
            return fData;
        } else {
            return null;
        }
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String createTime;
        private String headline;
        private String summary;
        private String type;
        private String link_url;
        private String cover_url;
        private String link_video_url;
        private Integer weight;

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", headline='" + headline + '\'' +
                    ", summary='" + summary + '\'' +
                    ", type='" + type + '\'' +
                    ", link_url='" + link_url + '\'' +
                    ", cover_url='" + cover_url + '\'' +
                    ", link_video_url='" + link_video_url + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getHeadline() {
            return headline;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLink_url() {
            return link_url;
        }

        public void setLink_url(String link_url) {
            this.link_url = link_url;
        }

        public String getCover_url() {
            return cover_url;
        }

        public void setCover_url(String cover_url) {
            this.cover_url = cover_url;
        }

        public String getLink_video_url() {
            return link_video_url;
        }

        public void setLink_video_url(String link_video_url) {
            this.link_video_url = link_video_url;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }
}
