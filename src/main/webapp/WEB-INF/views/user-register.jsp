<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<h1>Register as a Regular User</h1>
	
	<form action="/submit-user-registration" method="post">
		<br>
		<table>
		<tr>
			<td><label for="firstname">First Name:</label> <input id="firstname" name="firstname" pattern="[A-Z]{1,2}[a-z]*" required/></td>
		<tr></tr>
			<td><label>Last Name:</label> <input name="lastname" pattern="[A-Z][a-z]+" required/></td>
		</tr>
		<tr>
			<td><label>Email:</label> <input name="email" required type="email" /></td>
		
			<td><label>Age:</label> <input name="age" type="number" min= 18 max=110 required maxlength="3"/></td>
		<tr></tr>
			<td><label>Password: minimum 8 characters, at least one capital letter and one special character</label> <input name="password" type="password" required pattern="^(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$"/></td>
		</tr>
		
		</table>
		<br>
		<button>Register</button>
		
		
	</form>


</body>
</html>