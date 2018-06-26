<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visualgenome Data</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href="<%=basePath%>bootstrap/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="<%=basePath%>bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Visualgenome </a>
		</div>

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav" id="mytab">
				<li class="active"><a href="#">Home</a></li>
				<li class=""><a href="#">API</a></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input class="form-control" type="text" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">搜索</button>
			</form>
			<ul class=" nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">选择角色 <span class="caret"></span>
				</a>
					<ul class="dropdown-menu " role="menu"
						aria-labelledby="dropdownMenu1">
						<li><a href="#" role="menuitem">管理员</a></li>
						<li><a href="#" role="menuitem">用户</a></li>
					</ul></li>
				<li class=""><a href="#">登入</a></li>
				<li class=""><a href="#">注册</a></li>
				<ul>
		</div>
	</div>
	</nav>

	<div class="jumbotron">
		<div class="container">
			<h1>Visualgenome Json Data</h1>
			<p>We provide JSON data for Visualgenome</p>
			<p>
				<a class="btn btn-info btn-lg" href="#" role="button">Learn More</a>
			</p>
		</div>
	</div>
</body>
</html>