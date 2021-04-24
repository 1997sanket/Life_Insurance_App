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

<h1> Create client </h1>
<br>
<br>


<c:if test = "${sessionScope.username != null }">

<form:form method="post" modelAttribute="selectedClient">
	
		
		
		First name	:	<form:input path="firstName" /> <br>
		Last name	:	<form:input path="lastName" /> <br>
		Email		:	<form:input path="email" type="email"/> <br>
		
		
		<input type="submit">
	
	</form:form>

</c:if>


<c:if test = "${sessionScope.username == null }">
	
		<h1> Cannot come here without logging in. </h1>
		
	</c:if>

	
	

</body>
</html>




