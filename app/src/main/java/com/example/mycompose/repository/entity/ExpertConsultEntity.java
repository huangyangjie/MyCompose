package com.example.mycompose.repository.entity;

import java.util.List;

public class ExpertConsultEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "ExpertConsultEntity{" +
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
        private String consultation_id;
        private String consultation_no;
        private String type;
        private String patient_name;
        private String code_pat;
        private String patient_id;
        private String doctor_name;
        private String doctor_title;
        private String doctor_avatar;
        private String doctor_sn;
        private String doctor_id;
        private String dept_name;
        private String dept_id;
        private String dept_sn;
        private String createTime;
        private String chat_id;
        private String user_im_account;
        private String doctor_im_account;
        private String deadline;
        private String status;
        private LastMessageBean lastMessage;
        private Integer unreadCount;
        private Integer evaluation_status;

        public void setEvaluation_status(Integer evaluation_status) {
            this.evaluation_status = evaluation_status;
        }

        public Integer getEvaluation_status() {
            return evaluation_status;
        }

        public String getDeadline() {
            return deadline;
        }

        public void setDeadline(String deadline) {
            this.deadline = deadline;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "consultation_id='" + consultation_id + '\'' +
                    ", consultation_no='" + consultation_no + '\'' +
                    ", type='" + type + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", doctor_title='" + doctor_title + '\'' +
                    ", doctor_avatar='" + doctor_avatar + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", dept_id='" + dept_id + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", chat_id='" + chat_id + '\'' +
                    ", user_im_account='" + user_im_account + '\'' +
                    ", doctor_im_account='" + doctor_im_account + '\'' +
                    ", deadline='" + deadline + '\'' +
                    ", status='" + status + '\'' +
                    ", lastMessage=" + lastMessage +
                    ", unreadCount=" + unreadCount +
                    ", evaluation_status=" + evaluation_status +
                    '}';
        }

        public String getConsultation_no() {
            return consultation_no;
        }

        public void setConsultation_no(String consultation_no) {
            this.consultation_no = consultation_no;
        }

        public String getConsultation_id() {
            return consultation_id;
        }

        public void setConsultation_id(String consultation_id) {
            this.consultation_id = consultation_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getDoctor_title() {
            return doctor_title;
        }

        public void setDoctor_title(String doctor_title) {
            this.doctor_title = doctor_title;
        }

        public String getDoctor_avatar() {
            return doctor_avatar;
        }

        public void setDoctor_avatar(String doctor_avatar) {
            this.doctor_avatar = doctor_avatar;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }


        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getChat_id() {
            return chat_id;
        }

        public void setChat_id(String chat_id) {
            this.chat_id = chat_id;
        }

        public String getUser_im_account() {
            return user_im_account;
        }

        public void setUser_im_account(String user_im_account) {
            this.user_im_account = user_im_account;
        }

        public String getDoctor_im_account() {
            return doctor_im_account;
        }

        public void setDoctor_im_account(String doctor_im_account) {
            this.doctor_im_account = doctor_im_account;
        }

        public LastMessageBean getLastMessage() {
            return lastMessage;
        }

        public void setLastMessage(LastMessageBean lastMessage) {
            this.lastMessage = lastMessage;
        }

        public Integer getUnreadCount() {
            return unreadCount;
        }

        public void setUnreadCount(Integer unreadCount) {
            this.unreadCount = unreadCount;
        }
        public void addUnreadCount() {
            unreadCount++;
        }


        public static class LastMessageBean {
            private String msg_uuid;
            private String msg_category;
            private String msg_scene;
            private String msg_pattern;
            private String pattern;
            private String msg_type;
            private String msg_key;
            private String msg_content;
            private String send_time;
            private String cloud_custom_data;
            private Integer msg_status;
            private Integer withdraw_flag;

            @Override
            public String toString() {
                return "LastMessageBean{" +
                        "msg_uuid='" + msg_uuid + '\'' +
                        ", msg_category='" + msg_category + '\'' +
                        ", msg_scene='" + msg_scene + '\'' +
                        ", msg_pattern='" + msg_pattern + '\'' +
                        ", pattern='" + pattern + '\'' +
                        ", msg_type='" + msg_type + '\'' +
                        ", msg_key='" + msg_key + '\'' +
                        ", msg_content='" + msg_content + '\'' +
                        ", send_time='" + send_time + '\'' +
                        ", cloud_custom_data='" + cloud_custom_data + '\'' +
                        ", msg_status=" + msg_status +
                        ", withdraw_flag=" + withdraw_flag +
                        '}';
            }

            public Integer getWithdraw_flag() {
                return withdraw_flag;
            }

            public void setWithdraw_flag(Integer withdraw_flag) {
                this.withdraw_flag = withdraw_flag;
            }

            public String getSend_time() {
                return send_time;
            }

            public void setSend_time(String send_time) {
                this.send_time = send_time;
            }

            public String getCloud_custom_data() {
                return cloud_custom_data;
            }

            public void setCloud_custom_data(String cloud_custom_data) {
                this.cloud_custom_data = cloud_custom_data;
            }

            public String getMsg_uuid() {
                return msg_uuid;
            }

            public void setMsg_uuid(String msg_uuid) {
                this.msg_uuid = msg_uuid;
            }

            public String getMsg_category() {
                return msg_category;
            }

            public void setMsg_category(String msg_category) {
                this.msg_category = msg_category;
            }

            public String getMsg_scene() {
                return msg_scene;
            }

            public void setMsg_scene(String msg_scene) {
                this.msg_scene = msg_scene;
            }

            public String getMsg_pattern() {
                return msg_pattern;
            }

            public void setMsg_pattern(String msg_pattern) {
                this.msg_pattern = msg_pattern;
            }

            public String getPattern() {
                return pattern;
            }

            public void setPattern(String pattern) {
                this.pattern = pattern;
            }

            public String getMsg_type() {
                return msg_type;
            }

            public void setMsg_type(String msg_type) {
                this.msg_type = msg_type;
            }

            public String getMsg_key() {
                return msg_key;
            }

            public void setMsg_key(String msg_key) {
                this.msg_key = msg_key;
            }

            public String getMsg_content() {
                return msg_content;
            }

            public void setMsg_content(String msg_content) {
                this.msg_content = msg_content;
            }

            public Integer getMsg_status() {
                return msg_status;
            }

            public void setMsg_status(Integer msg_status) {
                this.msg_status = msg_status;
            }
        }

    }

}
