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
<%
	ArrayList<Cosmetics> cost=(ArrayList<Cosmetics>)request.getAttribute("cosmetics");
			Cosmetics cos=(Cosmetics)request.getAttribute("Cosmetics");
%>
<title>My JSP 'product_info.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	
	<div class="am-u-sm-6 am-u-md-6 am-u-lg-4">
		
	<img src="<%=cos.getImg()%>"/> 
		<%=cos.getName()%>
		<%=cos.getColour()%> 
		<%=cos.getColoursize()%> 
		<%=cos.getEffect()%>
		<%=cos.getPrice()%>
		 
		 
	</div>
	

</body>
</html>
