<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>hi Spring MVC</h1>
<img src="img/1.svg" width="300" height="300"/><br/>

<a href="test1?data1=100&data2=200">test1 map으로 받기</a><br/>
<a href="test2?data1=100&data2=200&data3=300&data3=400">test2 List으로 받기</a><br>
<a href="test3?data1=500&data2=600&data3=700">test3 @ModelAttribute</a><br>
<a href="test4?data1=500&data2=600&data3=700&data3=800">test4 @ModelAttribute</a><br>

</body>
</html>