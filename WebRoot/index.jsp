<%@ page language="java" import="java.util.*,com.entity.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%
		ArrayList<Cosmetics> cos = (ArrayList<Cosmetics>) request
				.getAttribute("cosmeticst");
		ArrayList<ChanPinFenLei> cpfl = (ArrayList<ChanPinFenLei>) request
				.getAttribute("cpfl");
				ArrayList<ZiXunFenLei> zxfl = (ArrayList<ZiXunFenLei>) request
				.getAttribute("zxfl");
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
<script type="text/javascript" src="lib/handlebars/handlebars.min.js"></script>
<script type="text/javascript" src="lib/iscroll/iscroll-probe.js"></script>
<script type="text/javascript" src="lib/amazeui/amazeui.min.js"></script>
<script type="text/javascript" src="lib/raty/jquery.raty.js"></script>
<script type="text/javascript" src="js/main.min.js?t=1"></script>
<style type="text/css">
#ccc{
width:180px;
height:180px;

}
#ccd{
width:180px;
height:180px;

}
</style>
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
				<a class="index-button" href="#">产品系列</a>
			</div>
		</div>
		</section>
	</div>
	</section>
	<section class="index-product"> <main>
	<ul>
		<%
				for (int i = 0; i < cpfl.size(); i++) {
			%>
		<li><a href="productlist"><%=cpfl.get(i).getName() %>系列</a>
		</li>
		<%} %>
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
				for (int i = 0; i < cos.size(); i++) {
			%>
			<div class="am-u-sm-6 am-u-md-6 am-u-lg-4" >
				<a href="productdetails?type=<%=cos.get(i).getId()%>"> <img id="ccc" src="<%=cos.get(i).getImg()%>"/> <%=cos.get(i).getName()%>
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
                <li><img src="img/block13.jpg" id="ccd"></img></li>
                <li>  <a href="article_list_content?type=<%=zxfl.get(0).getId()%>"><h3><%=cos.get(0).getName() %></h3>
                    <article><%=cos.get(0).getEffect() %></article></a></li>
            </ul>
			<ul>
			<%for(int i=1;i<cos.size();i++){ %>
				<li><a href="article_list_content?type=<%=zxfl.get(i).getId()%>"><h3><%=cos.get(i).getName() %></h3> <article><%=cos.get(i).getEffect() %></article>
				</a></li>
				<%} %>
			</ul>

		</div>
	</div>
	</section>
	﻿<jsp:include page="bottom.jsp"></jsp:include>
</body>

</html>
