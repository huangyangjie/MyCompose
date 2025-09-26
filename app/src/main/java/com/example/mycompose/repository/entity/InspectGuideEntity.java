package com.example.mycompose.repository.entity;

import java.util.List;

public class InspectGuideEntity {


    private int code;
    private String message;
    private DataDTO data;

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

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        private String test_id;
        private String code_pat;
        private String pat_name;
        private String pat_sex;
        private String pat_age;
        private String pat_id_num;
        private String dept_name;
        private String appl_date;
        private String doctor_name;
        private String major_said;
        private String primary_diagnosis;
        private String minor_diagnosis;
        private String sign_img;
        private List<TestItemsDTO> test_items;

        public String getTest_id() {
            return test_id;
        }

        public void setTest_id(String test_id) {
            this.test_id = test_id;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPat_name() {
            return pat_name;
        }

        public void setPat_name(String pat_name) {
            this.pat_name = pat_name;
        }

        public String getPat_sex() {
            return pat_sex;
        }

        public void setPat_sex(String pat_sex) {
            this.pat_sex = pat_sex;
        }

        public String getPat_age() {
            return pat_age;
        }

        public void setPat_age(String pat_age) {
            this.pat_age = pat_age;
        }

        public String getPat_id_num() {
            return pat_id_num;
        }

        public void setPat_id_num(String pat_id_num) {
            this.pat_id_num = pat_id_num;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getAppl_date() {
            return appl_date;
        }

        public void setAppl_date(String appl_date) {
            this.appl_date = appl_date;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getMajor_said() {
            return major_said;
        }

        public void setMajor_said(String major_said) {
            this.major_said = major_said;
        }

        public String getPrimary_diagnosis() {
            return primary_diagnosis;
        }

        public void setPrimary_diagnosis(String primary_diagnosis) {
            this.primary_diagnosis = primary_diagnosis;
        }

        public String getMinor_diagnosis() {
            return minor_diagnosis;
        }

        public void setMinor_diagnosis(String minor_diagnosis) {
            this.minor_diagnosis = minor_diagnosis;
        }

        public String getSign_img() {
            return sign_img;
        }

        public void setSign_img(String sign_img) {
            this.sign_img = sign_img;
        }

        public List<TestItemsDTO> getTest_items() {
            return test_items;
        }

        public void setTest_items(List<TestItemsDTO> test_items) {
            this.test_items = test_items;
        }

        public static class TestItemsDTO {
            private String name_srvtp;
            private String name_srv;
            private String name_dep_mp;
            private String name_sampt;

            public String getName_srvtp() {
                return name_srvtp;
            }

            public void setName_srvtp(String name_srvtp) {
                this.name_srvtp = name_srvtp;
            }

            public String getName_srv() {
                return name_srv;
            }

            public void setName_srv(String name_srv) {
                this.name_srv = name_srv;
            }

            public String getName_dep_mp() {
                return name_dep_mp;
            }

            public void setName_dep_mp(String name_dep_mp) {
                this.name_dep_mp = name_dep_mp;
            }

            public String getName_sampt() {
                return name_sampt;
            }

            public void setName_sampt(String name_sampt) {
                this.name_sampt = name_sampt;
            }

            @Override
            public String toString() {
                return "TestItemsDTO{" +
                        "name_srvtp='" + name_srvtp + '\'' +
                        ", name_srv='" + name_srv + '\'' +
                        ", name_dep_mp='" + name_dep_mp + '\'' +
                        ", name_sampt='" + name_sampt + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "test_id='" + test_id + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", pat_name='" + pat_name + '\'' +
                    ", pat_sex='" + pat_sex + '\'' +
                    ", pat_age='" + pat_age + '\'' +
                    ", pat_id_num='" + pat_id_num + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", appl_date='" + appl_date + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", major_said='" + major_said + '\'' +
                    ", primary_diagnosis='" + primary_diagnosis + '\'' +
                    ", minor_diagnosis='" + minor_diagnosis + '\'' +
                    ", sign_img='" + sign_img + '\'' +
                    ", test_items=" + test_items +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "InspectGuideEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
