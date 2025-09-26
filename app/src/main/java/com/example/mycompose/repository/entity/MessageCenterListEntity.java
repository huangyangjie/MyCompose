package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class MessageCenterListEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "MessageCenterListEntity{" +
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
        private Integer is_receive;
        private List<ListBean> list;

        @Override
        public String toString() {
            return "DataBean{" +
                    "is_receive=" + is_receive +
                    ", list=" + list +
                    '}';
        }

        public Integer getIs_receive() {
            return is_receive;
        }

        public void setIs_receive(Integer is_receive) {
            this.is_receive = is_receive;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String msg_name;
            private String msg_code;
            private String msg_type_uuid;
            private Integer is_receive;
            private ChildLastMsgBean childLastMsg;

            @Override
            public String toString() {
                return "ListBean{" +
                        "msg_name='" + msg_name + '\'' +
                        ", msg_code='" + msg_code + '\'' +
                        ", msg_type_uuid='" + msg_type_uuid + '\'' +
                        ", is_receive=" + is_receive +
                        ", childLastMsg=" + childLastMsg +
                        '}';
            }

            public String getMsg_name() {
                return msg_name;
            }

            public void setMsg_name(String msg_name) {
                this.msg_name = msg_name;
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

            public Integer getIs_receive() {
                return is_receive;
            }

            public void setIs_receive(Integer is_receive) {
                this.is_receive = is_receive;
            }

            public ChildLastMsgBean getChildLastMsg() {
                return childLastMsg;
            }

            public void setChildLastMsg(ChildLastMsgBean childLastMsg) {
                this.childLastMsg = childLastMsg;
            }

            public static class ChildLastMsgBean {
                private Integer unReadcount;
                private String msg_title;
                private String push_time;
                private String msg_info;
                private String day_of_week;

                @Override
                public String toString() {
                    return "ChildLastMsgBean{" +
                            "unReadcount=" + unReadcount +
                            ", msg_title='" + msg_title + '\'' +
                            ", push_time='" + push_time + '\'' +
                            ", msg_info='" + msg_info + '\'' +
                            ", day_of_week='" + day_of_week + '\'' +
                            '}';
                }

                public Integer getUnReadcount() {
                    return unReadcount;
                }

                public void setUnReadcount(Integer unReadcount) {
                    this.unReadcount = unReadcount;
                }

                public String getMsg_title() {
                    return msg_title;
                }

                public void setMsg_title(String msg_title) {
                    this.msg_title = msg_title;
                }

                public String getPush_time() {
                    if(TextUtils.isEmpty(push_time)){
                        return "";
                    }else{
                        return push_time;
                    }
                }

                public void setPush_time(String push_time) {
                    this.push_time = push_time;
                }

                public String getMsg_info() {
                    if(TextUtils.isEmpty(msg_info)){
                        return "";
                    }else{
                        return msg_info;
                    }
                }

                public void setMsg_info(String msg_info) {
                    this.msg_info = msg_info;
                }

                public String getDay_of_week() {
                    return day_of_week;
                }

                public void setDay_of_week(String day_of_week) {
                    this.day_of_week = day_of_week;
                }
            }
        }
    }
}
