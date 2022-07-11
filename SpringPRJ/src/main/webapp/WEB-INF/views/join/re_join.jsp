<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>re_join.jsp</title>
</head>
<body>

<h1>회원가입 결과</h1>
<h2>이름 : ${requestScope.person.name }</h2>
<h2>아이디 : ${requestScope.person.id }</h2>
<h2>비밀번호 : ${requestScope.person.pass }</h2>
<h2>생년월일 : ${requestScope.person.birth }</h2>
<h2>핸드폰 : ${requestScope.person.phone }</h2>

</body>
</html>