

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
#header {
    background-color:#000000 ;
    color:#FFFFFF;
    text-align:center;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#D3D3D3;
    height:530px;
    width:250px;
    float:left;
    padding:5px; 
}
#section {
    width:350px;
    float:left;
     
}
#aside {
line-height:40px;
width:350px;
float:right;

}
</style>
    </head>
    <body>
        <div id="header">
<table style="width:100%">
  <tr>
   
    <td><h1> <center>LIBRARY MANAGEMENT SYSTEM </center></td>		
   
  </tr>
</table>
<div style='float: right;'><h2><a href="website.html">Log out</a></h2></div>
</div>
<div id="nav">


<a href="search.jsp" target="_self">SEARCH A BOOK</a><br/><br/>
<a href="details.jsp" target="_self">EMPLOYEE DETAILS</a><br/><br/>

</div>
<div id="section">
<center>
<h1>Employee Details</h1>

        <table border="2">

            <tr>
                <th>EMPLOYEEID</th>
                <th>EMPLOYEENAME</th>
                <th>DEPARTMENT</th>
                <th>DESIGNATION</th>
                <th>CONTACT_NUMBER</th>
                <th>NUMBER_OF_BOOKS_RECEIVED</th>
           
            </tr>

            <c:forEach  var="emp" items="${requestScope.employeeDetails}">

                <tr>

                    <td>${emp.userId}</td>
                    <td>${emp.employeeName}</td>
                    <td>${emp.department}</td>
                    <td>${emp.designation}</td>
                    <td>${emp.contactNumber}</td>
                    <td>${emp.numberOfBooksRecieved}</td>
                </tr>
            </c:forEach>


        </table>

</center>
</div>
    </body>
</html>
