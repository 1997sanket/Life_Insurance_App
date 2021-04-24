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

<h3> Premium is 400rs for every 3 lac of coverage </h3>

<form:form method="post" action="/clientDashboard/comprehensiveCare" modelAttribute="cc">

	Cover Amount : <form:select path="coverageAmount">  
        <form:option value="300000" label="3 lac"/>  
        <form:option value="600000" label="6 lac"/>  
        <form:option value="900000" label="9 lac"/>
        
        </form:select>  <br> <br>
        
        
        <input type="submit">

</form:form>

</body>
</html>