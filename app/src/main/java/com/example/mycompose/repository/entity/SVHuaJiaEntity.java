package com.example.mycompose.repository.entity;

public class SVHuaJiaEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "SVHuaJiaEntity{" +
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
        private String price;
        private String consultation_id;
        private String consultation_no;
        private String code_pat;
        private String dept_sn;
        private String code_srv;

        @Override
        public String toString() {
            return "DataBean{" +
                    "price='" + price + '\'' +
                    ", consultation_id='" + consultation_id + '\'' +
                    ", consultation_no='" + consultation_no + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    '}';
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getConsultation_id() {
            return consultation_id;
        }

        public void setConsultation_id(String consultation_id) {
            this.consultation_id = consultation_id;
        }

        public String getConsultation_no() {
            return consultation_no;
        }

        public void setConsultation_no(String consultation_no) {
            this.consultation_no = consultation_no;
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

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
        }
    }
}
