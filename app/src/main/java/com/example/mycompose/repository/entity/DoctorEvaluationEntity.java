package com.example.mycompose.repository.entity;

import java.util.List;

public class DoctorEvaluationEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "DoctorEvaluationEntity{" +
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
        private List<ListBean> list;
        private Integer total;

        @Override
        public String toString() {
            return "DataBean{" +
                    "list=" + list +
                    ", total=" + total +
                    '}';
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public static class ListBean {
            private String id;
            private String name;
            private Integer score;
            private String content;
            private String evaluate_time;
            private List<String> evaluate_list;

            @Override
            public String toString() {
                return "ListBean{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", score=" + score +
                        ", content='" + content + '\'' +
                        ", evaluate_time='" + evaluate_time + '\'' +
                        ", evaluate_list=" + evaluate_list +
                        '}';
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getScore() {
                return score;
            }

            public void setScore(Integer score) {
                this.score = score;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getEvaluate_time() {
                return evaluate_time;
            }

            public void setEvaluate_time(String evaluate_time) {
                this.evaluate_time = evaluate_time;
            }

            public List<String> getEvaluate_list() {
                return evaluate_list;
            }

            public void setEvaluate_list(List<String> evaluate_list) {
                this.evaluate_list = evaluate_list;
            }
        }
    }
}
