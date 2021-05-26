package com.example.sc_back.controller;

import com.example.sc_back.bean.School;
import com.example.sc_back.dao.SchoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/buyService")
    public String buyService(@RequestBody School school){
        int flag = schoolDao.buyService(school.getSchool_name(), school.getService_type(), school.getStart_time(), school.getEnd_time());
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    @RequestMapping("/getEndTime")
    public String getEndTime(String school_name){
        return schoolDao.getEndTime(school_name);
    }
}
