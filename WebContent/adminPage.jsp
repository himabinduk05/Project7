

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
</style>

    </head>
    <body>
        
<div id="header">
<table style="width:100%">
  <tr>
    
    <td><h1><center>LIBRARY MANAGEMENT SYSTEM</center></td>		
   
  </tr>
</table>
<div style='float: right;'><h2><a href="website.html">Log out</a></h2></div>
</div>


<div id="nav">
<center>
<br>
<br>

<a href="addbook.jsp" target="_self">ADD A BOOK</a><br/><br/>
<a href="update.jsp" target="_self">UPDATE A BOOK</a><br/><br/>
<a href="delete.jsp" target="_self">DELETE A BOOK</a><br/><br/>
<a href="issue.jsp" target="_self">ISSUE A BOOK</a><br/><br/>
<a href="return.jsp" target="_self">RETURN A BOOK</a><br/><br/>
<a href="statusReport" target="_self">BOOKS REPORT</a><br/><br/>
<a href="viewAllBooks" target="_self">DISPLAY ALL BOOKS</a><br/><br/>
</center>
</div>




    </body>
</html>
