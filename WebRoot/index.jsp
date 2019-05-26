<%@ page language="java" import="java.util.*,com.entity.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
﻿
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate icon" type="image/png" href="images/favicon.png">
<link rel='icon' href='favicon.ico' type='image/x-ico' />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/default.min.css?t=227" />
<!--[if (gte IE 9)|!(IE)]><!-->
<script type="text/javascript" src="lib/jquery/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="lib/amazeui/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script type="text/javascript" src="lib/handlebars/handlebars.min.js"></script>
<script type="text/javascript" src="lib/iscroll/iscroll-probe.js"></script>
<script type="text/javascript" src="lib/amazeui/amazeui.min.js"></script>
<script type="text/javascript" src="lib/raty/jquery.raty.js"></script>
<script type="text/javascript" src="js/main.min.js?t=1"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<% Company com = (Company) request.getAttribute("company"); %>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="dongtai.jsp"></jsp:include>


	<section class="index-section">
	<div>
		<span></span> <span></span>
	</div>
	<div class="index-content">
		<section class="index-content-section-first">
		<div>
			<img src="img/block10.jpg"></img>
		</div>
		</section>
		<section class="index-content-section-second">
		<div>
			<div class="index-auto">
				
				<%=com.getIntroduction()%>
				<a class="index-button" href="#">产品系类</a>
			</div>
		</div>
		</section>
	</div>
	</section>
	<%
		ArrayList<KouHong> kh = (ArrayList<KouHong>) request
				.getAttribute("KouHong");
		KouHong kht = (KouHong) request.getAttribute("kouhongt"); 
	%>




	<section class="index-product"> <main>
	<ul>
		
		<li><a href="#">口红系列</a>
		</li>
		<li><a href="#">服装系列</a>
		</li>
		<li><a href="#">香水系列</a>
		</li>
	</ul>
	</main> <main></main> <main></main> </section>
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/">网页模板</a>
	</div>
	<section class="index-margin-bottom">
	<div class="index-morecase">
		<span></span> <a href="#">更多.... &#62; &#62;</a>
	</div>
	<div class="index-content">
		<div class="product-list">
			<%
				for (int i = 0; i < kh.size(); i++) {
			%>
			<div class="am-u-sm-6 am-u-md-6 am-u-lg-4">
				<a href="product_info?type=<%=kh.get(i).getId()%>"> <%=kh.get(i).getImg()%> <%=kh.get(i).getName()%>
					 </a>
			</div>
			<%
				}
			%>
		</div>
	</div>
	</section>
	<section class="index-margin-bottom">
	<div class="index-morecase">
		<span></span> <a href="#">MORE &#62; &#62;</a>
	</div>
	<div class="index-content">
		<div class="new-index">
			<ul>
				<li><img src="img/block9.jpg"></img></li>
				<li><a href="article_list_content"><h3>迪奥#999</h3> <article>这款唇膏暗藏玄机的迪奥全新金属外壳具有非凡吸引力：为了彰显一抹个性奢华魅力，唇膏盖内皆以Dior迪奥的经典迷人色彩——#传奇红唇（#999）的色彩装点。</article>
				</a>
				</li>
			</ul>
			<ul>
				<li><a href="article_list_content"><h3><%=kht.getName() %></h3> <article><%=kht.getEffect() %></article>
				</a></li>
			</ul>

		</div>
	</div>
	</section>

	﻿<jsp:include page="bottom.jsp"></jsp:include>

</body>

</html>
