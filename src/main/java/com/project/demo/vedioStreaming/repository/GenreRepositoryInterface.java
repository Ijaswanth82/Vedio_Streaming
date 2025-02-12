package com.project.demo.vedioStreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.vedioStreaming.entities.Genre;

public interface GenreRepositoryInterface extends JpaRepository<Genre,Integer>{

    Genre findByName(String genre);
    
}
