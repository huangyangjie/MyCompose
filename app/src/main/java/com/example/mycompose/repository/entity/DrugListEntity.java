package com.example.mycompose.repository.entity;

import java.util.List;

public class DrugListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "DrugListEntity{" +
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
        private String drug_code;
        private String drug_name;
        private String drug_spec;
        private String code_mmpkgutp;

        @Override
        public String toString() {
            return "DataBean{" +
                    "drug_code='" + drug_code + '\'' +
                    ", drug_name='" + drug_name + '\'' +
                    ", drug_spec='" + drug_spec + '\'' +
                    ", code_mmpkgutp='" + code_mmpkgutp + '\'' +
                    '}';
        }

        public String getDrug_code() {
            return drug_code;
        }

        public void setDrug_code(String drug_code) {
            this.drug_code = drug_code;
        }

        public String getDrug_name() {
            return drug_name;
        }

        public void setDrug_name(String drug_name) {
            this.drug_name = drug_name;
        }

        public String getDrug_spec() {
            return drug_spec;
        }

        public void setDrug_spec(String drug_spec) {
            this.drug_spec = drug_spec;
        }

        public String getCode_mmpkgutp() {
            return code_mmpkgutp;
        }

        public void setCode_mmpkgutp(String code_mmpkgutp) {
            this.code_mmpkgutp = code_mmpkgutp;
        }
    }
}
