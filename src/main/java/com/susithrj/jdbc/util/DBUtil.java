package com.susithrj.jdbc.util;

import com.susithrj.jdbc.dao.UserDAOImpl;

import java.sql.SQLException;

public class DBUtil {
    public static void main(String[] args) {
       // DBConn.getInstance();
       // DBConn.makeJDBCConn();
    //    DBConn.fetchFirstBitofData(DBConnR.getInstance());
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        try {
            userDAOImpl.getUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
