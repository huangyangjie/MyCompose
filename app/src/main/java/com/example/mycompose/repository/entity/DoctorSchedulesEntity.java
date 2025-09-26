package com.example.mycompose.repository.entity;


import java.util.List;

public class DoctorSchedulesEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "DoctorSchedulesEntity{" +
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
        private String Id_sch;
        private String Id_ticks;
        private String T_b_ticks;
        private String T_e_ticks;

        public String getId_sch() {
            return Id_sch;
        }

        public void setId_sch(String id_sch) {
            Id_sch = id_sch;
        }

        public String getId_ticks() {
            return Id_ticks;
        }

        public void setId_ticks(String id_ticks) {
            Id_ticks = id_ticks;
        }

        public String getT_b_ticks() {
            return T_b_ticks;
        }

        public void setT_b_ticks(String t_b_ticks) {
            T_b_ticks = t_b_ticks;
        }

        public String getT_e_ticks() {
            return T_e_ticks;
        }

        public void setT_e_ticks(String t_e_ticks) {
            T_e_ticks = t_e_ticks;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "Id_sch='" + Id_sch + '\'' +
                    ", Id_ticks='" + Id_ticks + '\'' +
                    ", T_b_ticks='" + T_b_ticks + '\'' +
                    ", T_e_ticks='" + T_e_ticks + '\'' +
                    '}';
        }
    }
}
