<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">

<title>menu</title>

</head>

<!-- Note: theme comes directly from the session. -->
<body class="theme-${ theme }">
	<div class="container">

	<header>
		<span>
			Hello ${ profile.firstname } ${ profile.lastname } <!--  (stored in session) -->
		</span>
	</header>
		
	<h1>jane's menu</h1>
		
	<table  class="table table-striped">
		<thead class="thead-dark">

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
			
		<ul>		
			<a href="/admin" class="btn btn-secondary">administrator</a>
			<a href="/" class="btn btn-secondary ml-3">home</a>
		</ul>

</div>
</body>
</html>