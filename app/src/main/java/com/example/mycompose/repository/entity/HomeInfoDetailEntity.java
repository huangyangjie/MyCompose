package com.example.mycompose.repository.entity;

public class HomeInfoDetailEntity {


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
        private String id;
        private String createTime;
        private String updateTime;
        private String headline;
        private String summary;
        private String type;
        private String content;
        private String link_url;
        private String type_code;
        private String tag_code;
        private String cover_url;
        private Integer weight;
        private Integer issue_flag;
        private String issue_time;
        private String course_source;
        private String issue_user_id;
        private String link_video_url;
        private String tag_name;
        private String browseCount;
        private String opr03Count;
        private String opr04Count;
        private String issuer;

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

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getLink_url() {
            return link_url;
        }

        public void setLink_url(String link_url) {
            this.link_url = link_url;
        }

        public String getType_code() {
            return type_code;
        }

        public void setType_code(String type_code) {
            this.type_code = type_code;
        }

        public String getTag_code() {
            return tag_code;
        }

        public void setTag_code(String tag_code) {
            this.tag_code = tag_code;
        }

        public String getCover_url() {
            return cover_url;
        }

        public void setCover_url(String cover_url) {
            this.cover_url = cover_url;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public Integer getIssue_flag() {
            return issue_flag;
        }

        public void setIssue_flag(Integer issue_flag) {
            this.issue_flag = issue_flag;
        }

        public String getIssue_time() {
            return issue_time;
        }

        public void setIssue_time(String issue_time) {
            this.issue_time = issue_time;
        }

        public String getLink_video_url() {
            return link_video_url;
        }

        public void setLink_video_url(String link_video_url) {
            this.link_video_url = link_video_url;
        }

        public String getCourse_source() {
            return course_source;
        }

        public void setCourse_source(String course_source) {
            this.course_source = course_source;
        }

        public String getIssue_user_id() {
            return issue_user_id;
        }

        public void setIssue_user_id(String issue_user_id) {
            this.issue_user_id = issue_user_id;
        }



        public String getTag_name() {
            return tag_name;
        }

        public void setTag_name(String tag_name) {
            this.tag_name = tag_name;
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
    }
}
