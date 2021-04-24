<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Protect top up </h1>

<span> Your Life Insurance Premium/ month is : <strong>${requestScope.premium}</strong> </span> <br> <br>

<h3>Include Top up for life protect ?</h3>

<a href="accidentalDeathBenifit/${requestScope.li2.id}"> Accidental death benifit</a> <br><br>



<a href="calculateFinalPremium"> <h3>Calculate final premium </h3></a>


</body>
</html>