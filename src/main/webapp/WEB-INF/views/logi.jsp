<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SecMan</title>
</head>
<body>
	<form:form action="logiProcess" method="post">
	<c:if test="${param.error != null}">
	Sorry wrong u are
	</c:if>
	<c:if test="${param.logout != null}">
	logout ayiduchi
	</c:if>
		<input name="username" type="text">
		<input name="password" type="password">
		<input value="login" type="submit">
	</form:form>
</body>
</html>