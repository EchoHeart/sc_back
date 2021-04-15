package com.example.sc_back.dao;

import com.example.sc_back.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao {
    public Teacher getTeacherByMessage(@Param("teacher_name") String teacher_name, @Param("password") String password);
}
