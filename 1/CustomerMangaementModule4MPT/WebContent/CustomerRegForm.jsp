<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="main.css" />
</head>
<body>
<form:form action="regform.obj" method="post" commandName="cust">
  <table align="center" cellpadding="5px" cellspacing="0" border="2px">
            <tr>
                <th colspan="2">Customer Registration Form</th>
            </tr>
            <tr>
                <td>Customer Name *</td>
                <td colspan="2">
                <form:input path="customerName"/><form:errors path="customerName"/></td>
            </tr>
            <tr>
	            <td>Customer ID </td>
	            <td colspan="2">
	            <form:input path="custId"/><form:errors path="custId"/></td>
           </tr>
           <tr>
           		<td>Customer Mobile No</td>
           		 <td colspan="2">
           		 <form:input path="mobNo"/><form:errors path="mobNo"/></td>
           	</tr>
           	<tr>
           		<td>Customer Email Id</td>
           		<td colspan="2">
           		<form:input path="email"/><form:errors path="email"/></td>
           	</tr>
           	<tr>
           		<td>Customer d.o.b</td>
           		<td colspan="2">
           		<form:input path="custDob"/><form:errors path="custDob"/></td>
           	</tr>
           	<tr>
           	<td colspan="2">
           	<input type="submit" value="Submit Customer Details">
           	</td>
           	</tr>
           		
         
          
           		 
            
   </table>
   </form:form>
</body>
</html>