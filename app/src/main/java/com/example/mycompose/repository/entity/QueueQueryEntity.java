package com.example.mycompose.repository.entity;

import java.util.List;

public class QueueQueryEntity {


    private int code;
    private String message;
    private List<DataDTO> data;

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

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        private String doctor_name;
        private String doctor_sn;
        private String dept_name;
        private String dept_sn;
        private String title;
        private String patient_name;
        private String dt_sch;
        private String area;
        private String zhenjian;
        private String num;
        private String triage_no;
        private int tg_waiting;
        private String status_name;

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getZhenjian() {
            return zhenjian;
        }

        public void setZhenjian(String zhenjian) {
            this.zhenjian = zhenjian;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getTriage_no() {
            return triage_no;
        }

        public void setTriage_no(String triage_no) {
            this.triage_no = triage_no;
        }

        public int getTg_waiting() {
            return tg_waiting;
        }

        public void setTg_waiting(int tg_waiting) {
            this.tg_waiting = tg_waiting;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "doctor_name='" + doctor_name + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", title='" + title + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", area='" + area + '\'' +
                    ", zhenjian='" + zhenjian + '\'' +
                    ", num='" + num + '\'' +
                    ", triage_no='" + triage_no + '\'' +
                    ", tg_waiting=" + tg_waiting +
                    ", status_name='" + status_name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "QueueQueryEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
