package com.example.sc_back.dao;

import com.example.sc_back.bean.School;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolDao {
    public School getSchoolByName(@Param("school_name") String school_name);

    public int setSchoolByRegister(@Param("school_name") String school_name);
}
