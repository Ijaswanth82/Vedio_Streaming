package com.project.demo.vedioStreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.vedioStreaming.entities.User;

public interface UserRepositoryInterface extends JpaRepository<User,Integer>{

    User findByUsername(String username);
    
}
