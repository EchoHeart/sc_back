package com.example.sc_back.dao;

import com.example.sc_back.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    public Admin getAdminByMessage(@Param("admin_name") String admin_name, @Param("password") String password);
}
