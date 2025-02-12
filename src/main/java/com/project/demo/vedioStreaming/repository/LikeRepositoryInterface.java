package com.project.demo.vedioStreaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.vedioStreaming.entities.Likes;

public interface LikeRepositoryInterface extends JpaRepository<Likes,Integer>{
    Likes findByLikedbyUsernameAndVideoId(String username, int videoId);

    List<Likes> findByVideoId(int videoId);
}
