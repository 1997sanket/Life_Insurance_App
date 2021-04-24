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


<h2> Display proposal. </h2>


	<%-- <h1>${sessionScope.proposal} </h1> --%>
	
	<span>Proposal ID	:		<strong>${sessionScope.proposal.id }</strong> </span> <br><br>
	
	<span>Proposer name	:		<strong>${sessionScope.proposal.accidentalDeath.lifeInsurance.firstName }</strong> </span> <br><br>	
	
	<span>Final Premium (including taxes)	:		<strong>${sessionScope.proposal.finalPremium}</strong> /month</span> <br><br>	
	
	<a href="http://localhost:8080/logout"> Home </a>
	


</body>
</html>