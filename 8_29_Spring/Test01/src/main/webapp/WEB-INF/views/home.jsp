<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/view/home.jsp</title>
</head>
<body>
<div class="container">
	<h1>구름이네 집!</h1>
	<p>구름이네 집은 어디에 있나요? : <strong>${requestScope.GsHouse}</strong></p>
	<ul>
		<li><a href="${pageContext.request.contextPath}/breed">구름이의 종은?</a></li>
		<li><a href="${pageContext.request.contextPath}/age">구름이의 나이는?</a></li>
	</ul>
</div>
</body>
</html>