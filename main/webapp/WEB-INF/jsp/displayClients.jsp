<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	 <c:if test = "${sessionScope.username != null }">
	 
	 
	 		<h1> List of clients </h1>
	
	<c:forEach var = "client" items = "${requestScope.clients}">
         
         	<h3> <a href="clientDashboard/${client.id}">${client.firstName}</a></h3>
         
    </c:forEach>
	 
	 </c:if>



	
    
    
    <c:if test = "${sessionScope.username == null }">
	
		<h1> Cannot come here without logging in. </h1>
		
	</c:if>

</body>
</html>