

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="main.css" />
</head>
<body>
<TABLE>

<h1>Customer  list Information.</h1>
<c:forEach items = "${list}" var = "list">
	<c:out value="${list.custId}"><br/></c:out>
	<c:out value="${list.customerName}"><br/></c:out>
	<c:out value="${list.mobNo}"><br/></c:out>
	<c:out value="${list.email}"><br/></c:out>
	<c:out value="${list.custDob}"><br/></c:out>
	<br/>
</c:forEach> 
</TABLE>
</body>
</html> 