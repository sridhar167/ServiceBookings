package com.example.JpaPractice.Repo;

import com.example.JpaPractice.DTO.UserBookingResponseDTO;
import com.example.JpaPractice.Entity.BookingDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<BookingDetailsEntity,Long> {

}

