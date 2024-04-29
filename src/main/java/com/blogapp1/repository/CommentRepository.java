package com.blogapp1.repository;

import com.blogapp1.entity.Comment;
import com.blogapp1.payload.CommentDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment , Long> {

    List<Comment> findByPostId(long postID);

}
