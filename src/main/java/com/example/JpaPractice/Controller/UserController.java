package com.example.JpaPractice.Controller;

import com.example.JpaPractice.DTO.UserResponseDTO;
import com.example.JpaPractice.DTO.UserLoginRequestDTO;
import com.example.JpaPractice.Entity.UserLoginEntity;
import com.example.JpaPractice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/loginUser")
    public ResponseEntity<String> loginUser(@RequestBody UserLoginRequestDTO userLoginRequest){
        try {
            return
                 ResponseEntity.ok(userService.LoginUser(userLoginRequest));
        } catch (Exception e) {
           return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PostMapping("/createUser")
    public UserLoginEntity createUser(@RequestBody UserLoginEntity userLoginEntity){
        return userService.createUser(userLoginEntity);
    }

    @PutMapping("/updateUser")
    public UserLoginEntity updateUser(@RequestBody UserLoginEntity userLoginEntity){
        return userService.updateUser(userLoginEntity);
    }

    @GetMapping("/getUser/{userId}")
    public UserResponseDTO getuser(@PathVariable Long userId){

        UserLoginEntity userLoginEntity = userService.getUser(userId);

        return UserResponseDTO.toDTO(userLoginEntity);

    }

}
