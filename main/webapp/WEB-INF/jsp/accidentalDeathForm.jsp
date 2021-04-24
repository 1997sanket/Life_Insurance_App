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

<h3> Premium is 10rs for every 50k of coverage </h3>

<form:form method="post" action="/clientDashboard/accidentlDeathBenifit" modelAttribute="ad">

	Cover Amount : <form:select path="coverageAmount">  
        <form:option value="50000" label="5o thousand"/>  
        <form:option value="100000" label="1 lac"/>  
        <form:option value="150000" label="1.5 lac"/>
        
        </form:select>  <br> <br>
        
        
        <input type="submit">

</form:form>

</body>
</html>