<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">

<title>${ title }</title>

</head>

<body>
	<main class="container">
	
		<h1>${ title }</h1>
		
		<!-- A form without an action submits back to the same URL, which is what we want here. -->
		<form method="post">
			<!-- We need to keep the ID and submit it with the form, but the user to have to see it. -->
			<input type="hidden" name="id" value="${item.id}" />
			
			<div class="form-group">
			    <label for="name">Name</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <input class="form-control" id="name" name="name" value="${item.name}" required minlength="2" autocomplete="off">
			</div>		

			<div class="form-group">
			    <label for="description">Description</label>
			    <input class="form-control" id="description" name="description" value="${item.description}" required minlength="3">
			</div>
			
			<div class="form-group">
			    <label for="quantity">Quantity</label>
			    <input type="number" name="quantity" min="0" max="999" class="form-control" id="quantity" value="${item.quantity}" required >
			</div>
			
			<div class="form-group">
			    <label for="price">Price</label>
			    <input type="number" name="price" min="0.25" max="99.99" class="form-control" id="price" value="${item.price}" required >
			</div>
			
			
			<button type="submit" class="btn btn-primary">Submit</button>
			
			<a href="/admin" class="btn btn-link">Cancel</a>
		</form>
		
	</main>
</body>
</html>