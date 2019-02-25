<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item Exists</title>
</head>
<body>

	<h1> 
	</h1>
		<p>
			<%-- Dot notation to access getters in Expression Language. --%>
			Sorry, ${ existingItem } is already on the menu.
		</p>

			
		<a class="btn btn-secondary" href="/item/create">Back</a>
	

</body>
</html>