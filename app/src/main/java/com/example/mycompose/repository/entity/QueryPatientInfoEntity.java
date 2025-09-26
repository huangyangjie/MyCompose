package com.example.mycompose.repository.entity;

public class QueryPatientInfoEntity {


    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "QueryPatientInfoEntity{" +
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
        private String id_type;
        private String id_type_name;
        private String id_num;
        private String phone;
        private String id_pat;
        private String code_pat;
        private String code_card;
        private String code_hp;
        private String name;
        private String sex;
        private String birthday;
        private String work_unit;
        private String nation_code;
        private String nation_name;
        private String country_code;
        private String country_name;
        private String code_homearea;
        private String addr_home;
        private String code_nowarea;
        private String nowarea_name;
        private String addr_now;
        private String name_patcont;
        private String tel_patcont;
        private String pat_type;
        private String pat_type_name;

        public String getId_type() {
            return id_type;
        }

        public void setId_type(String id_type) {
            this.id_type = id_type;
        }

        public String getId_type_name() {
            return id_type_name;
        }

        public void setId_type_name(String id_type_name) {
            this.id_type_name = id_type_name;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getId_pat() {
            return id_pat;
        }

        public void setId_pat(String id_pat) {
            this.id_pat = id_pat;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getCode_card() {
            return code_card;
        }

        public void setCode_card(String code_card) {
            this.code_card = code_card;
        }

        public String getCode_hp() {
            return code_hp;
        }

        public void setCode_hp(String code_hp) {
            this.code_hp = code_hp;
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

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getWork_unit() {
            return work_unit;
        }

        public void setWork_unit(String work_unit) {
            this.work_unit = work_unit;
        }

        public String getNation_code() {
            return nation_code;
        }

        public void setNation_code(String nation_code) {
            this.nation_code = nation_code;
        }

        public String getNation_name() {
            return nation_name;
        }

        public void setNation_name(String nation_name) {
            this.nation_name = nation_name;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public String getCode_homearea() {
            return code_homearea;
        }

        public void setCode_homearea(String code_homearea) {
            this.code_homearea = code_homearea;
        }

        public String getAddr_home() {
            return addr_home;
        }

        public void setAddr_home(String addr_home) {
            this.addr_home = addr_home;
        }

        public String getCode_nowarea() {
            return code_nowarea;
        }

        public void setCode_nowarea(String code_nowarea) {
            this.code_nowarea = code_nowarea;
        }

        public String getNowarea_name() {
            return nowarea_name;
        }

        public void setNowarea_name(String nowarea_name) {
            this.nowarea_name = nowarea_name;
        }

        public String getAddr_now() {
            return addr_now;
        }

        public void setAddr_now(String addr_now) {
            this.addr_now = addr_now;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id_type='" + id_type + '\'' +
                    ", id_type_name='" + id_type_name + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", phone='" + phone + '\'' +
                    ", id_pat='" + id_pat + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", code_card='" + code_card + '\'' +
                    ", code_hp='" + code_hp + '\'' +
                    ", name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", work_unit='" + work_unit + '\'' +
                    ", nation_code='" + nation_code + '\'' +
                    ", nation_name='" + nation_name + '\'' +
                    ", country_code='" + country_code + '\'' +
                    ", country_name='" + country_name + '\'' +
                    ", code_homearea='" + code_homearea + '\'' +
                    ", addr_home='" + addr_home + '\'' +
                    ", code_nowarea='" + code_nowarea + '\'' +
                    ", nowarea_name='" + nowarea_name + '\'' +
                    ", addr_now='" + addr_now + '\'' +
                    ", name_patcont='" + name_patcont + '\'' +
                    ", tel_patcont='" + tel_patcont + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", pat_type_name='" + pat_type_name + '\'' +
                    '}';
        }

        public String getName_patcont() {
            return name_patcont;
        }

        public void setName_patcont(String name_patcont) {
            this.name_patcont = name_patcont;
        }

        public String getTel_patcont() {
            return tel_patcont;
        }

        public void setTel_patcont(String tel_patcont) {
            this.tel_patcont = tel_patcont;
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
    }
}
