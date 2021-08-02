package com.susithrj.jdbc.dao;

import com.susithrj.jdbc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO  {
    public List<User> getUsers() throws SQLException;
//check
}
