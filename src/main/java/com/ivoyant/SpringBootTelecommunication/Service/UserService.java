package com.ivoyant.SpringBootTelecommunication.Service;

import com.ivoyant.SpringBootTelecommunication.Entity.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public List<User> viewAllUser();
    public User findUserByPhoneNumber(Long phoneNumber);
}
