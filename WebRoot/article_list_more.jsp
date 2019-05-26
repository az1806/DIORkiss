<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
    <title>某某家具设计公司企业官网-模板之家</title>
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
<%
		ArrayList<ZiXun> zx = (ArrayList<ZiXun>) request
				.getAttribute("zixun");
	%>
<body>
<jsp:include page="top.jsp"></jsp:include>
<jsp:include page="dongtai.jsp"></jsp:include>
<div>
    <header class="article_list_more_header">
     <div> <a>首页</a>&#62;<a>新闻资讯</a>&#62;<a>更多</a></div>
    </header>

    <section class="article-content">
        <ul>
        <%for(int i=0;i<zx.size();i++) {%>
            <li>
                <div class="article-date">
                    <strong><%=zx.get(i).getId() %></strong>
                    <p></p>
                </div>
                <div class="article-info">
                    <a href="article_list_content">
                        <h3><%=zx.get(i).getH() %></h3>
                        <p><%=zx.get(i).getContent() %></p>
                    </a>
                </div>
            </li>
<% } %>
        </ul>
    </section>
    <div class="article_list_more_pages">
        <ul>
            <li><a>上一页</a></li>
            <li class="article-current"><a>1</a></li>
            <li><a>2</a></li>
            <li><a>3</a></li>
            <li><a>下一页</a></li>
        </ul>
    </div>
</div>
﻿<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>