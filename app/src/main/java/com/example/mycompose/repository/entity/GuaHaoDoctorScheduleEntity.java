package com.example.mycompose.repository.entity;


import java.util.List;

public class GuaHaoDoctorScheduleEntity {

    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "GuaHaoDoctorScheduleEntity{" +
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
        private String area_name;
        private String doctor_name;

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        private List<DoctorSchedulesBean> doctor_schedules;

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public List<DoctorSchedulesBean> getDoctor_schedules() {
            return doctor_schedules;
        }

        public void setDoctor_schedules(List<DoctorSchedulesBean> doctor_schedules) {
            this.doctor_schedules = doctor_schedules;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "area_name='" + area_name + '\'' +
                    ", doctor_schedules=" + doctor_schedules +
                    '}';
        }

        public static class DoctorSchedulesBean {
            private String Id_sch;
            private String Dt_sch;
            private String day_of_week;
            private String Code_srvtp;
            private String Name_srvtp;
            private String Code_dayslottp;
            private String Name_dayslottp;
            private String Code_srv;
            private String Name_srv;
            private String doctor_sn;
            private String doctor_name;
            private String dept_sn;
            private String dept_name;
            private String Price;
            private String Total;
            private String Code_emptitle;
            private String Name_emptitle;
            private String Doc_speciality;
            private int alternate_tag;
            private String Used;
            private String Remain;
            private String Dt_stopreg;
            private Integer fulled_tag;
            private Integer night_tag;
            private Integer tg_alternate;

            @Override
            public String toString() {
                return "DoctorSchedulesBean{" +
                        "Id_sch='" + Id_sch + '\'' +
                        ", Dt_sch='" + Dt_sch + '\'' +
                        ", day_of_week='" + day_of_week + '\'' +
                        ", Code_srvtp='" + Code_srvtp + '\'' +
                        ", Name_srvtp='" + Name_srvtp + '\'' +
                        ", Code_dayslottp='" + Code_dayslottp + '\'' +
                        ", Name_dayslottp='" + Name_dayslottp + '\'' +
                        ", Code_srv='" + Code_srv + '\'' +
                        ", Name_srv='" + Name_srv + '\'' +
                        ", doctor_sn='" + doctor_sn + '\'' +
                        ", doctor_name='" + doctor_name + '\'' +
                        ", dept_sn='" + dept_sn + '\'' +
                        ", dept_name='" + dept_name + '\'' +
                        ", Price='" + Price + '\'' +
                        ", Total='" + Total + '\'' +
                        ", Code_emptitle='" + Code_emptitle + '\'' +
                        ", Name_emptitle='" + Name_emptitle + '\'' +
                        ", Doc_speciality='" + Doc_speciality + '\'' +
                        ", alternate_tag=" + alternate_tag +
                        ", Used='" + Used + '\'' +
                        ", Remain='" + Remain + '\'' +
                        ", Dt_stopreg='" + Dt_stopreg + '\'' +
                        ", fulled_tag=" + fulled_tag +
                        ", night_tag=" + night_tag +
                        ", tg_alternate=" + tg_alternate +
                        '}';
            }

            public Integer getTg_alternate() {
                return tg_alternate;
            }

            public void setTg_alternate(Integer tg_alternate) {
                this.tg_alternate = tg_alternate;
            }

            public int getAlternate_tag() {
                return alternate_tag;
            }

            public void setAlternate_tag(int alternate_tag) {
                this.alternate_tag = alternate_tag;
            }

            public String getDoctor_sn() {
                return doctor_sn;
            }

            public void setDoctor_sn(String doctor_sn) {
                this.doctor_sn = doctor_sn;
            }

            public String getDoctor_name() {
                return doctor_name;
            }

            public void setDoctor_name(String doctor_name) {
                this.doctor_name = doctor_name;
            }

            public String getDept_sn() {
                return dept_sn;
            }

            public void setDept_sn(String dept_sn) {
                this.dept_sn = dept_sn;
            }

            public String getDept_name() {
                return dept_name;
            }

            public void setDept_name(String dept_name) {
                this.dept_name = dept_name;
            }

            public String getId_sch() {
                return Id_sch;
            }

            public void setId_sch(String id_sch) {
                Id_sch = id_sch;
            }

            public String getDt_sch() {
                return Dt_sch;
            }

            public void setDt_sch(String dt_sch) {
                Dt_sch = dt_sch;
            }

            public String getDay_of_week() {
                return day_of_week;
            }

            public void setDay_of_week(String day_of_week) {
                this.day_of_week = day_of_week;
            }

            public String getCode_srvtp() {
                return Code_srvtp;
            }

            public void setCode_srvtp(String code_srvtp) {
                Code_srvtp = code_srvtp;
            }

            public String getName_srvtp() {
                return Name_srvtp;
            }

            public void setName_srvtp(String name_srvtp) {
                Name_srvtp = name_srvtp;
            }

            public String getCode_dayslottp() {
                return Code_dayslottp;
            }

            public void setCode_dayslottp(String code_dayslottp) {
                Code_dayslottp = code_dayslottp;
            }

            public String getName_dayslottp() {
                return Name_dayslottp;
            }

            public void setName_dayslottp(String name_dayslottp) {
                Name_dayslottp = name_dayslottp;
            }

            public String getCode_srv() {
                return Code_srv;
            }

            public void setCode_srv(String code_srv) {
                Code_srv = code_srv;
            }

            public String getName_srv() {
                return Name_srv;
            }

            public void setName_srv(String name_srv) {
                Name_srv = name_srv;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String price) {
                Price = price;
            }

            public String getTotal() {
                return Total;
            }

            public void setTotal(String total) {
                Total = total;
            }

            public String getCode_emptitle() {
                return Code_emptitle;
            }

            public void setCode_emptitle(String code_emptitle) {
                Code_emptitle = code_emptitle;
            }

            public String getName_emptitle() {
                return Name_emptitle;
            }

            public void setName_emptitle(String name_emptitle) {
                Name_emptitle = name_emptitle;
            }

            public String getDoc_speciality() {
                return Doc_speciality;
            }

            public void setDoc_speciality(String doc_speciality) {
                Doc_speciality = doc_speciality;
            }

            public String getUsed() {
                return Used;
            }

            public void setUsed(String used) {
                Used = used;
            }

            public String getRemain() {
                return Remain;
            }

            public void setRemain(String remain) {
                Remain = remain;
            }

            public String getDt_stopreg() {
                return Dt_stopreg;
            }

            public void setDt_stopreg(String dt_stopreg) {
                Dt_stopreg = dt_stopreg;
            }

            public Integer getFulled_tag() {
                return fulled_tag;
            }

            public void setFulled_tag(Integer fulled_tag) {
                this.fulled_tag = fulled_tag;
            }

            public Integer getNight_tag() {
                return night_tag;
            }

            public void setNight_tag(Integer night_tag) {
                this.night_tag = night_tag;
            }
        }
    }
}
