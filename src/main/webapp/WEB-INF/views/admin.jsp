<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
	<h1>Welcome to Georg's Kaffee Shoppe</h1>
	
	<ul>
		
		<li><a href="/user-register">Register as a Member</a></li>
	</ul>
	
	<div class="container">
		<h1>Menu</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th><th>Description</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="menu" items="${menuItems}">
				<tr>
					<td>${menu.name}</td>
					<td>${menu.description}</td>
					<td>${menu.price}</td>
					
					<td>
						<a href="/item/update?id=${ menu.id }" >Edit</a>
						&nbsp;  <!-- this puts space between the elements -->
						&nbsp;
						<a href="/item/delete?id=${ menu.id }" >Delete</a>
					</td>
					
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
			
		<a class="btn btn-secondary" href="/item/create">Add an item</a>
	
	
</body>
</html>