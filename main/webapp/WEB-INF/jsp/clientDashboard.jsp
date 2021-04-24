<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h2> Client name	:	${requestScope.client.firstName}</h2>
	
	
	<br><br>
	
	<a href="newProposal/${client.id}"> Create new Proposal </a> <br> <br>
	
	
	<%-- <a href="http://localhost:8080/listOfPolicies"> List of Policies </a> <br> <br>
	
	<a href="http://localhost:8080/listOfRejectedProposals"> List of Rejected Proposals </a> <br> <br>  --%>
	

</body>
</html>