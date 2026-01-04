package com.example.JpaPractice.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="user_details",
        uniqueConstraints = {
    @UniqueConstraint(columnNames = "userName")
})

public class UserLoginEntity {

    private String userName;
    private String password;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_profile",referencedColumnName = "profileId" , nullable = true)
    private UserProfileEntity userProfile;

    @OneToMany(mappedBy = "userLogin", cascade = CascadeType.ALL)
    private List<BookingDetailsEntity> bookingDetails;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserProfileEntity getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfileEntity userProfile) {
        this.userProfile = userProfile;
    }

    public List <BookingDetailsEntity> getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(List<BookingDetailsEntity> bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    public UserLoginEntity() {
    }
}
