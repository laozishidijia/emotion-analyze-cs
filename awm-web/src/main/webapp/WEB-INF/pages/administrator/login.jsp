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
<title>Login Page</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet"
	href="<%=basePath%>/resources/js/administrator/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<%=basePath%>/resources/js/administrator/assets/css/form-elements.css">
<link rel="stylesheet"
	href="<%=basePath%>/resources/js/administrator/assets/css/style.css">

<link rel="shortcut icon"
	href="<%=basePath%>/resources/js/administrator/assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="<%=basePath%>/resources/js/administrator/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="<%=basePath%>/resources/js/administrator/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="<%=basePath%>/resources/js/administrator/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="<%=basePath%>/resources/js/administrator/assets/ico/apple-touch-icon-57-precomposed.png">
<link rel="stylesheet"
	href="<%=basePath%>bootstrap/css/bootstrap.min.css">
<!-- 引入js -->
<script src="<%=basePath%>bootstrap/js/jquery-3.3.1.min.js"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>
<script
	src="<%=basePath%>/resources/js/administrator/assets/js/jquery.backstretch.min.js"></script>
<script
	src="<%=basePath%>/resources/js/administrator/assets/js/scripts.js"></script>
</head>
<body>
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>Visualgenome</strong> Login Form
						</h1>
						<div class="description">
							<p>
								This is a free responsive login form made with Bootstrap.
								Download it on <a href="#"><strong>AZMIND</strong></a>,
								customize and use it as you like!
							</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>Login to our site</h3>
								<p>Enter your username and password to log on:</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-key"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form role="form" action="/administrator/index.html"
								method="post" class="login-form">
								<div class="form-group">
									<label class="sr-only" for="form-username">Username</label> <input
										type="text" name="username" placeholder="Username..."
										class="form-username form-control" id="form-username">
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">Password</label> <input
										type="password" name="password" placeholder="Password..."
										class="form-password form-control" id="form-password">
								</div>
								<button type="submit" class="btn">Sign in!</button>
							</form>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 social-login">
						<h3>...or login with:</h3>
						<div class="social-login-buttons">
							<a class="btn btn-link-1 btn-link-1-facebook" href="#"> <i
								class="fa fa-facebook"></i> Facebook
							</a> <a class="btn btn-link-1 btn-link-1-twitter" href="#"> <i
								class="fa fa-twitter"></i> Twitter
							</a> <a class="btn btn-link-1 btn-link-1-google-plus" href="#"> <i
								class="fa fa-google-plus"></i> Google Plus
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	
	</div>
		<div class="backstretch"
			style="left: 0px; top: 0px; overflow: hidden; margin: 0px; padding: 0px; height: 215px; width: 1168px; z-index: -999999; position: fixed;">
			<img
				style="position: absolute; margin: 0px; padding: 0px; border: medium none; width: 1519px; height: 1012.67px; max-height: none; max-width: none; z-index: -999999; left: 0px; top: -395.333px;"
				src="<%=basePath%>/resources/js/administrator/assets/img/backgrounds/1.jpg">
		</div>
</body>
</html>