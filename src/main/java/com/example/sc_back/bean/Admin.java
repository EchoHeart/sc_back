package com.example.sc_back.bean;

/**
 * 管理员实体
 */
public class Admin {
    private int admin_id;//管理员ID
    private String admin_name;//管理员用户名
    private String password;//管理员密码
    private String telephone;//管理员电话

    public Admin(int admin_id, String admin_name, String password, String telephone) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.password = password;
        this.telephone = telephone;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
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

    //方便测试
    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
