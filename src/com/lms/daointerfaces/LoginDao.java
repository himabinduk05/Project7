package com.lms.daointerfaces;

import com.lms.beans.Login;
import com.lms.beans.EmployeeDetails;

import java.sql.SQLException;

public interface LoginDao {

	public abstract String validateUser(Login login ) throws ClassNotFoundException, SQLException;
	
	public abstract String registerUser(Login login,EmployeeDetails empd) throws ClassNotFoundException, SQLException;

}
