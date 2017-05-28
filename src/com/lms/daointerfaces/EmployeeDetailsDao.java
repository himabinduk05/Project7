package com.lms.daointerfaces;


import java.sql.SQLException;
import java.util.List;

import com.lms.beans.BookDetails;
import com.lms.beans.EmployeeDetails;
import com.lms.beans.StatusReport;




public interface EmployeeDetailsDao {
	   
		public abstract List getEmployeeDetails(String uid) throws ClassNotFoundException, SQLException;
	    
	    public abstract void returnBook(String uid,String bookId) throws ClassNotFoundException, SQLException;
	    public abstract void issueBook(StatusReport status) throws ClassNotFoundException, SQLException;
	    
	}


