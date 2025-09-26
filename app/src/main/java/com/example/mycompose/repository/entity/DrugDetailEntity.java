package com.example.mycompose.repository.entity;

import java.util.List;

public class DrugDetailEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "DrugDetailEntity{" +
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
        private String unit_price;
        private String drug_spec;
        private String drug_form;
        private String name_unit_pkgsp;
        private String name_mmca;
        private String stock;
        private String fg_stop;

        @Override
        public String toString() {
            return "DataBean{" +
                    "drug_code='" + drug_code + '\'' +
                    ", drug_name='" + drug_name + '\'' +
                    ", unit_price='" + unit_price + '\'' +
                    ", drug_spec='" + drug_spec + '\'' +
                    ", drug_form='" + drug_form + '\'' +
                    ", name_unit_pkgsp='" + name_unit_pkgsp + '\'' +
                    ", name_mmca='" + name_mmca + '\'' +
                    ", stock='" + stock + '\'' +
                    ", fg_stop='" + fg_stop + '\'' +
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

        public String getUnit_price() {
            return unit_price;
        }

        public void setUnit_price(String unit_price) {
            this.unit_price = unit_price;
        }

        public String getDrug_spec() {
            return drug_spec;
        }

        public void setDrug_spec(String drug_spec) {
            this.drug_spec = drug_spec;
        }

        public String getDrug_form() {
            return drug_form;
        }

        public void setDrug_form(String drug_form) {
            this.drug_form = drug_form;
        }

        public String getName_unit_pkgsp() {
            return name_unit_pkgsp;
        }

        public void setName_unit_pkgsp(String name_unit_pkgsp) {
            this.name_unit_pkgsp = name_unit_pkgsp;
        }

        public String getName_mmca() {
            return name_mmca;
        }

        public void setName_mmca(String name_mmca) {
            this.name_mmca = name_mmca;
        }

        public String getStock() {
            return stock;
        }

        public void setStock(String stock) {
            this.stock = stock;
        }

        public String getFg_stop() {
            return fg_stop;
        }

        public void setFg_stop(String fg_stop) {
            this.fg_stop = fg_stop;
        }
    }
}
