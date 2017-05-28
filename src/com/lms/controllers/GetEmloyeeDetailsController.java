package com.lms.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.EmployeeDetails;
import com.lms.services.EmployeeDetailsService;

public class GetEmloyeeDetailsController extends HttpServlet{
	
	public void init( ){
        // no code
    }

	 public void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		            
		 String uid = request.getParameter("uid");
			       
		 EmployeeDetailsService employeeService = new EmployeeDetailsService();
			        
		 //EmployeeDetails emp=new EmployeeDetails();
		 List emp= new ArrayList();
			          
		 try{
             emp = employeeService.getEmployeeDetails(uid);
		    }
	     catch(ClassNotFoundException ce){
			    ce.printStackTrace();
          // append message into log file
	     }
	     catch(SQLException se ){
			   se.printStackTrace();
            // append message into log file
		  }

	     request.setAttribute("employeeDetails", emp);
			        
			       
		RequestDispatcher rd = request.getRequestDispatcher("employeeDetails.jsp");
	    rd.forward(request, response);
	     
	 }
}
