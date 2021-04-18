package com.example.sc_back.dao;

import com.example.sc_back.bean.Headmaster;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeadmasterDao {
    //获取校长信息
    public Headmaster getHeadmasterByMessage(@Param("headmaster_name") String headmaster_name,
                                             @Param("password") String password);

    //校长注册
    public int setHeadmasterByRegister(@Param("headmaster_name") String headmaster_name,
                                       @Param("password") String password,
                                       @Param("telephone") String telephone,
                                       @Param("school_name") String school_name,
                                       @Param("state") int state);

    //获取校长列表
    public List<Headmaster> getAllHeadmaster(@Param("headmaster_name") String headmaster_name,
                                             @Param("pageStart") int pageStart,
                                             @Param("pageSize") int pageSize);

    //获取校长人数
    public int getHeadmasterCount(@Param("headmaster_name") String headmaster_name);
}
