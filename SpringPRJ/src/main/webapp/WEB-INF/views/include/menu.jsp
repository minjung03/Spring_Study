<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu.jsp</title>
<link href="../../../resources/css/main.css" rel="stylesheet"/>
</head>
<body>

<a href="multipli">구구단</a><br/>
<a href="score">성적 구하기</a><br/>
<a href="login">로그인</a><br/>
<a href="join">회원가입</a><br/>
<a href="upload">파일 업로드</a><br/>
<a href="register">MyBatis를 이용한 회원가입</a><br/>
<a href="register_list">회원 목록</a>

<hr/>

<!-- 
<table>
<tr>
<td>ID</td>
<td>Name</td>
<td>Email</td>
<td>hp</td>
<td>etc</td>
</tr>

<c:forEach var="value" items="${userinto }">
<tr>
<td>${value.userid }</td>
<td>${value.username }</td>
<td>${value.useremail }</td>
<td>${value.usertel }</td>
<td><a href="#">수정</a> <a href="#">삭제</a></td>
</tr>
</c:forEach>
</table>
 -->
 
</body>
</html>