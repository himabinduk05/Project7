package com.lms.daointerfaces;



import java.sql.SQLException;
import java.util.List;

import com.lms.beans.BookDetails;



public interface BookDetailsDao {
	public abstract void addBook(BookDetails book) throws ClassNotFoundException, SQLException;
	public abstract void updateBook(String bookId,String selectionAttribute,String selectionValue) throws ClassNotFoundException, SQLException;
	public abstract void deleteBook(String bookId) throws ClassNotFoundException, SQLException;
    public abstract List searchBook(String selection,String value) throws ClassNotFoundException, SQLException;
    public abstract List viewAllBookDetails() throws ClassNotFoundException, SQLException;
}
