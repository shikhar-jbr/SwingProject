package com.training.faq.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comments {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long com_id;
    String comment;

    @CreationTimestamp
    Date entrydate;

    @UpdateTimestamp
    Date updatedate;
//
//    @ManyToOne
//    FAQ faq;

    public Comments() {
    }

    public Comments(String comment, Date entrydate/*, FAQ faq*/) {
        this.comment = comment;
        this.entrydate = entrydate;
//        this.faq = faq;
    }

    public Comments(String comment, Date entrydate , Date updatedate/*,FAQ faq*/){
        this.comment=comment;
        this.entrydate= entrydate;
        this.updatedate=updatedate;
//        this.faq= faq;
    }

    public Long getCom_id() {
        return com_id;
    }

    public void setCom_id(Long com_id) {
        this.com_id = com_id;
    }

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

    @Override
    public String toString() {
        return "Comments{" +
                "com_id=" + com_id +
                ", comment='" + comment + '\'' +
                ", entrydate=" + entrydate +
                ", updatedate=" + updatedate +
//                ", faq=" + faq +
                '}';
    }
}
