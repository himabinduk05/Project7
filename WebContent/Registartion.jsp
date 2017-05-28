<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Registration Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script>
    function myFunction() {
        var pass1 = document.getElementById("pwd").value;
        var pass2 = document.getElementById("pwd1").value;
        if (pass1 != pass2) {
           
        	 alert("Passwords Does not Match!!!");
        }
        else {
            alert("Passwords Match!!!");
        }
    }
</script>
</head>
<body>
<div class="container-fluid" style="background-color: black">

		<div class="col-md-4">
			<a href="website.html"
				class="thumbnail"> <img src="library.png"
				alt="Pulpit Rock" style="width: 500px; height: 150px">
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
			<center>
				<h2>Registration Form</h2>
			</center>
			<form role="form" action="registration" method="post">
				<div class="col-xs-4">
					<label for="Gid">Gid:</label> <input type="textbox"
						class="form-control" name="gid" id="gid" placeholder="Enter gid" required>
				</div>
				<br>
				<br>
				<br>
				<div class="col-xs-4">
					<label for="Name">Name:</label> <input type="textbox"
						class="form-control" name="name" id="name"
						placeholder="Enter name" required>
				</div>
				<br>
				<br>
				<br>
				<div class="col-xs-4">
					<label for="Department">Department:</label> <input type="textbox"
						class="form-control" name="department" id="department"
						placeholder="Enter department name" required>
				</div>
				<br>
				<br>
				<br>
				<div class="col-xs-4">
					<label for="Designation">Designation:</label> <input type="textbox"
						class="form-control" name="designation" id="designation"
						placeholder="Enter designation" required>
				</div>
				<br>
				<br>
				<br>
				<div class="col-xs-4">
					<label for="Contact Number">Contact Number:</label> <input
						type="textbox" class="form-control" name="contactno"
						id="contactno" placeholder="Enter contact number" required>
				</div>
				<br>
				<br>
				<br>
				<div class="col-xs-4">
					<label for="pwd">Choose Password:</label> <input type="password"
						class="form-control" name="pwd" id="pwd"
						placeholder="Choose password" required>
				</div>
				<br>
				<br>
				<br>
				<div class="col-xs-4">
					<label for="pwd1">Re-enter Password:</label> <input type="password"
						class="form-control" name="pwd1" id="pwd1"
						placeholder="Re-enter password" required>
				</div>
				<br>
				<br>
				<br>
				<br>&nbsp&nbsp&nbsp&nbsp
				<button type="submit" class="btn btn-default" onclick="myFunction()">Submit</button>

			</form>
		</div>
	</div>

	<div class="container-fluid" style="background-color:black;color:white">
   <center><p> 2015 Library Management System</p></center>
  </div>
</body>
</html>