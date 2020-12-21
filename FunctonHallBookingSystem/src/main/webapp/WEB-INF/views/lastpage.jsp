<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Hall Booking System</title>
</head>
<style>
h1{text-align:center;
}
table.center
	{
     margin-left: auto;
     margin-right:auto;
     background-color:black;
     }
</style>
<body>
<spring:url value="/resources/external.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" /></div>

  <table  class="center" border="10"   cellspacing="3" cellpadding ="3"  > 
          
<!-- <!--            <tr><th><a href="login">Login</a></th> --> -->
<!-- <!--            <th><a href="persons">Register</a></th> --> -->
<!-- <!--            <th><a href="halls">Add hall </a></th> --> -->
            <tr><th><a href="">Logout</a></th></tr> 
            
             </table>
          
<h1>Congratulations! Hall Booked</h1>
</body>
</html>