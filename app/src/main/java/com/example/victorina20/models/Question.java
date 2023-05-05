package com.example.victorina20.models;

public class Question {
    private String Question, Choice1,Choice2,Choice3,Choice4,Right;

    public Question() {
    }

    public Question(String question, String choice1, String choice2, String choice3, String choice4, String right) {
        Question = question;
        Choice1 = choice1;
        Choice2 = choice2;
        Choice3 = choice3;
        Choice4 = choice4;
        Right = right;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }
}
