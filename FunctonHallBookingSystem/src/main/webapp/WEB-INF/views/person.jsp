<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>
<head>
	<title>Function hall Booking System</title>
	
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
<table  class="center" border="10"   cellspacing="3" cellpadding ="3"  >
          
<!--            <tr><th><a href="login">Login</a></th> -->
<!--            <th><a href="persons">Register</a></th> -->
<!--            <th><a href="halls">Add hall </a></th> -->
<!--            <th><a href="">Logout</a></th></tr> -->
            
             </table>

<h2>
	Add a Customer
</h2>

<c:url var="addAction" value="/person/add" ></c:url>

<form:form action="${addAction}" commandName="person">
<table class="center">
	<c:if test="${!empty person.customername}">
	<tr>
		<td>
			<form:label path="customerid">
				<spring:message text="CUSTOMERID"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerid" readonly="true" size="8"  disabled="true" />
			<form:hidden path="customerid" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="customername">
				<spring:message text="customerName"/>
			</form:label>
		</td>
		<td>
			<form:input path="customername" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customermobileno">
				<spring:message text="customerMobileno"/>
			</form:label>
		</td>
		<td>
			<form:input path="customermobileno" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customeremail">
				<spring:message text="customerEmail"/>
			</form:label>
		</td>
		<td>
			<form:input path="customeremail" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customerusername">
				<spring:message text="customerUserName"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerusername" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customerpassword">
				<spring:message text="customerPassword"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerpassword" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customeraddress">
				<spring:message text="customerAddress"/>
			</form:label>
		</td>
		<td>
			<form:input path="customeraddress" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customercity">
				<spring:message text="customerCity"/>
			</form:label>
		</td>
		<td>
			<form:input path="customercity" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customerstate">
				<spring:message text="customerState"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerstate" />
		</td> 
	</tr>
	 <tr>
		<td>
			<form:label path="customerpincode">
				<spring:message text="customerPincode"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerpincode" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty person.customername}">
				<input type="submit"
					value="<spring:message text="Edit Person"/>" />
			</c:if>
			<c:if test="${empty person.customername}">
				<input type="submit"
					value="<spring:message text="Register"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>



<h3>Customers List</h3>
<c:if test="${!empty listPersons}">
	<table class="tg">
	<tr>
		<th width="80">Person CUSTOMERID</th>
		<th width="120">Person customerName</th>
		<th width="120">Person customerMobileno</th>
		<th width="120">Person customerEmail</th>
<!-- 		<th width="120">Person customerUserName</th> -->
<!-- 		<th width="120">Person customerPassword</th> -->
		<th width="120">Person customerAddress</th>
		<th width="120">Person customerCity</th>
		<th width="120">Person customerState</th>
		<th width="120">Person customerPincode</th>
		<th width="60">Edit</th>
		<th width="60">Deletecustomer</th>
		<th width="60">login</th>
	</tr>
	<c:forEach items="${listPersons}" var="person">
		<tr>
			<td>${person.customerid}</td>
			<td>${person.customername}</td>
			<td>${person.customermobileno}</td>
			<td>${person.customeremail}</td>
<%-- 			<td>${person.customerusername}</td> --%>
<%-- 			<td>${person.customerpassword}</td> --%>
			<td>${person.customeraddress}</td>
			<td>${person.customercity}</td>
			<td>${person.customerstate}</td>
			<td>${person.customerpincode}</td>
			<td><a href="<c:url value='/edit/${person.customerid}' />" >Edit</a></td>
			<td><a href="<c:url value='/removecustomer/${person.customerid}' />" >Deletecustomer</a></td>
			<td><a href="<c:url value='/login/${person.customerid}' />" >login</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
