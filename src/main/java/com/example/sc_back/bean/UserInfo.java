package com.example.sc_back.bean;

public class UserInfo {
    private String name;
    private String telephone;
    private String identity;
    private String password;

    public UserInfo(String name, String telephone, String identity, String password) {
        this.name = name;
        this.telephone = telephone;
        this.identity = identity;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
