package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.Service;
import com.example.sc_back.dao.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    private ServiceDao serviceDao;

    @RequestMapping("/getAllService")
    public String getAllService(){
        List<Service> service_list = serviceDao.getAllService();
        return response_info("error", service_list);
    }

    @RequestMapping("/addService")
    public String addService(@RequestBody Service service){
        int flag = serviceDao.addService(service.getService_type(),service.getService_price(),
                service.getService_infor(),service.getService_usable_time());
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    @RequestMapping("/getServiceInfo")
    public String getServiceInfo(char service_type){
        return serviceDao.getServiceInfo(service_type);
    }

    public String response_info(String flag, Object object){
        HashMap<String, Object> res = new HashMap<>();
        if(object != null)
            flag = "ok";
        res.put("flag",flag);
        res.put("object",object);
        return JSON.toJSONString(res);
    }
}
