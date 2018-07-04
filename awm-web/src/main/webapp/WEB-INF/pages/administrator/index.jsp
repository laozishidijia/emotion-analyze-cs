<%@ page language="Java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String extjsPath = "http://202.196.37.91:8080/ext-4.2.1.883/";
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
<link rel="stylesheet"
	href="<%=basePath%>/resources/js/administrator/admin.css">


<script type="text/javascript">
	var localObj = window.location;
	var contextPath = localObj.pathname.split("/")[1];
	var basePath = localObj.protocol + "//" + localObj.host + "/" + contextPath;
	var server_context = basePath;
</script>
<link rel="stylesheet" type="text/css"
	href="<%=extjsPath%>resources/css/ext-all-neptune.css">
<script type="text/javascript" src="<%=extjsPath%>ext-all.js"></script>
<script type="text/javascript"
	src="<%=extjsPath%>locale/ext-lang-zh_CN.js"></script>
<!-- model css -->
<link
	href="<%=basePath%>/resources/js/administrator/assets/css/animate.min.css"
	rel="stylesheet">
<link
	href="<%=basePath%>/resources/js/administrator/assets/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="<%=basePath%>/resources/js/administrator/assets/css/form.css"
	rel="stylesheet">
<link
	href="<%=basePath%>/resources/js/administrator/assets/css/calendar.css"
	rel="stylesheet">
<link
	href="<%=basePath%>/resources/js/administrator/assets/css/style.css"
	rel="stylesheet">
<link
	href="<%=basePath%>/resources/js/administrator/assets/css/icons.css"
	rel="stylesheet">
<link
	href="<%=basePath%>/resources/js/administrator/assets/css/generics.css"
	rel="stylesheet">

</head>
<body>
	<!-- 导航 -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Artificial Intelligence</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.html">Home</a></li>
					<li><a href="#">Contact</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">About</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-sub pull-right">
					<li><a><span
							<span class="glyphicon glyphicon-user" role="group"></span>&nbsp;<%=session.getAttribute("username")%></a></li>
					<li><a>Number of entry &nbsp;<span
							class="badge badge-info"><%=session.getAttribute("logintimes")%></span></a></li>
					<li><a href="/awm-web"><span
							class="glyphicon glyphicon-off" role="group"></span> Login out</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<br>
	<h1 class="wordfont">The modules that you can manipulate</h1>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-md-7">
				<div class="panel panel-info">
					<div class="panel-heading">
						<div id="navbar" class="collapse navbar-collapse">
							<ul class="nav navbar-nav">
								<li><h5>IMAGE Information</h5></li>
							</ul>
							<ul class="nav navbar-nav  pull-right">
								<li><a href="/awm-web/image/index.html"><span
										class="glyphicon glyphicon-menu-hamburger"></span></a></li>
							</ul>
						</div>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-hover dashboard-task-infos">
								<thead>
									<tr class="active">
										<th>ID</th>
										<th>IMAGE_ID</th>
										<th>HEIGHT</th>
										<th>WIDTH</th>
										<th>URL</th>
									</tr>
								</thead>
								<tbody id="image">
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-5">
				<div class="panel panel-warning">
					<div class="panel-heading">
						<div id="navbar" class="collapse navbar-collapse">
							<ul class="nav navbar-nav">
								<li><h5>Question And Answer INFORAMTION</h5></li>
							</ul>
							<ul class="nav navbar-nav  pull-right">
								<li><a href="/awm-web/questionanswers/index.html"><span
										class="glyphicon glyphicon-menu-hamburger"></span></a></li>
							</ul>
						</div>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr class="active">
										<th>ID</th>
										<th>IMAGE_ID</th>
										<th>question</th>
										<th>answer</th>
									</tr>
								</thead>
								<tbody id="question">


								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="panel panel-warning">
					<div class="panel-heading">
						<div id="navbar" class="collapse navbar-collapse">
							<ul class="nav navbar-nav">
								<li><h5>OBJECT INFORAMTION</h5></li>
							</ul>
							<ul class="nav navbar-nav  pull-right">
								<li><a href="/awm-web/myObject/index.html"><span
										class="glyphicon glyphicon-menu-hamburger"></span></a></li>
							</ul>
						</div>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-bordered">
								<thead>
									<tr class="active">
										<th>IMAGE_ID</th>
										<th>NAME</th>
										<th>W</th>
										<th>X</th>
										<th>Y</th>
									</tr>
								</thead>
								<tbody id="object">
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-8">
				<div class="panel panel-success">
					<div class="panel-heading">
						<div id="navbar" class="collapse navbar-collapse">
							<ul class="nav navbar-nav">
								<li><h5>REGION INFORAMTION</h5></li>
							</ul>
							<ul class="nav navbar-nav  pull-right">
								<li><a href="/awm-web/region/index.html"><span
										class="glyphicon glyphicon-menu-hamburger"></span></a></li>
							</ul>
						</div>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-bordered">
								<thead>
									<tr class="active">
										<th>REGION_ID</th>
										<th>PHRASE</th>
										<th>WIDHT</th>
										<th>X</th>
										<th>Y</th>
									</tr>
								</thead>
								<tbody id="region">


								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>






	</div>
	<!-- 背景 -->
	<div class="backstretch"
		style="left: 0px; top: 0px; margin: 0px; padding: 0px; height: 215px; width: 1168px; z-index: -999999; position: fixed;">
		<img
			style="position: absolute; margin: 0px; padding: 0px; border: medium none; width: 2000px; height: 1500px; max-height: none; max-width: none; z-index: -999999; left: 0px; top: -395.333px;"
			src="<%=basePath%>/resources/js/administrator/assets/img/backgrounds/1.jpg">
	</div>

	<script src="<%=basePath%>bootstrap/js/jquery-3.3.1.min.js"></script>
	<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>
	<script src="<%=basePath%>/resources/js/administrator/admin.js"></script>
</body>
</html>