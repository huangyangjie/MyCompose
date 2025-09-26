package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MedicationDetailEntity {
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
        private String Code_ent;
        private String Code_pat;
        private String Name_pat;
        private String Code_dep_ap;
        private String Name_dep_ap;
        private String Name_bed;
        private String Code_dep_or;
        private String Name_dep_or;
        private String Code_emp_or;
        private String Name_emp_or;
        private String Sd_dgtp;
        private String Code_ap;
        private String Name_ap;
        private String Code_mm;
        private String Name_mm;
        private String Spec;
        private String Quan_med;
        private String Code_unit_med;
        private String Name_unit_med;
        private String Code_freq;
        private String Name_freq;
        private String Quan_ap;
        private String Code_pkgu_ap;
        private String Name_pkgu_ap;
        private String Eu_su_mp;


        public void setCode_pat(String code_pat) {
            Code_pat = code_pat;
        }

        public String getCode_pat() {
            return Code_pat;
        }

        public String getCode_ent() {
            return Code_ent;
        }

        public void setCode_ent(String code_ent) {
            Code_ent = code_ent;
        }

        public String getName_pat() {
            return Name_pat;
        }

        public void setName_pat(String name_pat) {
            Name_pat = name_pat;
        }

        public String getCode_dep_ap() {
            return Code_dep_ap;
        }

        public void setCode_dep_ap(String code_dep_ap) {
            Code_dep_ap = code_dep_ap;
        }

        public String getName_dep_ap() {
            return Name_dep_ap;
        }

        public void setName_dep_ap(String name_dep_ap) {
            Name_dep_ap = name_dep_ap;
        }

        public String getName_bed() {
            return Name_bed;
        }

        public void setName_bed(String name_bed) {
            Name_bed = name_bed;
        }

        public String getCode_dep_or() {
            return Code_dep_or;
        }

        public void setCode_dep_or(String code_dep_or) {
            Code_dep_or = code_dep_or;
        }

        public String getName_dep_or() {
            return Name_dep_or;
        }

        public void setName_dep_or(String name_dep_or) {
            Name_dep_or = name_dep_or;
        }

        public String getCode_emp_or() {
            return Code_emp_or;
        }

        public void setCode_emp_or(String code_emp_or) {
            Code_emp_or = code_emp_or;
        }

        public String getName_emp_or() {
            return Name_emp_or;
        }

        public void setName_emp_or(String name_emp_or) {
            Name_emp_or = name_emp_or;
        }

        public String getSd_dgtp() {
            return Sd_dgtp;
        }

        public void setSd_dgtp(String sd_dgtp) {
            Sd_dgtp = sd_dgtp;
        }

        public String getCode_ap() {
            return Code_ap;
        }

        public void setCode_ap(String code_ap) {
            Code_ap = code_ap;
        }

        public String getName_ap() {
            return Name_ap;
        }

        public void setName_ap(String name_ap) {
            Name_ap = name_ap;
        }

        public String getCode_mm() {
            return Code_mm;
        }

        public void setCode_mm(String code_mm) {
            Code_mm = code_mm;
        }

        public String getName_mm() {
            return Name_mm;
        }

        public void setName_mm(String name_mm) {
            Name_mm = name_mm;
        }

        public String getSpec() {
            return Spec;
        }

        public void setSpec(String spec) {
            Spec = spec;
        }

        public String getQuan_med() {
            return Quan_med;
        }

        public void setQuan_med(String quan_med) {
            Quan_med = quan_med;
        }

        public String getCode_unit_med() {
            return Code_unit_med;
        }

        public void setCode_unit_med(String code_unit_med) {
            Code_unit_med = code_unit_med;
        }

        public String getName_unit_med() {
            return Name_unit_med;
        }

        public void setName_unit_med(String name_unit_med) {
            Name_unit_med = name_unit_med;
        }

        public String getCode_freq() {
            return Code_freq;
        }

        public void setCode_freq(String code_freq) {
            Code_freq = code_freq;
        }

        public String getName_freq() {
            return Name_freq;
        }

        public void setName_freq(String name_freq) {
            Name_freq = name_freq;
        }

        public String getQuan_ap() {
            return Quan_ap;
        }

        public void setQuan_ap(String quan_ap) {
            Quan_ap = quan_ap;
        }

        public String getCode_pkgu_ap() {
            return Code_pkgu_ap;
        }

        public void setCode_pkgu_ap(String code_pkgu_ap) {
            Code_pkgu_ap = code_pkgu_ap;
        }

        public String getName_pkgu_ap() {
            return Name_pkgu_ap;
        }

        public void setName_pkgu_ap(String name_pkgu_ap) {
            Name_pkgu_ap = name_pkgu_ap;
        }

        public String getEu_su_mp() {
            return Eu_su_mp;
        }

        public void setEu_su_mp(String eu_su_mp) {
            Eu_su_mp = eu_su_mp;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "Code_ent='" + Code_ent + '\'' +
                    ", Code_pat='" + Code_pat + '\'' +
                    ", Name_pat='" + Name_pat + '\'' +
                    ", Code_dep_ap='" + Code_dep_ap + '\'' +
                    ", Name_dep_ap='" + Name_dep_ap + '\'' +
                    ", Name_bed='" + Name_bed + '\'' +
                    ", Code_dep_or='" + Code_dep_or + '\'' +
                    ", Name_dep_or='" + Name_dep_or + '\'' +
                    ", Code_emp_or='" + Code_emp_or + '\'' +
                    ", Name_emp_or='" + Name_emp_or + '\'' +
                    ", Sd_dgtp='" + Sd_dgtp + '\'' +
                    ", Code_ap='" + Code_ap + '\'' +
                    ", Name_ap='" + Name_ap + '\'' +
                    ", Code_mm='" + Code_mm + '\'' +
                    ", Name_mm='" + Name_mm + '\'' +
                    ", Spec='" + Spec + '\'' +
                    ", Quan_med='" + Quan_med + '\'' +
                    ", Code_unit_med='" + Code_unit_med + '\'' +
                    ", Name_unit_med='" + Name_unit_med + '\'' +
                    ", Code_freq='" + Code_freq + '\'' +
                    ", Name_freq='" + Name_freq + '\'' +
                    ", Quan_ap='" + Quan_ap + '\'' +
                    ", Code_pkgu_ap='" + Code_pkgu_ap + '\'' +
                    ", Name_pkgu_ap='" + Name_pkgu_ap + '\'' +
                    ", Eu_su_mp='" + Eu_su_mp + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MedicationDetailEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
