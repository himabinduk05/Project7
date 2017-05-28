

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
<h1>Required Book Details</h1>

        <table border="2">

            <tr>
                <th>BOOKID</th>
                <th>BOOKNAME</th>
                <th>AUTHOR</th>
                <th>PUBLICATION </th>
                <th>BOOK_STATUS</th>
            </tr>

            <c:forEach  var="search" items="${requestScope.searchResult}">

                <tr>

                    <td>${search.bookId}</td>
                    <td>${search.bookName}</td>
                    <td>${search.author}</td>
                    <td>${search.publication}</td>
                    <td>${search.bookStatus}</td>
                </tr>
            </c:forEach>


        </table>

</center>
</div>




    </body>
</html>
