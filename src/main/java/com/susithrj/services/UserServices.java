package com.susithrj.services;

import com.susithrj.dao.UserRepository;
import com.susithrj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        return allUsers;
    }


    public String saveUser(User userData) {
        userRepository.save(userData);
        return "data saved";
    }
}
