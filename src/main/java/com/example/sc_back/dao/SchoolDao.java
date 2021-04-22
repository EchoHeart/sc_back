package com.example.sc_back.dao;

import com.example.sc_back.bean.School;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolDao {
    //获取学校信息
    public String getSchoolByName(@Param("school_name") String school_name);

    //创建学校
    public int setSchoolByRegister(@Param("school_name") String school_name);

    public List<String> getAllSchoolName();
}
