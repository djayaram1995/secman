<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SecMan</title>
</head>
<body>
	Hi guys
	<div>
	username: <security:authentication property="principal.username"/>
	</div>
	<div>
		authorization: <security:authentication property="principal.authorities"/>
		</div>
	<div>
	<form method="post" action="${pageContext.request.contextPath}/logout">
		<input type="submit">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	</form>
	</div>
</body>
</html>