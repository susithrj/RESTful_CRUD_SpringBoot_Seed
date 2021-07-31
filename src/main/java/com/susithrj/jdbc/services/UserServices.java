package com.susithrj.jdbc.services;

import com.susithrj.jdbc.model.User;
import com.susithrj.jdbc.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        User u1 = new User();
     //   u1.setName("susith");
        List<User> allUsers = userRepository.findAll();
        return allUsers;
    }


    public String saveUser(User userData) {
        userRepository.save(userData);
        return "data saved";
    }
    public String updateUser(User newUserData) {
      String msg = null;
       if(newUserData.getName() != null){
        userRepository.save(newUserData);
        msg = "sucessfully updated User";
       }else{
           msg = "Error";
       }
       return msg;
    }
    public String deleteUser(User newUserData) {
        String msg = null;
        if(newUserData.getName() != null){
        userRepository.delete(newUserData);
        msg= "data deleted";
        }else{
         msg = "Error";
        }
        return msg;
    }

    public User findById(Integer id) {
       return userRepository.getOne(id);

    }
}
