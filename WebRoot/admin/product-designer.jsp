<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%ArrayList<Designer> des=(ArrayList<Designer>) request.getAttribute("des"); %>
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
          var layer,upload;
        $(function (){  //jQuery组件的ready事件，
            layui.use(['upload','layer'],function(){  //layui中包含了大量的组件，此处指明仅仅加载upload和layer组件
                upload = layui.upload; //upload指代上传组件
                layer=layui.layer;  //layer指代各种弹出窗口弹出窗口组件，非常有利于业务的控制，我们项目中可以大量使用
                upload.render({
                    elem:'#test1',  //点击哪个按钮时，选择本地文件
                        url:'admin/smart?method=saveImg', //服务器端接收文件数据的地址
                        done:function(res){ //当服务器端保存成功后回调此方法，已经约定res格式为json
                            //res对象中到底有哪些属性， 由服务器端控制。    
                            layer.alert(res.message);  //layer的alert方法，可以呈现1个更好看的弹出框 
                        	document.getElementById("img").value = "img/"+res.message;
                        }
                    });
              });
        });
    </script>
<script type="text/javascript">
	function adddes() {
	    var img = document.getElementById("img").value;
		var position = document.getElementById("position").value;
		var name = document.getElementById("name").value;
		if (name== "" && position=="") {
			return;
		}
		window.location.href = "admin/designer?method=adddesigner&name=" +encodeURI(encodeURI(name))+"&position=" + encodeURI(encodeURI(position))+"&img=" +encodeURI(encodeURI(img));
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
				 <input class="layui-input" placeholder="设计师姓名" name="name" id="name">
				  <input class="layui-input" placeholder="设计师职位" name="position" id="position">
				   <input class="layui-input" placeholder="设计师图片" name="img" id="img">
				   <button type="button" class="layui-btn" id="test1">上传图片</button>
				<button class="layui-btn" type="button" lay-filter="sreach"
					onclick="adddes()">
					<i class="layui-icon"></i>增加
				</button>
			</form>
		</div>
		<xblock>
		<button class="layui-btn layui-btn-danger" onclick="delAll()">
			<i class="layui-icon"></i>批量删除
		</button>
		<span class="x-right" style="line-height:40px"><%=des.size()%>条</span>
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
					<th>设计师姓名</th>
					<th>设计师职位</th>
					<th>设计师图片</th>
					<th>操作</th>
			</thead>
			<tbody>
				<%
					for(int i=0;i<des.size();i++){
				%>
				<tr>
					<td>
						<div class="layui-unselect layui-form-checkbox" lay-skin="primary"
							data-id='2'>
							<i class="layui-icon">&#xe605;</i>
						</div>
					</td>
					<td><%=des.get(i).getId()%></td>
					<td><%=des.get(i).getName()%></td>
					<td><%=des.get(i).getPosition()%></td>
					<td><img src="<%=des.get(i).getImg()%>"></td>
					<td class="td-manage"><a title="编辑"
	href="admin/designer?method=getonedes&type=<%=des.get(i).getId()%>">
							<i class="layui-icon">&#xe642;</i> </a> <a title="删除"
						onclick="return confirm('确定要删除么')"
						href="admin/designer?method=deldesigner&type=<%=des.get(i).getId()%>"> <i
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