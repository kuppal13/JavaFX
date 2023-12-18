package com.example;

import java.util.ArrayList;

public class studentManager {
    private static final ArrayList<student> studentarray = new ArrayList<>();

    public static void addStudent(student student) {
        studentarray.add(student);
    }

    public static student findStudentById(int id) {
        for (student student : studentarray) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static ArrayList<student> getStudents(

    ) {
        return studentarray;
    }

    public static void setStudents(ArrayList<student> students) {
    }

}