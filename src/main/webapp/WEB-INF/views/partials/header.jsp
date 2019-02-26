<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header>
	<a href="/">Home</a>
	
	<span>
	<c:choose>
		<c:when test="${ not empty user }">
			Welcome ${ user.name }
			<a href="/logout">Logout</a>
		</c:when>
		<c:otherwise>
			<a href="/login">Login</a>
			<a href="/signup">Register as a new Preferred Member</a>
		</c:otherwise>
	</c:choose>
	</span>
</header>
