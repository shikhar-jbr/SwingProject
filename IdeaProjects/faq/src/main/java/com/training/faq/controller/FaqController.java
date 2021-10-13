package com.training.faq.controller;

import com.training.faq.payloads.FaqPld;
import com.training.faq.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@RequestMapping("/")
@RestController
public class FaqController {

    @Autowired
    FaqService faqService;

    //Create Question
    @PostMapping("faq/create")
    public ResponseEntity<?> saveUsers(@RequestBody FaqPld faqPld){
        return new ResponseEntity<Object>(faqService.addFaq(faqPld), HttpStatus.CREATED);
    }

    //Read User
    @GetMapping("faq")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(faqService.getAllUsers());
    }

    //Update User
    @PutMapping("faq/update/{id}")
    public ResponseEntity<?> updateUsers(@RequestBody FaqPld faqPld, @PathVariable("id") Long id){
        return new ResponseEntity<Object>(faqService.updateUser(faqPld, id), HttpStatus.CREATED);
    }

    @DeleteMapping("faq/delete/{id}")
    public ResponseEntity<?> deleteUsers(@PathVariable("id") Long id){
        faqService.deleteUser(id);
        return ResponseEntity.ok("User deleted for id: "+id);
    }

}
