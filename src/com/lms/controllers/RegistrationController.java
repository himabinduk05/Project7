package com.lms.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.EmployeeDetails;
import com.lms.beans.Login;
import com.lms.services.LoginService;

public class RegistrationController extends HttpServlet {
	
	public void init( ){
        // no code
    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		
		String uid=request.getParameter("gid");
		String password=request.getParameter("pwd");
		String employeeName=request.getParameter("name");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String contactno=request.getParameter("contactno");
		String output="";
		
		Login login=new Login();
		
		login.setUserId(uid);
		login.setPassword(password);
		
		EmployeeDetails empd= new EmployeeDetails();
		
		empd.setEmployeeName(employeeName);
		empd.setDepartment(department);
		empd.setDesignation(designation);
		empd.setContactNumber(contactno);
		
		LoginService loginService= new LoginService();
		
		try{
		     output=loginService.registerUser(login,empd);
		     }
		     
		     catch(ClassNotFoundException ce){
		             ce.printStackTrace();
		     }
		     
		     catch(SQLException se){
		            se.printStackTrace( );
		     }
		     
		request.setAttribute("output",output);
		
		RequestDispatcher rd = request.getRequestDispatcher("registrationOutput.jsp");
        rd.forward(request, response);

		
	}
}
