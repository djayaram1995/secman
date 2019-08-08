<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>done</title>
</head>
<body>
Super
<security:authorize access="hasRole('ADMIN')">
	<a href="${pageContext.request.contextPath}/seccheck">Super secload</a>
</security:authorize>
</body>
</html>