package com.chelsia.springcore;

public class Student {

    private String name;
    private String department;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
    }
}