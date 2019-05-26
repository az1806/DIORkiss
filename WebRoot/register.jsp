<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgColor="aqua">
   注册页面
	<br>
	<form action="/DIORkiss/register" method="post">
		<p>
			用户名 ：<input type="text" name="username" />
		</p>
		<p>
			密码 ：<input type="password" name="pwd" />
		</p>
		<p>
			重复密码 ：<input type="password" name="pwd2" />
		</p>
		<p>
			<input type="submit" value="注册" />
		</p>
	</form>
  </body>
</html>
