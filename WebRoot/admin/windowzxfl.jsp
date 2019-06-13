<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%ZiXunFenLei zxfl=(ZiXunFenLei) request.getAttribute("zxfl"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'windowcpfl.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="admin/css/font.css">
<link rel="stylesheet" href="admin/css/xadmin.css">
<script type="text/javascript" src="admin/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="admin/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="admin/js/xadmin.js"></script>
  <script type="text/javascript">
  function update(){
  var id=document.getElementById("id").value;
  var name=document.getElementById("name").value;
  if (id == "" && name == "" &&content=="") {
			return;
		}
		window.location.href = "admin/zixun?method=updatezxfl&id=" +id
+"&name="+encodeURI(encodeURI(name));
//		$post("index?method=update", {
//			"cate_name" : m,"cate_id":id
//		}, function(res) {
//			if (res.success) {
//				window.location.href = "product-cate.jsp";
//			} else {
//				alert("添加失败");
//			}
//		}, "json");
  }
  </script>
  </head>
  
  <body>
   <form class="layui-form">
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span> id   </label>
				<div class="layui-input-inline">
					<input type="text" name="id" value="<%=zxfl.getId()%>" id="id" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
				
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>  资讯名  </label>
				<div class="layui-input-inline">
					<input type="text" name="name" value="<%=zxfl.getName()%>" id="name" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
				
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<input type="button" onclick="update()" value="修改" class="layui-btn" lay-filter="add" lay-submit="">
			</div>
			</form>
  </body>
</html>
