<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<!-- Note: theme comes directly from the session. -->
<body class="theme-${ theme }">
	<header>
		<span>
			Hello ${ profile.firstname } ${ profile.lastname } <!--  (stored in session) -->
		</span>
	</header>


	<h1>Welcome to Georg's Kaffee Shoppe</h1>
	
	<ul>
		<li><a href="/showMenu">Our Menu</a></li>
	</ul>
	
	<ul>
		<li><a href="/user-register">Register as a new member</a></li>
	</ul>
	
	<ul>		
		<a class="btn btn-secondary" href="/admin">Administrator</a>
	</ul>
	
</body>
</html>