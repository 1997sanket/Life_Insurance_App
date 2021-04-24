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

<h1> List of rejected Proposals </h1>


<c:forEach var = "prop" items = "${requestScope.list}">
         
         	<h3> <a href="http://localhost:8080/getPolicy/${prop.id}">${prop.id} - <span>${prop.lifeInsurance.firstName }</span> - <span>${prop.lifeInsurance.lastName }</span></a></h3>
         
    </c:forEach>

</body>
</html>