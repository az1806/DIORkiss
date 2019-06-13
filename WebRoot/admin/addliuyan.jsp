<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%LiuYan ly=(LiuYan) request.getAttribute("lys"); %>
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
      <script type="text/javascript">
  function addliuyan(){
  var id=<%=ly.getId()%>
  var hf=document.getElementById("hf").value;
  if (id == "" ||hf=="") {
			return;
		}
		window.location.href = "admin/designer?method=addliuyan&type=" + id
				+"&hf="+encodeURI(encodeURI(hf));
  }
  </script>
</head>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>回复内容 </label>
				<div class="layui-input-inline">
					<input type="text" id="hf" name="hf" value="<%=ly.getHf() %>" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<input class="layui-btn" lay-filter="add" lay-submit="" onclick="addliuyan()" value="添加">
				<a href="admin/index.jsp" >返回首页</a>
			</div>
		</form>
	</div>
</body>

</html>