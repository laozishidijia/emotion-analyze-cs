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
<link rel="stylesheet"
	href="<%=basePath%>/resources/js/administrator/admin.css">
<script src="<%=basePath%>bootstrap/js/jquery-3.3.1.min.js"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function SearchFunction() {
		document.getElementById("panel_view").setAttribute("src", "");
	}
</script>

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
					<li><a href="/awm-web"><span
							class="glyphicon glyphicon-off" role="group"></span> Login out</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
	
	</div>

	<!-- 背景 -->
	<div class="backstretch"
		style="left: 0px; top: 0px; margin: 0px; padding: 0px; height: 215px; width: 1168px; z-index: -999999; position: fixed;">
		<img
			style="position: absolute; margin: 0px; padding: 0px; border: medium none; width: 2000px; height: 1500px; max-height: none; max-width: none; z-index: -999999; left: 0px; top: -395.333px;"
			src="<%=basePath%>/resources/js/administrator/assets/img/backgrounds/1.jpg">
	</div>
</body>
</html>