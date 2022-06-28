<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>data1, data2의 결과값</h1>

<!--  
<h2>data1 : ${requestScope.dataBean.data1 }</h2>
<h2>data2 : ${requestScope.dataBean.data2 }</h2>
-->

<!-- request 영역에 객체 이름 지정해서 저장하는 방법(testBean이라 지정) -->
<h2>data1 : ${requestScope.testBean.data1 }</h2>
<h2>data2 : ${requestScope.testBean.data2 }</h2>

</body>
</html>