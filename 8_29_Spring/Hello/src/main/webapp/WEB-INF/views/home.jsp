<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>
	<div class="container">
	<h1>인덱스 페이지 입니다.</h1>
	<p>오늘의 날씨 : <strong>${requestScope.weatherToday}</strong></p>
	<ul>
		<li><a href="${pageContext.request.contextPath}/study">공부하러 가기</a></li>
		<li><a href="${pageContext.request.contextPath}/play">놀러가기</a></li>
	</ul>
	</div>
</body>
</html>