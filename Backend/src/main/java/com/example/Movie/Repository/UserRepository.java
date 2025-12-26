package com.example.Movie.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie.Entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

        Optional<User>findByUsername(String username);
}
