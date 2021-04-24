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


<h2> Term Insurance Form. </h2>


<form:form method="post" action="/clientDashboard/termInsurance" modelAttribute="li">
	
		
		First name			:	<form:input path="firstName"/> <br>
		Last name		:	<form:input path="lastName"/> <br>
		DOB			:	<form:input id="dob" path="DOB" type="date" onchange="getAge(event)"/> <br>
		Age			:	<form:input id="ag" path="age" type="number" /> <br>
		Mobile		:	<form:input path="mobile" type="number" /> <br>
		Gender:   
        Male <form:radiobutton path="gender" value="Male"/>  
        Female <form:radiobutton path="gender" value="Female"/>    
         <br>
		
		Does client consume tobacco ?		:	Yes <form:radiobutton path="consumeTobacco" value="yes"/>  
        										No  <form:radiobutton path="consumeTobacco" value="no"/>    <br>
        										
        Annual Income	:	<form:input path="annualIncome" type="number" /> <br>
        
        Cover Amount : <form:select path="coverAmount">  
        <form:option value="10000000" label="1 Crore"/>  
        <form:option value="20000000" label="2 Crore"/>  
        <form:option value="30000000" label="3 Crore"/>
        
        </form:select>  
        <br><br>  
        
        Cover upto Age	:	<form:select path="coverUpToAge">  
        <form:option value="60" label="60 years"/>  
        <form:option value="80" label="80 years"/>  
        <form:option value="100" label="100 years"/>
        
        </form:select>  
        <br><br>  
		
		
		<input type="submit">
	
	</form:form>
	
	
	<script>
		
	function getAge(e) 
	{
		
	  const date = e.target.value;
	  
	  const birthYear = new Date(date).getFullYear();
	  
	  
	  
	  const currentYear = new Date().getFullYear();
	  
	  
	  
	  document.getElementById("ag").value = currentYear - birthYear;
	} 
	
	</script>

</body>
</html>