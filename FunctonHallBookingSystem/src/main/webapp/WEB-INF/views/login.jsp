<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>  Function Hall Booking System</title>
<style>

div{text-align:center;}

</style>
</head>
<body  vlink="black" link="white" alink="white">
 <p style="color:white"><h2>Welcome to Function Hall Booking System</h2></p>
<div class="a"><spring:url value="/resources/external.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" /></div>
 

		<div>
		
		<form action="/bookings" method="get">
		
		Enter user name<span>*</span>:<input type="text" name="uname" required ><br>
		Enter password<span>*</span>:<input type="password" name="pwd" required><br>
        <a href="bookings"><input type="button" value="login"></a><input type="reset"><br>
		  New user? Register here <a href="persons"> Register</a>
			 </form>
		 
		
		 	
		  
		  
		  
		</div>
		
      
    </main>
  </div>
</div>


</body>
</html>