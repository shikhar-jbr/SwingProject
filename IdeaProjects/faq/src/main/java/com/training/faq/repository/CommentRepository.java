package com.training.faq.repository;

import com.training.faq.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {
}
