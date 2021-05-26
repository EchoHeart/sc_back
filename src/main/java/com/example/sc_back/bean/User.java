package com.example.sc_back.bean;

public class User {
    private int user_id;
    private String user_name;
    private String user_sex;
    private int user_age;
    private String school_name;
    private String teacher_name;
    private int user_grade;
    private int user_class;

    public User(int user_id, String user_name, String user_sex, int user_age, String school_name, String teacher_name, int user_grade, int user_class) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_sex = user_sex;
        this.user_age = user_age;
        this.school_name = school_name;
        this.teacher_name = teacher_name;
        this.user_grade = user_grade;
        this.user_class = user_class;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public int getUser_grade() {
        return user_grade;
    }

    public void setUser_grade(int user_grade) {
        this.user_grade = user_grade;
    }

    public int getUser_class() {
        return user_class;
    }

    public void setUser_class(int user_class) {
        this.user_class = user_class;
    }
}
