<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function hall Booking System</title>
	
	<style>
	h1{text-align:center;}
	h2{text-align:center;}
	table.center
	{
     margin-left: auto;
     margin-right:auto;
     background-color:black;
     }
     table.tg
	{
     margin-left: auto;
     margin-right:auto;
     background-color:black;
     }
	</style>
</head>
<body>
<div class="a"><spring:url value="/resources/external.css" var="mainCss" />
 <link href="${mainCss}" rel="stylesheet" /></div>
<p ><h2>Welcome to Function Hall Booking System</h2></p>
<!-- <table  class="center" border="10"   cellspacing="3" cellpadding ="3"  > -->
          
<!--            <tr><th><a href="login">Login</a></th> -->
<!--            <th><a href="persons">Register</a></th> -->
<!--            <th><a href="halls">Add hall </a></th> -->
<!--            <th><a href="">Logout</a></th></tr> -->
            
<!--              </table> -->

<h2>
	Add a Booking
</h2>

<c:url var="addAction" value="/booking/add" ></c:url>

<form:form action="${addAction}" commandName="booking">
<table class="center">
	<c:if test="${!empty booking.booking_username}">
	<tr>
		<td>
			<form:label path="bookingid">
				<spring:message text="BOOKINGID"/>
			</form:label>
		</td>
		<td>
			<form:input path="bookingid" readonly="true" size="8"  disabled="true" />
			<form:hidden path="bookingid" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="booking_username">
				<spring:message text="booking_username"/>
			</form:label>
		</td>
		<td>
			<form:input path="booking_username" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="bookingdate">
				<spring:message text="bookingDate"/>
			</form:label>
		</td>
		<td>
			<form:input path="bookingdate" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="booking_customername">
				<spring:message text="booking_customerName"/>
			</form:label>
		</td>
		<td>
			<form:input path="booking_customername" />
		</td> 
	</tr>
	 <tr>
		  
           <td> <label >Hall<span>*</span></label></td>
           <td><select style="height: 40px; width:300px" name = "credit_card_type" required>
            	<option value="">Please Select</option>
            	<option>RK_kalyanamandapam,1-2_rkpuram,nellore,andhra </option>
            	<option>gK_kalyanamandapam,1-4_rspuram,hyd,telangana </option>
            	<option> vedik_kalyanamandapam,1-3-4_ramalingapuram,bangalore,karnataka </option>
            	<option>abc_kalyanamandapam,1-3-4_sholinganallur,chennai,tamilnadu</option>
            	
            </select></td>
    </tr>
	<tr>
		<td>
			<form:label path="accountno">
				<spring:message text="accountNo"/>
			</form:label>
		</td>
		<td>
			<form:input path="accountno" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="booking_mobileno">
				<spring:message text="booking_Mobileno"/>
			</form:label>
		</td>
		<td>
			<form:input path="booking_mobileno" />
		</td> 
	</tr>
	
	<tr>
		<td colspan="2">
		 			<c:if test="${!empty booking.booking_username}"> 
 				<input type="submit"
 					value="<spring:message text="Update booking"/>" /> 
 			</c:if> 
			<c:if test="${empty booking.booking_username}">
				<input type="submit"
					value="<spring:message text="Booked"/>" />
			</c:if>
		</td>
		</tr>
	
</table>	
</form:form>
<br>



<h3>Bookings List</h3>
<c:if test="${!empty listBookings}">
	<table class="tg">
	<tr>
		<th width="80">Booking BOOKINGID</th>
		<th width="120">Booking  booking_username</th>
		<th width="120">Booking bookingDate</th>
		<th width="120">Booking booking_customerName</th>
		<th width="120">Booking accountNo</th>
		<th width="120">Booking booking_Mobileno</th>
		
		<th width="60">Update</th>
		<th width="60">Delete</th>
		<th width="60">Payment</th>
	</tr>
	<c:forEach items="${listBookings}" var="booking">
		<tr>
			<td>${booking.bookingid}</td>
			<td>${booking.booking_username}</td>
			<td>${booking.bookingdate}</td>
			<td>${booking.booking_customername}</td>
			<td>${booking.accountno}</td>
			<td>${booking.booking_mobileno}</td>
			
			
			<td><a href="<c:url value='/Update/${booking.bookingid}' />" >Update</a></td> 
			<td><a href="<c:url value='/removebooking/${booking.bookingid}' />" >Delete</a></td>
			<td><a href="<c:url value='/payment/${booking.bookingid}' />" >Payment</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>