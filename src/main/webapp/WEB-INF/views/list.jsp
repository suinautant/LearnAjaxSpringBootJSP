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
	<h2>JSP AJAX - LIST</h2>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>역할</th>
			</tr>
		</thead>
		<tbody id="list">
		</tbody>
	</table>
	<a type="button" href="/api/write">작성</a>

</body>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$
								.ajax({
									url : "http://localhost:8080/employees",
									method : 'GET',
									success : function(items) {
										items
												.forEach(function(item, index) {
													$('#list')
															.append(
																	"<tr><td>"
																			+ item.id
																			+ "</td><td>"
																			+ "<a href=\'/api/list/"+item.id+"\'>"
																			+ item.name
																			+ "</a>"
																			+ "</td><td>"
																			+ item.role
																			+ "</td></tr>");

												})
									},
									error : function(xhr) {
										console
												.log("error : "
														+ xhr.statusText);
									}
								});
					});
</script>
</html>