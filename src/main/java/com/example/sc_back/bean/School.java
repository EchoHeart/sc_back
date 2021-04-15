package com.example.sc_back.bean;

import java.util.Date;

public class School {
    private String school_name;
    private String school_address;
    private String school_type;
    private char service_type;
    private Date usable_time;
    private int is_usable;

    public School(String school_name, String school_address, String school_type, char service_type, Date usable_time, int is_usable) {
        this.school_name = school_name;
        this.school_address = school_address;
        this.school_type = school_type;
        this.service_type = service_type;
        this.usable_time = usable_time;
        this.is_usable = is_usable;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getSchool_address() {
        return school_address;
    }

    public void setSchool_address(String school_address) {
        this.school_address = school_address;
    }

    public String getSchool_type() {
        return school_type;
    }

    public void setSchool_type(String school_type) {
        this.school_type = school_type;
    }

    public char getService_type() {
        return service_type;
    }

    public void setService_type(char service_type) {
        this.service_type = service_type;
    }

    public Date getUsable_time() {
        return usable_time;
    }

    public void setUsable_time(Date usable_time) {
        this.usable_time = usable_time;
    }

    public int getIs_usable() {
        return is_usable;
    }

    public void setIs_usable(int is_usable) {
        this.is_usable = is_usable;
    }
}
