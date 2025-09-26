package com.example.mycompose.repository.entity;

import java.util.List;

public class EaxmAppointmentEntity {
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
        private String time;
        private String time2;
        private String deptName;
        private String deptAdress;
        private String number;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime2() {
            return time2;
        }

        public void setTime2(String time2) {
            this.time2 = time2;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getDeptAdress() {
            return deptAdress;
        }

        public void setDeptAdress(String deptAdress) {
            this.deptAdress = deptAdress;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "time='" + time + '\'' +
                    ", time2='" + time2 + '\'' +
                    ", deptName='" + deptName + '\'' +
                    ", deptAdress='" + deptAdress + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "EaamAppointmentEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
