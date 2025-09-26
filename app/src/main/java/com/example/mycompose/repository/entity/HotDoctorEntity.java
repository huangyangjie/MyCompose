package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class HotDoctorEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "HotDoctorEntity{" +
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
        private String doctor_sn;
        private String title;
        private String doctor_name;
        private String dept_sn;
        private String dept_id;
        private String dept_name;
        private String parent_dept_name;
        private String parent_dept_sn;
        private String doctor_id;
        private String whole_doctor_sn;
        private Integer weight;
        private String avatar;
        private String doctor_type;
        private Integer hot_tag;
        private String code_srv;

        @Override
        public String toString() {
            return "DataBean{" +
                    "doctor_sn='" + doctor_sn + '\'' +
                    ", title='" + title + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", dept_name=" + dept_name +
                    ", parent_dept_name=" + parent_dept_name +
                    ", parent_dept_sn=" + parent_dept_sn +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", whole_doctor_sn='" + whole_doctor_sn + '\'' +
                    ", weight=" + weight +
                    ", avatar='" + avatar + '\'' +
                    ", doctor_type='" + doctor_type + '\'' +
                    ", hot_tag=" + hot_tag +
                    ", code_srv='" + code_srv + '\'' +
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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
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

        public Object getParent_dept_name() {
            return parent_dept_name;
        }

        public void setParent_dept_name(String parent_dept_name) {
            this.parent_dept_name = parent_dept_name;
        }

        public Object getParent_dept_sn() {
            return parent_dept_sn;
        }

        public void setParent_dept_sn(String parent_dept_sn) {
            this.parent_dept_sn = parent_dept_sn;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getWhole_doctor_sn() {
            return whole_doctor_sn;
        }

        public void setWhole_doctor_sn(String whole_doctor_sn) {
            this.whole_doctor_sn = whole_doctor_sn;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
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

        public String getDoctor_type() {
            return doctor_type;
        }

        public void setDoctor_type(String doctor_type) {
            this.doctor_type = doctor_type;
        }

        public Integer getHot_tag() {
            return hot_tag;
        }

        public void setHot_tag(Integer hot_tag) {
            this.hot_tag = hot_tag;
        }

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
        }
    }
}
