package com.susithrj.jdbc.dao;

import com.susithrj.jdbc.model.User;
import com.susithrj.jdbc.util.DBConnR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {





    public static List<com.susithrj.jdbc.model.User> getUsers1()
            throws SQLException
    {
        System.out.println("inside getusers method");
        Connection con = DBConnR.getInstance();
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
            usr.setId('1');
            usr.setName("susithhd");
           // usr.setName(rs.getString("name"));

            ls.add(usr);

        }
        System.out.println(ls.size());
        return ls;
    }


    @Override
    public List<User> getUsers() throws SQLException {
        return null;
    }
}
