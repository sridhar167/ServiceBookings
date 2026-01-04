package com.example.JpaPractice.DTO;

import com.example.JpaPractice.Entity.BookingDetailsEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class BookingListDTO {

    private long bookingId;
    private String bookingFor;
    private LocalDateTime TimeOfBooking;
    private LocalDate bookingDate;

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingFor() {
        return bookingFor;
    }

    public void setBookingFor(String bookingFor) {
        this.bookingFor = bookingFor;
    }

    public LocalDateTime getTimeOfBooking() {
        return TimeOfBooking;
    }

    public void setTimeOfBooking(LocalDateTime timeOfBooking) {
        TimeOfBooking = timeOfBooking;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public BookingListDTO() {
    }

    public BookingListDTO(long bookingId, String bookingFor, LocalDateTime timeOfBooking, LocalDate bookingDate) {
        this.bookingId = bookingId;
        this.bookingFor = bookingFor;
        TimeOfBooking = timeOfBooking;
        this.bookingDate = bookingDate;
    }

    public static BookingListDTO toDTO(BookingDetailsEntity bookingDetails){
        return new BookingListDTO(
                bookingDetails.getBookingId(),
                bookingDetails.getBookingName(),
                bookingDetails.getBookingTime(),
                bookingDetails.getBookingDate()
        );
    }
}
