package com.susithrj.util;

public class DBUtil {
    public static void main(String[] args) {
        DBConn.getInstance();
        DBConn.makeJDBCConn();
       // DBConn.fetchFirstBitofData();
    }



}
