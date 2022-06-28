<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>result</h1>
<h2>이름 : ${requestScope.studentBean.name }</h2>
<h2>국어 : ${requestScope.studentBean.kor }</h2>
<h2>영어 : ${requestScope.studentBean.eng }</h2>
<h2>수학 : ${requestScope.studentBean.meth }</h2>
<h2>스프링 : ${requestScope.studentBean.spring }</h2>

<h2>총점 : ${requestScope.student_sum }</h2>
<h2>평균 : ${requestScope.student_avg }</h2>

</body>
</html>