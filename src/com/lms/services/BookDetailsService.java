package com.lms.services;

import java.sql.SQLException;
import java.util.List;

import com.lms.beans.BookDetails;
import com.lms.daoimplementations.BookDetailsDaoImplementation;
import com.lms.daointerfaces.BookDetailsDao;

public class BookDetailsService {
	public void addBook(BookDetails book) throws ClassNotFoundException, SQLException{
		BookDetailsDao bookDetailsDao= new BookDetailsDaoImplementation();
		bookDetailsDao.addBook(book);
		
	}
	
	public void deleteBook(String bookId) throws ClassNotFoundException, SQLException{
		BookDetailsDao bookDetailsDao= new BookDetailsDaoImplementation();
		bookDetailsDao.deleteBook(bookId);
	}
	
	public void updateBook(String bookId,String selectionAttribute,String selectionValue) throws ClassNotFoundException, SQLException{
		BookDetailsDao bookDetailsDao= new BookDetailsDaoImplementation();
		bookDetailsDao.updateBook(bookId,selectionAttribute,selectionValue);
	}
	
	public List searchBook(String selection,String value) throws ClassNotFoundException, SQLException{
		BookDetailsDao bookDetailsDao= new BookDetailsDaoImplementation();
		return (bookDetailsDao.searchBook(selection,value));
	}
	
	public List viewAllBookDetails() throws ClassNotFoundException, SQLException{
		BookDetailsDao bookDetailsDao= new BookDetailsDaoImplementation();
		return (bookDetailsDao.viewAllBookDetails());
	}
}
