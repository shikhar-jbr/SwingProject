package com.training.faq.controller;

import com.training.faq.payloads.CommentPld;
import com.training.faq.payloads.FaqPld;
import com.training.faq.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    //Create Question
    @GetMapping("comment/create/{id}")
    public ResponseEntity<?> saveComment(@PathVariable("id") Long id, @RequestBody CommentPld commentPld){
        return new ResponseEntity<Object>(commentService.addComment(id, commentPld), HttpStatus.CREATED);
    }

    //Read User
    @GetMapping("comment")
    public ResponseEntity<?> getComment(){
        return ResponseEntity.ok(commentService.getAllComments());
    }

    //Update User
    @PutMapping("comment/update/{id}")
    public ResponseEntity<?> updateComment(@RequestBody CommentPld commentPld, @PathVariable("id") Long id){
        return new ResponseEntity<Object>(commentService.updateComment(commentPld, id), HttpStatus.CREATED);
    }

    @DeleteMapping("comment/delete/{id}")
    public ResponseEntity<?> deleteComment(@PathVariable("id") Long id){
        commentService.deleteComment(id);
        return ResponseEntity.ok("User deleted for id: "+id);
    }

}
