package com.example.sc_back.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolDao {
    //获取学校信息
    public String getSchoolByName(@Param("school_name") String school_name);

    //创建学校
    public int setSchoolByRegister(@Param("school_name") String school_name);

    //获取所有已注册学校
    public List<String> getAllSchoolName();

    //获取学校购买的套餐
    public String getServiceType(@Param("school_name") String school_name);

    //获取学校购买的套餐的截止日期
    public String getEndTime(@Param("school_name") String school_name);

    //购买套餐
    public int buyService(@Param("school_name") String school_name,
                             @Param("service_type") String service_type,
                             @Param("start_time") String start_time,
                             @Param("end_time") String end_time);
}
