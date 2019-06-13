<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
	<%
	Cosmetics cos = (Cosmetics) request
				.getAttribute("cosmetics");
		ArrayList<Cosmetics> co = (ArrayList<Cosmetics>) request
				.getAttribute("Cosmetics");
				ArrayList<ChanPinFenLei> cpfl = (ArrayList<ChanPinFenLei>) request
				.getAttribute("cpfl");
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
<style type="text/css">
#asdx{
padding-top: 0px;
margin-left: 200px;
margin-top: 0px;
}
</style>
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<jsp:include page="dongtai.jsp"></jsp:include>

<section class="pro-list">
    <aside class="pro-leftsidebar">
        <ul>
            <li>
                <a>产品搜索</a>
                <ul id="pro-search">
                    <li><a><input type="text"  class="pro-search"><a class="pro-search-btn" >搜索</a></a></li>
                </ul>
            </li>
            <li>
                <a>产品分类</a>
                <ul id="pro-category">
                    
                    <%for(int i=0;i<cpfl.size();i++){ %>
                    <li class="on">
                    <a href="productlist?type=<%=cpfl.get(i).getId()%>"><%=cpfl.get(i).getName() %></a></li>
                    <%} %>
                </ul>
            </li>
        </ul>
    </aside>

    <aside class="pro-rightsidebar">
        <header>
            <p></p>
            <span>系列</span>
            <div class="product-nav"><a href="index">首页 </a>&#62;<a href="#">产品展示</a>&#62;<a><%=cos.getName()%> </a></div>
        </header>
        <main>
            <div class="pro-right-left">
                <div class="pro-details-img"><img src="<%=cos.getImg()%>"></div>
				
                <div class="pro-detalis-carousel">
                    <div class="am-slider am-slider-default am-slider-carousel" data-am-flexslider="{itemWidth: 112, itemMargin: 4,move:5,  controlNav: false ,  slideshow: true}">
                        <ul class="am-slides pro-details">
                         <%for(int i=0;i<co.size();i++){ %>
                            <li><img src="images/procarousel.png" /></li>
                           <%} %>
                        </ul>
                    </div>
                </div>
				
            </div>
            <div class="pro-right-right" id="asdx">
                <ul class="pro-right-info-constant">
                    <li>产品名称:</li>
                    <li>产品分类:</li>
                    <li>产品售价:</li>
                    <li>产品说明：</li>
                </ul>
                <ul class="pro-right-info-variable">
                    <li><%=cos.getName() %></li>
                    <li><%=cos.getType()%></li>
                    <li><%=cos.getPrice() %></li>
                    <li><%=cos.getSize() %></li>
                </ul>
            </div>

            <div class="am-tabs pro-tabs" data-am-tabs>
                <ul class="am-tabs-nav am-nav am-nav-tabs">
                    <li class="am-active">
                    <a href="#tab1">详细说明</a></li>
                  <%=cos.getEffect() %>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active" id="tab1">
                        <ul>
                            <li>
                                <span class="pro-tabs-constant">适合性别:</span>
                                <span class="pro-tabs-variable"><%=cos.getGirlc() %></span>
                            </li>
                            <li>
                                <span class="pro-tabs-constant">风格:</span>
                                <span class="pro-tabs-variable"><%=cos.getStyle() %></span>
                            </li>
                        </ul>
                    </div>
                    
                </div>
            </div>
        </main>
    </aside>


</section>

<jsp:include page="bottom.jsp"></jsp:include>
</body>

</html>