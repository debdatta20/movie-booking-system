package com.example.Movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Movie.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
