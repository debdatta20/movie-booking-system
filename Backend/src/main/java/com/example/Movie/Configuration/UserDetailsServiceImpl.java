package com.example.Movie.Configuration;

import com.example.Movie.Entity.User;
import com.example.Movie.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

   @Override
public UserDetails loadUserByUsername(String username)
        throws UsernameNotFoundException {

    User user = userRepository.findByUsername(username)
            .orElseThrow(() ->
                    new UsernameNotFoundException("User not found: " + username)
            );

    return org.springframework.security.core.userdetails.User
            .withUsername(user.getUsername())
            .password(user.getPassword())
            .roles(user.getRole()) // ROLE_ prefix auto added
            .build();
}
}
