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
	<c:if test="${test==0}">
	입력값없음
	</c:if>
	<c:if test="${test!=0}">
	곱셈:${test}
	</c:if>
	
</form>


</body>
</html>
