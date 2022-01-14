<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="/Web_test/favicon.ico">
<title>Insert title here</title>
	<head>
		<meta charset="UTF-8">
		<!--<meta http-equiv="refresh" content="0;url=<%=request.getContextPath()%>/access.do?method=home">-->
		<title>Insert title here</title>
	</head>
	<body>
	
		<p>正在跳转...</p>
		<p>若长时间未进行跳转，请<a href="">刷新</a>页面</p>
		<script>
		window.location.href = /Android|webOS|iPhone|iPod|BlackBerry/i.test(navigator.userAgent) ? "<%=request.getContextPath()%>/access.do?method=home&ua=android" :  "<%=request.getContextPath()%>/access.do?method=home&ua=windows";
		</script>
	</body>
</html>
