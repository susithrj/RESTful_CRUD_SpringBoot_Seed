//package com.susithrj.jdbc.services;
//
//import com.susithrj.jdbc.model.User;
//import com.susithrj.jdbc.dao.UserDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.sql.SQLException;
//import java.util.List;
//
//
//@Service
//public class UserServices {
//
//    public List<User> getUser()
//            throws SQLException
//    {
//        String query = "select * from employee";
//        PreparedStatement ps
//                = con.prepareStatement(query);
//        ResultSet rs = ps.executeQuery();
//        List<Employee> ls = new ArrayList();
//
//        while (rs.next()) {
//            Employee emp = new Employee();
//            emp.setEmp_id(rs.getInt("emp_id"));
//            emp.setEmp_name(rs.getString("emp_name"));
//            emp.setEmp_address(rs.getString("emp_address"));
//            ls.add(emp);
//        }
//        return ls;
//    }
//}
