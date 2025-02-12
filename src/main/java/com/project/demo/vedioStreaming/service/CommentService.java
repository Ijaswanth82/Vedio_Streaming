package com.project.demo.vedioStreaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.vedioStreaming.entities.Comment;
import com.project.demo.vedioStreaming.repository.CommentRepositoryInterface;

@Service
public class CommentService {
    @Autowired
    CommentRepositoryInterface cri;

    public List<Comment> getAllComments(int videoId) {
        return cri.findByVideoId(videoId);
    }

    public void addComment(Comment c) {
        cri.save(c);
    }

    public Comment findbyuserandcomment(String username, String content) {
        return cri.findByUserUsernameAndComment(username,content);
    }

    
}
