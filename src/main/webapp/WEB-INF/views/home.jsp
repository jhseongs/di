<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
지현
</h1>
<form action="a.do" method="POST" name="first">
	<input type="text" name="test">
	<button type="submit">전송</button>
</form>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
