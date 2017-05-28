package com.lms.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.BookDetails;
import com.lms.services.BookDetailsService;

public class AddBookController extends HttpServlet{
	
	public void init( ){
        // no code
    }
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		 
	
	     String bookId = request.getParameter("bookId");
	     String bookName = request.getParameter("bookName");
	     String author = request.getParameter("author");
	     String publication = request.getParameter("publication");
	     String bookStatus = request.getParameter("bookStatus");
	     
	     BookDetails bookDetails = new BookDetails();
	     
	     bookDetails.setBookId(bookId);
	     bookDetails.setBookName(bookName);
	     bookDetails.setAuthor(author);
	     bookDetails.setPublication(publication);
	     bookDetails.setBookStatus(bookStatus);
	     
	     BookDetailsService bookDetailsService =new BookDetailsService();
	     
	     try{
	     bookDetailsService.addBook(bookDetails);
	     }
	     
	     catch(ClassNotFoundException ce){
	             ce.printStackTrace();
	     }
	     
	     catch(SQLException se){
	            se.printStackTrace( );
	     }
	     
	     RequestDispatcher rd = request.getRequestDispatcher("addBookOutput.jsp");
         rd.forward(request, response);
	 }

}
