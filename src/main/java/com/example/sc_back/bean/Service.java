package com.example.sc_back.bean;

public class Service {
    private char service_type;
    private float service_price;
    private String service_infor;
    private int service_usable_time;

    public Service(char service_type, float service_price, String service_infor, int service_usable_time) {
        this.service_type = service_type;
        this.service_price = service_price;
        this.service_infor = service_infor;
        this.service_usable_time = service_usable_time;
    }

    public char getService_type() {
        return service_type;
    }

    public void setService_type(char service_type) {
        this.service_type = service_type;
    }

    public float getService_price() {
        return service_price;
    }

    public void setService_price(float service_price) {
        this.service_price = service_price;
    }

    public String getService_infor() {
        return service_infor;
    }

    public void setService_infor(String service_infor) {
        this.service_infor = service_infor;
    }

    public int getService_usable_time() {
        return service_usable_time;
    }

    public void setService_usable_time(int service_usable_time) {
        this.service_usable_time = service_usable_time;
    }
}
