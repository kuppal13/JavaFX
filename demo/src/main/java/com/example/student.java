package com.example;

public class student {
    private int id;

    public student(int id, String name, String dob, String class1, int grades, int attendance) {
        this.id = id;
        this.name = name;
        DOB = dob;
        this.class1 = class1;
        this.grades = grades;
        this.attendance = attendance;
    }

    private String name;
    private String DOB;
    private String class1;
    private int grades;

    private int attendance;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return String return the class1
     */
    public String getClass1() {
        return class1;
    }

    /**
     * @param class1 the class1 to set
     */
    public void setClass1(String class1) {
        this.class1 = class1;
    }

    /**
     * @return String return the grades
     */
    public int getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(int grades) {
        this.grades = grades;
    }

    /**
     * @return int return the attendance
     */
    public int getAttendance() {
        return attendance;
    }

    /**
     * @param attendance the attendance to set
     */
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    /**
     * @return String return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
