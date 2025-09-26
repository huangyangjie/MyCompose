package com.example.mycompose.repository.entity;

import java.util.List;

public class WeChatUserBean {


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
        return "WeChatUserBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static class DataBean {
        private String openid;
        private String nickname;
        private Integer sex;
        private String language;
        private String city;
        private String province;
        private String country;
        private String headimgurl;
        private List<?> privilege;
        private String unionid;

        @Override
        public String toString() {
            return "DataBean{" +
                    "openid='" + openid + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", sex=" + sex +
                    ", language='" + language + '\'' +
                    ", city='" + city + '\'' +
                    ", province='" + province + '\'' +
                    ", country='" + country + '\'' +
                    ", headimgurl='" + headimgurl + '\'' +
                    ", privilege=" + privilege +
                    ", unionid='" + unionid + '\'' +
                    '}';
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public Integer getSex() {
            return sex;
        }

        public void setSex(Integer sex) {
            this.sex = sex;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }

        public List<?> getPrivilege() {
            return privilege;
        }

        public void setPrivilege(List<?> privilege) {
            this.privilege = privilege;
        }

        public String getUnionid() {
            return unionid;
        }

        public void setUnionid(String unionid) {
            this.unionid = unionid;
        }
    }

}
