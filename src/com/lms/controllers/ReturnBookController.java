

package com.lms.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.services.EmployeeDetailsService;

public class ReturnBookController extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	String uid = request.getParameter("uid");
    String bookId = request.getParameter("bookId");
    
    EmployeeDetailsService employeeService = new EmployeeDetailsService();		       
     
    try{
        employeeService. returnBook(uid,bookId);
    }
    catch(ClassNotFoundException ce){
          ce.printStackTrace();
       // append message into log file
    }
    
    catch(SQLException se ){
        se.printStackTrace();
        // append message into log file
    }
        
       
    RequestDispatcher rd = request.getRequestDispatcher("returnOutput.jsp");
    
    rd.forward(request, response);

	}

}
