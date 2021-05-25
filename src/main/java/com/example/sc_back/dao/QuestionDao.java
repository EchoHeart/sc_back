package com.example.sc_back.dao;

import com.example.sc_back.bean.Question;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao {
    //获取所有问题列表
    public List<Question> getAllQuestion(@Param("question_description") String question_description,
                                         @Param("pageStart") int pageStart,
                                         @Param("pageSize") int pageSize);

    //获取问题数
    public int getQuestionCount(@Param("question_description") String question_description);

    //添加问题
    public int addQuestion(@Param("game_type") String game_type,
                          @Param("question_description") String question_description,
                          @Param("option_A_description") String option_A_description,
                          @Param("option_B_description") String option_B_description,
                          @Param("option_C_description") String option_C_description,
                          @Param("option_D_description") String option_D_description,
                          @Param("question_answer") String question_answer);

    //根据question_id删除问题
    public int deleteQuestion(int question_id);
}
