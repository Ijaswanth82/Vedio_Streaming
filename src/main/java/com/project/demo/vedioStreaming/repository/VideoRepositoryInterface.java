package com.project.demo.vedioStreaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.vedioStreaming.entities.Video;

public interface VideoRepositoryInterface extends JpaRepository<Video,Integer>{
    public List<Video> findByGenreId(int id);
}
