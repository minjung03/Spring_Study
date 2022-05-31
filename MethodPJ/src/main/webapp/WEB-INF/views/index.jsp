<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>hello</h1>
<img src="img/1.svg" width="150" height="150"/>

<a href="test1">test1 get</a><br>

<form method="POST" action="test2">
ID : <input type="text" name="userid"/><br/>
PW : <input type="text" name="userpw"/><br/>
<button type="submit">Login</button>
</form>

<a href="test3">test3 get_post</a>

<a href="test4">test4 get</a>

<form method="POST" action="test5">
ID : <input type="text" name="userid"/><br/>
PW : <input type="text" name="userpw"/><br/>
<button type="submit">Login</button>
</form>

</body>
</html>