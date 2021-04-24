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

		Policy ID	:	<strong> ${requestScope.proposal.id}</strong> <br> <br>
	
		First name	:	<strong> ${requestScope.proposal.lifeInsurance.firstName}</strong> <br> <br>
		
		Last name	:	<strong> ${requestScope.proposal.lifeInsurance.lastName}</strong> <br> <br>
		
		Gender	:	<strong> ${requestScope.proposal.lifeInsurance.gender}</strong> <br> <br>
		
		DOB	:	<strong> ${requestScope.proposal.lifeInsurance.DOB}</strong> <br> <br>
		
		City	:	<strong> ${requestScope.proposal.city}</strong> <br> <br>
		
		Education	:	<strong> ${requestScope.proposal.education}</strong> <br> <br>
		
		Occupation	:	<strong> ${requestScope.proposal.occupation}</strong> <br> <br>
		
		Payment Mode	:	<strong> ${requestScope.proposal.paymentMode}</strong> <br> <br>
		
		Consumes Tobacco ?	:	<strong> ${requestScope.proposal.lifeInsurance.consumeTobacco}</strong> <br> <br>
		
		Annual Income	:	<strong> ${requestScope.proposal.lifeInsurance.annualIncome}</strong> <br> <br>
		
		Life Insurance Cover amount	:	<strong> ${requestScope.proposal.lifeInsurance.coverAmount}</strong> <br> <br>
		
		Cover Upto Age	:	<strong> ${requestScope.proposal.lifeInsurance.coverUpToAge}</strong> <br> <br>
		
		Accidental Death coverage amount	:	<strong> ${requestScope.proposal.accidentalDeath.coverageAmount}</strong> <br> <br>
		
		Accidental Death Premium	:	<strong> ${requestScope.proposal.accidentalDeath.premium}</strong> <br> <br>
		
		Comprehensive care coverage amount	:	<strong> ${requestScope.proposal.comprehensiveCare.coverageAmount}</strong> <br> <br>
		
		Comprehensive care Premium	:	<strong> ${requestScope.proposal.comprehensiveCare.premium}</strong> <br> <br> <br>
		
		
		Final Premium	:	<strong> ${requestScope.proposal.finalPremium}</strong> / month <br> <br> <br>
		
		
		<%
			session.setAttribute("prop", request.getAttribute("proposal"));
		%>
	
		
		
		
		
		
		
		

</body>
</html>