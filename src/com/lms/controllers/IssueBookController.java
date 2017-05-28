package com.lms.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.StatusReport;
import com.lms.services.EmployeeDetailsService;

public class IssueBookController extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String uid = request.getParameter("uid");
	String bookId = request.getParameter("bookId");
	String issueDate = request.getParameter("issueDate");
	String returnDate = request.getParameter("returnDate");
	String bookName = request.getParameter("bookName");
	
	EmployeeDetailsService employeeService = new EmployeeDetailsService();	
	
	StatusReport status=new StatusReport();
	status.setUserId(uid);
	status.setBookId(bookId);
	status.setIssueDate(issueDate);
	status.setReturnDate(returnDate);
	status.setBookName(bookName);
    
		          
    try{
	 employeeService.issueBook(status);
    }
		          
    catch(ClassNotFoundException ce){
		    ce.printStackTrace();
	// append message into log file
    }
		        
    catch(SQLException se ){
		 se.printStackTrace();
	// append message into log file
    }
		         
   
		       
		        
    RequestDispatcher rd = request.getRequestDispatcher("issueOutput.jsp");
    rd.forward(request, response);
    
}

}
