

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
<h1>Book Details</h1>

        <table border="2">

            <tr>
                <th>BOOKID</th>
                <th>BOOKNAME</th>
                <th>AUTHOR</th>
                <th>PUBLICATION </th>
                <th>BOOK_STATUS</th>
            </tr>

            <c:forEach  var="book" items="${requestScope.allBookDetails}">

                <tr>

                    <td>${book.bookId}</td>
                    <td>${book.bookName}</td>
                    <td>${book.author}</td>
                    <td>${book.publication}</td>
                    <td>${book.bookStatus}</td>
                </tr>
            </c:forEach>


        </table>

</center>

</div>
    
        
    </body>
</html>
