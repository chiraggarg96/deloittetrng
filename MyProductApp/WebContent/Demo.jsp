<%@ taglib uri="/WEB-INF/customtag.tld" prefix="a"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--I am comment bro --%>

	<%
		for (int i = 0; i <= 3; i++) {
	%>
	Outside Loop:<%
		out.println("<br> Inside Loop");
		}
	%>
	<c:forEach begin="1" end="5" step="1">
	<br>Hello
	</c:forEach>	
<a:delloiteadd></a:delloiteadd>
</body>
</html>