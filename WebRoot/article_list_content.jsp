<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% ZiXun zx = (ZiXun) request
				.getAttribute("zixun");
	
		ArrayList<ZiXunFenLei> zxfl = (ArrayList<ZiXunFenLei>) request
				.getAttribute("zxfl");			
				
				%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
    <title>Diorkiss</title>
    ﻿<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
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
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<jsp:include page="dongtai.jsp"></jsp:include>
<div>
    <header class="header-article-list">
        <div class="article-position">
          <a  href="article_list_content">
              <span>上一篇</span>
              <span>DIORkiss经营内容</span>
          </a>
        </div>
        <ul>
        <%for(int i=0;i<zxfl.size();i++) {%>
            <li class="article-on">
            <a href="article_list?type=<%=zxfl.get(i).getId()%>"><%=zxfl.get(i).getName() %></a></li>
            <%} %>
        </ul>
        <div class="article-more-btn">
            <a href="article_list_content">
                <span>下一篇</span>
                <span>DIORkiss经营内容</span>
            </a>
        </div>
    </header>

    <section class="article-content">
            <h4><%=zx.getName() %></h4>
        <main>
            <%=zx.getContent() %>
        </main>
    </section>
</div>
<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>
