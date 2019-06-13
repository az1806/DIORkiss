<%@page import="com.entity.ZiXun"%>
<%@page import="com.entity.ZiXunFenLei"%>
<%@ page language="java" import="java.util.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
ArrayList<ZiXunFenLei> zxfl=(ArrayList<ZiXunFenLei>)request.getAttribute("zxfl");%>
<% 	ArrayList<ZiXun> zixun=(ArrayList<ZiXun>)request.getAttribute("zixun");
%>
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
<script type="text/javascript" src="admin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript" src="admin/js/xadmin.js"></script>
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
	function selectzixun(){
		var h = document.getElementById("ht").value;
		var tid = document.getElementById("tidt").value;
		window.location.href = "admin/zixun?method=chaxun&ht=" + encodeURI(encodeURI(h))
				+  "&tidt=" + tid;
	};
</script>
<script type="text/javascript">
	function addzixun(){
		var h = document.getElementById("h").value;
		var content = document.getElementById("content").value;
		var name = document.getElementById("name").value;
		var tid = document.getElementById("tid").value;
		if (tid == ""){
			return;
		}
		window.location.href = "admin/zixun?method=addzixun&name="+encodeURI(encodeURI(name))+"&h=" + encodeURI(encodeURI(h))
				+ "&content=" + encodeURI(encodeURI(content))+ "&tid=" + tid;
	};
</script>
</head>

<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="admin/index.jsp">首页</a>
			<a href="">演示</a> <a> <cite>导航元素</cite> </a> </span> <a
			class="layui-btn layui-btn-small"
			style="line-height:1.6em;margin-top:3px;float:right"
			href="javascript:location.replace(location.href);" title="刷新"> <i
			class="layui-icon" style="line-height:30px">ဂ</i> </a>
	</div>
	<div class="x-body">
		<div class="layui-row">
			<form class="layui-form layui-col-md12 x-so layui-form-pane">
				<input class="layui-input" placeholder="标题" name="h" id="h">
				<input class="layui-input" placeholder="资讯名称" name="name" id="name">
				<input class="layui-input" placeholder="资讯内容" name="content"
					id="content"> <input class="layui-input" placeholder="分类id"
					name="tid" id="tid">
				<button class="layui-btn" type="button" lay-filter="sreach"
					onclick="addzixun()">
					<i class="layui-icon"></i>增加
				</button>
			</form>
		</div>
		<div class="x-body">
			<div class="layui-row">
				<form class="layui-form layui-col-md12 x-so layui-form-pane">
					<input class="layui-input" placeholder="标题"  id="ht">
						id="contentt"> <select id="tidt">
						<option value="0">请选择</option>
						<%
							for(int i=0;i<zxfl.size();i++) {
						%>
						<option value="<%=zxfl.get(i).getId()%>"><%=zxfl.get(i).getName()%></option>
						<%
							}
						%>
					</select>
					<button class="layui-btn" type="button" lay-filter="sreach"
						onclick="selectzixun()" >
						<i class="layui-icon">查询</i>
					</button>
				</form>
			</div>
			<xblock> <!--	<div><select><%for(int i=0;i<zixun.size();i++) {%>
		<option value="<%=zixun.get(i).getId()%>"><input /></option>
		<%}%></select> </div> !-->
			<button class="layui-btn layui-btn-danger" onclick="delAll()">
				<i class="layui-icon"></i>批量删除
			</button>
			<span class="x-right" style="line-height:40px"><%=zixun.size()%>条</span>
			</xblock>
			<table class="layui-table">
				<thead>
					<tr>
						<th>
							<div class="layui-unselect header layui-form-checkbox"
								lay-skin="primary">
								<i class="layui-icon">&#xe605;</i>
							</div></th>
						<th>ID</th>
						<th>TiD</th>
						<th>名子</th>
						<th>标题</th>
						<th>内容</th>
						<th>操作</th>
				</thead>
				<tbody>
					<%
						for(int i=0;i<zixun.size();i++){
					%>
					<tr>
						<td>
							<div class="layui-unselect layui-form-checkbox"
								lay-skin="primary" data-id='2'>
								<i class="layui-icon">&#xe605;</i>
							</div></td>
						<td><%=zixun.get(i).getId()%></td>
						<td><%=zixun.get(i).getTid()%></td>
						<td><%=zixun.get(i).getName()%></td>
						<td><%=zixun.get(i).getH()%></td>
						<td><%=zixun.get(i).getContent()%></td>
						<td class="td-manage"><a title="编辑"
							href="admin/zixun?method=getonezixun&type=<%=zixun.get(i).getId()%>">
								<i class="layui-icon">&#xe642;</i> </a> <a title="删除"
							onclick="return confirm('确定要删除么')"
							href="admin/zixun?method=delzixun&zixunid=<%=zixun.get(i).getId()%>">
								<i class="layui-icon">&#xe640;</i> </a></td>
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
		<script>
		layui.use('laydate', function() {
			var laydate = layui.laydate;

			//执行一个laydate实例
			laydate.render({
				elem : '#start' //指定元素
			});

			//执行一个laydate实例
			laydate.render({
				elem : '#end' //指定元素
			});
		});

		/*用户-停用*/
		function member_stop(obj, id) {
			layer.confirm('确认要停用吗？', function(index) {

				if ($(obj).attr('title') == '启用') {

					//发异步把用户状态进行更改
					$(obj).attr('title', '停用')
					$(obj).find('i').html('&#xe62f;');

					$(obj).parents("tr").find(".td-status").find('span')
							.addClass('layui-btn-disabled').html('已停用');
					layer.msg('已停用!', {
						icon : 5,
						time : 1000
					});

				} else {
					$(obj).attr('title', '启用')
					$(obj).find('i').html('&#xe601;');

					$(obj).parents("tr").find(".td-status").find('span')
							.removeClass('layui-btn-disabled').html('已启用');
					layer.msg('已启用!', {
						icon : 5,
						time : 1000
					});
				}

			});
		}

		/*用户-删除*/
		function member_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				//发异步删除数据
				$(obj).parents("tr").remove();
				layer.msg('已删除!', {
					icon : 1,
					time : 1000
				});
			});
		}

		function delAll(argument) {

			var data = tableCheck.getData();

			layer.confirm('确认要删除吗？' + data, function(index) {
				//捉到所有被选中的，发异步进行删除
				layer.msg('删除成功', {
					icon : 1
				});
				$(".layui-form-checked").not('.header').parents('tr').remove();
			});
		}
	</script>
</body>

</html>