package com.example.sc_back.bean;

/**
 * 校长实体
 */
public class Headmaster {
    private int headmaster_id;//校长ID
    private String headmaster_name;//校长用户名
    private String password;//校长密码
    private String telephone;//校长电话
    private String school_name;//校长所属学校名称
    private int state;//注册状态

    public Headmaster(int headmaster_id, String headmaster_name, String password, String telephone, String school_name, int state) {
        this.headmaster_id = headmaster_id;
        this.headmaster_name = headmaster_name;
        this.password = password;
        this.telephone = telephone;
        this.school_name = school_name;
        this.state = state;
    }

    public int getHeadmaster_id() {
        return headmaster_id;
    }

    public void setHeadmaster_id(int headmaster_id) {
        this.headmaster_id = headmaster_id;
    }

    public String getHeadmaster_name() {
        return headmaster_name;
    }

    public void setHeadmaster_name(String headmaster_name) {
        this.headmaster_name = headmaster_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
