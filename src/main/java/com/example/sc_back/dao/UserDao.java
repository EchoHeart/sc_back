package com.example.sc_back.dao;

import com.example.sc_back.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //获取学生列表
    public List<User> getUserBySchoolAndTeacher(@Param("school_name") String school_name,
                                                @Param("teacher_name") String teacher_name);

    //添加学生
    public int addUser(@Param("user_name") String user_name,
                       @Param("user_sex") String user_sex,
                       @Param("user_age") int user_age,
                       @Param("school_name") String school_name,
                       @Param("teacher_name") String teacher_name,
                       @Param("user_grade") int user_grade,
                       @Param("user_class") int user_class);
}
