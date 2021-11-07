<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>스프링 부트 / JSP</title>
</head>
<body>
	<h2>스프링부트 model 값 JSP 받기</h2>
	<div>
		<table border="1">
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>취미</th>
				<th>객체</th>
			</tr>

			<c:forEach items="${hobbys}" var="hobby">
				<tr>
					<th>${hobby.getIdx()}</th>
					<th>${hobby.getName()}</th>
					<th>${hobby.getHobby()}</th>
					<th>${hobby}</th>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>