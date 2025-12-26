package com.example.Movie.Service;


import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Movie.Entity.User;
import com.example.Movie.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepo;

    //Adding this later after writing passwordEncoder
    private final PasswordEncoder passwordEncoder;
    

    

    public UserServiceImpl(UserRepository userRepo,PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    //Registering a new user
    @Override
    public User registerUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepo.findAll();

    }

    
}
