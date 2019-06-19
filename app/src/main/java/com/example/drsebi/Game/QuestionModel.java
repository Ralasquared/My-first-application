package com.example.drsebi.Game;

public class QuestionModel {

    public QuestionModel(String name, String answer){
        QuestionString = name;
        Answer = answer;
    }

    public String getQuestionString(){
        return QuestionString;
    }
    public void setQuestionString(String name){
        QuestionString = name;
    }
    public String getAnswer(){
        return Answer;
    }
    public void setAnswer(String answer){
        Answer = answer;
    }

    private String QuestionString;
    private String Answer;

}
