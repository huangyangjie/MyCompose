package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

public class PresPayOrderEntity {
    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "SVPayOrderEntity{" +
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
        private String out_trade_no;
        private String union_order_info;
        private PayOrderInfoEntity.DataBean.zfbOrderInfoBean zfb_order_info;
        private PayOrderInfoEntity.DataBean.WxOrderInfoBean wx_order_info;

        public String getUnion_order_info() {
            return union_order_info;
        }

        public void setUnion_order_info(String union_order_info) {
            this.union_order_info = union_order_info;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "out_trade_no='" + out_trade_no + '\'' +
                    ", union_order_info='" + union_order_info + '\'' +
                    ", zfb_order_info=" + zfb_order_info +
                    ", wx_order_info=" + wx_order_info +
                    '}';
        }

        public void setZfb_order_info(PayOrderInfoEntity.DataBean.zfbOrderInfoBean zfb_order_info) {
            this.zfb_order_info = zfb_order_info;
        }

        public PayOrderInfoEntity.DataBean.zfbOrderInfoBean getZfb_order_info() {
            return zfb_order_info;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public PayOrderInfoEntity.DataBean.WxOrderInfoBean getWx_order_info() {
            return wx_order_info;
        }

        public void setWx_order_info(PayOrderInfoEntity.DataBean.WxOrderInfoBean wx_order_info) {
            this.wx_order_info = wx_order_info;
        }
    }
}
