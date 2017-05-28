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


import com.lms.services.StatusReportService;

public class StatusReportController extends HttpServlet{
	public void init( ){
        // no code
    }
	
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		 
		 
	     
	     StatusReportService statusReportService =new StatusReportService();
	     
	     	List statusReportList = new ArrayList();
	     
	     try{
	    	 statusReportList=statusReportService.generateStatusReport();
		     }
		     
		     catch(ClassNotFoundException ce){
		             ce.printStackTrace();
		     }
		     
		     catch(SQLException se){
		            se.printStackTrace( );
		     }
		     
	     
	         request.setAttribute("statusReportList", statusReportList);
	     
		     RequestDispatcher rd = request.getRequestDispatcher("bookreport.jsp");
	         rd.forward(request, response);
	 }

}
