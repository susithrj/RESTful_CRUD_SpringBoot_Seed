package com.susithrj.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.System.err;

public class DBConn {
    private  static  DBConn dbConn = new DBConn();
    private DBConn(){

    }
    public static DBConn getInstance(){
        if (dbConn == null)
        {
            dbConn = new DBConn();
        }
        return dbConn;
    }

    public static void makeJDBCConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            err.println("jdbc class not found");
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartguru_db?serverTimezone=UTC", "root", "");
          //  jdbc:mysql://localhost:3306/crudapi?serverTimezone=UTC
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn != null) {
            System.out.println("Connection Successful! Enjoy. Now it's time to pull data");
        } else {
            System.out.println("Failed to make connection!");
        }

        //todo queriying database in another class


        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("connection successfully closed");
        }

    }
}
