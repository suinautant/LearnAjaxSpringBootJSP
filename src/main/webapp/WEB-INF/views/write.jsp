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
	<h2>JSP AJAX - WRITE</h2>
	<form id="writeForm" method="post">
		이름 : <input type="text" id="formName" name="name" /><br /> 역할 : <input
			type="text" id="formRole" name="role" /><br />
		<button type="button" onclick="fn_writeForm();">등록</button>
		<button type="button" onclick="location.href='/api/list'">목록</button>
	</form>

	<script type="text/javascript">
		function fn_writeForm() {
			$.ajax({
				type : "POST",
				async : true,
				dataType : "json",
				contentType : 'application/json',
				url : "/employees",
				data : JSON.stringify({
					name : $('#formName').val(),
					role : $('#formRole').val()
				}),
				success : function(data) {
					location.href = "/api/list/" + data.id;
				},
				error : function(xhr) {
					console.log("error : " + xhr.statusText);
				}
			});

		}
	</script>
</body>
</html>