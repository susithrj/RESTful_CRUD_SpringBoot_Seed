package com.susithrj.controllers;

import com.susithrj.model.User;
import com.susithrj.services.UserServices;
import com.susithrj.util.FileReaderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public List<String> mainDisplay() {
        return  FileReaderUtils.returnFromFile();
    }
    @GetMapping("/all")
    public List<User> allUsers() {
        return userServices.getAllUsers();
    }
    @PostMapping("/add")
    public String addUser(@RequestBody User Userdata){
        return  userServices.saveUser(Userdata);
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody User newUserdata){
        return  userServices.updateUser(newUserdata);
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestBody User newUserdata){
        return  userServices.deleteUser(newUserdata);
    }
    @GetMapping("/find/{id}")
    public String getUSerById(@PathVariable Integer id) {
        System.out.println("UserID: "+ id);
       User user1 = userServices.findById(id);
       return user1.getName();

    }
    /*@GetMapping("/find/{id}")
    public User getUserById(@PathVariable("id") Integer id) {

        System.out.println("UserID: "+id);

       return userServices.findById(id);
    }*/


}
