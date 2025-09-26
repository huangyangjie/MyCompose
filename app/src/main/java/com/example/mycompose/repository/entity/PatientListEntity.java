package com.example.mycompose.repository.entity;

import android.text.TextUtils;

import java.util.List;

public class PatientListEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    private String selectName;
    private String selectPid;
    private String selectPatientId;

    public String getSelectPatientId() {
        return selectPatientId;
    }

    public void setSelectPatientId(String selectPatientId) {
        this.selectPatientId = selectPatientId;
    }

    public String getSelectName() {
        return selectName;
    }

    public void setSelectName(String selectName) {
        this.selectName = selectName;
    }

    public String getSelectPid() {
        return selectPid;
    }

    public void setSelectPid(String selectPid) {
        this.selectPid = selectPid;
    }

    public void setDataChecked(int i) {
        changeStatus();
        data.get(i).setChecked(true);
        setSelectName(data.get(i).getName());
        setSelectPid(data.get(i).getCode_pat());
        setSelectPatientId(data.get(i).getPatient_id());
    }

    public void changeStatus() {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).setChecked(false);
        }
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

    @Override
    public String toString() {
        return "PatientListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static class DataBean {
        private String patient_id = "";
        private String code_pat = "";
        private String name = "";
        private String sex = "";
        private String id_num = "";
        private String id_type_name = "";
        private String id_type = "";
        private String is_auth = "";
        private String is_primary = "";
        private String code_card = "";
        private String pat_type = "";
        private String pat_type_name = "";
        private String age = "";
        private String phone = "";
        private String privacyStatus = "";
        private boolean isChecked = false;


        public Boolean isReal(){
//            is_auth: 数字1表示已实名，数字0表示未实名。
            return "1".equals(is_auth)?true:false;
        }
        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public String getId_type() {
            return id_type;
        }

        public void setId_type(String id_type) {
            this.id_type = id_type;
        }

        public String getPatient_id() {
            if (TextUtils.isEmpty(patient_id)) {
                return "";
            } else {
                return patient_id;
            }
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getCode_pat() {
            if (TextUtils.isEmpty(code_pat)) {
                return "";
            } else {
                return code_pat;
            }
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }
        public String getSexChinese() {
            return "1".equals(getSex())?"男":"女";
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getId_type_name() {
            return id_type_name;
        }

        public void setId_type_name(String id_type_name) {
            this.id_type_name = id_type_name;
        }

        public String getIs_auth() {
            return is_auth;
        }

        public void setIs_auth(String is_auth) {
            this.is_auth = is_auth;
        }

        public String getIs_primary() {
            return is_primary;
        }

        public void setIs_primary(String is_primary) {
            this.is_primary = is_primary;
        }

        public String getCode_card() {
            return code_card;
        }

        public void setCode_card(String code_card) {
            this.code_card = code_card;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getPat_type_name() {
            return pat_type_name;
        }

        public void setPat_type_name(String pat_type_name) {
            this.pat_type_name = pat_type_name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getPhone() {
            if (TextUtils.isEmpty(phone)) {
                return "";
            } else {
                return phone;
            }
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPrivacyStatus() {
            return privacyStatus;
        }

        public void setPrivacyStatus(String privacyStatus) {
            this.privacyStatus = privacyStatus;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "patient_id='" + patient_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", id_type_name='" + id_type_name + '\'' +
                    ", id_type='" + id_type + '\'' +
                    ", is_auth='" + is_auth + '\'' +
                    ", is_primary='" + is_primary + '\'' +
                    ", code_card='" + code_card + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    ", age='" + age + '\'' +
                    ", phone='" + phone + '\'' +
                    ", privacyStatus='" + privacyStatus + '\'' +
                    '}';
        }
    }
}
