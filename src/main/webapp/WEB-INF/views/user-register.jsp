<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">

<title>registration</title>

</head>

<body>
<div class="container">

	<%@include file="partials/header.jsp" %>
	<h2>Register as a Preferred Member</h2>
	
	<p class="message">${ message }</p>
	
	<form action="/user-register" method="post">

		<table>

			<col>
			<td><label for="firstname">First Name </label> <input
				id="firstname" name="firstname" pattern="[A-Z]{1,2}[a-z]*" size="15" required /></td>
				
			<td><label>Last Name </label> <input name="lastname"  
				pattern="[A-Z][a-z]+" size="15" required /></td>
				
		</table>

		<table>
		
			<col>
			<td><label for="username">User Name:</label> <input id="username" name="username" value="${ param.username }" required minlength="2" /></td>
				
			<td><label for="password">Password:</label> <input id="password" type="password" name="password" required minlength="2" /></td>
			
			<td><label for="password2">Confirm Password:</label> <input id="password2" type="password" name="confirm-password" required minlength="2" /></td>
		
		</table>
		
		<table>

			<td><label>Email </label> <input name="email"  size="20" required
				type="email" /></td>
			
			<td><label>phone number </label><input type="tel" id="phone" name="phonenumber"  size="10" 
				pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required></td>

			<td><label>Age </label> <input name="age"  type="number" min=18
				max=110 required maxlength="3" /></td>

		</table>

		<table>
			<col>
			<tr>
			<label>Credit Card # (optional) </label> <input name="creditcardnumber"  required
				pattern="(\d{16})*" minlength ="16" maxlength="16"/>
			</tr>
		</table>
		<br>

		<table>
			<td><label>Would you like to receive offers and announcements from Jane's Café?</label>
			 
			<label>yes</label> <input type="radio" name="requestmail" value="true"/>
			
			<label>no</label> <input type="radio" name="requestmail" value="false"/>
			<br>
		</table>

		<br>
		<button>Remember Me!</button>
		<a href="/" class="btn btn-link">Cancel</a>

	</form>

</div>
</body>
</html>