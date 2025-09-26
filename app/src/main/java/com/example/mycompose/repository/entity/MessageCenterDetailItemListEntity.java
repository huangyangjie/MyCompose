package com.example.mycompose.repository.entity;

import java.util.List;

public class MessageCenterDetailItemListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "MessageCenterDetailItemListEntity{" +
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
        try {
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String msg_uuid;
        private String msg_code;
        private String msg_type_uuid;
        private String push_time;
        private String msg_title;
        private String msg_info;
        private MsgBodyBean msg_body;
        private Integer is_click;

        @Override
        public String toString() {
            return "DataBean{" +
                    "msg_uuid='" + msg_uuid + '\'' +
                    ", msg_code='" + msg_code + '\'' +
                    ", msg_type_uuid='" + msg_type_uuid + '\'' +
                    ", push_time='" + push_time + '\'' +
                    ", msg_title='" + msg_title + '\'' +
                    ", msg_info='" + msg_info + '\'' +
                    ", msg_body=" + msg_body +
                    ", is_click=" + is_click +
                    '}';
        }

        public String getMsg_uuid() {
            return msg_uuid;
        }

        public void setMsg_uuid(String msg_uuid) {
            this.msg_uuid = msg_uuid;
        }

        public String getMsg_code() {
            return msg_code;
        }

        public void setMsg_code(String msg_code) {
            this.msg_code = msg_code;
        }

        public String getMsg_type_uuid() {
            return msg_type_uuid;
        }

        public void setMsg_type_uuid(String msg_type_uuid) {
            this.msg_type_uuid = msg_type_uuid;
        }

        public String getPush_time() {
            return push_time;
        }

        public void setPush_time(String push_time) {
            this.push_time = push_time;
        }

        public String getMsg_title() {
            return msg_title;
        }

        public void setMsg_title(String msg_title) {
            this.msg_title = msg_title;
        }

        public String getMsg_info() {
            return msg_info;
        }

        public void setMsg_info(String msg_info) {
            this.msg_info = msg_info;
        }

        public MsgBodyBean getMsg_body() {
            return msg_body;
        }

        public void setMsg_body(MsgBodyBean msg_body) {
            this.msg_body = msg_body;
        }

        public Integer getIs_click() {
            return is_click;
        }

        public void setIs_click(Integer is_click) {
            this.is_click = is_click;
        }

        public static class MsgBodyBean {
            private String id;
            private String dt_sch;
            private String id_apt;
            private String name_srv;
            private String name_srvtp;
            private String op_place;
            private String dept_name;
            private String next_step;
            private String doctor_name;
            private String execut_dept_name;
            private String amount;
            private String patient_name;
            private String doctor_id;
            private String location;
            private String trade_no;
            private String pay_method;
            private String code_pat;
            private String patient_id;
            private String rd_appli_time;
            private String amt_deposit;
            private String registration_id;
            private String effective_date;
            private String pay_time;
            private String doctor_avatar;
            private String doctor_title;
            private String cancel_rd_appli_time;
            private String consult_time;
            private String consultation_id;
            private String consultation_no;
            private String pay_type;
            private String take_drug_addr;
            private String prescription_id;
            private Integer evaluation_status;
            private String feedback_no;
            public String name;
            public String report_date;
            public String report_name;
            public String labrepname;
            public String report_time;
            public String visit_dept_name;
            public String visit_doctor_name;
            public String critical_value_test_item_name;
            public String ward_name;
            public String discharge_time;
            public String reserve_exam_date;
            public String sourceno;
            public String status_flag;
            public String surgery_oper_name;
            public String surgery_date;
            public String mail_no;
            public String bsp_order_no;
            public String inhosp_ward_name;
            public String admit_zyz_date_time;
            public String pb_date;
            public String bed_no;
            public String pb_time;

            @Override
            public String toString() {
                return "MsgBodyBean{" +
                        "id='" + id + '\'' +
                        ", dt_sch='" + dt_sch + '\'' +
                        ", id_apt='" + id_apt + '\'' +
                        ", name_srv='" + name_srv + '\'' +
                        ", name_srvtp='" + name_srvtp + '\'' +
                        ", op_place='" + op_place + '\'' +
                        ", dept_name='" + dept_name + '\'' +
                        ", next_step='" + next_step + '\'' +
                        ", doctor_name='" + doctor_name + '\'' +
                        ", execut_dept_name='" + execut_dept_name + '\'' +
                        ", amount='" + amount + '\'' +
                        ", patient_name='" + patient_name + '\'' +
                        ", doctor_id='" + doctor_id + '\'' +
                        ", location='" + location + '\'' +
                        ", trade_no='" + trade_no + '\'' +
                        ", pay_method='" + pay_method + '\'' +
                        ", code_pat='" + code_pat + '\'' +
                        ", patient_id='" + patient_id + '\'' +
                        ", rd_appli_time='" + rd_appli_time + '\'' +
                        ", amt_deposit='" + amt_deposit + '\'' +
                        ", registration_id='" + registration_id + '\'' +
                        ", effective_date='" + effective_date + '\'' +
                        ", pay_time='" + pay_time + '\'' +
                        ", doctor_avatar='" + doctor_avatar + '\'' +
                        ", doctor_title='" + doctor_title + '\'' +
                        ", cancel_rd_appli_time='" + cancel_rd_appli_time + '\'' +
                        ", consult_time='" + consult_time + '\'' +
                        ", consultation_id='" + consultation_id + '\'' +
                        ", consultation_no='" + consultation_no + '\'' +
                        ", pay_type='" + pay_type + '\'' +
                        ", take_drug_addr='" + take_drug_addr + '\'' +
                        ", prescription_id='" + prescription_id + '\'' +
                        ", evaluation_status=" + evaluation_status +
                        ", feedback_no='" + feedback_no + '\'' +
                        ", name='" + name + '\'' +
                        ", report_date='" + report_date + '\'' +
                        ", report_name='" + report_name + '\'' +
                        ", labrepname='" + labrepname + '\'' +
                        ", report_time='" + report_time + '\'' +
                        ", visit_dept_name='" + visit_dept_name + '\'' +
                        ", visit_doctor_name='" + visit_doctor_name + '\'' +
                        ", critical_value_test_item_name='" + critical_value_test_item_name + '\'' +
                        ", ward_name='" + ward_name + '\'' +
                        ", discharge_time='" + discharge_time + '\'' +
                        ", reserve_exam_date='" + reserve_exam_date + '\'' +
                        ", sourceno='" + sourceno + '\'' +
                        ", status_flag='" + status_flag + '\'' +
                        ", surgery_oper_name='" + surgery_oper_name + '\'' +
                        ", surgery_date='" + surgery_date + '\'' +
                        ", mail_no='" + mail_no + '\'' +
                        ", bsp_order_no='" + bsp_order_no + '\'' +
                        ", inhosp_ward_name='" + inhosp_ward_name + '\'' +
                        ", admit_zyz_date_time='" + admit_zyz_date_time + '\'' +
                        ", pb_date='" + pb_date + '\'' +
                        ", bed_no='" + bed_no + '\'' +
                        ", pb_time='" + pb_time + '\'' +
                        '}';
            }

            public String getName_srvtp() {
                return name_srvtp;
            }

            public void setName_srvtp(String name_srvtp) {
                this.name_srvtp = name_srvtp;
            }

            public String getPb_date() {
                return pb_date;
            }

            public void setPb_date(String pb_date) {
                this.pb_date = pb_date;
            }

            public String getBed_no() {
                return bed_no;
            }

            public void setBed_no(String bed_no) {
                this.bed_no = bed_no;
            }

            public String getPb_time() {
                return pb_time;
            }

            public void setPb_time(String pb_time) {
                this.pb_time = pb_time;
            }

            public String getInhosp_ward_name() {
                return inhosp_ward_name;
            }

            public void setInhosp_ward_name(String inhosp_ward_name) {
                this.inhosp_ward_name = inhosp_ward_name;
            }

            public String getAdmit_zyz_date_time() {
                return admit_zyz_date_time;
            }

            public void setAdmit_zyz_date_time(String admit_zyz_date_time) {
                this.admit_zyz_date_time = admit_zyz_date_time;
            }

            public String getMail_no() {
                return mail_no;
            }

            public MsgBodyBean setMail_no(String mail_no) {
                this.mail_no = mail_no;
                return this;
            }

            public String getBsp_order_no() {
                return bsp_order_no;
            }

            public MsgBodyBean setBsp_order_no(String bsp_order_no) {
                this.bsp_order_no = bsp_order_no;
                return this;
            }

            public String getExecut_dept_name() {
                return execut_dept_name;
            }

            public void setExecut_dept_name(String execut_dept_name) {
                this.execut_dept_name = execut_dept_name;
            }

            public String getSourceno() {
                return sourceno;
            }

            public void setSourceno(String sourceno) {
                this.sourceno = sourceno;
            }

            public String getSurgery_oper_name() {
                return surgery_oper_name;
            }

            public void setSurgery_oper_name(String surgery_oper_name) {
                this.surgery_oper_name = surgery_oper_name;
            }

            public String getSurgery_date() {
                return surgery_date;
            }

            public void setSurgery_date(String surgery_date) {
                this.surgery_date = surgery_date;
            }

            public String getReserve_exam_date() {
                return reserve_exam_date;
            }

            public void setReserve_exam_date(String reserve_exam_date) {
                this.reserve_exam_date = reserve_exam_date;
            }

            public String getStatus_flag() {
                return status_flag;
            }

            public void setStatus_flag(String status_flag) {
                this.status_flag = status_flag;
            }

            public String getWard_name() {
                return ward_name;
            }

            public void setWard_name(String ward_name) {
                this.ward_name = ward_name;
            }

            public String getDischarge_time() {
                return discharge_time;
            }

            public void setDischarge_time(String discharge_time) {
                this.discharge_time = discharge_time;
            }

            public String getCritical_value_test_item_name() {
                return critical_value_test_item_name;
            }

            public void setCritical_value_test_item_name(String critical_value_test_item_name) {
                this.critical_value_test_item_name = critical_value_test_item_name;
            }

            public String getVisit_dept_name() {
                return visit_dept_name;
            }

            public void setVisit_dept_name(String visit_dept_name) {
                this.visit_dept_name = visit_dept_name;
            }

            public String getVisit_doctor_name() {
                return visit_doctor_name;
            }

            public void setVisit_doctor_name(String visit_doctor_name) {
                this.visit_doctor_name = visit_doctor_name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getReport_date() {
                return report_date;
            }

            public void setReport_date(String report_date) {
                this.report_date = report_date;
            }

            public String getReport_name() {
                return report_name;
            }

            public void setReport_name(String report_name) {
                this.report_name = report_name;
            }

            public String getReport_time() {
                return report_time;
            }

            public void setReport_time(String report_time) {
                this.report_time = report_time;
            }

            public void setFeedback_no(String feedback_no) {
                this.feedback_no = feedback_no;
            }

            public String getFeedback_no() {
                return feedback_no;
            }

            public String getLabrepname() {
                return labrepname;
            }

            public void setLabrepname(String labrepname) {
                this.labrepname = labrepname;
            }

            public String getCode_pat() {
                return code_pat;
            }

            public void setCode_pat(String code_pat) {
                this.code_pat = code_pat;
            }

            public String getTake_drug_addr() {
                return take_drug_addr;
            }

            public void setTake_drug_addr(String take_drug_addr) {
                this.take_drug_addr = take_drug_addr;
            }

            public String getDoctor_avatar() {
                return doctor_avatar;
            }

            public void setDoctor_avatar(String doctor_avatar) {
                this.doctor_avatar = doctor_avatar;
            }

            public String getDoctor_title() {
                return doctor_title;
            }

            public void setDoctor_title(String doctor_title) {
                this.doctor_title = doctor_title;
            }

            public String getPrescription_id() {
                return prescription_id;
            }

            public void setPrescription_id(String prescription_id) {
                this.prescription_id = prescription_id;
            }

            public String getPay_type() {
                return pay_type;
            }

            public void setPay_type(String pay_type) {
                this.pay_type = pay_type;
            }

            public String getDoctor_id() {
                return doctor_id;
            }

            public void setDoctor_id(String doctor_id) {
                this.doctor_id = doctor_id;
            }

            public String getPatient_id() {
                return patient_id;
            }

            public void setPatient_id(String patient_id) {
                this.patient_id = patient_id;
            }

            public String getConsult_time() {
                return consult_time;
            }

            public void setConsult_time(String consult_time) {
                this.consult_time = consult_time;
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

            public Integer getEvaluation_status() {
                return evaluation_status;
            }

            public void setEvaluation_status(Integer evaluation_status) {
                this.evaluation_status = evaluation_status;
            }

            public String getEffective_date() {
                return effective_date;
            }

            public void setEffective_date(String effective_date) {
                this.effective_date = effective_date;
            }

            public String getTrade_no() {
                return trade_no;
            }

            public void setTrade_no(String trade_no) {
                this.trade_no = trade_no;
            }

            public String getPay_method() {
                return pay_method;
            }

            public void setPay_method(String pay_method) {
                this.pay_method = pay_method;
            }

            public String getRd_appli_time() {
                return rd_appli_time;
            }

            public void setRd_appli_time(String rd_appli_time) {
                this.rd_appli_time = rd_appli_time;
            }

            public String getAmt_deposit() {
                return amt_deposit;
            }

            public void setAmt_deposit(String amt_deposit) {
                this.amt_deposit = amt_deposit;
            }

            public String getRegistration_id() {
                return registration_id;
            }

            public void setRegistration_id(String registration_id) {
                this.registration_id = registration_id;
            }

            public String getPay_time() {
                return pay_time;
            }

            public void setPay_time(String pay_time) {
                this.pay_time = pay_time;
            }

            public String getCancel_rd_appli_time() {
                return cancel_rd_appli_time;
            }

            public void setCancel_rd_appli_time(String cancel_rd_appli_time) {
                this.cancel_rd_appli_time = cancel_rd_appli_time;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDt_sch() {
                return dt_sch;
            }

            public void setDt_sch(String dt_sch) {
                this.dt_sch = dt_sch;
            }

            public String getId_apt() {
                return id_apt;
            }

            public void setId_apt(String id_apt) {
                this.id_apt = id_apt;
            }

            public String getName_srv() {
                return name_srv;
            }

            public void setName_srv(String name_srv) {
                this.name_srv = name_srv;
            }

            public String getOp_place() {
                return op_place;
            }

            public void setOp_place(String op_place) {
                this.op_place = op_place;
            }

            public String getDept_name() {
                return dept_name;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public void setDept_name(String dept_name) {
                this.dept_name = dept_name;
            }

            public String getNext_step() {
                return next_step;
            }

            public void setNext_step(String next_step) {
                this.next_step = next_step;
            }

            public String getDoctor_name() {
                return doctor_name;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public void setDoctor_name(String doctor_name) {
                this.doctor_name = doctor_name;
            }

            public String getPatient_name() {
                return patient_name;
            }

            public void setPatient_name(String patient_name) {
                this.patient_name = patient_name;
            }
        }
    }
}



