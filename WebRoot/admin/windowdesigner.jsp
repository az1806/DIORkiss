<%@page import="com.entity.Designer"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% Designer des=(Designer)request.getAttribute("des"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>欢迎页面</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="admin/css/font.css">
<link rel="stylesheet" href="admin/css/xadmin.css">
<script type="text/javascript" src="admin/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="admin/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="admin/js/xadmin.js"></script>
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript">
	function update() {
	    var img = document.getElementById("img").value;
		var position = document.getElementById("position").value;
		var name = document.getElementById("name").value;
		if (name== "" && position=="") {
			return;
		}
		window.location.href = "admin/designer?method=updatedes&name=" +encodeURI(encodeURI(name))+"&position=" + encodeURI(encodeURI(position))+"&img=" +encodeURI(encodeURI(img))+"&id="+<%=des.getId()%>;
	};
</script>

</head>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>设计师姓名 </label>
				<div class="layui-input-inline">
					<input type="text" id="name" name="name" value="<%=des.getName() %>" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="phone" class="layui-form-label"> <span
					class="x-red">*</span>职位 </label>
				<div class="layui-input-inline">
					<input type="text" id="position" name="position" value="<%=des.getPosition() %>" required=""
						lay-verify="phone" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>图片 </label>
				<div class="layui-input-inline">
					<input type="text" id="img" name="img" value="<%=des.getImg() %>" required=""
						lay-verify="email" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<input class="layui-btn" type="button" onclick="update()" value="提交" lay-filter="add" lay-submit="">
			</div>
		</form>
	</div>
	

</body>

</html>