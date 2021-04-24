<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> User registration for</h1>
<br>
<br>


	<form:form method="post" modelAttribute="newUser">
	
		
		Username	:	<form:input path="userName" /> <br> 
		Password	:	<form:input path="password" type="password" /> <br>
		First name	:	<form:input path="firstName" /> <br>
		Last name	:	<form:input path="lastName" /> <br>
		Email		:	<form:input path="email" type="email"/> <br>
		
		
		<input type="submit">
	
	</form:form>
	

</body>
</html>




