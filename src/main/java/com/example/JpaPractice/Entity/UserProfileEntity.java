package com.example.JpaPractice.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="user_address")
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int profileId;

    private int age;
    private String gender;
    private LocalDate dateOfBirth;
    private int phoneNumber;

    private String doorNumber;
    private String street;
    private String city;
    private int pinCode;

    @OneToMany(mappedBy = "userProfile", cascade=CascadeType.ALL)
    private List<BookingDetailsEntity > bookingDetails;

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<BookingDetailsEntity> getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(List<BookingDetailsEntity> bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    public UserProfileEntity() {
    }
}
