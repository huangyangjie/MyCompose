package com.example.mycompose.repository.entity;

import java.util.List;

public class DeptmentListEntity {

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
        return "DeptmentListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static class DataBean {
        private String dept_sn;
        private String dept_name;
        private String area_code;
        private Integer level;
        private String parent_sn;
        private Integer weight;
        private String prompt;
        private String dept_tag;
        private Integer is_prompt;
        private Integer prompt_time;
        private String location;
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

        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }

        public Integer getIs_prompt() {
            return is_prompt;
        }

        public void setIs_prompt(Integer is_prompt) {
            this.is_prompt = is_prompt;
        }

        public Integer getPrompt_time() {
            return prompt_time;
        }

        public void setPrompt_time(Integer prompt_time) {
            this.prompt_time = prompt_time;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
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
                    ", level=" + level +
                    ", parent_sn='" + parent_sn + '\'' +
                    ", weight=" + weight +
                    ", prompt='" + prompt + '\'' +
                    ", dept_tag='" + dept_tag + '\'' +
                    ", is_prompt=" + is_prompt +
                    ", prompt_time=" + prompt_time +
                    ", location='" + location + '\'' +
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
            private String prompt;
            private String doctor_sn;
            private Integer is_prompt;
            private Integer prompt_time;
            private String location;
            private Integer tg_selfpay;

            @Override
            public String toString() {
                return "ChildrenBean{" +
                        "dept_sn='" + dept_sn + '\'' +
                        ", dept_name='" + dept_name + '\'' +
                        ", area_code='" + area_code + '\'' +
                        ", level=" + level +
                        ", parent_sn='" + parent_sn + '\'' +
                        ", weight=" + weight +
                        ", prompt='" + prompt + '\'' +
                        ", is_prompt=" + is_prompt +
                        ", prompt_time=" + prompt_time +
                        ", location='" + location + '\'' +
                        ", tg_selfpay=" + tg_selfpay +
                        '}';
            }

            public String getDoctor_sn() {
                return doctor_sn;
            }

            public void setDoctor_sn(String doctor_sn) {
                this.doctor_sn = doctor_sn;
            }

            public Integer getTg_selfpay() {
                return tg_selfpay;
            }

            public void setTg_selfpay(Integer tg_selfpay) {
                this.tg_selfpay = tg_selfpay;
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

            public String getPrompt() {
                return prompt;
            }

            public void setPrompt(String prompt) {
                this.prompt = prompt;
            }

            public Integer getIs_prompt() {
                return is_prompt;
            }

            public void setIs_prompt(Integer is_prompt) {
                this.is_prompt = is_prompt;
            }

            public Integer getPrompt_time() {
                return prompt_time;
            }

            public void setPrompt_time(Integer prompt_time) {
                this.prompt_time = prompt_time;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

        }
    }
}
