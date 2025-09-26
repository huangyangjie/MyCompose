package com.example.mycompose.repository.entity;

import java.util.List;

public class HomeInfoContentListEntity {

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
        private String id;
        private String headline;
        private String type;
        private String cover_url;
        private String summary;
        private String tag_name;
        private String createTime;
        private String browseCount;
        private String opr03Count;
        private String opr04Count;
        private String issuer;
        private String type_name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getHeadline() {
            return headline;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCover_url() {
            return cover_url;
        }

        public void setCover_url(String cover_url) {
            this.cover_url = cover_url;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getTag_name() {
            return tag_name;
        }

        public void setTag_name(String tag_name) {
            this.tag_name = tag_name;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getBrowseCount() {
            return browseCount;
        }

        public void setBrowseCount(String browseCount) {
            this.browseCount = browseCount;
        }

        public String getOpr03Count() {
            return opr03Count;
        }

        public void setOpr03Count(String opr03Count) {
            this.opr03Count = opr03Count;
        }

        public String getOpr04Count() {
            return opr04Count;
        }

        public void setOpr04Count(String opr04Count) {
            this.opr04Count = opr04Count;
        }

        public String getIssuer() {
            return issuer;
        }

        public void setIssuer(String issuer) {
            this.issuer = issuer;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "id='" + id + '\'' +
                    ", headline='" + headline + '\'' +
                    ", type='" + type + '\'' +
                    ", cover_url=" + cover_url +
                    ", summary='" + summary + '\'' +
                    ", tag_name='" + tag_name + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", browseCount='" + browseCount + '\'' +
                    ", opr03Count='" + opr03Count + '\'' +
                    ", opr04Count='" + opr04Count + '\'' +
                    ", issuer='" + issuer + '\'' +
                    ", type_name='" + type_name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HomeInfoContentListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
