package com.example.mycompose.repository.entity;


import java.util.ArrayList;
import java.util.Date;

public class CalendarEntity {
    public ArrayList<Day> days;

    public static class Day {
        String week;
        Date dateStamp;
        String dateStr;
        String monthStr;
        int dayOfMonth;
        int dayOfYear;
        boolean canUse;
        boolean isComing;

        @Override
        public String toString() {
            return "Day{" +
                    "week='" + week + '\'' +
                    ", dateStamp=" + dateStamp +
                    ", dateStr='" + dateStr + '\'' +
                    ", dayOfMonth=" + dayOfMonth +
                    ", dayOfYear=" + dayOfYear +
                    ", canUse=" + canUse +
                    ", isComing=" + isComing +
                    '}';
        }

        public String getMonthStr() {
            return monthStr;
        }

        public void setMonthStr(String monthStr) {
            this.monthStr = monthStr;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public Date getDateStamp() {
            return dateStamp;
        }

        public void setDateStamp(Date dateStamp) {
            this.dateStamp = dateStamp;
        }

        public String getDateStr() {
            return dateStr;
        }

        public void setDateStr(String dateStr) {
            this.dateStr = dateStr;
        }

        public int getDayOfMonth() {
            return dayOfMonth;
        }

        public void setDayOfMonth(int dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
        }

        public int getDayOfYear() {
            return dayOfYear;
        }

        public void setDayOfYear(int dayOfYear) {
            this.dayOfYear = dayOfYear;
        }

        public boolean isCanUse() {
            return canUse;
        }

        public void setCanUse(boolean canUse) {
            this.canUse = canUse;
        }

        public boolean isComing() {
            return isComing;
        }

        public void setComing(boolean coming) {
            isComing = coming;
        }
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "CalendarEntity{" +
                "days=" + days +
                '}';
    }
}
