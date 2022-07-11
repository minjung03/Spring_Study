<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>join.jsp</title>
</head>
<body>

<form action="join_re" method="post">
이름 : <input type="text" name="name"/></br>
아이디 : <input type="text" name="id"/></br>
비밀번호 : <input type="text" name="pass"/></br>
생년월일 : <input type="date" name="birth"/></br>
핸드폰 : <input type="text" name="phone"/></br>
<button type="submit">회원가입</button>
</form>

</body>
</html>