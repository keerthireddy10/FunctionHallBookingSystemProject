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
<title>Function Hall Booking System</title>

	<style>
	
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
	Add a Hall
</h2>
<c:url var="addAction" value="/hall/add" ></c:url>

<form:form action="${addAction}" commandName="hall">
<table class="center">
	<c:if test="${!empty hall.hallname}">
	<tr>
		<td>
			<form:label path="hallid">
				<spring:message text="HALlID"/>
			</form:label>
		</td>
		<td>
			<form:input path="hallid" readonly="true" size="8"  disabled="true" />
			<form:hidden path="hallid" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="hallname">
				<spring:message text="hallName"/>
			</form:label>
		</td>
		<td>
			<form:input path="hallname" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="halladdress">
				<spring:message text="hallAddress"/>
			</form:label>
		</td>
		<td>
			<form:input path="halladdress" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="hallcity">
				<spring:message text="hallCity"/>
			</form:label>
		</td>
		<td>
			<form:input path="hallcity" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="hallstate">
				<spring:message text="hallState"/>
			</form:label>
		</td>
		<td>
			<form:input path="hallstate" />
		</td> 
	</tr>
	
	<tr>
		<td colspan="2">
 			<c:if test="${!empty hall.hallname}"> 
 				<input type="submit" 
 					value="<spring:message text="Edithall hall"/>" /> 
 			</c:if> 
			<c:if test="${empty hall.hallname}">
				<input type="submit"
					value="<spring:message text=" Add Hall"/>" />
			</c:if>
		</td>
		</tr>
	
</table>	
</form:form>
<br>
<h3>Halls List</h3>
<c:if test="${!empty listHalls}">
	<table class="tg">
	<tr>
		<th width="80">Hall HALLID</th>
		<th width="120">Hall  hallName</th>
		<th width="120">Hall hallAddress</th>
		<th width="120">Hall hallCity</th>
		<th width="120">Hall hallState</th>
		
	<th width="60">Edithall</th> 
		<th width="60">removehall</th>
	</tr>
	<c:forEach items="${listHalls}" var="hall">
		<tr>
			<td>${hall.hallid}</td>
			<td>${hall.hallname}</td>
			<td>${hall.halladdress}</td>
			<td>${hall.hallcity}</td>
			<td>${hall.hallstate}</td>
			
			
 			<td><a href="<c:url value='/edithall/${hall.hallid}' />" >Edithall</a></td> 
			<td><a href="<c:url value='/removehall/${hall.hallid}' />" >removehall</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>