<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%ArrayList<LiuYan> lys=(ArrayList<LiuYan>) request.getAttribute("lys"); %>
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
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="admin/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="admin/js/xadmin.js"></script>
<script type="text/javascript">
function chaxun(){
var zt=document.getElementById("hft").value;
window.location.href="designer?method=chaxunly&hft="+encodeURI(encodeURI(zt));
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
				 <input class="layui-input" placeholder="状态" name="hft" id="hft">
				<button class="layui-btn" type="button" lay-filter="sreach"
					onclick="chaxun()">
					<i class="layui-icon">查询</i>
				</button>
			</form>
		</div>
		<xblock>
		<button class="layui-btn layui-btn-danger" onclick="delAll()">
			<i class="layui-icon"></i>批量删除
		</button>
		<span class="x-right" style="line-height:40px"><%=lys.size()%>条</span>
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
					<th>姓名</th>
					<th>联系方式</th>
					<th>邮箱</th>
					<th>内容</th>
					<th>改变状态</th>
					<th>操作</th>
			</thead>
			<tbody>
				<%
					for(int i=0;i<lys.size();i++){
				%>
				<tr>
					<td>
						<div class="layui-unselect layui-form-checkbox" lay-skin="primary"
							data-id='2'>
							<i class="layui-icon">&#xe605;</i>
						</div>
					</td>
					<td><%=lys.get(i).getId()%></td>
					<td><%=lys.get(i).getName()%></td>
					<td><%=lys.get(i).getPhone()%></td>
					<td><%=lys.get(i).getEmail()%></td>
					<td><%=lys.get(i).getContent()%></td>
					<td><%=lys.get(i).getHf()%></td>
					<td class="td-manage"> 
						<a   href="admin/designer?method=liuyan&type=<%=lys.get(i).getId()%>"  ><input type="button" value="更改状态"></a>
						<a title="删除" onclick="return confirm('确定要删除么')"
						href="admin/designer?method=delliuyan&type=<%=lys.get(i).getId()%>"> <i
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