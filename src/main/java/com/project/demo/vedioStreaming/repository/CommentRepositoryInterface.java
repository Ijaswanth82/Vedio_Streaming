package com.project.demo.vedioStreaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.vedioStreaming.entities.Comment;

public interface CommentRepositoryInterface extends JpaRepository<Comment,Integer>{

    List<Comment> findByVideoId(int videoId);

    Comment findByUserUsernameAndComment(String username, String content);
    
}
