package com.example.mycompose.repository.entity;

import java.util.List;

public class AddressEntity {
    // 省 城市 区
    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "AddressEntity{" +
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
        private String code;
        private String name;
        private String parent_id;
        private Integer level_type;
        private String city_code;
        private String zip_code;
        private String full_name;
        private List<CitysBean> citys;

        @Override
        public String toString() {
            return "DataBean{" +
                    "code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    ", parent_id='" + parent_id + '\'' +
                    ", level_type=" + level_type +
                    ", city_code='" + city_code + '\'' +
                    ", zip_code='" + zip_code + '\'' +
                    ", full_name='" + full_name + '\'' +
                    ", citys=" + citys +
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

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public Integer getLevel_type() {
            return level_type;
        }

        public void setLevel_type(Integer level_type) {
            this.level_type = level_type;
        }

        public String getCity_code() {
            return city_code;
        }

        public void setCity_code(String city_code) {
            this.city_code = city_code;
        }

        public String getZip_code() {
            return zip_code;
        }

        public void setZip_code(String zip_code) {
            this.zip_code = zip_code;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public List<CitysBean> getCitys() {
            return citys;
        }

        public void setCitys(List<CitysBean> citys) {
            this.citys = citys;
        }

        public static class CitysBean {
            private String code;
            private String name;
            private String parent_id;
            private Integer level_type;
            private String city_code;
            private String zip_code;
            private String full_name;
            private List<AChildrenBean> a_children;

            @Override
            public String toString() {
                return "CitysBean{" +
                        "code='" + code + '\'' +
                        ", name='" + name + '\'' +
                        ", parent_id='" + parent_id + '\'' +
                        ", level_type=" + level_type +
                        ", city_code='" + city_code + '\'' +
                        ", zip_code='" + zip_code + '\'' +
                        ", full_name='" + full_name + '\'' +
                        ", a_children=" + a_children +
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

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public Integer getLevel_type() {
                return level_type;
            }

            public void setLevel_type(Integer level_type) {
                this.level_type = level_type;
            }

            public String getCity_code() {
                return city_code;
            }

            public void setCity_code(String city_code) {
                this.city_code = city_code;
            }

            public String getZip_code() {
                return zip_code;
            }

            public void setZip_code(String zip_code) {
                this.zip_code = zip_code;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public List<AChildrenBean> getA_children() {
                return a_children;
            }

            public void setA_children(List<AChildrenBean> a_children) {
                this.a_children = a_children;
            }

            public static class AChildrenBean {
                private String code;
                private String name;
                private String parent_id;
                private Integer level_type;
                private String city_code;
                private String zip_code;
                private String full_name;

                @Override
                public String toString() {
                    return "AChildrenBean{" +
                            "code='" + code + '\'' +
                            ", name='" + name + '\'' +
                            ", parent_id='" + parent_id + '\'' +
                            ", level_type=" + level_type +
                            ", city_code='" + city_code + '\'' +
                            ", zip_code='" + zip_code + '\'' +
                            ", full_name='" + full_name + '\'' +
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

                public String getParent_id() {
                    return parent_id;
                }

                public void setParent_id(String parent_id) {
                    this.parent_id = parent_id;
                }

                public Integer getLevel_type() {
                    return level_type;
                }

                public void setLevel_type(Integer level_type) {
                    this.level_type = level_type;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getZip_code() {
                    return zip_code;
                }

                public void setZip_code(String zip_code) {
                    this.zip_code = zip_code;
                }

                public String getFull_name() {
                    return full_name;
                }

                public void setFull_name(String full_name) {
                    this.full_name = full_name;
                }
            }
        }
    }
}
