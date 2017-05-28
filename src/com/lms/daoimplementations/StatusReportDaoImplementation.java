package com.lms.daoimplementations;

import java.sql.SQLException;
import com.lms.beans.StatusReport;
import com.lms.daointerfaces.StatusReportDao;
import com.lms.utilities.DatabaseConnectionUtility;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StatusReportDaoImplementation implements  StatusReportDao{
	public List generateStatusReport() throws ClassNotFoundException, SQLException{
		List bookList = new ArrayList( );
        Connection con = DatabaseConnectionUtility.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from LMS_STATUS_REPORT");
        StatusReport book = null;
        while(rs.next()){
            book = new StatusReport( );
            book.setUserId(rs.getString("USERID"));
            book.setBookId(rs.getString("BOOKID"));
            book.setBookName(rs.getString("BOOKNAME"));
            book.setIssueDate(rs.getString("ISSUE_DATE"));
            book.setReturnDate(rs.getString("RETURN_DATE"));
            bookList.add(book);

        }
       System.out.println(book);
        DatabaseConnectionUtility.closeConnection(con);
        return bookList;
		
	}
}
