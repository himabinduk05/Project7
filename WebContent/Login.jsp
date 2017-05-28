<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid" style="background-color:black">   
      
      <div class="col-md-4">
    <a href="website.html" class="thumbnail">
      
      <img src="library.png" alt="Pulpit Rock" style="width:500px;height:150px">
    </a>
  </div>    
  <div class="col-md-4">
    <center><h2 style="color:white">Library Management System<h2></center>
    
  </div> 
    </div>
    
  </div>
</nav>

<div class="container">  
  <div class="jumbotron">
  <center> <h2>Login</h2></center>
  <form role="form" action="login" method="post">
   
    <div class="col-xs-4">
      <label for="User Name">User ID:</label>
      <input type="textbox" class="form-control" name="uid" id="uid" placeholder="Enter User Name" required>
       </div>
      <br><br><br>
   
    <div class="col-xs-4">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Enter password" required>
    </div>
      <br><br> <br>&nbsp&nbsp&nbsp&nbsp
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>&nbsp&nbsp
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
  </div>
</div>
 
<div class="container-fluid" style="background-color:black;color:white">
   <center><p> 2015 Library Management System</p></center>
  </div>

</body>
</html>