

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
    
    <td><h1><center>LIBRARY MANAGEMENT SYSTEM</center></td>		
   
  </tr>
</table>
<div style='float: right;'><h2><a href="website.html">Log out</a></h2></div>
</div>
<div id="nav">


<a href="addbook.jsp" target="_self">ADD A BOOK</a><br/><br/>
<a href="update.jsp" target="_self">UPDATE A BOOK</a><br/><br/>
<a href="delete.jsp" target="_self">DELETE A BOOK</a><br/><br/>
<a href="issue.jsp" target="_self">ISSUE A BOOK</a><br/><br/>
<a href="return.jsp" target="_self">RETURN A BOOK</a><br/><br/>
<a href="statusReport" target="_self">BOOKS REPORT</a><br/><br/>
<a href="viewAllBooks" target="_self">DISPLAY ALL BOOKS</a><br/><br/>
</div>
<div id="section">
<center>
<h2><u>ADD A BOOK</u></h2>
<table border=0>

    <form name="add a book" action="addBook" method="post" >
<tr><th>Book Id:</th><td><input type="text" name="bookId" id="bookId" ></td></tr>
<tr><th>Book Name:</th><td><input type="text" name="bookName" id="bookName"></td></tr>
<tr><th>Author:</th><td><input type="text" name="author" id="author" ></td></tr>
<tr><th>Publication:</th><td><input type="text" name="publication" id="publication"></td></tr>
<tr><th>Book Status:</th><td><input type="text" name="bookStatus" id="bookStatus"></td></tr>

<tr><br><center><td><input type="submit" name="submit" value="submit"> </center>
</form>
</table>

</center>

</div>


    </body>
</html>
