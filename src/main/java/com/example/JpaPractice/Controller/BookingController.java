package com.example.JpaPractice.Controller;

import com.example.JpaPractice.DTO.UserBookingResponseDTO;
import com.example.JpaPractice.Entity.BookingDetailsEntity;
import com.example.JpaPractice.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/createBooking/{profileId}")
    public ResponseEntity<String> createBooking(@PathVariable("profileId") Long profileId, @RequestBody BookingDetailsEntity bookingDetails){
      try {
          String output = bookingService.createBooking(profileId, bookingDetails);
          return ResponseEntity.ok(output);
      }catch (Exception e){
          return ResponseEntity.badRequest().body(e.getMessage());
      }

    }
    @GetMapping("/getMapping/{userName}")
    public ResponseEntity<UserBookingResponseDTO> getUserBookings(@PathVariable(name = "userName") String userName){

            UserBookingResponseDTO userBookingResponseDTO = bookingService.getUserBookings(userName);
            return ResponseEntity.ok().body(userBookingResponseDTO);

    }
}
