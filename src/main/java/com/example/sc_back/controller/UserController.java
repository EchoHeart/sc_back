package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.*;
import com.example.sc_back.dao.AdminDao;
import com.example.sc_back.dao.HeadmasterDao;
import com.example.sc_back.dao.TeacherDao;
import com.example.sc_back.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private UserDao userDao;

    //获取所有校长
    @RequestMapping("/getHeadmaster")
    public String getHeadmaster(QueryInfo queryInfo){
        int headmaster_count = headmasterDao.getHeadmasterCount(
                "%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

        List<Headmaster> headmaster_list = headmasterDao.getAllHeadmaster(
                "%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());

        return response_info(headmaster_count,headmaster_list);
    }

    //获取所有老师
    @RequestMapping("/getTeacher")
    public String getTeacher(QueryInfo queryInfo){
        int teacher_count = teacherDao.getTeacherCount(
                "%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

        List<Teacher> teacher_list = teacherDao.getAllTeacher(
                "%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());

        return response_info(teacher_count,teacher_list);
    }

    //通过学校和老师获取学生
    @RequestMapping("/getUserBySchoolAndTeacher")
    public String getUserBySchoolAndTeacher(String school_name, String teacher_name){
        String flag = "error";

        List<User> user_list = userDao.getUserBySchoolAndTeacher(school_name, teacher_name);
        if(user_list != null)
            flag = "ok";

        HashMap<String, Object> res = new HashMap<>();
        res.put("flag",flag);
        res.put("object",user_list);

        return JSON.toJSONString(res);
    }

    //添加学生
    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        int flag = 0;
        flag = userDao.addUser(user.getUser_name(),user.getUser_sex(),user.getUser_age(),
                               user.getSchool_name(),user.getTeacher_name(),user.getUser_grade(),
                               user.getUser_class());
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    //修改个人电话号码
    @RequestMapping ("/editTelephone")
    public String editTelephone(@RequestBody UserInfo userInfo){
        int flag = 0;
        if(userInfo.getIdentity().equals("管理员"))
            flag = adminDao.editAdminByTelephone(userInfo.getName(), userInfo.getTelephone());
        if(userInfo.getIdentity().equals("校长"))
            flag = headmasterDao.editHeadmasterByTelephone(userInfo.getName(), userInfo.getTelephone());
        if(userInfo.getIdentity().equals("老师"))
            flag = teacherDao.editTeacherByTelephone(userInfo.getName(), userInfo.getTelephone());

        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    //修改个人密码
    @RequestMapping("/editPassword")
    public String editPassword(@RequestBody UserInfo userInfo){
        int flag = 0;
        if(userInfo.getIdentity().equals("管理员"))
            flag = adminDao.editAdminByPassword(userInfo.getName(), userInfo.getPassword());
        if(userInfo.getIdentity().equals("校长"))
            flag = headmasterDao.editHeadmasterByPassword(userInfo.getName(), userInfo.getPassword());
        if(userInfo.getIdentity().equals("老师"))
            flag = teacherDao.editTeacherByPassword(userInfo.getName(), userInfo.getPassword());

        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    //获取待审核校长列表
    @RequestMapping("/getHeadmasterByState")
    public String getHeadmasterByState(){
        List<String> headmasterList = headmasterDao.getHeadmasterByState(0);
        return JSON.toJSONString(headmasterList);
    }

    //获取待审核老师列表
    @RequestMapping("/getTeacherByState")
    public String getTeacherByState(){
        List<String> teacherList = teacherDao.getTeacherByState(0);
        return JSON.toJSONString(teacherList);
    }

    //编辑校长审核状态
    @RequestMapping("/editHeadmasterByState")
    public String editHeadmasterByState(@RequestBody String[] headmaster_return){
        String flag = "ok";
        for(int i=0; i<headmaster_return.length; i++){
            if(headmasterDao.editHeadmasterByState(headmaster_return[i],1) == 1)
                continue;
            else
                flag = "error";
        }

        return flag;
    }

    //编辑老师审核状态
    @RequestMapping("/editTeacherByState")
    public String editTeacherByState(@RequestBody String[] teacher_return){
        String flag = "ok";
        for(int i=0; i<teacher_return.length; i++){
            if(teacherDao.editTeacherByState(teacher_return[i],1) == 1)
                continue;
            else
                flag = "error";
        }

        return flag;
    }

    //删除校长
    @RequestMapping("/deleteHeadmaster")
    public String deleteHeadmaster(int headmaster_id){
        int flag = headmasterDao.deleteHeadmaster(headmaster_id);
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    //删除老师
    @RequestMapping("/deleteTeacher")
    public String deleteTeacher(int teacher_id){
        int flag = teacherDao.deleteTeacher(teacher_id);
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    public String response_info(int count, Object object){
        HashMap<String, Object> res = new HashMap<>();
        res.put("count",count);
        res.put("object",object);
        return JSON.toJSONString(res);
    }
}
