package com.example.Movie.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie.Entity.Booking;
import com.example.Movie.Repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    //Book ticket: User
    public Booking bookMovie(Booking booking){
        return bookingRepository.save(booking);
    }


    public List<Booking>getAllBookings(){
        return bookingRepository.findAll();
    }
}
