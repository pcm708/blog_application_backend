package com.pcm708.blog.repositories;

import com.pcm708.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo  extends JpaRepository<Comment, Integer> {

}
