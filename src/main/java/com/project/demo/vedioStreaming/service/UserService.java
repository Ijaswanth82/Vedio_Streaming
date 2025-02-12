package com.project.demo.vedioStreaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.vedioStreaming.entities.User;
import com.project.demo.vedioStreaming.repository.UserRepositoryInterface;

@Service
public class UserService {
    @Autowired
    UserRepositoryInterface uri;

    public User finduser(String username) {
        return uri.findByUsername(username);
    }

    public void addUser(User user) {
        uri.save(user);
    }

    public User findbycredentials(String username, String password) {
        User user = uri.findByUsername(username);
        if(user != null && user.getPassword().equals(password))  return user;
        return null;
    }
    
}
