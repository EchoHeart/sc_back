package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.Admin;
import com.example.sc_back.bean.Headmaster;
import com.example.sc_back.bean.Teacher;
import com.example.sc_back.dao.AdminDao;
import com.example.sc_back.dao.HeadmasterDao;
import com.example.sc_back.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {
    @Autowired
    AdminDao adminDao;
    @Autowired
    TeacherDao teacherDao;
    @Autowired
    HeadmasterDao headmasterDao;

    //管理员登录
    @RequestMapping("/adminLogin")
    public String adminLogin(@RequestBody Admin admin_request){
        Admin admin_response = adminDao.getAdminByMessage(
                admin_request.getAdmin_name(),admin_request.getPassword());

        return response_info("error",admin_response);
    }

    //老师登录
    @RequestMapping("/teacherLogin")
    public String teacherLogin(@RequestBody Teacher teacher_request){
        Teacher teacher_response = teacherDao.getTeacherByMessage(
                teacher_request.getTeacher_name(),teacher_request.getPassword());

        return response_info("error",teacher_response);
    }

    //校长登录
    @RequestMapping("/headmasterLogin")
    public String headmasterLogin(@RequestBody Headmaster headmaster_request){
        Headmaster headmaster_response = headmasterDao.getHeadmasterByMessage(
                headmaster_request.getHeadmaster_name(),headmaster_request.getPassword());

        return response_info("error",headmaster_response);
    }

    public String response_info(String flag, Object object){
        HashMap<String, Object> res = new HashMap<>();
        if(object != null)
            flag = "ok";
        res.put("flag",flag);
        res.put("object",object);
        return JSON.toJSONString(res);
    }
}
