<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SecMan</title>
</head>
<body>
	Hi guys
	<div>
	<form method="post" action="${pageContext.request.contextPath}/logout">
		<input type="submit">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	</form>
	</div>
</body>
</html>