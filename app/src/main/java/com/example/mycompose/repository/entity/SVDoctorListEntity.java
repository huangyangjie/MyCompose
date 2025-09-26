package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class SVDoctorListEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "SVDoctorListEntity{" +
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
        private String dept_sn;
        private String dept_name;
        private String parent_dept_name;
        private String parent_dept_sn;
        private String whole_doctor_sn;
        private String doctor_sn;
        private String doctor_name;
        private String weight;
        private String title;
        private String avatar;
        private String doctor_id;
        private String profession;
        private String doctor_type;
        private String hot_tag;
        private String follow_price;
        private String consult_count;
        private String interest_count;
        private String score;
        private String dept_id;
        private List<String> featureLables;
        private Integer interest_tag;
        private Integer consulted_tag;
        private Integer reimburse_tag;
        private Integer remain;

        @Override
        public String toString() {
            return "DataBean{" +
                    "dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", parent_dept_name='" + parent_dept_name + '\'' +
                    ", parent_dept_sn='" + parent_dept_sn + '\'' +
                    ", whole_doctor_sn='" + whole_doctor_sn + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", weight='" + weight + '\'' +
                    ", title='" + title + '\'' +
                    ", avatar='" + avatar + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", profession='" + profession + '\'' +
                    ", doctor_type='" + doctor_type + '\'' +
                    ", hot_tag='" + hot_tag + '\'' +
                    ", follow_price='" + follow_price + '\'' +
                    ", consult_count='" + consult_count + '\'' +
                    ", interest_count='" + interest_count + '\'' +
                    ", score='" + score + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", featureLables=" + featureLables +
                    ", interest_tag=" + interest_tag +
                    ", consulted_tag=" + consulted_tag +
                    ", reimburse_tag=" + reimburse_tag +
                    ", remain=" + remain +
                    '}';
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getParent_dept_name() {
            return parent_dept_name;
        }

        public void setParent_dept_name(String parent_dept_name) {
            this.parent_dept_name = parent_dept_name;
        }

        public String getParent_dept_sn() {
            return parent_dept_sn;
        }

        public void setParent_dept_sn(String parent_dept_sn) {
            this.parent_dept_sn = parent_dept_sn;
        }

        public String getWhole_doctor_sn() {
            return whole_doctor_sn;
        }

        public void setWhole_doctor_sn(String whole_doctor_sn) {
            this.whole_doctor_sn = whole_doctor_sn;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAvatar() {
            if(TextUtils.isEmpty(avatar)){
                return "";
            }else{
                return avatar+"?imageMogr2/auto-orient/format/jpg/blur/1x0/quality/50";
            }
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public String getDoctor_type() {
            return doctor_type;
        }

        public void setDoctor_type(String doctor_type) {
            this.doctor_type = doctor_type;
        }

        public String getHot_tag() {
            return hot_tag;
        }

        public void setHot_tag(String hot_tag) {
            this.hot_tag = hot_tag;
        }

        public String getFollow_price() {
            return follow_price;
        }

        public void setFollow_price(String follow_price) {
            this.follow_price = follow_price;
        }

        public String getConsult_count() {
            return consult_count;
        }

        public void setConsult_count(String consult_count) {
            this.consult_count = consult_count;
        }

        public String getInterest_count() {
            return interest_count;
        }

        public void setInterest_count(String interest_count) {
            this.interest_count = interest_count;
        }

        public Integer getRemain() {
            return remain;
        }

        public void setRemain(Integer remain) {
            this.remain = remain;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public List<String> getFeatureLables() {
            return featureLables;
        }

        public void setFeatureLables(List<String> featureLables) {
            this.featureLables = featureLables;
        }

        public Integer getInterest_tag() {
            return interest_tag;
        }

        public void setInterest_tag(Integer interest_tag) {
            this.interest_tag = interest_tag;
        }

        public Integer getConsulted_tag() {
            return consulted_tag;
        }

        public void setConsulted_tag(Integer consulted_tag) {
            this.consulted_tag = consulted_tag;
        }

        public Integer getReimburse_tag() {
            return reimburse_tag;
        }

        public void setReimburse_tag(Integer reimburse_tag) {
            this.reimburse_tag = reimburse_tag;
        }
    }
}
