<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Hall Booking System</title>
<style >
table.center{
margin-left: auto;
margin-right:auto;
}
div{text-align:center;}
</style>
</head>
<body  vlink="white" link="black" alink="white" >
 
<div class="a"><spring:url value="/resources/external.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" /></div>
           
           
		 
		<div><p style="color:white"><h1>Welcome to Function Hall Booking System</h1></p></div>
          <table  class="center" border="10"   cellspacing="3" cellpadding ="3"  >
          
           <tr><th><a href="login">Login</a></th>
           <th><a href="persons">Register</a></th>
           <th><a href="halls">Add hall </a></th>
           <th><a href="">Logout</a></th></tr>
            
             </table>
         

</body>
</html>