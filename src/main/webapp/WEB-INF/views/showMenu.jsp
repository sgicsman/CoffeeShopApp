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

	<h1>Georg's Menu</h1>
	
	<ul>
		
		<li><a href="/">Home</a></li>
	</ul>
	
	<div class="container">
		<h1>Menu</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="menu" items="${menuItems}">
				<tr>
					<td>${menu.name}</td>
					<td>${menu.description}</td>
					<td>${menu.quantity}</td>
					<td>${menu.price}</td>	
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>	
			
		<a class="btn btn-secondary" href="/admin">Administrator</a>
	
</body>
</html>