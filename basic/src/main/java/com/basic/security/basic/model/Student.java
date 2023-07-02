package com.basic.security.basic.model;

public class Student {
    private String name;
    private int standard;
    private int rollNo;

    public Student(String name, int standard, int rollNo) {
        this.name = name;
        this.standard = standard;
        this.rollNo = rollNo;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
