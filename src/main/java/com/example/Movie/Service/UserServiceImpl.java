package com.example.Movie.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Movie.Entity.User;
import com.example.Movie.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepo;

    

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    //Registering a new user
    @Override
    public User registerUser(User user){
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepo.findAll();

    }

    
}
