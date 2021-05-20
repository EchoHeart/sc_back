package com.example.sc_back.bean;

public class Lesson {
    private String lesson_name;
    private String teacher_name;
    private String lesson_date;
    private String lesson_time;

    public Lesson(String lesson_name, String teacher_name, String lesson_date, String lesson_time) {
        this.lesson_name = lesson_name;
        this.teacher_name = teacher_name;
        this.lesson_date = lesson_date;
        this.lesson_time = lesson_time;
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
}
