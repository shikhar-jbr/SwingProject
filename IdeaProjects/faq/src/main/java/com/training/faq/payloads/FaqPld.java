package com.training.faq.payloads;

import com.training.faq.model.Comments;

import java.util.List;

public class FaqPld {

    private String question, answer;
    List<Comments> clist;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<Comments> getClist() {
        return clist;
    }

    public void setClist(List<Comments> clist) {
        this.clist = clist;
    }
}
