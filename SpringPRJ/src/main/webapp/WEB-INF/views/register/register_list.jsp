<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>ID</td>
<td>Name</td>
<td>Email</td>
<td>hp</td>
<td>etc</td>
</tr>

<c:forEach var="value" items="${userinfo }">
<tr>
<td>${value.userid }</td>
<td>${value.username }</td>
<td>${value.useremail }</td>
<td>${value.usertel }</td>
<td><a href="#">수정</a> <a href="#">삭제</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>