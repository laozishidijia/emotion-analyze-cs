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
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet"
	href="<%=basePath%>bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/js/show/assets/css/main.css" />
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
<script type="text/javascript">
	var id = 141327;
	var data;
	var count = 1;
	function setImg() {
		url = server_context + '/image/' + id + '.json';
		$.ajax({
			url : url,
			dataType : 'json',
			type : 'get',
			success : function(data) {
				console.log(data);
				url = data['url'];
				$("#a" + count)
						.load(
								url,
								function() {
									$("#a" + count).attr("href", url);
									$("#img" + count).attr("src", url);
									$("#a" + count).load(
											location.href + " #a" + count
													+ ">*", "");
									$("#img" + count).load(
											location.href + " #img" + count
													+ ">*", "");
									console.log(count);
									count++;
									id++;
									if (count == 13)
										count = 1;
								});
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
					console.log("error");
			}
		});

	}
	setInterval(setImg, 10 * 1000);
</script>
</head>
<body>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<h1>
				<a href="${pageContext.request.contextPath}"><strong>HOME</strong></a>
			</h1>
			<nav>
				<ul>
					<li><a href="#footer" class="icon fa-info-circle">About</a></li>
				</ul>
			</nav>
		</header>

		<!-- Main -->
		<div id="main">
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K_2/1.jpg"
					class="image" id="a1"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K_2/1.jpg" alt=""
					id="img1" /></a>
				<h2 id="h1">Magna feugiat lorem</h2>
				<p id="p1">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/2.jpg"
					class="image" id="a2"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/2.jpg" alt=""
					id="img2" /></a>
				<h2 id="h2">Nisl adipiscing</h2>
				<p id="p2">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/3.jpg"
					class="image" id="a3"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/3.jpg" alt=""
					id="img3" /></a>
				<h2 id="h3">Tempus aliquam veroeros</h2>
				<p id="p3">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/4.jpg"
					class="image" id="a4"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/4.jpg"
					alt="img4" src="" /></a>
				<h2 id="h4">Aliquam ipsum sed dolore</h2>
				<p id="p4">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/5.jpg"
					class="image" id="a5"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/5.jpg" alt=""
					id="img5" /></a>
				<h2 id="h5">Cursis aliquam nisl</h2>
				<p id="p5">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/6.jpg"
					class="image" id="a6"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/6.jpg" alt=""
					id="img6" /></a>
				<h2 id="h6">Sed consequat phasellus</h2>
				<p id="p6">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/7.jpg"
					class="image" id="a7"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/7.jpg" alt=""
					id="img7" /></a>
				<h2 id="h7">Mauris id tellus arcu</h2>
				<p id="p7">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/8.jpg"
					class="image" id="a8"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/8.jpg" alt=""
					id="img8" /></a>
				<h2 id="h8">Nunc vehicula id nulla</h2>
				<p id="p8">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/9.jpg"
					class="image" id="a9"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/9.jpg" alt=""
					id="img9" /></a>
				<h2>Neque et faucibus viverra</h2>
				<p>Nunc blandit nisi ligula magna sodales lectus elementum non.
					Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/10.jpg"
					class="image" id="a10"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/10.jpg" alt=""
					id="img10" /></a>
				<h2 id="h10">Mattis ante fermentum</h2>
				<p id="p10">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/11.jpg"
					class="image" id="a11"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/11.jpg" alt=""
					id="img11" /></a>
				<h2 id="h11">Sed ac elementum arcu</h2>
				<p id="p11">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
			<article class="thumb">
				<a href="https://cs.stanford.edu/people/rak248/VG_100K/12.jpg"
					class="image" id="a12"><img
					src="https://cs.stanford.edu/people/rak248/VG_100K/12.jpg" alt=""
					id="img12" /></a>
				<h2 id="h12">Vehicula id nulla dignissim</h2>
				<p id="p12">Nunc blandit nisi ligula magna sodales lectus
					elementum non. Integer id venenatis velit.</p>
			</article>
		</div>
	</div>

	<!-- Scripts -->
	<script
		src="${pageContext.request.contextPath}/resources/js/show/assets/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/show/assets/js/jquery.poptrox.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/show/assets/js/skel.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/show/assets/js/util.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/show/assets/js/main.js"></script>

</body>

</html>