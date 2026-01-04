package com.example.JpaPractice.Repo;

import com.example.JpaPractice.DTO.UserBookingResponseDTO;
import com.example.JpaPractice.DTO.UserLoginRequestDTO;
import com.example.JpaPractice.Entity.UserLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserLoginEntity, Long> {

     UserLoginEntity findByuserName(String userName);

     @Query("SELECT new com.example.JpaPractice.DTO.UserLoginRequestDTO(u.userName, u.password)"+
     "FROM UserLoginEntity u WHERE u.userName = :username")
     Optional<UserLoginRequestDTO> findUserNameandPassword(@Param("username") String userName);

     Optional<UserLoginEntity> findByUserName(String userName);
//     @Query("""
//        SELECT com.example.JpaPractice.DTO.UserBookingResponseDTO(
//        b.userName,
//        b.street,
//        b.doorNumber,
//        b.userPhoneNumber,
//        b.city,
//        b.pinCode,
//        b.bookings)
//        FROM BookingDetailsEntity b
//        JOIN b.userProfileEntity p
//        JOIN p.userLogin l
//        WHERE l.userName = : userName
//        """)
//     List<UserBookingResponseDTO> findUserBookings(@Param("userName")String userName);
}


