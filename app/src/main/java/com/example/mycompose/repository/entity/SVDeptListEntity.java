package com.example.mycompose.repository.entity;

import java.util.List;

public class SVDeptListEntity {

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

    @Override
    public String toString() {
        return "SVDeptListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static class DataBean {
        private String dept_sn;
        private String dept_name;
        private String area_code;
        private String level;
        private String parent_sn;
        private String weight;
        private String pinyin;
        private String dept_tag;
        private String dept_id;
        private List<ChildrenBean> children;

        public String getDept_tag() {
            return dept_tag;
        }

        public void setDept_tag(String dept_tag) {
            this.dept_tag = dept_tag;
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

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getParent_sn() {
            return parent_sn;
        }

        public void setParent_sn(String parent_sn) {
            this.parent_sn = parent_sn;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public List<ChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBean> children) {
            this.children = children;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", area_code='" + area_code + '\'' +
                    ", level='" + level + '\'' +
                    ", parent_sn='" + parent_sn + '\'' +
                    ", weight='" + weight + '\'' +
                    ", pinyin='" + pinyin + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", children=" + children +
                    '}';
        }

        public static class ChildrenBean {
            private String dept_sn;
            private String dept_name;
            private String area_code;
            private Integer level;
            private String parent_sn;
            private Integer weight;
            private String pinyin;
            private String dept_id;

            @Override
            public String toString() {
                return "ChildrenBean{" +
                        "dept_sn='" + dept_sn + '\'' +
                        ", dept_name='" + dept_name + '\'' +
                        ", area_code='" + area_code + '\'' +
                        ", level=" + level +
                        ", parent_sn='" + parent_sn + '\'' +
                        ", weight=" + weight +
                        ", pinyin='" + pinyin + '\'' +
                        ", dept_id='" + dept_id + '\'' +
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

            public Integer getLevel() {
                return level;
            }

            public void setLevel(Integer level) {
                this.level = level;
            }

            public String getParent_sn() {
                return parent_sn;
            }

            public void setParent_sn(String parent_sn) {
                this.parent_sn = parent_sn;
            }

            public Integer getWeight() {
                return weight;
            }

            public void setWeight(Integer weight) {
                this.weight = weight;
            }

            public String getPinyin() {
                return pinyin;
            }

            public void setPinyin(String pinyin) {
                this.pinyin = pinyin;
            }

            public String getDept_id() {
                return dept_id;
            }

            public void setDept_id(String dept_id) {
                this.dept_id = dept_id;
            }
        }
    }
}
