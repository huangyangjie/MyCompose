package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

public class AlternatePayOrderInfoEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "PayOrderInfoEntity{" +
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
        private zfbOrderInfoBean zfb_order_info;
        private String union_order_info;
        private WxOrderInfoBean wx_order_info;

        public String getUnion_order_info() {
            return union_order_info;
        }

        public void setUnion_order_info(String union_order_info) {
            this.union_order_info = union_order_info;
        }


        public void setZfb_order_info(zfbOrderInfoBean zfb_order_info) {
            this.zfb_order_info = zfb_order_info;
        }

        public zfbOrderInfoBean getZfb_order_info() {
            return zfb_order_info;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "out_trade_no='" + out_trade_no + '\'' +
                    ", zfb_order_info=" + zfb_order_info +
                    ", union_order_info='" + union_order_info + '\'' +
                    ", wx_order_info=" + wx_order_info +
                    '}';
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public WxOrderInfoBean getWx_order_info() {
            return wx_order_info;
        }

        public void setWx_order_info(WxOrderInfoBean wx_order_info) {
            this.wx_order_info = wx_order_info;
        }

        public static class WxOrderInfoBean {
            private String miniuser;
            private String appid;
            private String partnerid;
            private String prepayid;
            private String noncestr;
            @SerializedName("package")
            private String packageX;
            private String timestamp;
            private String sign;
            private String minipath;

            public String getMiniuser() {
                return miniuser;
            }

            public void setMiniuser(String miniuser) {
                this.miniuser = miniuser;
            }

            public String getMinipath() {
                return minipath;
            }

            public void setMinipath(String minipath) {
                this.minipath = minipath;
            }

            public String getAppid() {
                return appid;
            }

            public void setAppid(String appid) {
                this.appid = appid;
            }

            public String getNoncestr() {
                return noncestr;
            }

            public void setNoncestr(String noncestr) {
                this.noncestr = noncestr;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public String getPartnerid() {
                return partnerid;
            }

            public void setPartnerid(String partnerid) {
                this.partnerid = partnerid;
            }

            public String getPrepayid() {
                return prepayid;
            }

            public void setPrepayid(String prepayid) {
                this.prepayid = prepayid;
            }


            public String getPackageX() {
                return packageX;
            }

            public void setPackageX(String packageX) {
                this.packageX = packageX;
            }

            public String getSign() {
                return sign;
            }

            public void setSign(String sign) {
                this.sign = sign;
            }

            @Override
            public String toString() {
                return "WxOrderInfoBean{" +
                        "miniuser='" + miniuser + '\'' +
                        ", appid='" + appid + '\'' +
                        ", partnerid='" + partnerid + '\'' +
                        ", prepayid='" + prepayid + '\'' +
                        ", noncestr='" + noncestr + '\'' +
                        ", packageX='" + packageX + '\'' +
                        ", timestamp='" + timestamp + '\'' +
                        ", sign='" + sign + '\'' +
                        ", minipath='" + minipath + '\'' +
                        '}';
            }
        }

        public static class zfbOrderInfoBean {
            private String miniuser;
            private String appid;
            private String msgType;
            @SerializedName("package")
            private String packageX;
            private String minipath;
            private String appScheme;
            private String sign;
            private String prepayid;
            private String noncestr;
            private String timestamp;
            private String partnerid;

            public String getAppid() {
                return appid;
            }

            public void setAppid(String appid) {
                this.appid = appid;
            }

            public String getPartnerid() {
                return partnerid;
            }

            public void setPartnerid(String partnerid) {
                this.partnerid = partnerid;
            }

            public String getMiniuser() {
                return miniuser;
            }

            public void setMiniuser(String miniuser) {
                this.miniuser = miniuser;
            }

            public String getMsgType() {
                return msgType;
            }

            public void setMsgType(String msgType) {
                this.msgType = msgType;
            }

            public String getPackageX() {
                return packageX;
            }

            public void setPackageX(String packageX) {
                this.packageX = packageX;
            }

            public String getMinipath() {
                return minipath;
            }

            public void setMinipath(String minipath) {
                this.minipath = minipath;
            }

            public String getAppScheme() {
                return appScheme;
            }

            public void setAppScheme(String appScheme) {
                this.appScheme = appScheme;
            }

            public String getSign() {
                return sign;
            }

            public void setSign(String sign) {
                this.sign = sign;
            }

            public String getPrepayid() {
                return prepayid;
            }

            public void setPrepayid(String prepayid) {
                this.prepayid = prepayid;
            }

            public String getNoncestr() {
                return noncestr;
            }

            public void setNoncestr(String noncestr) {
                this.noncestr = noncestr;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            @Override
            public String toString() {
                return "zfbOrderInfoBean{" +
                        "miniuser='" + miniuser + '\'' +
                        ", appid='" + appid + '\'' +
                        ", msgType='" + msgType + '\'' +
                        ", packageX='" + packageX + '\'' +
                        ", minipath='" + minipath + '\'' +
                        ", appScheme='" + appScheme + '\'' +
                        ", sign='" + sign + '\'' +
                        ", prepayid='" + prepayid + '\'' +
                        ", noncestr='" + noncestr + '\'' +
                        ", timestamp='" + timestamp + '\'' +
                        ", partnerid='" + partnerid + '\'' +
                        '}';
            }
        }

    }

}

