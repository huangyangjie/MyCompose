package com.example.mycompose.repository.entity;

import java.util.List;

public class HelpCenterDataEntity {


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

    @Override
    public String toString() {
        return "HelpCenterDataEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static class DataBean {
        private List<ListBean> list;
        private List<TypesBean> types;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<TypesBean> getTypes() {
            return types;
        }

        public void setTypes(List<TypesBean> types) {
            this.types = types;
        }

        public static class ListBean {
            private int id;
            private String name;
            private String code;
            private Integer weight;

            @Override
            public String toString() {
                return "ListBean{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", code='" + code + '\'' +
                        ", weight=" + weight +
                        '}';
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public Integer getWeight() {
                return weight;
            }

            public void setWeight(Integer weight) {
                this.weight = weight;
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "list=" + list +
                    ", types=" + types +
                    '}';
        }

        public static class TypesBean {
            private String code;
            private String name;
            private String description;
            private String icon;

            @Override
            public String toString() {
                return "TypesBean{" +
                        "code='" + code + '\'' +
                        ", name='" + name + '\'' +
                        ", description='" + description + '\'' +
                        ", icon='" + icon + '\'' +
                        '}';
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
