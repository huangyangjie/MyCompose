package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GuaHaoDoctorListByDateEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "GuaHaoDoctorListByDateEntity{" +
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
        private List<DateRangeBean> dateRange;
        private List<GuaHaoDoctorListEntity.DataBean> schedules;

        @Override
        public String toString() {
            return "DataBean{" +
                    "dateRange=" + dateRange +
                    ", schedules=" + schedules +
                    '}';
        }

        public List<DateRangeBean> getDateRange() {
            return dateRange;
        }

        public void setDateRange(List<DateRangeBean> dateRange) {
            this.dateRange = dateRange;
        }

        public List<GuaHaoDoctorListEntity.DataBean> getSchedules() {
            return schedules;
        }

        public void setSchedules(List<GuaHaoDoctorListEntity.DataBean> schedules) {
            this.schedules = schedules;
        }

        public static class DateRangeBean {
            private String date;
            private String day_of_week;
            private String status;
            private String openTime;

            @Override
            public String toString() {
                return "DateRangeBean{" +
                        "date='" + date + '\'' +
                        ", day_of_week='" + day_of_week + '\'' +
                        ", status='" + status + '\'' +
                        ", openTime='" + openTime + '\'' +
                        '}';
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDay_of_week() {
                return day_of_week;
            }

            public void setDay_of_week(String day_of_week) {
                this.day_of_week = day_of_week;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getOpenTime() {
                return openTime;
            }

            public void setOpenTime(String openTime) {
                this.openTime = openTime;
            }
        }

    }
}
