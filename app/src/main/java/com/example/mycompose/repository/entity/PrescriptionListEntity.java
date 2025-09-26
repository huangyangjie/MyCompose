package com.example.mycompose.repository.entity;

import java.util.List;

public class PrescriptionListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "PrescriptionListEntity{" +
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
        private String prescription_id;
        private String patient_id;
        private String pres_doctor_name;
        private String pres_dept_name;
        private String pres_status;
        private String pres_status_name;
        private String pres_type;
        private String pres_type_name;
        private String effective_date;
        private String expiry_date;
        private String use_date;
        private String refund_date;
        private String pres_cate;
        private String bottom_message;
        private String take_drug_addr;
        private String purchase_way;
        private String patient_name;
        private String mail_no;
        private String bsp_order_no;

        @Override
        public String toString() {
            return "DataBean{" +
                    "prescription_id='" + prescription_id + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", pres_doctor_name='" + pres_doctor_name + '\'' +
                    ", pres_dept_name='" + pres_dept_name + '\'' +
                    ", pres_status='" + pres_status + '\'' +
                    ", pres_status_name='" + pres_status_name + '\'' +
                    ", pres_type='" + pres_type + '\'' +
                    ", pres_type_name='" + pres_type_name + '\'' +
                    ", effective_date='" + effective_date + '\'' +
                    ", expiry_date='" + expiry_date + '\'' +
                    ", use_date='" + use_date + '\'' +
                    ", refund_date='" + refund_date + '\'' +
                    ", pres_cate='" + pres_cate + '\'' +
                    ", bottom_message='" + bottom_message + '\'' +
                    ", take_drug_addr='" + take_drug_addr + '\'' +
                    ", purchase_way='" + purchase_way + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", mail_no='" + mail_no + '\'' +
                    ", bsp_order_no='" + bsp_order_no + '\'' +
                    '}';
        }

        public String getMail_no() {
            return mail_no;
        }

        public void setMail_no(String mail_no) {
            this.mail_no = mail_no;
        }

        public String getBsp_order_no() {
            return bsp_order_no;
        }

        public void setBsp_order_no(String bsp_order_no) {
            this.bsp_order_no = bsp_order_no;
        }


        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getPurchase_way() {
            return purchase_way;
        }

        public void setPurchase_way(String purchase_way) {
            this.purchase_way = purchase_way;
        }

        public String getPrescription_id() {
            return prescription_id;
        }

        public void setPrescription_id(String prescription_id) {
            this.prescription_id = prescription_id;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getPres_doctor_name() {
            return pres_doctor_name;
        }

        public void setPres_doctor_name(String pres_doctor_name) {
            this.pres_doctor_name = pres_doctor_name;
        }

        public String getPres_dept_name() {
            return pres_dept_name;
        }

        public void setPres_dept_name(String pres_dept_name) {
            this.pres_dept_name = pres_dept_name;
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

        public String getPres_type() {
            return pres_type;
        }

        public void setPres_type(String pres_type) {
            this.pres_type = pres_type;
        }

        public String getPres_type_name() {
            return pres_type_name;
        }

        public void setPres_type_name(String pres_type_name) {
            this.pres_type_name = pres_type_name;
        }

        public String getEffective_date() {
            return effective_date;
        }

        public void setEffective_date(String effective_date) {
            this.effective_date = effective_date;
        }

        public String getExpiry_date() {
            return expiry_date;
        }

        public void setExpiry_date(String expiry_date) {
            this.expiry_date = expiry_date;
        }

        public String getUse_date() {
            return use_date;
        }

        public void setUse_date(String use_date) {
            this.use_date = use_date;
        }

        public String getRefund_date() {
            return refund_date;
        }

        public void setRefund_date(String refund_date) {
            this.refund_date = refund_date;
        }

        public String getPres_cate() {
            return pres_cate;
        }

        public void setPres_cate(String pres_cate) {
            this.pres_cate = pres_cate;
        }

        public String getBottom_message() {
            return bottom_message;
        }

        public void setBottom_message(String bottom_message) {
            this.bottom_message = bottom_message;
        }

        public String getTake_drug_addr() {
            return take_drug_addr;
        }

        public void setTake_drug_addr(String take_drug_addr) {
            this.take_drug_addr = take_drug_addr;
        }
    }
}
