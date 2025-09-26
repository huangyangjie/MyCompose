package com.example.mycompose.repository.entity;

import java.util.List;

public class AtpTimeListEntity {

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
        private String room_id;
        private String room_name;
        private String exam_place;
        private String apppoint_source_id;
        private String appoint_date;
        private String st_et;
        private int valid_count;

        public String getRoom_id() {
            return room_id;
        }

        public void setRoom_id(String room_id) {
            this.room_id = room_id;
        }

        public String getRoom_name() {
            return room_name;
        }

        public void setRoom_name(String room_name) {
            this.room_name = room_name;
        }

        public String getExam_place() {
            return exam_place;
        }

        public void setExam_place(String exam_place) {
            this.exam_place = exam_place;
        }

        public String getApppoint_source_id() {
            return apppoint_source_id;
        }

        public void setApppoint_source_id(String apppoint_source_id) {
            this.apppoint_source_id = apppoint_source_id;
        }

        public String getAppoint_date() {
            return appoint_date;
        }

        public void setAppoint_date(String appoint_date) {
            this.appoint_date = appoint_date;
        }

        public String getSt_et() {
            return st_et;
        }

        public void setSt_et(String st_et) {
            this.st_et = st_et;
        }

        public int getValid_count() {
            return valid_count;
        }

        public void setValid_count(int valid_count) {
            this.valid_count = valid_count;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "room_id='" + room_id + '\'' +
                    ", room_name='" + room_name + '\'' +
                    ", exam_place='" + exam_place + '\'' +
                    ", apppoint_source_id='" + apppoint_source_id + '\'' +
                    ", appoint_date='" + appoint_date + '\'' +
                    ", st_et='" + st_et + '\'' +
                    ", valid_count=" + valid_count +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AtpTimeListEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
