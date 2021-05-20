package com.example.sc_back.dao;

import com.example.sc_back.bean.Headmaster;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeadmasterDao {
    //校长登录
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


    //编辑电话号码
    public int editHeadmasterByTelephone(@Param("headmaster_name") String headmaster_name,
                                         @Param("telephone") String telephone);

    //修改密码
    public int editHeadmasterByPassword(@Param("headmaster_name") String headmaster_name,
                                         @Param("password") String password);

    //按状态获取校长
    public List<String> getHeadmasterByState(@Param("state") int state);

    //编辑校长状态
    public int editHeadmasterByState(@Param("headmaster_name") String headmaster_name,
                                     @Param("state") int state);

    //删除校长
    public int deleteHeadmaster(int headmaster_id);
}
