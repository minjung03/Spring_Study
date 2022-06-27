<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>test3 result!!</h1>

<!-- 데이터들은 requestScope에 저장된다 -->
<h2>data3 : ${requestScope.data3}</h2>
<h2>data4 : ${data4}</h2> <!-- requestScope(영역)을 제외해도 잘 나온다 -->

</body>
</html>