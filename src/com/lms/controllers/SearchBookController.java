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

public class SearchBookController extends HttpServlet{
	
		public void init( ){
	        // no code
	    }
		
		 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 
			 String selection = request.getParameter("selection");
			 String value = request.getParameter("value");
		    
			 BookDetailsService bookDetailsService =new BookDetailsService();
			 
			 List list= new ArrayList();
			 
			 try{
			     list=bookDetailsService.searchBook(selection,value);
			     }
			     
			     catch(ClassNotFoundException ce){
			             ce.printStackTrace();
			     }
			     
			     catch(SQLException se){
			            se.printStackTrace( );
			     }
			  System.out.println(list);
			   request.setAttribute("searchResult", list);
			     
			    RequestDispatcher rd = request.getRequestDispatcher("searchBookDetails.jsp");
			     
		         rd.forward(request, response);
			 
			 
		 }

}
