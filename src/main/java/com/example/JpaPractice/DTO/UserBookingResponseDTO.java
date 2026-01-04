package com.example.JpaPractice.DTO;

import com.example.JpaPractice.Entity.UserLoginEntity;
import com.example.JpaPractice.Entity.UserProfileEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserBookingResponseDTO {

    private String userName;
    private int userPhoneNumber;
    private String doorNumber;
    private String street;
    private String city;
    private int pinCode;

    private List<BookingListDTO> bookings;

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public List<BookingListDTO> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingListDTO> bookings) {
        this.bookings = bookings;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserBookingResponseDTO() {
    }

    public UserBookingResponseDTO(String userName, String street, String doorNumber, int userPhoneNumber, String city, int pinCode, List<BookingListDTO> bookings) {
        this.userName = userName;
        this.street = street;
        this.doorNumber = doorNumber;
        this.userPhoneNumber = userPhoneNumber;
        this.city = city;
        this.pinCode = pinCode;
        this.bookings = bookings;
    }
    public static UserBookingResponseDTO toDTO(UserLoginEntity userLogin){

       UserProfileEntity userProfile = userLogin.getUserProfile();
        List<BookingListDTO> bookingList = userProfile.getBookingDetails()
                .stream().map(BookingListDTO::toDTO).collect(Collectors.toList());

       return new UserBookingResponseDTO(
            userLogin.getUserName(),
            userProfile.getStreet(),
            userProfile.getDoorNumber(),
            userProfile.getPhoneNumber(),
            userProfile.getCity(),
            userProfile.getPinCode(),
               bookingList

       );

    }
}
