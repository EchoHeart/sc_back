package com.example.sc_back.dao;

import com.example.sc_back.bean.Lesson;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonDao {
    //添加课程
    public int addLesson(@Param("lesson_name") String lesson_name,
                         @Param("teacher_name") String teacher_name,
                         @Param("school_name") String school_name,
                         @Param("lesson_date") String lesson_date,
                         @Param("lesson_time") String lesson_time,
                         @Param("class_infor") String class_infor);

    //获取排课信息
    public List<Lesson> getLesson(@Param("school_name") String school_name,
                                  @Param("lesson_date") String lesson_date);

    //删除课程
    public int deleteLesson(@Param("teacher_name") String teacher_name,
                            @Param("lesson_date") String lesson_date,
                            @Param("lesson_time") String lesson_time);
}
