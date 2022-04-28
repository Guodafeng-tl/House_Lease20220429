<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎来到登录界面</title>
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
	<style>
		body{
			background-image: url("./images/e.jpg");
			background-size: cover;
			background-repeat: no-repeat;
		}
	</style>
</head>
<body>

	<!-- 搭建登录显示界面 -->
	<div class="container" >
		<div class="row">
			<!-- 标题 -->
			<div class="col-md-12 col-md-offset-1">
				 <h1>Welcome to</h1>
				<div class="col-md-5 col-md-offset-1">
				  <h4>the rental housing system</h4>
			    </div>
			</div> 
			
		</div>
		<!-- 用户名 密码-->
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<br/>
				<form class="form-horizontal" action="${APP_PATH}/login" method="post">
				  <div class="form-group">
				    <label for="inputUser" class="col-sm-3 control-label">用户名</label>
				    <div class="col-sm-9">
				      <input name="userid" type="text" class="form-control" id="inputUser" placeholder="请输入用户名/手机号/邮箱">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputPassword" class="col-sm-3 control-label">密码</label>
				    <div class="col-sm-9">
				      <input name="password" type="password" class="form-control" id="inputPassword" placeholder="请输入密码">
				    </div>
				  </div>
				  <div class="form-group">
				    <div class="col-sm-offset-3 col-md-9">
				      <button type="submit" class="btn btn-success" style="height: 35px;width: 213px">登录</button>
				    </div>
				  </div>
				</form>
			</div> 
		</div>
	</div>
	
</body>
</html>