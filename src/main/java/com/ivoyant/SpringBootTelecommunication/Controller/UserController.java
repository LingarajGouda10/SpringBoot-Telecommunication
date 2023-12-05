package com.ivoyant.SpringBootTelecommunication.Controller;

import com.ivoyant.SpringBootTelecommunication.Entity.User;
import com.ivoyant.SpringBootTelecommunication.Service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("UserRegistration")
    public String add(@RequestBody User user){
        userService.addUser(user);
        return "User Added Succesfully";
    }

    @GetMapping("getAllUser")
    public List<User> getAllUser(){

        return userService.viewAllUser();
    }

    @GetMapping("GetUserByphoneNumber/{phoneNumber}")
    public User getUserByPhoneNumber(@PathVariable("phoneNumber") Long phoneNumber){
        return userService.findUserByPhoneNumber(phoneNumber);
    }
}
