package com.ivoyant.SpringBootTelecommunication.Service.impl;

import com.ivoyant.SpringBootTelecommunication.Entity.User;
import com.ivoyant.SpringBootTelecommunication.Repository.UserRepository;
import com.ivoyant.SpringBootTelecommunication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        if(userRepository.existsByPhoneNumber(user.getPhoneNumber()))
            return null;
        return userRepository.save(user);
    }

    @Override
    public List<User> viewAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByPhoneNumber(Long phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }
}



