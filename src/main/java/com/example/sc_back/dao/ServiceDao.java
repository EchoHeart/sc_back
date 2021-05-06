package com.example.sc_back.dao;

import com.example.sc_back.bean.Service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDao {
    //获取套餐列表
    public List<Service> getAllService();
}
