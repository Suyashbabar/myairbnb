package com.blogapp1.repository;

import com.blogapp1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostRepository extends JpaRepository<Post , Long> {
}
