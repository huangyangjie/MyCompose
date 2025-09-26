package com.example.mycompose.repository.entity;

import java.util.List;

public class AlternateListEntity {


    public int code;
    public String message;
    public List<DataBean> data;

    @Override
    public String toString() {
        return "AlternateListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        public String alternate_id;
        public String id_apt;
        public String dept_sn;
        public String code_pat;
        public String code_srv;
        public String id_sch;
        public String createTime;
        public String patient_id;
        public String doctor_name;
        public String dept_name;
        public String patient_name;
        public String dt_sch;
        public String name_dayslottp;
        public String pat_type;
        public String out_trade_no;
        public String price;
        public String fg_alternate;
        public String nm_alternate;
        public String suc_time;

        public String getSuc_time() {
            return suc_time;
        }

        public void setSuc_time(String suc_time) {
            this.suc_time = suc_time;
        }

        transient private String action;//操作动作

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "alternate_id='" + alternate_id + '\'' +
                    ", id_apt='" + id_apt + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", id_sch='" + id_sch + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", price='" + price + '\'' +
                    ", fg_alternate='" + fg_alternate + '\'' +
                    ", nm_alternate='" + nm_alternate + '\'' +
                    ", suc_time='" + suc_time + '\'' +
                    ", action='" + action + '\'' +
                    '}';
        }

        public String getAlternate_id() {
            return alternate_id;
        }

        public void setAlternate_id(String alternate_id) {
            this.alternate_id = alternate_id;
        }

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
        }

        public String getId_sch() {
            return id_sch;
        }

        public void setId_sch(String id_sch) {
            this.id_sch = id_sch;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
        }

        public String getName_dayslottp() {
            return name_dayslottp;
        }

        public void setName_dayslottp(String name_dayslottp) {
            this.name_dayslottp = name_dayslottp;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getFg_alternate() {
            return fg_alternate;
        }

        public void setFg_alternate(String fg_alternate) {
            this.fg_alternate = fg_alternate;
        }

        public String getNm_alternate() {
            return nm_alternate;
        }

        public void setNm_alternate(String nm_alternate) {
            this.nm_alternate = nm_alternate;
        }
    }
}
