package com.example.sc_back.dao;

import com.example.sc_back.bean.Headmaster;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadmasterDao {
    public Headmaster getHeadmasterByMessage(@Param("headmaster_name") String headmaster_name, @Param("password") String password);

    public int setHeadmasterByRegister(@Param("headmaster_name") String headmaster_name, @Param("password") String password,
                                       @Param("telephone") String telephone, @Param("school_name") String school_name);
}
