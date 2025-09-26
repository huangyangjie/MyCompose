package com.example.mycompose.repository.entity;

import java.util.List;

public class FeatureDeptEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "FeatureDeptEntity{" +
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
        private String area_code;
        private String dept_id;
        private String parent_sn;
        private String icon;

        @Override
        public String toString() {
            return "DataBean{" +
                    "dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", area_code='" + area_code + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", parent_sn='" + parent_sn + '\'' +
                    ", icon='" + icon + '\'' +
                    '}';
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

        public String getArea_code() {
            return area_code;
        }

        public void setArea_code(String area_code) {
            this.area_code = area_code;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getParent_sn() {
            return parent_sn;
        }

        public void setParent_sn(String parent_sn) {
            this.parent_sn = parent_sn;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
