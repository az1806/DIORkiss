<%@page import="com.entity.ChanPinFenLei"%>
<%@page import="com.entity.Cosmetics"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
ArrayList<Cosmetics> cos=(ArrayList<Cosmetics>) request.getAttribute("cos");
ArrayList<ChanPinFenLei> cpfl=(ArrayList<ChanPinFenLei>) request.getAttribute("cpfl");
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
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
	function chaxun() {
		var  tid= document.getElementById("tidt").value;
		var  name= document.getElementById("namet").value;
		var  colour= document.getElementById("colourt").value;
		var  coloursize= document.getElementById("coloursizet").value;
		var  style= document.getElementById("stylet").value;
		var effect = document.getElementById("effectt").value;
		var girlc = document.getElementById("girlct").value;
		var bodyc = document.getElementById("bodyct").value;
		var type = document.getElementById("typet").value;
		window.location.href = "admin/index?method=chaxun&tidt=" + tid+
		 "&namet=" + encodeURI(encodeURI(name))+ 
		 "&colourt=" + encodeURI(encodeURI(colour))+ 
		 "&coloursizet=" +  encodeURI(encodeURI(coloursize))+ 
		 "&stylet=" + encodeURI(encodeURI(style))+
		  "&effectt=" + encodeURI(encodeURI(effect))+ 
		  "&girlct=" + encodeURI(encodeURI(girlc))+ 
		  "&bodyct=" + encodeURI(encodeURI(bodyc))+ 
		  "&typet=" + encodeURI(encodeURI(type));
	};
</script>
<script type="text/javascript">
	function addcos() {
		var  tid= document.getElementById("tid").value;
		var  name= document.getElementById("name").value;
		var  colour= document.getElementById("colour").value;
		var  price= document.getElementById("price").value;
		var  img= document.getElementById("img").value;
		var  size= document.getElementById("size").value;
		var  coloursize= document.getElementById("coloursize").value;
		var  style= document.getElementById("style").value;
		var effect = document.getElementById("effect").value;
		var girlc = document.getElementById("girlc").value;
		var bodyc = document.getElementById("bodyc").value;
		var type = document.getElementById("type").value;
		var ml = document.getElementById("ml").value;
		if(tid==""||price==""||size==""||ml==""){
	alert("tid，价格，型号，或者毫升不能为空");
	return ;
	}
		window.location.href = "admin/index?method=addcos&tid=" + tid+ "&name=" + encodeURI(encodeURI(name))+ "&colour=" + encodeURI(encodeURI(colour))+ "&price=" 
				+ price+ "&img=" + encodeURI(encodeURI(img))+ "&size=" + size+ "&coloursize=" + encodeURI(encodeURI(coloursize))+ "&style=" + encodeURI(encodeURI(style))+ "&effect="
				 + encodeURI(encodeURI(effect))+ "&girlc=" + encodeURI(encodeURI(girlc))+ "&bodyc=" + encodeURI(encodeURI(bodyc))+ "&type=" + encodeURI(encodeURI(type))+ "&ml=" + ml;
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
				<input class="layui-input" placeholder="产品名" name="namet" id="namet">
				<input class="layui-input" placeholder="颜色" name="colourt"id="colourt"> 
				<input class="layui-input" placeholder="色号" name="coloursizet" id="coloursizet">
				<input class="layui-input"	placeholder="风格" name="stylet" id="stylet">
				<input	class="layui-input" placeholder="说明" name="effectt" id="effectt">
				<input class="layui-input" placeholder="女款" name="girlct" id="girlct">
				<input class="layui-input" placeholder="男款" name="bodyct" id="bodyct">
				<input class="layui-input" placeholder="属性" name="typet" id="typet">
				<select id="tidt">
						<option value="0">请选择</option>
	<%for(int i=0;i<cpfl.size();i++) {%><option value="<%=cpfl.get(i).getId()%>"><%=cpfl.get(i).getName()%></option><%}%>
					</select>
				<button class="layui-btn" type="button" lay-filter="sreach" onclick="chaxun()">
					<i class="layui-icon"></i>查询 </button>
			</form>
		</div>
		<xblock>
		
		<button class="layui-btn layui-btn-danger" onclick="delAll()">
			<i class="layui-icon"></i>批量删除
		</button>
		<span class="x-right" style="line-height:40px"><%=cos.size()%>条</span>
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
					<th>产品类别id</th>
					<th>产品名</th>
					<th>颜色</th>
					<th>价格</th>
					<th>图片</th>
					<th>型号</th>
					<th>色号</th>
					<th>风格</th>
					<th>说明</th>
					<th>女款</th>
					<th>男款</th>
					<th>属性</th>
					<th>毫升</th>
					<th>操作</th>
			</thead>
			<tbody>
				<%
					for(int i=0;i<cos.size();i++){
				%>
				<tr>
					<td>
						<div class="layui-unselect layui-form-checkbox" lay-skin="primary"
							data-id='2'>
							<i class="layui-icon">&#xe605;</i>
						</div></td>
					<td><%=cos.get(i).getId()%></td>
					<td><%=cos.get(i).getTid()%></td>
					<td><%=cos.get(i).getName()%></td>
					<td><%=cos.get(i).getColour()%></td>
					<td><%=cos.get(i).getPrice()%></td>
					<td><img src="<%=cos.get(i).getImg()%>"></td>
					<td><%=cos.get(i).getSize()%></td>
					<td><%=cos.get(i).getColoursize()%></td>
					<td><%=cos.get(i).getStyle()%></td>
					<td><%=cos.get(i).getEffect()%></td>
					<td><%=cos.get(i).getGirlc()%></td>
					<td><%=cos.get(i).getBodyc()%></td>
					<td><%=cos.get(i).getType()%></td>
					<td><%=cos.get(i).getMl()%></td>
					<td class="td-manage"><a title="编辑" 
					href="admin/index?method=getallcos&type=<%=cos.get(i).getId()%>"
						> <i class="layui-icon">&#xe642;</i> </a> <a
						title="删除" onclick="return confirm('确定要删除么')"
						href="admin/index?method=delcos&cosid=<%=cos.get(i).getId()%>"> <i
							class="layui-icon">&#xe640;</i> </a></td>
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
	<div class="layui-row">
			<form class="layui-form layui-col-md12 x-so layui-form-pane">
				<input class="layui-input" placeholder="产品类别id" name="tid" id="tid">
				<input class="layui-input" placeholder="产品名" name="name" id="name">
				<input class="layui-input" placeholder="颜色" name="colour"
					id="colour"> <input class="layui-input" placeholder="价格"
					name="price" id="price">  <input
					class="layui-input" placeholder="型号" name="size" id="size">
				<input class="layui-input" placeholder="色号" name="coloursize"
					id="coloursize"> <input class="layui-input"
					placeholder="风格" name="style" id="style"> <input
					class="layui-input" placeholder="说明" name="effect" id="effect">
				<input class="layui-input" placeholder="女款" name="girlc" id="girlc">
				<input class="layui-input" placeholder="男款" name="bodyc" id="bodyc">
				<input class="layui-input" placeholder="属性" name="type" id="type">
				<input class="layui-input" placeholder="毫升" name="ml" id="ml">
				<jsp:include page="getImg.jsp"></jsp:include>
				<button class="layui-btn" type="button" lay-filter="sreach"
					onclick="addcos()">
					<i class="layui-icon"></i>增加
				</button>
			</form>
		</div>
</body>

</html>