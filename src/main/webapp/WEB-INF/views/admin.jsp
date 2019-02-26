<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">

<title>admin</title>

</head>
<body>

	<div class="container">
	
	<h1>Admin Page</h1>
		
		<table  class="table table-striped">
			<col>
  			<col>
  			<col>
  			<col>
  			<colgroup span="2"></colgroup>
			<thead class="thead-dark">
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Quantity</th>
					<th scope="col">Price</th>
					<th colspan="2" scope="colgroup"></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="menu" items="${menuItems}">
					<tr>
					<td>${menu.name}</td>
					<td>${menu.description}</td>
					<td>${menu.quantity}</td>
					<td>${menu.price}</td>
					
					<td>
						<a href="/item/update?id=${ menu.id }" >Edit</a>
						&nbsp;  <!-- this puts space between the elements -->
						&nbsp;
						<a class="confirmation" href="/item/delete?id=${ menu.id }" onclick="return confirm('Are you sure?')">Delete</a>
					</td>
					
					</tr>
				</c:forEach>
			</tbody>

		</table>
			
			<a class="btn btn-secondary" href="/item/create">add an item</a>
			<a href="/" class="btn btn-secondary ml-3">home</a>

	</div>
</body>
</html>