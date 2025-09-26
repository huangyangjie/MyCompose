package com.example.mycompose.repository.entity;


public class LoginEntity {

    public int code;
    public String message;
    public Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {
        private String phone;
        private String user_id;
        private String nickname;
        private String headimgurl;
        private String im_accounts;
        private String identifier;
        private String usersig;
        private String token;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }

        public String getIm_accounts() {
            return im_accounts;
        }

        public void setIm_accounts(String im_accounts) {
            this.im_accounts = im_accounts;
        }

        public String getIdentifier() {
            return identifier;
        }

        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }

        public String getUsersig() {
            return usersig;
        }

        public void setUsersig(String usersig) {
            this.usersig = usersig;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "phone='" + phone + '\'' +
                    ", user_id='" + user_id + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", headimgurl='" + headimgurl + '\'' +
                    ", im_accounts='" + im_accounts + '\'' +
                    ", identifier='" + identifier + '\'' +
                    ", usersig='" + usersig + '\'' +
                    ", token='" + token + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
