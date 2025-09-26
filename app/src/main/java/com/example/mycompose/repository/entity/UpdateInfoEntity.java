package com.example.mycompose.repository.entity;

import android.text.TextUtils;

public class UpdateInfoEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "UpdateInfoEntity{" +
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
        private String id;
        private String createTime;
        private String updateTime;
        private String endpoint;
        private String terminal_type;
        private String version;
        private Integer force_update;
        private Integer is_alert_only;
        private String download_url;
        private String upgrade;
        private Integer is_alert_notice;
        private String is_national_memorial_day;
        private String notice_content;

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", updateTime='" + updateTime + '\'' +
                    ", endpoint='" + endpoint + '\'' +
                    ", terminal_type='" + terminal_type + '\'' +
                    ", version='" + version + '\'' +
                    ", force_update=" + force_update +
                    ", is_alert_only=" + is_alert_only +
                    ", download_url='" + download_url + '\'' +
                    ", upgrade='" + upgrade + '\'' +
                    ", is_alert_notice=" + is_alert_notice +
                    ", is_national_memorial_day=" + is_national_memorial_day +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getEndpoint() {
            return endpoint;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public String getTerminal_type() {
            return terminal_type;
        }

        public void setTerminal_type(String terminal_type) {
            this.terminal_type = terminal_type;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public boolean getForce_update() {
            try {
                if (force_update == 1) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void setForce_update(Integer force_update) {
            this.force_update = force_update;
        }

        public boolean getIs_alert_only() {
            try {
                if (is_alert_only == 1) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void setIs_alert_only(Integer is_alert_only) {
            this.is_alert_only = is_alert_only;
        }

        public String getDownload_url() {
            return download_url;
        }

        public void setDownload_url(String download_url) {
            this.download_url = download_url;
        }

        public String getUpgrade() {
            return upgrade;
        }

        public void setUpgrade(String upgrade) {
            this.upgrade = upgrade;
        }

        public boolean getIs_alert_notice() {
            try {
                if (is_alert_notice == 1) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void setIs_alert_notice(Integer is_alert_notice) {
            this.is_alert_notice = is_alert_notice;
        }

        public String getIs_national_memorial_day() {
            if (TextUtils.isEmpty(is_national_memorial_day)) {
                return "";
            } else {
                return is_national_memorial_day;
            }
        }

        public void setIs_national_memorial_day(String is_national_memorial_day) {
            this.is_national_memorial_day = is_national_memorial_day;
        }

        public String getNotice_content() {
            return notice_content;
        }

        public void setNotice_content(String notice_content) {
            this.notice_content = notice_content;
        }
    }
}
