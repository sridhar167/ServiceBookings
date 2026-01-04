package com.example.JpaPractice.Service;

import com.example.JpaPractice.DTO.BookingListDTO;
import com.example.JpaPractice.DTO.UserBookingResponseDTO;
import com.example.JpaPractice.Entity.BookingDetailsEntity;
import com.example.JpaPractice.Entity.UserLoginEntity;
import com.example.JpaPractice.Entity.UserProfileEntity;
import com.example.JpaPractice.Repo.BookingRepo;
import com.example.JpaPractice.Repo.UserProfileRepo;
import com.example.JpaPractice.Repo.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserProfileRepo userProfileRepo;

    @Transactional
    public String createBooking(Long profile_id ,BookingDetailsEntity bookingDetails){
        try {
            UserProfileEntity userProfile = userProfileRepo.findById(profile_id)
                    .orElseThrow(() -> new RuntimeException("ProfileID not found"));
            bookingDetails.setUserProfile(userProfile);
            bookingRepo.save(bookingDetails);
            return "Booking Success";
        }catch (Exception e){
            throw e;
        }
    }

    public UserBookingResponseDTO getUserBookings(String userName){
        if(!userName.isEmpty()){
            try {
                UserLoginEntity userLogin = userRepo.findByuserName(userName);
               return UserBookingResponseDTO.toDTO(userLogin);
            }catch (Exception e){
                throw e;
            }
        }
        else {
            throw new RuntimeException("Please provide valid userName");
        }
    }




}
