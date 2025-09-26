package com.example.mycompose.repository.entity;

import android.text.TextUtils;

public class DoctorInfoEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "DoctorInfoEntity{" +
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
        private String doctor_sn;
        private String whole_doctor_sn;
        private String doctor_name;
        private String title;
        private String profession;
        private String avatar;
        public int interest_tag;  // 0 是未关注 1 是已关注

        public int getInterest_tag() {
            return interest_tag;
        }

        public DataBean setInterest_tag(int interest_tag) {
            this.interest_tag = interest_tag;
            return this;
        }

        @Override
        public String
        toString() {
            return "DataBean{" +
                    "doctor_sn='" + doctor_sn + '\'' +
                    ", whole_doctor_sn='" + whole_doctor_sn + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", title='" + title + '\'' +
                    ", profession='" + profession + '\'' +
                    ", avatar='" + avatar + '\'' +
                    '}';
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getWhole_doctor_sn() {
            return whole_doctor_sn;
        }

        public void setWhole_doctor_sn(String whole_doctor_sn) {
            this.whole_doctor_sn = whole_doctor_sn;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
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
    }
}
