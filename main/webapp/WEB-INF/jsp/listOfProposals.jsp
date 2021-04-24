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

<h1>List of proposals </h1>

	<c:if test = "${requestScope.list.isEmpty() }">
	
		<h2> Sorry, no proposals currently. </h2>
		
	</c:if>

	<c:forEach var = "proposal" items = "${requestScope.list}">
         
         	<h3> <a href="proposalDashboard/${proposal.id}"> <span> ${proposal.id} </span>- ${proposal.accidentalDeath.lifeInsurance.firstName}</a></h3>
         
    </c:forEach>

</body>
</html>