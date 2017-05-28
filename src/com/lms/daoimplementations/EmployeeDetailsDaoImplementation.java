package com.lms.daoimplementations;


import com.lms.beans.BookDetails;
import com.lms.beans.EmployeeDetails;
import com.lms.beans.StatusReport;
import com.lms.daointerfaces.EmployeeDetailsDao;
import com.lms.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class EmployeeDetailsDaoImplementation implements EmployeeDetailsDao{
	


	public List getEmployeeDetails(String uid) throws ClassNotFoundException, SQLException{
        
        Connection con = DatabaseConnectionUtility.getConnection();
        PreparedStatement pstmt=con.prepareStatement("select * from LMS_EMPLOYEE_DETAILS where USERID=? ");
        pstmt.setString(1,uid);
        ResultSet rs = pstmt.executeQuery();
		EmployeeDetails emp=null;
		List viewEmployeeDetails =new ArrayList();
        while(rs.next()){
        	emp=new EmployeeDetails();
        	emp.setUserId(rs.getString("USERID"));
        	emp.setEmployeeName(rs.getString("EMPLOYEENAME"));
        	emp.setDepartment(rs.getString("DEPARTMENT"));
        	emp.setDesignation(rs.getString("DESIGNATION"));
        	emp.setContactNumber(rs.getString("CONTACT_NUMBER"));
        	emp.setNumberOfBooksRecieved(rs.getInt("NUMBER_OF_BOOKS_RECIEVED"));   
        	viewEmployeeDetails.add(emp);
            }
        DatabaseConnectionUtility.closeConnection(con);

        return viewEmployeeDetails;
    }
    public void returnBook(String uid,String bookId) throws ClassNotFoundException, SQLException{
    	Connection con = DatabaseConnectionUtility.getConnection();      
        PreparedStatement pstmt=con.prepareStatement("delete from LMS_STATUS_REPORT where USERID=? and BOOKID=?"); 
        pstmt.setString(1,uid);
        pstmt.setString(2,bookId);
        PreparedStatement pstmt1=con.prepareStatement("update LMS_EMPLOYEE_DETAILS set NUMBER_OF_BOOKS_RECIEVED=NUMBER_OF_BOOKS_RECIEVED-1 WHERE USERID=?");
        pstmt1.setString(1,uid);
        PreparedStatement pstmt2=con.prepareStatement("update LMS_BOOK_DETAILS set book_status='AVAILABLE'  where BOOKID=?");
        pstmt2.setString(1,bookId);
        pstmt.executeUpdate();
        pstmt1.executeUpdate();
        pstmt2.executeUpdate();
        con.commit();
        DatabaseConnectionUtility.closeConnection(con);
        
    }
   
    public void issueBook(StatusReport status) throws ClassNotFoundException, SQLException{
    	
    	Connection con = DatabaseConnectionUtility.getConnection();
    	PreparedStatement pstmt=con.prepareStatement("select * from LMS_EMPLOYEE_DETAILS where userid=?");
    	pstmt.setString(1,status.getUserId());
        ResultSet rs=pstmt.executeQuery(); 
        while(rs.next()){
        	if(rs.getInt("NUMBER_OF_BOOKS_RECIEVED")<5){
        		Statement stmt1 = con.createStatement();
                ResultSet rs1=stmt1.executeQuery("select count(bookname) count from LMS_BOOK_DETAILS where BOOK_STATUS='AVAILABLE'"); 
			

        		while(rs1.next()){
        			if(rs1.getInt("count")>0){
        				
        				PreparedStatement pstmt2=con.prepareStatement("select count(BOOKNAME) countbook from LMS_STATUS_REPORT where USERID=? and BOOKNAME=?");
        		    	pstmt2.setString(1,status.getUserId());
        		    	pstmt2.setString(2,status.getBookName());
        		        ResultSet rs2=pstmt2.executeQuery(); 
        				while(rs2.next()){
        					if(rs2.getInt("countbook")!=0){
        					
        						}
        					else{
        						PreparedStatement pstmt1=null; 
        						pstmt1= con.prepareStatement("insert into LMS_STATUS_REPORT values(?,?,?,?,?)");
        					   
								pstmt1.setString(1,status.getUserId());
        					    
								pstmt1.setString(2,status.getBookId());
        					   
								pstmt1.setString(3,status.getBookName());
        					    
								pstmt1.setString(4,status.getIssueDate());
        					   
								pstmt1.setString(5,status.getReturnDate());
								pstmt1.executeUpdate();
								Statement stmt3=con.createStatement();
								stmt3.executeUpdate("update LMS_EMPLOYEE_DETAILS set NUMBER_OF_BOOKS_RECIEVED=NUMBER_OF_BOOKS_RECIEVED+1");
								PreparedStatement pstmt3=con.prepareStatement("UPDATE LMS_BOOK_DETAILS set BOOK_STATUS='NOT AVAILABLE' WHERE BOOKID=?");
		        		    	pstmt3.setString(1,status.getBookId());
		        		    	
		        		        pstmt3.executeQuery(); 
								
								
								
        					}
        				}
        			}
        		}
        	} 
        }
        DatabaseConnectionUtility.closeConnection(con);
    }
  

}


