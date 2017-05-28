package com.lms.services;

import java.sql.SQLException;
import java.util.List;

import com.lms.beans.BookDetails;
import com.lms.beans.EmployeeDetails;
import com.lms.beans.StatusReport;
import com.lms.daoimplementations.EmployeeDetailsDaoImplementation;
import com.lms.daointerfaces.EmployeeDetailsDao;

public class EmployeeDetailsService {
	
	public List getEmployeeDetails(String uid) throws ClassNotFoundException, SQLException{
		EmployeeDetailsDao employeeDetailsDao = new EmployeeDetailsDaoImplementation();
		return employeeDetailsDao.getEmployeeDetails(uid);
	}
	
	public void returnBook(String uid,String bookId) throws ClassNotFoundException, SQLException{
		EmployeeDetailsDao employeeDetailsDao = new EmployeeDetailsDaoImplementation();
		employeeDetailsDao.returnBook(uid,bookId);

	}
	 public void issueBook(StatusReport status) throws ClassNotFoundException, SQLException{
		 EmployeeDetailsDao employeeDetailsDao = new EmployeeDetailsDaoImplementation();
			employeeDetailsDao.issueBook(status);
	 }
	 
	 
}
