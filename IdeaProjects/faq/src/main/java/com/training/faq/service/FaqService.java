package com.training.faq.service;

import com.training.faq.model.FAQ;
import com.training.faq.payloads.FaqPld;
import com.training.faq.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqService {

    @Autowired
    FaqRepository faqRepository;

    //get vaue
    public List<FAQ> getAllUsers(){
        return faqRepository.findAll();
    }

    //add value
    public Object addFaq(FaqPld faqPld) {
        return faqRepository.save(new FAQ(faqPld.getQuestion(),faqPld.getAnswer(),faqPld.getClist()));
    }

    //update value
    public Object updateUser(FaqPld faqPld, Long id) {
        FAQ faq= faqRepository.findById(id).orElseThrow(()-> new RuntimeException("FAQ not found of id: "+id));
        faq.setQuestion(faqPld.getQuestion());
        faq.setAnswer(faqPld.getAnswer());
        faq.setClist(faqPld.getClist());

        return faqRepository.save(faq);
    }

    //delete value
    public void deleteUser(Long id) {
        faqRepository.deleteById(id);
    }
}
