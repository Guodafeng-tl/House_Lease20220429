<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- APP_PATH 获取服务器的路径 以/开始  但是不以/结尾 -->

<!-- web路径问题总结 -->
<!-- 不以/开始的相对路径,找资源以当前资源的路径为基准,经常容易出问题 -->
<!-- 以/开始的相对路径,找资源以服务器的路径为基准(http://localhost:3306) 需要加上项目名-->

<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery.min.js"></script>
<!-- 引入样式 bootstrap -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>index</h1>
	<button class="btn btn-success">"按钮"</button>
	<button class="btn btn-danger">"按钮"</button>
	
</body>
</html>