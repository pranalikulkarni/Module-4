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
<table>
<tr>
<td>Customer Name:</td>
<td>
${m.customerName}
</td>
</tr>
<tr>
<td>Customer Id:</td>
<td>
${m.custId}
</td>
</tr>
<tr>
<td>Mobile NO:</td>
<td>
${m.mobNo}
</td>
</tr>
<tr>
<td>Email:</td>
<td>
${m.email}
</td>
</tr>
<tr>
<td>Date Of Birth</td>
<td>
${m.custDob}
</td>
</tr>
</table>
</body>
</html>