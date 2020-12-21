<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Hall Booking System</title>
<style>
div{text-align:center;}
table.center{
margin-left: auto;
margin-right:auto;
}
</style>
</head>
<body>
<spring:url value="/resources/external.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" /></div>
 <div><p style="color:white"><h1>Welcome to Function Hall Booking System</h1></p></div>
 <table  class="center" border="10"   cellspacing="3" cellpadding ="3"  >
          
           <tr><th><a href="home">adminlogin</a></th>
           <th><a href="home">userlogin</a></th></tr>
           </table>
</body>
</html>