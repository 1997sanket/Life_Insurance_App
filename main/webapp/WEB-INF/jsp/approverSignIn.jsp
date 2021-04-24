<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Approver Sign in </h1>
<br>
<br>
   
         
    <form:form method="post" modelAttribute="ap">
	
		
		Username	:	<form:input path="username" /> <br> 
		Password	:	<form:input path="password" type="password" /> <br>
		
		
		
		<input type="submit">
	
	</form:form>
         
    
 
</body>
</html>




