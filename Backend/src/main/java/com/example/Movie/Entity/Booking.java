package com.example.Movie.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long bookingId;

    private int seats;
    private LocalDate bookingDate;
    
    @ManyToOne
    private User user; //Many user can book a movie


    @ManyToOne
    private Movie movie; //Many booking can be done to one movie

    
    

    public Booking() {
    }


    public Booking(Long bookingId, int seats, LocalDate bookingDate, User user, Movie movie) {
        this.bookingId = bookingId;
        this.seats = seats;
        this.bookingDate = bookingDate;
        this.user = user;
        this.movie = movie;
    }


    public Long getBookingId() {
        return bookingId;
    }


    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }


    public int getSeats() {
        return seats;
    }


    public void setSeats(int seats) {
        this.seats = seats;
    }


    public LocalDate getBookingDate() {
        return bookingDate;
    }


    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public Movie getMovie() {
        return movie;
    }


    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    
}
