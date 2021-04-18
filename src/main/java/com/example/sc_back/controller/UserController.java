package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.Headmaster;
import com.example.sc_back.bean.QueryInfo;
import com.example.sc_back.bean.Teacher;
import com.example.sc_back.dao.HeadmasterDao;
import com.example.sc_back.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private HeadmasterDao headmasterDao;
    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping("/getHeadmaster")
    public String getHeadmaster(QueryInfo queryInfo){
        int headmaster_count = headmasterDao.getHeadmasterCount(
                "%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

        List<Headmaster> headmaster_list = headmasterDao.getAllHeadmaster(
                "%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());

        return response_info(headmaster_count,headmaster_list);
    }

    @RequestMapping("/getTeacher")
    public String getTeacher(QueryInfo queryInfo){
        int teacher_count = teacherDao.getTeacherCount(
                "%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

        List<Teacher> teacher_list = teacherDao.getAllTeacher(
                "%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());

        return response_info(teacher_count,teacher_list);
    }

    public String response_info(int count, Object object){
        HashMap<String, Object> res = new HashMap<>();
        res.put("count",count);
        res.put("object",object);
        return JSON.toJSONString(res);
    }
}
