package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SVDoctorInfoEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "SVDoctorInfoEntity{" +
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
        private String doctor_sn = "";
        private String doctor_id = "";
        private String doctor_name = "";
        private String im_accounts = "";
        private String avatar = "";
        private String area_code = "";
        private String title = "";
        private String profession = "";
        private String dept_id = "";
        private String dept_sn = "";
        private String resume = "";
        private String follow_price = "";
        private String dept_name = "";
        private String interest_count = "";
        private String consult_count = "";
        private String readme = "";

        private String score = "";
        private Integer interest_tag;
        private Integer remain;
        private List<String> FAQs;

        @Override
        public String toString() {
            return "DataBean{" +
                    "doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", im_accounts='" + im_accounts + '\'' +
                    ", avatar='" + avatar + '\'' +
                    ", area_code='" + area_code + '\'' +
                    ", title='" + title + '\'' +
                    ", profession='" + profession + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", resume='" + resume + '\'' +
                    ", follow_price='" + follow_price + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", interest_count='" + interest_count + '\'' +
                    ", consult_count='" + consult_count + '\'' +
                    ", readme='" + readme + '\'' +
                    ", score='" + score + '\'' +
                    ", interest_tag=" + interest_tag +
                    ", FAQs=" + FAQs +
                    '}';
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public Integer getRemain() {
            return remain;
        }

        public void setRemain(Integer remain) {
            this.remain = remain;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getIm_accounts() {
            return im_accounts;
        }

        public void setIm_accounts(String im_accounts) {
            this.im_accounts = im_accounts;
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

        public String getArea_code() {
            return area_code;
        }

        public void setArea_code(String area_code) {
            this.area_code = area_code;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public String getResume() {
            return resume;
        }

        public void setResume(String resume) {
            this.resume = resume;
        }

        public String getFollow_price() {
            return follow_price;
        }

        public void setFollow_price(String follow_price) {
            this.follow_price = follow_price;
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

        public String getInterest_count() {
            return interest_count;
        }

        public void setInterest_count(String interest_count) {
            this.interest_count = interest_count;
        }

        public String getConsult_count() {
            return consult_count;
        }

        public void setConsult_count(String consult_count) {
            this.consult_count = consult_count;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public Integer getInterest_tag() {
            return interest_tag;
        }

        public void setInterest_tag(Integer interest_tag) {
            this.interest_tag = interest_tag;
        }

        public List<String> getFAQs() {
            return FAQs;
        }

        public void setFAQs(List<String> FAQs) {
            this.FAQs = FAQs;
        }

        public String getReadme() {
            return readme;
        }

        public void setReadme(String readme) {
            this.readme = readme;
        }
    }
}
