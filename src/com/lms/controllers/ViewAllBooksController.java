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

import com.lms.services.BookDetailsService;

public class ViewAllBooksController extends HttpServlet{

	public void init( ){
        // no code
    }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		
		 BookDetailsService bookDetailsService =new BookDetailsService();
		 
		 List list= new ArrayList();
		 
		 try{
		     list=bookDetailsService.viewAllBookDetails();
		     }
		     
		     catch(ClassNotFoundException ce){
		             ce.printStackTrace();
		     }
		     
		     catch(SQLException se){
		            se.printStackTrace( );
		     }
		
		    request.setAttribute("allBookDetails", list);
		     
		     RequestDispatcher rd = request.getRequestDispatcher("allbooks.jsp");
		     
	        rd.forward(request, response);
		 
		 
	 


	}
}
