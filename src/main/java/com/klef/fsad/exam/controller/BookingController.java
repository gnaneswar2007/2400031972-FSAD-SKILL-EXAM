package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService service;

    // Add Booking
    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return service.addBooking(booking);
    }

    // Delete Booking
    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable int id) {
        service.deleteBooking(id);
        return "Booking Deleted Successfully";
    }
}