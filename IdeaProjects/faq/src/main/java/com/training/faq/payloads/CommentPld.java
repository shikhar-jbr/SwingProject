package com.training.faq.payloads;

import com.training.faq.model.FAQ;

import java.util.Date;

public class CommentPld {

    private String comment;
    private Date entrydate, updatedate;
//    private FAQ faq;


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

//    public FAQ getFaq() {
//        return faq;
//    }
//
//    public void setFaq(FAQ faq) {
//        this.faq = faq;
//    }
}
