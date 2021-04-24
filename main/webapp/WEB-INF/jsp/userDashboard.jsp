<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test = "${sessionScope.username != null }">
	
		<h1> Welcome ${sessionScope.username }</h1>

		<a href="createNewClient"> Create new client </a> <br><br>
		<a href="currentClients"> Current clients </a> <br> <br>
		
		<a href="http://localhost:8080/listOfPolicies"> List of Policies </a> <br> <br>
	
	<a href="http://localhost:8080/listOfRejectedProposals"> List of Rejected Proposals </a> <br> <br>
		
		<a href="logout"> Logout </a>
		
	</c:if>
	
	
	<c:if test = "${sessionScope.username == null }">
	
		<h1> Cannot come here without logging in. </h1>
		
	</c:if>
	

</body>
</html>