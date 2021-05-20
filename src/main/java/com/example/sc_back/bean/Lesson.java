package com.example.sc_back.bean;

public class Lesson {
    private String lesson_name;
    private String teacher_name;
    private String school_name;
    private String lesson_date;
    private String lesson_time;
    private String class_infor;

    public Lesson(String lesson_name, String teacher_name, String school_name, String lesson_date, String lesson_time, String class_infor) {
        this.lesson_name = lesson_name;
        this.teacher_name = teacher_name;
        this.school_name = school_name;
        this.lesson_date = lesson_date;
        this.lesson_time = lesson_time;
        this.class_infor = class_infor;
    }

    public String getLesson_name() {
        return lesson_name;
    }

    public void setLesson_name(String lesson_name) {
        this.lesson_name = lesson_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getLesson_date() {
        return lesson_date;
    }

    public void setLesson_date(String lesson_date) {
        this.lesson_date = lesson_date;
    }

    public String getLesson_time() {
        return lesson_time;
    }

    public void setLesson_time(String lesson_time) {
        this.lesson_time = lesson_time;
    }

    public String getClass_infor() {
        return class_infor;
    }

    public void setClass_infor(String class_infor) {
        this.class_infor = class_infor;
    }
}
