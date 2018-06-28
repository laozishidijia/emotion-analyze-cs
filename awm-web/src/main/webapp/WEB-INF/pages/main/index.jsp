<%@ page language="Java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>Visualgenome Data</title>
<meta charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="<%=basePath%>bootstrap/css/bootstrap.min.css">
<script src="<%=basePath%>bootstrap/js/jquery-3.3.1.min.js"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function SearchFunction(){
		document.getElementById("panel_view").setAttribute("src","http://localhost:8080/awm-web/image/index.html");
	}
</script>

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
					<button id="search" type="submit" class="btn btn-default" onclick="SearchFunction()">搜索</button>
				</form>
				<ul class=" nav navbar-nav navbar-right">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle"
							data-toggle="dropdown">选择角色 <span class="caret"></span>
						</a>
						<ul class="dropdown-menu " role="menu"
							aria-labelledby="dropdownMenu1">
							<li><a href="#" role="menuitem">管理员</a></li>
							<li><a href="#" role="menuitem">用户</a></li>
						</ul>
					</li>
					<li class=""><a href="#">登入</a></li>
					<li class=""><a href="#">注册</a></li>
				</ul>
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

	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading">
				<h4>Object Data</h4>
			</div>
			<div class="panel-body">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" src="http://localhost:8080/awm-web/image/index.html" id="panel_view"></iframe>
				</div>
			</div>
		</div>
	</div>

</body>
</html>