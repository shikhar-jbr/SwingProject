package com.training.faq.service;

import com.training.faq.model.Comments;
import com.training.faq.model.FAQ;
import com.training.faq.payloads.CommentPld;
import com.training.faq.repository.CommentRepository;
import com.training.faq.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;
    @Autowired
    FaqRepository faqRepository;

    public List<Comments> getAllComments(){
        return commentRepository.findAll();
    }

    public Object addComment(Long id, CommentPld commentPld) {
        FAQ faq= faqRepository.findById(id).orElseThrow(()->new RuntimeException("Id not found: "+id));
        Comments comments= commentRepository.save(new Comments(commentPld.getComment(),commentPld.getEntrydate()));
        faq.getClist().add(comments);
        faqRepository.save(faq);
        return comments;
    }

    public Object updateComment(CommentPld commentPld, Long id) {
        Comments comments= commentRepository.findById(id).orElseThrow(()-> new RuntimeException("Comment not found of id: "+id));
        comments.setComment(commentPld.getComment());
        comments.setUpdatedate(commentPld.getUpdatedate());
        return commentRepository.save(comments);
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

}
