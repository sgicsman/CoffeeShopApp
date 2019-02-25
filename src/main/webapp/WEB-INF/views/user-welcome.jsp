<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm User</title>
</head>

<!-- Note: theme comes directly from the session. -->
<body class="theme-${ theme }">
	<header>
		<span>
			Hello ${ profile.firstName } ${ profile.lastName } (stored in session)
		</span>
	</header>
			
		<a class="btn btn-secondary" href="/">Home</a>
	
</body>
</html>