package com.example.sc_back.dao;

import com.example.sc_back.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao {
    //老师登录
    public Teacher getTeacherByMessage(@Param("teacher_name") String teacher_name,
                                       @Param("password") String password);

    //老师注册
    public int setTeacherByRegister(@Param("teacher_name") String teacher_name,
                                    @Param("password") String password,
                                    @Param("telephone") String telephone,
                                    @Param("school_name") String school_name,
                                    @Param("state") int state);

    //获取老师列表
    public List<Teacher> getAllTeacher(@Param("teacher_name") String teacher_name,
                                       @Param("pageStart") int pageStart,
                                       @Param("pageSize") int pageSize);

    //获取老师人数
    public int getTeacherCount(@Param("teacher_name") String teacher_name);

    //编辑电话号码
    public int editTeacherByTelephone(@Param("teacher_name") String teacher_name,
                                      @Param("telephone") String telephone);

    //修改密码
    public int editTeacherByPassword(@Param("teacher_name") String teacher_name,
                                      @Param("password") String password);

    //按状态获取老师
    public List<String> getTeacherByState(@Param("state") int state);

    //编辑老师状态
    public int editTeacherByState(@Param("teacher_name") String teacher_name,
                                  @Param("state") int state);

    //删除老师
    public int deleteTeacher(int teacher_id);

    //获取学校老师人数
    public int getTeacherNum(@Param("school_name") String school_name);
}
