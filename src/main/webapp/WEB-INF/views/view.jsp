<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP AJAX</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
	<h2>JSP AJAX - VIEW</h2>
	<div id="view"></div>
	<button type="button" onclick="location.href='/api/modify?id=${id}'">수정</button>
	<br />
	<button type="button" onclick="deleteList(${id});">삭제</button>
	<br />
	<button type="button" onclick="location.href='/api/list'">목록</button>


	<script type="text/javascript">
		$(document).ready(
				function() {
					var id = "${id}";
					$.ajax({
						url : "http://localhost:8080/employees/" + id,
						method : 'GET',
						success : function(item) {
							$('#view').append(
									"<ul><li>번호 : " + item.id
											+ " </li><li>이름 :  " + item.name
											+ "</li><li> 역할 : " + item.role
											+ "</li></ul>");
						},
						error : function(xhr) {
							console.log("error : " + xhr.statusText);
						}
					});
				});
		function deleteList(id) {
			$.ajax({
				type:"DELETE",
				async:true,
				url : "/employees/" + id,
				success : function(data) {
					location.href="/api/list";
				},
				error : function(xhr) {
					console.log("error : " + xhr.statusText);
				}
			});
		}
	</script>
</body>
</html>