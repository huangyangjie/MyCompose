package com.example.mycompose.repository.entity;

public class AlternateRecordDetailEntity {


    public int code;
    public String message;
    public DataBean data;

    @Override
    public String toString() {
        return "AlternateRecordDetailEntity{" +
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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        public String createTime;
        public String id_apt;
        public String dept_name;
        public String dt_sch;
        public String name_dayslottp;
        public String patient_id;
        public String patient_name;
        public String code_pat;
        public String code_srv;
        public String dept_sn;
        public String id_num;
        public String doctor_name;
        public String cancel_time;
        public String cancel_reason;
        public String deadline;
        public String suc_time;
        public String op_place;
        public String fg_alternate;
        public String nm_alternate;
        public String pay_time;
        public String out_trade_no;
        public String pay_method;
        public String price;

        @Override
        public String toString() {
            return "DataBean{" +
                    "createTime='" + createTime + '\'' +
                    ", id_apt='" + id_apt + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", cancel_time='" + cancel_time + '\'' +
                    ", cancel_reason='" + cancel_reason + '\'' +
                    ", deadline='" + deadline + '\'' +
                    ", suc_time='" + suc_time + '\'' +
                    ", op_place='" + op_place + '\'' +
                    ", fg_alternate='" + fg_alternate + '\'' +
                    ", nm_alternate='" + nm_alternate + '\'' +
                    ", pay_time='" + pay_time + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }

        public String getCancel_reason() {
            return cancel_reason;
        }

        public void setCancel_reason(String cancel_reason) {
            this.cancel_reason = cancel_reason;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
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

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
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

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getCancel_time() {
            return cancel_time;
        }

        public void setCancel_time(String cancel_time) {
            this.cancel_time = cancel_time;
        }

        public String getDeadline() {
            return deadline;
        }

        public void setDeadline(String deadline) {
            this.deadline = deadline;
        }

        public String getSuc_time() {
            return suc_time;
        }

        public void setSuc_time(String suc_time) {
            this.suc_time = suc_time;
        }

        public String getOp_place() {
            return op_place;
        }

        public void setOp_place(String op_place) {
            this.op_place = op_place;
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

        public String getPay_time() {
            return pay_time;
        }

        public void setPay_time(String pay_time) {
            this.pay_time = pay_time;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
