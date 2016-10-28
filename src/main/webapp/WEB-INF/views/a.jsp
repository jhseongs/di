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
	컨트롤러 *  
</h1>
<form action="a1.do" method="POST" name="first">
	<input type="text" name="test" value="${test}" readonly="readonly"> * 
	<input type="text" name="test1">
	
	<button type="submit">전송</button>
</form>


</body>
</html>
