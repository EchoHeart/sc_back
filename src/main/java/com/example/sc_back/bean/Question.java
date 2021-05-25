package com.example.sc_back.bean;

/**
 * 题库中的问题实体
 */
public class Question {
    private int question_id;//问题ID
    private String game_type;//游戏模块
    private String question_answer;//问题答案
    private String question_description;//问题描述
    private String option_A_description;//A选项
    private String option_B_description;//B选项
    private String option_C_description;//C选项
    private String option_D_description;//D选项

    public Question(int question_id,
                    String game_type,
                    String question_description,
                    String option_A_description,
                    String option_B_description,
                    String option_C_description,
                    String option_D_description,
                    String question_answer) {
        this.question_id = question_id;
        this.game_type = game_type;
        this.question_description = question_description;
        this.option_A_description = option_A_description;
        this.option_B_description = option_B_description;
        this.option_C_description = option_C_description;
        this.option_D_description = option_D_description;
        this.question_answer = question_answer;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getGame_type() {
        return game_type;
    }

    public void setGame_type(String game_type) {
        this.game_type = game_type;
    }

    public String getQuestion_answer() {
        return question_answer;
    }

    public void setQuestion_answer(String question_answer) {
        this.question_answer = question_answer;
    }

    public String getQuestion_description() {
        return question_description;
    }

    public void setQuestion_description(String question_description) {
        this.question_description = question_description;
    }

    public String getOption_A_description() {
        return option_A_description;
    }

    public void setOption_A_description(String option_A_description) {
        this.option_A_description = option_A_description;
    }

    public String getOption_B_description() {
        return option_B_description;
    }

    public void setOption_B_description(String option_B_description) {
        this.option_B_description = option_B_description;
    }

    public String getOption_C_description() {
        return option_C_description;
    }

    public void setOption_C_description(String option_C_description) {
        this.option_C_description = option_C_description;
    }

    public String getOption_D_description() {
        return option_D_description;
    }

    public void setOption_D_description(String option_D_description) {
        this.option_D_description = option_D_description;
    }
}
