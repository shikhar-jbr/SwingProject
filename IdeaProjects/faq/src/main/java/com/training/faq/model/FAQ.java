package com.training.faq.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FAQ {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long faq_id;
    String question;
    String answer;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "faqid", referencedColumnName = "faq_id")
    List<Comments> clist;

    public FAQ(String question, String answer, List<Comments> clist) {
        this.question= question;
        this.answer= answer;
        this.clist= clist;
    }

    public FAQ() {

    }

    public Long getFaq_id() {
        return faq_id;
    }

    public void setFaq_id(Long faq_id) {
        this.faq_id = faq_id;
    }

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

    @Override
    public String toString() {
        return "FAQ{" +
                "faq_id=" + faq_id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", clist=" + clist +
                '}';
    }
}
