<%@ page language="Java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String extjsPath = "http://202.196.37.91:8080/ext-4.2.1.883/";
	String imagePath = "http://202.196.37.91:8080/visualgenome/image/";
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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/image/app/Image.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/index/index.js"></script>


<script type="text/javascript">
	window.onload = function() {
		$("#search-btn").click(function() {
			var imgId = $("#keyword").val();
			var getUrl = getUrlById;
		});
	};
</script>
<script type="text/javascript">
	var id = 141315;
	var url;
	function setImg() {
		 url = server_context + '/image/' + id + '.json';
		//步骤一:创建异步对象
		var ajax = new XMLHttpRequest();
		//步骤二:设置请求的url参数,参数一是请求的类型,参数二是请求的url,可以带参数,动态的传递参数starName到服务端
		ajax.open('get',url);
		//步骤三:发送请求
		ajax.send();
		ajax.onreadystatechange = function () {
		   if (ajax.readyState==4 &&ajax.status==200) {
			 var record=ajax.responseText;
			 var obj=JSON.parse(record);
			 $("#imgView").attr("src","<%=imagePath%>"+obj.image_id+".jpg");
			 console.log("<%=imagePath%>" + obj.image_id + ".jpg");
				var imageId = obj.image_id;
				console.log("-----------------")
				console.log(imageId)
				getquestion(imageId);
				id++;
			}
		}
	}
	setInterval(setImg, 6 * 1000);
</script>
</head>
<body>
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
					<li><a href="#">Register</a></li>
					<li><a href="/awm-web/administrator/index.html">Login</a></li>
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
	<h1>You can search by image ID</h1>
		<div class="input-group">
			<input type="text" class="form-control" placeholder="Image Id"
				id="keyword"> <span class="input-group-btn">
				<button class="btn btn-danger" id="search-btn">
					<span class="glyphicon glyphicon-search"></span>
				</button>
			</span>
		</div>
	</div>

	<div class="container">
		<h1>Data details are as follows</h1>
		<div class="row">
			<div class="col-xs-6">
				<div class="panel panel-info">
					<div class="panel-body">
						<a href="#" class="thumbnail"> <img id="imgView"
							src="http://202.196.37.91:8080/visualgenome/image/1.jpg">
						</a>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-info">
					<div class="panel-heading">
						<p>Question And Answer</p>
					</div>
					<div class="panel-body">
						<button class="btn btn-primary" type="button"
							data-toggle="collapse" data-target="#question"
							aria-expanded="false" aria-controls="question">Open/Close
							QuestionAndAnswer</button>
						<div class="collapse" id="question">
							<div class="table-responsive">
								<table class="table table-hover dashboard-task-infos">
									<thead>
										<tr class="active">
											<th>question</th>
											<th>answer</th>
										</tr>
									</thead>
									<tbody id="questionTable">

									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-7">
				<div class="panel panel-success">
					<div class="panel-heading">
						<p>RelationShip</p>
					</div>
					<div class="panel-body">This is the objects relationship</div>
				</div>


			</div>
			<div class="col-md-5">
				<div class="panel panel-danger">
					<div class="panel-heading">
						<p>Objects</p>
					</div>
					<div class="panel-body">This is the objects</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<div class="panel panel-warning">
					<div class="panel-heading">
						<p>Scenes</p>
					</div>
					<div class="panel-body">This is the scenes</div>
				</div>
			</div>
			<div class="col-md-7">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<p>Region</p>
					</div>
					<div class="panel-body">This is the objects region</div>
				</div>
			</div>
		
		</div>
	</div>
</body>
</html>