package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class ChannelListEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;
    private String selectChannelName;
    private String selectChannelId;

    public void setDataChecked(int i) {
        changeStatus();
        data.get(i).setChecked(true);
        setSelectChannelId(data.get(i).getCode_chltp());
        setSelectChannelName(data.get(i).getChltp_name());
    }

    public String getSelectChannelName() {
        return TextUtils.isEmpty(selectChannelName) ? data.get(0).getChltp_name() : selectChannelName;
    }

    public void setSelectChannelName(String selectChannelName) {
        this.selectChannelName = selectChannelName;
    }

    public String getSelectChannelId() {
        return TextUtils.isEmpty(selectChannelId) ? data.get(0).getCode_chltp() : selectChannelId;
    }

    public void setSelectChannelId(String selectChannelId) {
        this.selectChannelId = selectChannelId;
    }

    public void changeStatus() {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).setChecked(false);
        }
    }

    @Override
    public String toString() {
        return "ChannelListEntity{" +
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
        private String code_chltp;
        private String chltp_name;
        private boolean isChecked = false;

        @Override
        public String toString() {
            return "DataBean{" +
                    "code_chltp='" + code_chltp + '\'' +
                    ", chltp_name='" + chltp_name + '\'' +
                    '}';
        }

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public String getCode_chltp() {
            return code_chltp;
        }

        public void setCode_chltp(String code_chltp) {
            this.code_chltp = code_chltp;
        }

        public String getChltp_name() {
            return chltp_name;
        }

        public void setChltp_name(String chltp_name) {
            this.chltp_name = chltp_name;
        }
    }
}
