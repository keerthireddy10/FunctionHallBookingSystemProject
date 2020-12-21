<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page import= "java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Hall Booking System</title>
<style >

h2{text-align:center;}
table.center
	{
     margin-left: auto;
     margin-right:auto;
     background-color:black;
     }
     

</style>
</head>
<body>

<div class="a">
<spring:url value="/resources/external.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" /></div>
<h2>Welcome to Function Hall Booking System</h2>
<table  class="center" border="10"   cellspacing="3" cellpadding ="3"  >
          
<!--            <tr><th><a href="login">Login</a></th> -->
<!--            <th><a href="persons">Register</a></th> -->
<!--            <th><a href="halls">Add hall </a></th> -->
<!--            <th><a href="">Logout</a></th></tr> -->
            
             </table>
      <h2>Make Payment</h2>
      
        <form action="/FunctionHallBookingSystem/lastpage" method="get">
        <table class="center">
          <tr>
		  <td> <label for="email">Credit Card Number<span>*</span></label></td>
            <td><input type="text"  required onkeypress="return IsNumeric(event);"  maxlength="16"></td>
           
          </tr>
          <tr>
          
            <td><label for="email">Name on Credit Card<span>*</span></label></td>
           <td> <input type="text"  name="Credit_card name" required ></td>
         
          </tr>
          <tr>
		 
           <td> <label for="email">Credit Card Type<span>*</span></label></td>
           <td><select style="height: 40px; width:300px" name = "credit_card_type" required>
            	<option value="">Please Select</option>
            	<option>MasterCard</option>
            	<option>Visa Card</option>
            	<option>Discover</option>
            	<option>Maestro</option>
            	<option>American Expresss</option>
            </select></td>
         
          </tr>
         
          <tr>
          
           <td> <label for="email">CVV No.<span>*</span></label></td>
           <td> <input type="text" name="cvv" required maxlength="4"></td>
          
          </tr>
          <tr>
         
            <td><label for="email">Total Amount.<span>*</span></label></td>
           <td> <input type="text" name="total_amount"  readonly value="25000"></td>
        
          </tr>
          
         </table>
           <a href="FunctionHallBookingSystem/lastpage"><input name="submit" type="submit" value="Make Payment"></a>
           <input  type="reset" value="Cancel Payment">
         </form>
</body>
</html>