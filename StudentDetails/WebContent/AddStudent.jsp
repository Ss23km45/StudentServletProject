<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a New Student</title>
</head>
<body>
<h4 align="center"> Add New Student </h4>
<h5>Fill below Form</h5>

<form action="AddStudentController" method="GET">

Enter First Name : <input type="text" name="firstName"> <br/> <br/>

Enter Second Name : <input type="text" name="secondName"> <br/> <br/>

Enter Roll Number : <input type="text" name="rollNo"> <br/> <br/>

Enter Email Id : <input type="text" name="email"> <br/> <br/>

<input type="submit" name="Submit">

</form>

</body>
</html>