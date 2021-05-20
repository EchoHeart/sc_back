package com.example.sc_back.dao;

import com.example.sc_back.bean.Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDao {
    //获取套餐列表
    public List<Service> getAllService();

    //添加套餐
    public int addService(@Param("service_type") char service_type,
                          @Param("service_price") float service_price,
                          @Param("service_infor") String service_infor,
                          @Param("service_usable_time") int service_usable_time);

    //获取套餐信息
    public String getServiceInfo(@Param("service_type") char service_type);
}
