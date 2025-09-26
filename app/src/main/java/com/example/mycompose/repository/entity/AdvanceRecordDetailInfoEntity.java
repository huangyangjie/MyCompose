package com.example.mycompose.repository.entity;

import java.util.List;

public class AdvanceRecordDetailInfoEntity {

    private Integer code;
    private String message;
    private DataBean data;

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
        private String record_id;
        private String registration_id;
        private String patient_id;
        private String code_pat;
        private String out_trade_no;
        private String trade_no;
        private String pay_time;
        private String pay_method;
        private String amount;
        private String status;
        private String status_name;
        private String brief_status;
        private String rd_out_trade_no;
        private String refund_time;
        private String rd_amount;



        private String platform;
        private String status_name_sub;
        private String fee;

        public String getStatus_name_sub() {
            return status_name_sub;
        }

        public void setStatus_name_sub(String status_name_sub) {
            this.status_name_sub = status_name_sub;
        }

        public String getFee() {
            return fee;
        }

        public void setFee(String fee) {
            this.fee = fee;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        private List<AppliRecordBean> appliRecord;

        public String getRecord_id() {
            return record_id;
        }

        public void setRecord_id(String record_id) {
            this.record_id = record_id;
        }

        public String getRegistration_id() {
            return registration_id;
        }

        public void setRegistration_id(String registration_id) {
            this.registration_id = registration_id;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getTrade_no() {
            return trade_no;
        }

        public void setTrade_no(String trade_no) {
            this.trade_no = trade_no;
        }

        public String getPay_time() {
            return pay_time;
        }

        public void setPay_time(String pay_time) {
            this.pay_time = pay_time;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
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

        public String getBrief_status() {
            return brief_status;
        }

        public void setBrief_status(String brief_status) {
            this.brief_status = brief_status;
        }

        public String getRd_out_trade_no() {
            return rd_out_trade_no;
        }

        public void setRd_out_trade_no(String rd_out_trade_no) {
            this.rd_out_trade_no = rd_out_trade_no;
        }

        public String getRefund_time() {
            return refund_time;
        }

        public void setRefund_time(String refund_time) {
            this.refund_time = refund_time;
        }

        public String getRd_amount() {
            return rd_amount;
        }

        public void setRd_amount(String rd_amount) {
            this.rd_amount = rd_amount;
        }

        public List<AppliRecordBean> getAppliRecord() {
            return appliRecord;
        }

        public void setAppliRecord(List<AppliRecordBean> appliRecord) {
            this.appliRecord = appliRecord;
        }

        public static class AppliRecordBean {
            private String appli_id;
            private String appli_time;
            private String appli_reason;
            private String audit_time;
            private String audit_refuse_reason;

            public String getAppli_id() {
                return appli_id;
            }

            public void setAppli_id(String appli_id) {
                this.appli_id = appli_id;
            }

            public String getAppli_time() {
                return appli_time;
            }

            public void setAppli_time(String appli_time) {
                this.appli_time = appli_time;
            }

            public String getAppli_reason() {
                return appli_reason;
            }

            public void setAppli_reason(String appli_reason) {
                this.appli_reason = appli_reason;
            }

            public String getAudit_time() {
                return audit_time;
            }

            public void setAudit_time(String audit_time) {
                this.audit_time = audit_time;
            }

            public String getAudit_refuse_reason() {
                return audit_refuse_reason;
            }

            public void setAudit_refuse_reason(String audit_refuse_reason) {
                this.audit_refuse_reason = audit_refuse_reason;
            }
        }
    }
}
