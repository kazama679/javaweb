package com.data.model;

import java.util.Date;
import java.util.List;

public class Ticket {
    private String movieTitle;
    private Date showTime;
    private List<Seat> seats;
    private double totalAmount;

    // getters, setters
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public Date getShowTime() {
        return showTime;
    }
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }
    public List<Seat> getSeats() {
        return seats;
    }
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}