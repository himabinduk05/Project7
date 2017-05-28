

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

<a href="search.jsp" target="_self">SEARCH A BOOK</a><br/><br/>
<a href="details.jsp" target="_self">EMPLOYEE DETAILS</a><br/><br/>

</center>
</div>
<div id="section">
<center>
<h2><u>SEARCH A BOOK</u></h2>
<table border=0>

    <form name="search_a_book" action="searchBook" method="post">
<tr><td><b>Update Content Type:</b></td>

<td><select align="center" name="selection">
<option>Select</option>
<option>Book Id</option>
<option>Book Name</option>
<option>Author</option>
<option>Publication</option><br>
</td></tr><br><br>
<tr><th>Selection Value:</th><td><input type="text" name="value" id="value" ></td></tr>


<tr><br><center><td><input type="submit" name="submit" value="search"> </center>
</form>
</table>

</center>

</div>




    </body>
</html>
