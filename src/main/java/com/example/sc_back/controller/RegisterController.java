package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.Headmaster;
import com.example.sc_back.bean.School;
import com.example.sc_back.bean.Teacher;
import com.example.sc_back.dao.HeadmasterDao;
import com.example.sc_back.dao.SchoolDao;
import com.example.sc_back.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    HeadmasterDao headmasterDao;
    @Autowired
    SchoolDao schoolDao;
    @Autowired
    TeacherDao teacherDao;

    //校长注册
    @RequestMapping("/headmasterRegister")
    public String headmasterRegister(@RequestBody Headmaster headmaster_request){
        String flag = "error";

        if(schoolDao.getSchoolByName(headmaster_request.getSchool_name()) == null)
            schoolDao.setSchoolByRegister(headmaster_request.getSchool_name());

        int headmaster_response = headmasterDao.setHeadmasterByRegister(
                headmaster_request.getHeadmaster_name(), headmaster_request.getPassword(),
                headmaster_request.getTelephone(), headmaster_request.getSchool_name(), 0);

        if (headmaster_response == 1)
            flag = "ok";
        return JSON.toJSONString(flag);
    }

    //老师注册
    @RequestMapping("/teacherRegister")
    public String teacherRegister(@RequestBody Teacher teacher_request){
        String flag = "error";
        if (schoolDao.getSchoolByName(teacher_request.getSchool_name()) != null){
            int teacher_response = teacherDao.setTeacherByRegister(
                    teacher_request.getTeacher_name(), teacher_request.getPassword(),
                    teacher_request.getTelephone(), teacher_request.getSchool_name(), 0);
            if (teacher_response == 1)
                flag = "ok";
        }
        return JSON.toJSONString(flag);
    }

    //老师注册表单获取当前学校
    @RequestMapping("/getSchool")
    public String getSchool(){
        List<String> school_name = schoolDao.getAllSchoolName();
        return JSON.toJSONString(school_name);
    }

}
