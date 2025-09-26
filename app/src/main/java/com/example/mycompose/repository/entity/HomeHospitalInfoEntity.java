package com.example.mycompose.repository.entity;

public class HomeHospitalInfoEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "HomeHospitalInfoEntity{" +
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
        private String area_name;
        private String address;
        private String introduction;
        private String website;
        private String traffic_route;
        private String telephone;
        private String apt_phone;
        private String email;
        private String subway_route;

        @Override
        public String toString() {
            return "DataBean{" +
                    "area_name='" + area_name + '\'' +
                    ", address='" + address + '\'' +
                    ", introduction='" + introduction + '\'' +
                    ", website='" + website + '\'' +
                    ", traffic_route='" + traffic_route + '\'' +
                    ", telephone='" + telephone + '\'' +
                    ", apt_phone='" + apt_phone + '\'' +
                    ", email='" + email + '\'' +
                    ", subway_route='" + subway_route + '\'' +
                    '}';
        }

        public String getSubway_route() {
            return subway_route;
        }

        public void setSubway_route(String subway_route) {
            this.subway_route = subway_route;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getTraffic_route() {
            return traffic_route;
        }

        public void setTraffic_route(String traffic_route) {
            this.traffic_route = traffic_route;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getApt_phone() {
            return apt_phone;
        }

        public void setApt_phone(String apt_phone) {
            this.apt_phone = apt_phone;
        }
    }
}
