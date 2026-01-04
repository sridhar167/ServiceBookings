package com.example.JpaPractice.Repo;

import com.example.JpaPractice.Entity.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepo extends JpaRepository<UserProfileEntity,Long> {
}
