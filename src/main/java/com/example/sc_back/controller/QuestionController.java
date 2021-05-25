package com.example.sc_back.controller;

import com.alibaba.fastjson.JSON;
import com.example.sc_back.bean.Question;
import com.example.sc_back.bean.QueryInfo;
import com.example.sc_back.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionDao questionDao;

    //获取所有问题
    @RequestMapping("/getQuestion")
    public String getQuestion(QueryInfo queryInfo){
        int question_count = questionDao.getQuestionCount(
                "%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

        List<Question> question_list = questionDao.getAllQuestion(
                "%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());

        return response_info(question_count, question_list);
    }

    //添加问题
    @RequestMapping("/addQuestion")
    public String addQuestion(@RequestBody Question question){
        int flag = questionDao.addQuestion(question.getGame_type(),
                question.getQuestion_description(),
                question.getOption_A_description(),
                question.getOption_B_description(),
                question.getOption_C_description(),
                question.getOption_D_description(),
                question.getQuestion_answer());
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    //删除问题
    @RequestMapping("/deleteQuestion")
    public String deleteQuestion(int question_id){
        int flag = questionDao.deleteQuestion(question_id);
        if(flag == 1)
            return "ok";
        else
            return "error";
    }

    public String response_info(int count, Object object){
        HashMap<String, Object> res = new HashMap<>();
        res.put("count",count);
        res.put("object",object);
        return JSON.toJSONString(res);
    }
}
