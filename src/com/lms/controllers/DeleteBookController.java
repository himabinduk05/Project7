package com.lms.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.services.BookDetailsService;

public class DeleteBookController extends HttpServlet{
	
	public void init( ){
        // no code
    }
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		 
		 String bookId = request.getParameter("bookId");
	    
		 BookDetailsService bookDetailsService =new BookDetailsService();
		 
		 try{
		     bookDetailsService.deleteBook(bookId);
		     }
		     
		     catch(ClassNotFoundException ce){
		             ce.printStackTrace();
		     }
		     
		     catch(SQLException se){
		            se.printStackTrace( );
		     }
		     
		     RequestDispatcher rd = request.getRequestDispatcher("deleteOutput.jsp");
	         rd.forward(request, response);
		 
		 
	 }
}
