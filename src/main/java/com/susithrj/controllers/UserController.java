package com.susithrj.controllers;

import com.susithrj.model.User;
import com.susithrj.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public String mainDisplay() {
        return "allUsers";

    }

    @PostMapping("/add")
    public String addUser(@RequestBody User Userdata){
       return  userServices.saveUser(Userdata);
    }


}
