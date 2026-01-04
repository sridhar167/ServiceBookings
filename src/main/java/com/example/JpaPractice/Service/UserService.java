package com.example.JpaPractice.Service;

import com.example.JpaPractice.DTO.UserLoginRequestDTO;
import com.example.JpaPractice.Entity.UserLoginEntity;
import com.example.JpaPractice.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String LoginUser(UserLoginRequestDTO userLoginRequest) {
        String userName = userLoginRequest.getUserName();
        String password = userLoginRequest.getPassword();

        if (!userName.isEmpty() || !password.isEmpty()) {
            UserLoginRequestDTO userLoginDetails = userRepo.findUserNameandPassword(userName)
                    .orElseThrow(() -> new RuntimeException("Invalid userName"));
            if (!userLoginDetails.getPassword().equals(password)) {
                return "Invalid password";
            } else {
                return "Login success";
            }
        }else{
            return "Please provide User credentials";
        }
    }
    public UserLoginEntity createUser(UserLoginEntity userLoginEntity) {
        return userRepo.save(userLoginEntity);
    }

    public UserLoginEntity updateUser(UserLoginEntity userLoginEntity) {
        return userRepo.save(userLoginEntity);
    }

    public UserLoginEntity getUser(Long userId) {
        return userRepo.getById(userId);
    }
}
