package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HospitalGuideEntity {


    public int code;
    public String message;
    public DataBean data;

    @Override
    public String toString() {
        return "HospitalGuideEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        public String code_pat;
        public String patient_name;
        public String age;
        public String sex;
        public String comment_info;

        public String getComment_info() {
            return comment_info;
        }

        public void setComment_info(String comment_info) {
            this.comment_info = comment_info;
        }

        @SerializedName("Name_dep_or")
        public String name_dep_or;
        @SerializedName("Dt_acpt")
        public String dt_acpt;
        @SerializedName("Name_emp_or")
        public String name_emp_or;
        public List<GuidesDataBean> guidesData;

        @Override
        public String toString() {
            return "DataBean{" +
                    "code_pat='" + code_pat + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", age='" + age + '\'' +
                    ", sex='" + sex + '\'' +
                    ", comment_info='" + comment_info + '\'' +
                    ", name_dep_or='" + name_dep_or + '\'' +
                    ", dt_acpt='" + dt_acpt + '\'' +
                    ", name_emp_or='" + name_emp_or + '\'' +
                    ", guidesData=" + guidesData +
                    '}';
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getName_dep_or() {
            return name_dep_or;
        }

        public void setName_dep_or(String name_dep_or) {
            this.name_dep_or = name_dep_or;
        }

        public String getDt_acpt() {
            return dt_acpt;
        }

        public void setDt_acpt(String dt_acpt) {
            this.dt_acpt = dt_acpt;
        }

        public String getName_emp_or() {
            return name_emp_or;
        }

        public void setName_emp_or(String name_emp_or) {
            this.name_emp_or = name_emp_or;
        }

        public List<GuidesDataBean> getGuidesData() {
            return guidesData;
        }

        public void setGuidesData(List<GuidesDataBean> guidesData) {
            this.guidesData = guidesData;
        }

        public static class GuidesDataBean {
            public String name_item;
            public String id_stoep;
            public String time_report;
            public String code_or;
            public String place;
            public String note;
            public String name_sample;

            @Override
            public String toString() {
                return "GuidesDataBean{" +
                        " name_item='" + name_item + '\'' +
                        ", id_stoep='" + id_stoep + '\'' +
                        ", time_report='" + time_report + '\'' +
                        ", code_or='" + code_or + '\'' +
                        ", place='" + place + '\'' +
                        ", note='" + note + '\'' +
                        ", name_sample='" + name_sample + '\'' +
                        '}';
            }


            public String getName_item() {
                return name_item;
            }

            public void setName_item(String name_item) {
                this.name_item = name_item;
            }

            public String getId_stoep() {
                return id_stoep;
            }

            public void setId_stoep(String id_stoep) {
                this.id_stoep = id_stoep;
            }

            public String getTime_report() {
                return time_report;
            }

            public void setTime_report(String time_report) {
                this.time_report = time_report;
            }

            public String getCode_or() {
                return code_or;
            }

            public void setCode_or(String code_or) {
                this.code_or = code_or;
            }

            public String getPlace() {
                return place;
            }

            public void setPlace(String place) {
                this.place = place;
            }

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }

            public String getName_sample() {
                return name_sample;
            }

            public void setName_sample(String name_sample) {
                this.name_sample = name_sample;
            }
        }
    }
}
