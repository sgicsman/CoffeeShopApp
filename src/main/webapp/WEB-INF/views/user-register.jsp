<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

</head>
<body>

	<h2>Register as a Regular User</h2>

	<form action="/user-welcome">

		<table>

			<col>
			<td><label for="firstname">First Name </label> <input
				id="firstname" name="firstname" pattern="[A-Z]{1,2}[a-z]*" size="15" required /></td>

			<td><label>Last Name </label> <input name="lastname"
				pattern="[A-Z][a-z]+" size="15" required /></td>
		</table>
		
		<table>

			<td><label>Email </label> <input name="email" size="20" required
				type="email" /></td>
			
			<label>phone number </label><input type="tel" id="phone" name="phonenumber" size="10" 
				pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>

			<td><label>Age </label> <input name="age" type="number" min=18
				max=110 required maxlength="3" /></td>

		</table>

		<table>
			<col>
			<label>Password: minimum 8 characters, at least one
					capital letter and one special character</label> <input name="password"
				type="password" required
				pattern="^(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$" />
			<tr>
			<label>Credit Card # (optional) </label> <input name="creditcardnumber"
				pattern="(\d{16})*" minlength ="16" maxlength="16"/>
			</tr>
		</table>
		<br>

		<table>
			<td><label>Would you like to receive offers and announcements from Georg's Kafe?</label>
			 
			<label>yes</label> <input type="radio" name="requestmail" value="true"/>
			
			<label>no</label> <input type="radio" name="requestmail" value="false"/>
			<br>
		</table>


		<br>
		<button>Register</button>


	</form>


</body>
</html>