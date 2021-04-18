package com.example.sc_back.dao;

import com.example.sc_back.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao {
    public Teacher getTeacherByMessage(@Param("teacher_name") String teacher_name,
                                       @Param("password") String password);

    public int setTeacherByRegister(@Param("teacher_name") String teacher_name,
                                    @Param("password") String password,
                                    @Param("telephone") String telephone,
                                    @Param("school_name") String school_name);

    //获取老师列表
    public List<Teacher> getAllTeacher(@Param("teacher_name") String teacher_name,
                                       @Param("pageStart") int pageStart,
                                       @Param("pageSize") int pageSize);

    //获取老师人数
    public int getTeacherCount(@Param("teacher_name") String teacher_name);
}
