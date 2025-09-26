package com.example.mycompose.repository.entity;

public class LockRegisteredEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "LockRegisteredEntity{" +
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
        private String id_apt;
        private String apt_id;
        private String price;
        private String create_time;
        private String code_srv;
        private String code_pat;
        private String dept_sn;
        private String pat_type;


        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id_apt='" + id_apt + '\'' +
                    ", apt_id='" + apt_id + '\'' +
                    ", price='" + price + '\'' +
                    ", create_time='" + create_time + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    '}';
        }

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getApt_id() {
            return apt_id;
        }

        public void setApt_id(String apt_id) {
            this.apt_id = apt_id;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }
    }
}
