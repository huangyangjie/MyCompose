package com.example.mycompose.repository.entity;

public class DaozhenEntity {
    String patientName;

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public String toString() {
        return "DaozhenEntity{" +
                "patientName='" + patientName + '\'' +
                '}';
    }
}
