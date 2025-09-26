package com.example.mycompose.repository.entity;

import java.util.List;

public class DrugListEntity2 {

    private Integer code;
    private String message;
    private DataEntity data;

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

    public DataEntity getData() {
        return data;
    }

    public DrugListEntity2 setData(DataEntity data) {
        this.data = data;
        return this;
    }

    public static class   DataEntity{

        private List<DataBean> drugs;
        private int total;
        private int drugNums;

        public List<DataBean> getDrugs() {
            return drugs;
        }

        public void setDrugs(List<DataBean> drugs) {
            this.drugs = drugs;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getDrugNums() {
            return drugNums;
        }

        public void setDrugNums(int drugNums) {
            this.drugNums = drugNums;
        }
    }

    public static class DataBean {
        private String drug_code;
        private String drug_name;
        private String drug_spec;
        private String code_mmpkgutp;
        private String drug_cate;
        private String pinyin;

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

        public String getDrug_cate() {
            return drug_cate;
        }

        public void setDrug_cate(String drug_cate) {
            this.drug_cate = drug_cate;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }
    }
}
