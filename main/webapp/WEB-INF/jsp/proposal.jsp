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


<h2> Final proposal. </h2>


<form:form method="post" action="submitProposal" modelAttribute="p">
	
		
		Enter City			:	<form:input path="city"/> <br>
		Enter Education Qualification		:	<form:input path="education"/> <br>
		Enter Occupation			:	<form:input path="occupation"/> <br>
		
        
        Choose Payment Mode(10% reducation in half-yearly and 15% in annually) : <form:select path="paymentMode">  
        <form:option value="monthly" label="Monthly"/>  
        <form:option value="half-yearly" label="Half-yearly"/>  
        <form:option value="annually" label="Anually"/>
        
        </form:select>  
        <br><br>  
        
      
		
		
		<input type="submit">
	
	</form:form>  

</body>
</html>