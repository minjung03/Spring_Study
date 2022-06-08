<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<a href="test1?data1=100&data2=200">test1 (HttpRequest)</a>
<hr>
<a href="test2?data1=100&data2=200&data3=300&data3=400">test2 (HttpRequest)</a> <!-- 같은 이름의 데이터가 2개 있다(배열 형식으로 넘어감) -->
<hr>
<a href="test3?data1=10&data2=20&data3=30">test3 (WebRequest)</a>
<hr>
<a href="test4/100/200/300">test4 (@PathVariable)</a>
<hr>
<a href="test5?data1=100&data2=200&data3=300&data3=400&data4=500">test5 (Request Param)</a>
<hr>

</body>
</html>