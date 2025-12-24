package com.example.Movie.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Movie.Entity.User;

@Service
public interface UserService {

    User registerUser(User user);
    List<User> getAllUsers();
    
    
}
