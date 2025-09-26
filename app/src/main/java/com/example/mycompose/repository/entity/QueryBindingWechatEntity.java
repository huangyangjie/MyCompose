package com.example.mycompose.repository.entity;

public class QueryBindingWechatEntity {

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

    public static class DataBean {
        private Integer bindWechatStatus;
        private Integer bindAppleStatus;
        private String openid;
        private String headimgurl;
        private String nickname;
        private String appleId;

        @Override
        public String toString() {
            return "DataBean{" +
                    "bindWechatStatus=" + bindWechatStatus +
                    ", bindAppleStatus=" + bindAppleStatus +
                    ", openid='" + openid + '\'' +
                    ", headimgurl='" + headimgurl + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", appleId='" + appleId + '\'' +
                    '}';
        }

        public Integer getBindWechatStatus() {
            return bindWechatStatus;
        }

        public void setBindWechatStatus(Integer bindWechatStatus) {
            this.bindWechatStatus = bindWechatStatus;
        }

        public Integer getBindAppleStatus() {
            return bindAppleStatus;
        }

        public void setBindAppleStatus(Integer bindAppleStatus) {
            this.bindAppleStatus = bindAppleStatus;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAppleId() {
            return appleId;
        }

        public void setAppleId(String appleId) {
            this.appleId = appleId;
        }
    }
}
