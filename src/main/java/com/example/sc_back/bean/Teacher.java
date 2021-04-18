package com.example.sc_back.bean;

/**
 * 老师实体
 */
public class Teacher {
    private int teacher_id;//老师ID
    private String teacher_name;//老师用户名
    private String password;//老师密码
    private String school_name;//老师所属学校名称
    private String telephone;//老师电话
    private int state;//登录状态

    public Teacher(int teacher_id, String teacher_name, String password, String school_name, String telephone, int state) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.password = password;
        this.school_name = school_name;
        this.telephone = telephone;
        this.state = state;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
