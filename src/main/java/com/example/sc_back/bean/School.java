package com.example.sc_back.bean;

public class School {
    private String school_name;
    private String school_address;
    private String school_type;
    private String service_type;
    private String start_time;
    private String end_time;

    public School(String school_name, String school_address, String school_type, String service_type, String start_time, String end_time) {
        this.school_name = school_name;
        this.school_address = school_address;
        this.school_type = school_type;
        this.service_type = service_type;
        this.start_time = start_time;
        this.end_time = end_time;
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

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
