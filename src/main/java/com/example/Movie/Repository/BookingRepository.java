package com.example.Movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie.Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    
}
