package com.example.Movie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie.Entity.Booking;
import com.example.Movie.Service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    
    //Book a ticket
    @PostMapping
    public Booking book(@RequestBody Booking booking){
        return bookingService.bookMovie(booking);
    }

    //View bookings
    @GetMapping
    public List<Booking>getBookings(){
        return bookingService.getAllBookings();
    }

    
}
