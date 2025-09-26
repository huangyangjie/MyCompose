package com.example.mycompose.repository.entity;

import java.util.List;

public class AlternateStatusEntity {


    public int code;
    public String message;
    public List<DataBean> data;
    private String selectChannelName;
    private String selectChannelId;

    public void setDataChecked(int i) {
        changeStatus();
        data.get(i).setChecked(true);
        setSelectChannelId(data.get(i).getFg_alternate());
        setSelectChannelName(data.get(i).getNm_alternate());
    }
    public void changeStatus() {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).setChecked(false);
        }
    }


    @Override
    public String toString() {
        return "AlternateStatusEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", selectChannelName='" + selectChannelName + '\'' +
                ", selectChannelId='" + selectChannelId + '\'' +
                '}';
    }

    public String getSelectChannelName() {
        return selectChannelName;
    }

    public void setSelectChannelName(String selectChannelName) {
        this.selectChannelName = selectChannelName;
    }

    public String getSelectChannelId() {
        return selectChannelId;
    }

    public void setSelectChannelId(String selectChannelId) {
        this.selectChannelId = selectChannelId;
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
        @Override
        public String toString() {
            return "DataBean{" +
                    "fg_alternate='" + fg_alternate + '\'' +
                    ", nm_alternate='" + nm_alternate + '\'' +
                    '}';
        }

        public String fg_alternate;
        public String nm_alternate;
        private boolean isChecked = false;

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
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
