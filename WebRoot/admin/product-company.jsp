<%@ page language="java" import="java.util.*,com.entity.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	Company com = (Company) request.getAttribute("company");
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
<script type="text/javascript" src="admin/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="admin/js/xadmin.js"></script>
<script type="text/javascript">
	function update() {
		var id = document.getElementById("id").value;
		var name = document.getElementById("name").value;
		var phone = document.getElementById("phone").value;
		var introduction = document.getElementById("introduction").value;
		var address = document.getElementById("address").value;
		var culture = document.getElementById("culture").value;
		var email = document.getElementById("email").value;
		var img = document.getElementById("img").value;
		window.location.href = "admin/company?method=updatecompany&id=" + id
				+ "&name=" + encodeURI(encodeURI(name))+ "&phone="
				+ encodeURI(encodeURI(phone)) + "&introduction="
				+ encodeURI(encodeURI(introduction)) + "&address="
				+ encodeURI(encodeURI(address)) + "&culture="
				+ encodeURI(encodeURI(culture)) + "&email="
				+ encodeURI(encodeURI(email)) + "&img="
				+ encodeURI(encodeURI(img));
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
		<xblock> <span class="x-right" style="line-height:40px">1条</span>
		</xblock>
		<form method="post" class="layui-form">
			<table class="layui-table">
				<tbody>
					<tr>
						<th>ID</th>
						<td><%=com.getId() %>
						</td>
						<td><input name="id" value="<%=com.getId()%>" id="id">
						</td>
					</tr>
					<tr>
						<th>公司名</th>
						<td><%=com.getName() %>
						</td>
						<td><input name="name" value="<%=com.getName()%>" id="name">
						</td>
					</tr>
					<tr>
						<th>联系电话</th>
						<td><%=com.getPhone() %>
						</td>
						<td><input name="phone" value="<%=com.getPhone()%>"
							id="phone"></td>
					</tr>
					<tr>
						<th>公司介绍</th>
						<td><%=com.getIntroduction() %>
						</td>
						<td><input name="introduction"
							value="<%=com.getIntroduction()%>" id="introduction"></td>
					</tr>
					<tr>
						<th>公司地址</th>
						<td><%=com.getAddress() %>
						</td>
						<td><input name="address" value="<%=com.getAddress()%>"
							id="address"></td>
					</tr>
					<tr>
						<th>公司文化</th>
						<td><%=com.getCulture() %>
						</td>
						<td><input name="culture" value="<%=com.getCulture()%>"
							id="culture"></td>
					</tr>
					<tr>
						<th>公司邮箱</th>
						
						<td><%=com.getEmail()%>
						</td>
						<td><input name="email" value="<%=com.getEmail()%>"
							id="email"></td>
					</tr>
					<tr>
						<th>公司logo</th>
						<td><img src="<%=com.getImg() %>">
						</td>
						<td><jsp:include page="getImg.jsp"></jsp:include>
						</td>
					</tr>
					<tr>
						<th>操作</th>
						<td>查看
						</td>
						<td class="td-manage"><input type="button" onclick="update()"
							value="修改">
						</td>
					</tr>
				</tbody>
			</table>
		</form>
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