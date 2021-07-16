package com.schepick.model;

public class User {
    private String depart;
    private byte grade;
    private String minor;
    private String doubleMajor;
    private boolean isCosmos;

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setGrade(byte grade) {
        this.grade = grade;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public void setDoubleMajor(String doubleMajor) {
        this.doubleMajor = doubleMajor;
    }

    public void setCosmos(boolean cosmos) {
        isCosmos = cosmos;
    }
}
