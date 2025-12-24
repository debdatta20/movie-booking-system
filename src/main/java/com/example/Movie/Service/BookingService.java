package com.example.Movie.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Movie.Entity.Booking;

@Service
public interface BookingService {
    Booking bookMovie(Booking booking);
    List<Booking>getAllBookings();
    
}
