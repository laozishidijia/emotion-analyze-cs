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
<title>Artificial Intelligence Data</title>
<meta charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="<%=basePath%>bootstrap/css/bootstrap.min.css">
<script src="<%=basePath%>bootstrap/js/jquery-3.3.1.min.js"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<nav>
	<ul class="nav nav-tabs">
		<li role="presentation" class="active">
			<a href="#">首页</a>
		</li>
		<li role="presentation">
			<a href="#">HTML</a>
		</li>
		<li role="presentation">
			<a href="#">CSS</a>
		</li>
	</ul>
</nav>
	<a href="#" data-toggle="tooltip" data-placement="right" title="在右侧显示提示内容" cass="btnbtn-primary">工具提示</a>
<script type="text/javascript">
	$('.btn').tooltip();
</script>
</body>
</html>