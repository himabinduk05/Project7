 package com.lms.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.swing.text.html.HTMLDocument.Iterator;


import com.lms.beans.BookDetails;
import com.lms.beans.StatusReport;
import com.lms.daointerfaces.BookDetailsDao;
import com.lms.utilities.DatabaseConnectionUtility;

public class BookDetailsDaoImplementation implements BookDetailsDao{


	public void addBook(BookDetails book) throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 PreparedStatement pstmt=null;
		 String bookId=book.getBookId();
		 String bookName=book.getBookName();
		 String author=book.getAuthor();
		 String publication=book.getPublication();
		 String bookStatus=book.getBookStatus();
		 pstmt=con.prepareStatement("insert into LMS_BOOK_DETAILS values(?,?,?,?,?)");
		 pstmt.setString(1, bookId);
		 pstmt.setString(2, bookName);
		 pstmt.setString(3, author);
		 pstmt.setString(4, publication);
		 pstmt.setString(5, bookStatus);
		 pstmt.executeUpdate();
		 
		 DatabaseConnectionUtility.closeConnection(con);
		 		
	}
	public void deleteBook(String bookId) throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 PreparedStatement pstmt=null;
		 pstmt=con.prepareStatement("delete from LMS_BOOK_DETAILS where BOOKID=? ");
		 pstmt.setString(1, bookId);
		 pstmt.executeUpdate(); 
		 
		 DatabaseConnectionUtility.closeConnection(con);
	}
	public void updateBook(String bookId,String selectionAttribute,String selectionValue) throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 PreparedStatement pstmt=null;
		 if(selectionAttribute.equalsIgnoreCase("publication")){
			 
				pstmt= con.prepareStatement("update LMS_BOOK_DETAILS set publication=? where BOOKID=? ");
			   
				pstmt.setString(1,selectionValue);
				pstmt.setString(2,bookId);
				
				pstmt.executeUpdate();
		 }
		 else if(selectionAttribute.equalsIgnoreCase("author")){
			 
				pstmt= con.prepareStatement("update LMS_BOOK_DETAILS set author=? where BOOKID=? ");
			   
				pstmt.setString(1,selectionValue);
				pstmt.setString(2,bookId);
				pstmt.executeUpdate();
		 }
		 else if(selectionAttribute.equalsIgnoreCase("BOOK ID")){
			 
				pstmt= con.prepareStatement("update LMS_BOOK_DETAILS set BOOKID=? where BOOKID=? ");
			   
				pstmt.setString(1,selectionValue);
				pstmt.setString(2,bookId);
				
				pstmt.executeUpdate();
		 }
		 else{
			 
				pstmt= con.prepareStatement("update LMS_BOOK_DETAILS set BOOKNAME=? where BOOKID=? ");
			   
				pstmt.setString(1,selectionValue);
				pstmt.setString(2,bookId);
				
				pstmt.executeUpdate();
		 }
		 
		 DatabaseConnectionUtility.closeConnection(con);
	}
	
	 public List searchBook(String selection,String value) throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 PreparedStatement pstmt=null;
		 ResultSet rs=null;
		 if(selection.equalsIgnoreCase("publication")){
			 pstmt=con.prepareStatement("select * from LMS_BOOK_DETAILS where publication=?");
			 
				pstmt.setString(1,value);
			rs =pstmt.executeQuery();
				
			  
				
		 }
		 else if(selection.equalsIgnoreCase("author")){
			 pstmt=con.prepareStatement("select * from LMS_BOOK_DETAILS where author=?");
			 pstmt.setString(1,value);
			 rs=pstmt.executeQuery();		   
				
				
		 }
		 else if(selection.equalsIgnoreCase("BOOK ID")){
			 pstmt=con.prepareStatement("select * from LMS_BOOK_DETAILS where BOOKID=?");
			 pstmt.setString(1,value);
			  rs=pstmt.executeQuery();	   
				
				
		 }
		 else{
			 pstmt=con.prepareStatement("select * from LMS_BOOK_DETAILS where BOOKNAME=?");
			 pstmt.setString(1,value);
			  rs=pstmt.executeQuery();			
			  			
			
		 }
	     
			 List searchList = new ArrayList();
			 BookDetails book=null;
			 while(rs.next()){
		            book = new BookDetails( );
		            book.setBookId(rs.getString("BOOKID"));
		            book.setBookName(rs.getString("BOOKNAME"));
		            book.setAuthor(rs.getString("AUTHOR"));
		            book.setPublication(rs.getString("PUBLICATION"));
		            book.setBookStatus(rs.getString("BOOK_STATUS"));
		            searchList.add(book);
			 }       
			 DatabaseConnectionUtility.closeConnection(con);
			 return searchList;
	 }
	 
	 public List viewAllBookDetails() throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from LMS_BOOK_DETAILS");
		 List viewAllBooks =new ArrayList();
		 BookDetails book=null;
		 while(rs.next()){
	            book = new BookDetails( );
	            book.setBookId(rs.getString("BOOKID"));
	            book.setBookName(rs.getString("BOOKNAME"));
	            book.setAuthor(rs.getString("AUTHOR"));
	            book.setPublication(rs.getString("PUBLICATION"));
	            book.setBookStatus(rs.getString("BOOK_STATUS"));
	            viewAllBooks.add(book);
		 }       
		 
		 
		 DatabaseConnectionUtility.closeConnection(con);
		
		 return viewAllBooks;
	 }
}
