package com.example.JpaPractice.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="booking_details")
public class BookingDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;
    private String bookingName;
    private LocalDateTime bookingTime;
    private LocalDate bookingDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "profileId",nullable = true)
    private UserProfileEntity userProfile;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(referencedColumnName = "user_id")
    private UserLoginEntity userLogin;

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public UserProfileEntity getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfileEntity userProfile) {
        this.userProfile = userProfile;
    }

    public UserLoginEntity getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLoginEntity userLogin) {
        this.userLogin = userLogin;
    }

    public BookingDetailsEntity() {
    }
}
