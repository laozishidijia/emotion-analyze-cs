<%@ page language="Java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String extjsPath = "http://202.196.37.91:8080/ext-4.2.1.883/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>Artificial Intelligence Data</title>
<meta charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="<%=basePath%>bootstrap/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="<%=extjsPath%>resources/css/ext-all-neptune.css">
<script type="text/javascript" src="<%=extjsPath%>ext-all.js"></script>
<script type="text/javascript"
	src="<%=extjsPath%>locale/ext-lang-zh_CN.js"></script>
</script>
<script type="text/javascript">
	var localObj = window.location;
	var contextPath = localObj.pathname.split("/")[1];
	var basePath = localObj.protocol + "//" + localObj.host + "/" + contextPath;
	var server_context = basePath;
</script>
	
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/image/app/Image.js"></script>
<script type="text/javascript">
window.onload = function(){
	$("#search-btn").click(function() {
		var imgId = $("#keyword").val();
		var getUrl=getUrlById;
		getUrl(imgId);
	});
};
</script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
				data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
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
				<li><a href="#">Register</a></li>
				<li><a href="#">Login</a></li>
			</ul>
		</div>
	</div>
</nav>
<br>
<br>
<br>
<br>
	<!-- 搜索框 -->
	<div class="container">
		<div class="input-group">
			<input type="text" class="form-control" placeholder="Image Id"
				id="keyword"> <span class="input-group-btn">
				<button class="btn btn-danger" id="search-btn">
					<span class="glyphicon glyphicon-search"></span>
				</button>
			</span>
		</div>
		<div align="center" id="imgDiv">
			<img alt="center" src="https://cs.stanford.edu/people/rak248/VG_100K_2/1.jpg" id="imgView">
		</div>
	</div>
</body>
</html>