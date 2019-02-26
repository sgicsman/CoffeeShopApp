<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>  <!-- ?? PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">

<title>home</title>
	<%@include file="partials/header.jsp" %>

</head>

	<!-- Note: theme comes directly from the session. -->
<body class="theme-${ theme }">

	<div class="container">

		<p class="message">${ message }</p>
	
		<h1>Welcome to Jane's Café</h1>
		
		<ul>
			<li><a href="/showMenu">Our Menu</a></li>
		</ul>
		
		<ul>		
			<a class="btn btn-secondary" href="/admin">Administrator</a>
		</ul>
	
	</div>
	
</body>
</html>