package com.example.mycompose.repository.entity;

import java.util.List;

public class LogisticsInfoEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "LogisticsInfoEntity{" +
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
        private String mailno;
        private String accept_address;
        private String accept_date;
        private String remark;
        private String opcode;
        private String accept_time;
        private String accept_totaltime;

        @Override
        public String toString() {
            return "DataBean{" +
                    "mailno='" + mailno + '\'' +
                    ", accept_address='" + accept_address + '\'' +
                    ", accept_date='" + accept_date + '\'' +
                    ", remark='" + remark + '\'' +
                    ", opcode='" + opcode + '\'' +
                    ", accept_time='" + accept_time + '\'' +
                    ", accept_totaltime='" + accept_totaltime + '\'' +
                    '}';
        }

        public String getMailno() {
            return mailno;
        }

        public void setMailno(String mailno) {
            this.mailno = mailno;
        }

        public String getAccept_address() {
            return accept_address;
        }

        public void setAccept_address(String accept_address) {
            this.accept_address = accept_address;
        }

        public String getAccept_date() {
            return accept_date;
        }

        public void setAccept_date(String accept_date) {
            this.accept_date = accept_date;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getOpcode() {
            return opcode;
        }

        public void setOpcode(String opcode) {
            this.opcode = opcode;
        }

        public String getAccept_time() {
            return accept_time;
        }

        public void setAccept_time(String accept_time) {
            this.accept_time = accept_time;
        }

        public String getAccept_totaltime() {
            return accept_totaltime;
        }

        public void setAccept_totaltime(String accept_totaltime) {
            this.accept_totaltime = accept_totaltime;
        }
    }
}
