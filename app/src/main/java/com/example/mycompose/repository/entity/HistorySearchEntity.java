package com.example.mycompose.repository.entity;

import java.util.ArrayList;

public class HistorySearchEntity {
    ArrayList<TextObject> data;

    @Override
    public String toString() {
        return "HistorySearchEntity{" +
                "data=" + data +
                '}';
    }

    public ArrayList<TextObject> getData() {
        return data;
    }

    public void setData(ArrayList<TextObject> data) {
        this.data = data;
    }

    public static class TextObject {
        String name;
        String time;

        @Override
        public String toString() {
            return "TextObject{" +
                    "name='" + name + '\'' +
                    ", time='" + time + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
