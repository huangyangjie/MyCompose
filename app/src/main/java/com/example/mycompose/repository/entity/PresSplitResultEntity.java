package com.example.mycompose.repository.entity;

import java.util.List;

public class PresSplitResultEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "PresSplitResultEntity{" +
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
        private List<ListBean> list;
        private String pres_status;
        private String pres_status_name;
        private Integer total;

        @Override
        public String toString() {
            return "DataBean{" +
                    "list=" + list +
                    ", pres_status='" + pres_status + '\'' +
                    ", pres_status_name='" + pres_status_name + '\'' +
                    ", total=" + total +
                    '}';
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public String getPres_status() {
            return pres_status;
        }

        public void setPres_status(String pres_status) {
            this.pres_status = pres_status;
        }

        public String getPres_status_name() {
            return pres_status_name;
        }

        public void setPres_status_name(String pres_status_name) {
            this.pres_status_name = pres_status_name;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public static class ListBean {
            private String prescription_name;
            private String prescription_id;
            private String drug_cate;
            private Integer prescription_count;

            @Override
            public String toString() {
                return "ListBean{" +
                        "prescription_name='" + prescription_name + '\'' +
                        ", prescription_id='" + prescription_id + '\'' +
                        ", drug_cate='" + drug_cate + '\'' +
                        ", prescription_count=" + prescription_count +
                        '}';
            }

            public String getPrescription_name() {
                return prescription_name;
            }

            public void setPrescription_name(String prescription_name) {
                this.prescription_name = prescription_name;
            }

            public String getPrescription_id() {
                return prescription_id;
            }

            public void setPrescription_id(String prescription_id) {
                this.prescription_id = prescription_id;
            }

            public String getDrug_cate() {
                return drug_cate;
            }

            public void setDrug_cate(String drug_cate) {
                this.drug_cate = drug_cate;
            }

            public Integer getPrescription_count() {
                return prescription_count;
            }

            public void setPrescription_count(Integer prescription_count) {
                this.prescription_count = prescription_count;
            }
        }
    }
}
