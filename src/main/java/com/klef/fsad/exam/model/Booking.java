package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    private int bookingId;

    private String name;
    private String date;
    private String status;

    public Booking() {
    }

    public Booking(int bookingId, String name, String date, String status) {
        this.bookingId = bookingId;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}