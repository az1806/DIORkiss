<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% 
ArrayList<ZiXunFenLei> zxfl=(ArrayList<ZiXunFenLei>) request.getAttribute("zxfl"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>欢迎页面-X-admin2.0</title>
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
	function addzxfl() {
		var name=document.getElementById("name").value;
		if (name == "") {
			return;
		}
		window.location.href = "admin/zixun?method=addzxfl&name=" + encodeURI(encodeURI(name));
	};
	
</script>
</head>

<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="admin/index.jsp">首页</a> <a
			href="">演示</a> <a> <cite>导航元素</cite> </a> </span> <a
			class="layui-btn layui-btn-small"
			style="line-height:1.6em;margin-top:3px;float:right"
			href="javascript:location.replace(location.href);" title="刷新"> <i
			class="layui-icon" style="line-height:30px">ဂ</i> </a>
	</div>
	<div class="x-body">
		<div class="layui-row">
			<form class="layui-form layui-col-md12 x-so layui-form-pane">
				<input class="layui-input" placeholder="资讯名" name="name" id="name">
				<button class="layui-btn" type="button" lay-filter="sreach"
					onclick="addzxfl()">
					<i class="layui-icon"></i>增加
				</button>
			</form>
		</div>
		<xblock>
		<button class="layui-btn layui-btn-danger" onclick="delAll()">
			<i class="layui-icon"></i>批量删除
		</button>
		<span class="x-right" style="line-height:40px"><%=zxfl.size()%>条</span>
		</xblock>
		<table class="layui-table">
			<thead>
				<tr>
					<th>
						<div class="layui-unselect header layui-form-checkbox"
							lay-skin="primary">
							<i class="layui-icon">&#xe605;</i>
						</div>
					</th>
					<th>ID</th>
					<th>资讯名</th>
					<th>操作</th>
			</thead>
			<tbody>
				<%
					for(int i=0;i<zxfl.size();i++){
				%>
				<tr>
					<td>
						<div class="layui-unselect layui-form-checkbox" lay-skin="primary"
							data-id='2'>
							<i class="layui-icon">&#xe605;</i>
						</div>
					</td>
					<td><%=zxfl.get(i).getId()%></td>
					<td><%=zxfl.get(i).getName()%></td>
					<td class="td-manage"><a title="编辑"
                  href="admin/zixun?method=getallzxfl&type=<%=zxfl.get(i).getId()%>">
							<i class="layui-icon">&#xe642;</i> </a> <a title="删除"
						onclick="return confirm('确定要删除么')"
						href="admin/zixun?method=delzxfl&zxflid=<%=zxfl.get(i).getId()%>"> <i
							class="layui-icon">&#xe640;</i> </a>
					</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<div class="page">
			<div>
				<a class="prev" href="">&lt;&lt;</a> <a class="num" href="">1</a> <span
					class="current">2</span> <a class="num" href="">3</a> <a
					class="num" href="">489</a> <a class="next" href="">&gt;&gt;</a>
			</div>
		</div>

	</div>
	
</body>

</html>