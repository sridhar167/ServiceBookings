package com.example.JpaPractice.DTO;

import com.example.JpaPractice.Entity.UserProfileEntity;

import java.time.LocalDate;

public class UserProfileDTO {
    private int age;
    private String gender;
    private LocalDate dateOfBirth;
    private int phoneNumber;

    private String doorNumber;
    private String street;
    private String city;
    private int pinCode;

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

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public UserProfileDTO(String gender, int age, LocalDate dateOfBirth, int phoneNumber, String doorNumber, String street, String city, int pinCode) {
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
    }

    public static UserProfileDTO toDTO(UserProfileEntity userProfile){
        return new UserProfileDTO(
                userProfile.getGender(),
                userProfile.getAge(),
                userProfile.getDateOfBirth(),
                userProfile.getPhoneNumber(),
                userProfile.getDoorNumber(),
                userProfile.getStreet(),
                userProfile.getCity(),
                userProfile.getPinCode()
        );
    }
}
