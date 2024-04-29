package com.blogapp1.controller;

import com.blogapp1.payload.CommentDto;
import com.blogapp1.payload.PostWithCommentDto;
import com.blogapp1.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
@AllArgsConstructor
public class CommentController {

    private CommentService commentService;

    @PostMapping("/{postID}")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto ,@PathVariable long postID){

        CommentDto dto = commentService.createComment(commentDto, postID);
        return new ResponseEntity<>(dto , HttpStatus.CREATED);

    }
    @GetMapping("/{postID}")
    public ResponseEntity<PostWithCommentDto> getAllCommentsByPostId(@PathVariable long postID){
        PostWithCommentDto allCommentByPostId = commentService.getAllCommentByPostId(postID);

        return new ResponseEntity<>(allCommentByPostId ,HttpStatus.OK);

    }
}
