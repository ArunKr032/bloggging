package com.nontech.blogapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontech.blogapis.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
