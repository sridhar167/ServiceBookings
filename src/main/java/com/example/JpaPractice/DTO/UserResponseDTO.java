package com.example.JpaPractice.DTO;

import com.example.JpaPractice.Entity.UserLoginEntity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"UserName","email","userProfile"})
public class UserResponseDTO {

    private String UserName;
    private String email;

    private UserProfileDTO userProfile;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserProfileDTO getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfileDTO userProfile) {
        this.userProfile = userProfile;
    }

    public UserResponseDTO(String userName, String email , UserProfileDTO userProfile) {
        UserName = userName;
        this.email = email;
        this.userProfile = userProfile;
    }

    public static UserResponseDTO toDTO(UserLoginEntity userDetails){
        return new UserResponseDTO(
                userDetails.getUserName(),
                userDetails.getEmail(),
                UserProfileDTO.toDTO(userDetails.getUserProfile())
        );
        }
    }
