package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.Lesson;
import com.example.sc_back.bean.User;
import com.example.sc_back.dao.LessonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class LessonController {
    @Autowired
    private LessonDao lessonDao;

    //添加课程
    @RequestMapping("/addLesson")
    public String addLesson(@RequestBody Lesson lesson){
        int flag = lessonDao.addLesson(lesson.getLesson_name(), lesson.getTeacher_name(),
                                       lesson.getSchool_name(), lesson.getLesson_date(),
                                       lesson.getLesson_time(), lesson.getClass_infor());
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    //获取排课信息
    @RequestMapping("/getLesson")
    public String getLesson(String school_name, String lesson_date){
        String flag = "error";
        List<Lesson> lessonList = lessonDao.getLesson(school_name, lesson_date);

        if(lessonList != null)
            flag = "ok";

        return response_info(flag,lessonList);
    }

    //删除课程
    @RequestMapping("/deleteLesson")
    public String deleteLess(String teacher_name,String lesson_date,String lesson_time){
        int flag = 0;
        flag = lessonDao.deleteLesson(teacher_name,lesson_date,lesson_time);

        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    public String response_info(String flag, Object object){
        HashMap<String, Object> res = new HashMap<>();
        res.put("flag",flag);
        res.put("object",object);
        return JSON.toJSONString(res);
    }
}
