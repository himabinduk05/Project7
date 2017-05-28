package com.lms.daoimplementations;

import com.lms.beans.EmployeeDetails;
import com.lms.beans.Login;
import com.lms.daointerfaces.LoginDao;
import com.lms.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImplementation implements LoginDao {
	
	public String validateUser( Login login) throws ClassNotFoundException, SQLException{
        
		String role = "";
        Connection con = DatabaseConnectionUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("select role from LMS_LOGIN where USERID=? and PASSWORD=?");
        psmt.setString(1, login.getUserId());
        psmt.setString(2, login.getPassword());
        ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            role=rs.getString("role");
        }
        else{
            role = "invalid";
        }
        return role;
    }
	
	public String registerUser(Login login,EmployeeDetails empd ) throws ClassNotFoundException, SQLException{
		
		Connection con = DatabaseConnectionUtility.getConnection();
		String output="";
		
		String uid=login.getUserId();
		String password=login.getPassword();
		String employeeName=empd.getEmployeeName();
		String department=empd.getDepartment();
		String designation=empd.getDesignation();
		String contactno=empd.getContactNumber();
		
		PreparedStatement psmt= con.prepareStatement("Insert into LMS_LOGIN values(?,?,'USER')");
		psmt.setString(1,uid);
		psmt.setString(2,password);
		psmt.executeUpdate();
		PreparedStatement psmt2= con.prepareStatement("Insert into LMS_EMPLOYEE_DETAILS values(?,?,?,?,?,0)");	
		psmt2.setString(1,uid);
		psmt2.setString(2,employeeName);
		psmt2.setString(3,department);
		psmt2.setString(4,designation);
		psmt2.setString(5,contactno);
		psmt2.executeUpdate();
		output="Resgistered Sucessfully";
		return output;
		
	}
}
