package com.example.sc_back.controller;

import com.example.sc_back.dao.SchoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SchoolController {
    @Autowired
    private SchoolDao schoolDao;

    @RequestMapping("/getServiceType")
    public String getServiceType(String school_name){
        String result = schoolDao.getServiceType(school_name);

        if(result == null)
            return "There is no service";
        else
            return result;
    }
}
