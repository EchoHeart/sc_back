package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.Headmaster;
import com.example.sc_back.bean.Teacher;
import com.example.sc_back.dao.HeadmasterDao;
import com.example.sc_back.dao.SchoolDao;
import com.example.sc_back.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RegisterController {
    @Autowired
    HeadmasterDao headmasterDao;
    @Autowired
    SchoolDao schoolDao;
    @Autowired
    TeacherDao teacherDao;

    @RequestMapping("/headmasterRegister")
    public String headmasterRegister(@RequestBody Headmaster headmaster_request){
        String flag = "error";
        int headmaster_response = headmasterDao.setHeadmasterByRegister(
                headmaster_request.getHeadmaster_name(), headmaster_request.getPassword(),
                headmaster_request.getTelephone(), headmaster_request.getSchool_name());
        schoolDao.setSchoolByRegister(headmaster_request.getSchool_name());

        if (headmaster_response == 1)
            flag = "ok";
        return JSON.toJSONString(flag);
    }

    @RequestMapping("/teacherRegister")
    public String teacherRegister(@RequestBody Teacher teacher_request){
        String flag = "error";
        if (schoolDao.getSchoolByName(teacher_request.getSchool_name()) != null){
            int teacher_response = teacherDao.setTeacherByRegister(
                    teacher_request.getTeacher_name(), teacher_request.getPassword(),
                    teacher_request.getTelephone(), teacher_request.getSchool_name());
            if (teacher_response == 1)
                flag = "ok";
        }
        return JSON.toJSONString(flag);
    }

}
