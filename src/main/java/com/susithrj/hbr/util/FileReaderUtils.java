package com.susithrj.hbr.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtils {

//    public static void main(String[] args) {
//       //creates a new file instance
//
//       // String finalreturn = returnFromFile();
////        System.out.println(".............");
////        System.out.println(returnFromFile());
////        System.out.println(".............");
////        System.out.println(returnFromFileProcessed(returnFromFile()));
//    //        DBConn.getInstance();
//    //        DBConn.makeJDBCConn();
//        //creates a new file instance
//
//    }

    public static List<String> returnFromFile(){
        ArrayList<String> result = new ArrayList<>();
        try {
            File file=new File("E:\\2021_hot projects\\RESTful_CRUD_SpringBoot_Seed\\src\\main\\resources\\todo.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
               // System.out.println(line);
                // read next line
                result.add(line);
              line = reader.readLine();

            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String returnFromFileProcessed(List<String> list) {

        for (String element : list) {
            System.out.println(element);
        }
        return "printedbyelement";
    }
}
