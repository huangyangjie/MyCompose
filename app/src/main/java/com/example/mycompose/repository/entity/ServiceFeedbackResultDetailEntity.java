package com.example.mycompose.repository.entity;

import java.util.List;

public class ServiceFeedbackResultDetailEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "ServiceFeedbackResultDetailEntity{" +
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
        private String feedback_no;
        private String consultation_id;
        private String status;
        private String status_name;
        private String pay_fee;
        private String doctor_id;
        private String doctor_name;
        private String patient_id;
        private String patient_name;
        private String feedback_time;
        private String fk_desc;
        private String reason;
        private String brief_status_name;
        private List<String> desc_imgs;
        private String out_trade_no;
        private String consul_s_time;
        private String consul_e_time;
        private String refund_time;
        private String rd_out_trade_no;
        private String chat_id;
        private String doctor_im_account;
        private List<FlowListBean> flowList;

        @Override
        public String toString() {
            return "DataBean{" +
                    "feedback_no='" + feedback_no + '\'' +
                    ", consultation_id='" + consultation_id + '\'' +
                    ", status='" + status + '\'' +
                    ", status_name='" + status_name + '\'' +
                    ", pay_fee='" + pay_fee + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", feedback_time='" + feedback_time + '\'' +
                    ", fk_desc='" + fk_desc + '\'' +
                    ", reason='" + reason + '\'' +
                    ", brief_status_name='" + brief_status_name + '\'' +
                    ", desc_imgs=" + desc_imgs +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", consul_s_time='" + consul_s_time + '\'' +
                    ", consul_e_time='" + consul_e_time + '\'' +
                    ", refund_time='" + refund_time + '\'' +
                    ", rd_out_trade_no='" + rd_out_trade_no + '\'' +
                    ", chat_id='" + chat_id + '\'' +
                    ", doctor_im_account='" + doctor_im_account + '\'' +
                    ", flowList=" + flowList +
                    '}';
        }

        public String getFeedback_no() {
            return feedback_no;
        }

        public void setFeedback_no(String feedback_no) {
            this.feedback_no = feedback_no;
        }

        public String getConsultation_id() {
            return consultation_id;
        }

        public void setConsultation_id(String consultation_id) {
            this.consultation_id = consultation_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        public String getPay_fee() {
            return pay_fee;
        }

        public void setPay_fee(String pay_fee) {
            this.pay_fee = pay_fee;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
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

        public String getFeedback_time() {
            return feedback_time;
        }

        public void setFeedback_time(String feedback_time) {
            this.feedback_time = feedback_time;
        }

        public String getFk_desc() {
            return fk_desc;
        }

        public void setFk_desc(String fk_desc) {
            this.fk_desc = fk_desc;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getBrief_status_name() {
            return brief_status_name;
        }

        public void setBrief_status_name(String brief_status_name) {
            this.brief_status_name = brief_status_name;
        }

        public List<String> getDesc_imgs() {
            return desc_imgs;
        }

        public void setDesc_imgs(List<String> desc_imgs) {
            this.desc_imgs = desc_imgs;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getConsul_s_time() {
            return consul_s_time;
        }

        public void setConsul_s_time(String consul_s_time) {
            this.consul_s_time = consul_s_time;
        }

        public String getConsul_e_time() {
            return consul_e_time;
        }

        public void setConsul_e_time(String consul_e_time) {
            this.consul_e_time = consul_e_time;
        }

        public String getRefund_time() {
            return refund_time;
        }

        public void setRefund_time(String refund_time) {
            this.refund_time = refund_time;
        }

        public String getRd_out_trade_no() {
            return rd_out_trade_no;
        }

        public void setRd_out_trade_no(String rd_out_trade_no) {
            this.rd_out_trade_no = rd_out_trade_no;
        }

        public String getChat_id() {
            return chat_id;
        }

        public void setChat_id(String chat_id) {
            this.chat_id = chat_id;
        }

        public String getDoctor_im_account() {
            return doctor_im_account;
        }

        public void setDoctor_im_account(String doctor_im_account) {
            this.doctor_im_account = doctor_im_account;
        }

        public List<FlowListBean> getFlowList() {
            return flowList;
        }

        public void setFlowList(List<FlowListBean> flowList) {
            this.flowList = flowList;
        }

        public static class FlowListBean {
            private String node;
            private String surname;
            private String display_content;
            private String reject_reason;
            private String flow_time;

            public String getNode() {
                return node;
            }

            public void setNode(String node) {
                this.node = node;
            }

            public String getSurname() {
                return surname;
            }

            public void setSurname(String surname) {
                this.surname = surname;
            }

            public String getDisplay_content() {
                return display_content;
            }

            public void setDisplay_content(String display_content) {
                this.display_content = display_content;
            }

            public String getReject_reason() {
                return reject_reason;
            }

            public void setReject_reason(String reject_reason) {
                this.reject_reason = reject_reason;
            }

            public String getFlow_time() {
                return flow_time;
            }

            public void setFlow_time(String flow_time) {
                this.flow_time = flow_time;
            }
        }
    }
}
