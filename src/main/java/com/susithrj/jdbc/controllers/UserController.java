package com.susithrj.jdbc.controllers;

import com.susithrj.jdbc.dao.UserDAO;
import com.susithrj.jdbc.dao.UserDAOImpl;
import com.susithrj.jdbc.model.User;
//import com.susithrj.jdbc.services.UserServices;
import com.susithrj.jdbc.util.DBConnR;
import com.susithrj.jdbc.util.FileReaderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController

public class UserController {
 //   @Autowired
//    private UserServices userServices;
        private UserDAOImpl userDAOimpl;
    @GetMapping("/")
    public List<String> mainDisplay() {
        return  FileReaderUtils.returnFromFile();
    }
    @GetMapping("/all")
    public List<User> allUsers() throws SQLException {
        //List<User> ls = UserDAOImpl.();
        Connection con = DBConnR.getInstance();
        if(con == null){
            System.out.println("con is null");
        }
        String query = "select * from tbl_employee";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<User> ls = new ArrayList();

        while (rs.next()) {
            User usr = new User();
            usr.setId(rs.getInt("id"));
            //usr.setName(rs.getString("name"));
            //usr.setId(rs.getInt("id"));
            //  usr.setId('1');
            usr.setName(rs.getString("name"));

            ls.add(usr);

        }
        System.out.println("ls size"+ls.size());
        return ls;
    }
    @GetMapping("/all1")
    public String allUsersT() {
        //List<User> ls = UserDAOImpl.();
        return "test string";
    }
//    @PostMapping("/add")
//    public String addUser(@RequestBody User Userdata){
//        return  userServices.saveUser(Userdata);
//    }
//
//    @PostMapping("/update")
//    public String updateUser(@RequestBody User newUserdata){
//        return  userServices.updateUser(newUserdata);
//    }
//
//    @PostMapping("/delete")
//    public String deleteUser(@RequestBody User newUserdata){
//        return  userServices.deleteUser(newUserdata);
//    }
//    @GetMapping("/find/{id}")
//    public String getUSerById(@PathVariable Integer id) {
//        System.out.println("UserID: "+ id);
//       User user1 = userServices.findById(id);
//       return user1.getName();
//
//    }
    /*@GetMapping("/find/{id}")
    public User getUserById(@PathVariable("id") Integer id) {

        System.out.println("UserID: "+id);

       return userServices.findById(id);
    }*/


}
