<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%Cosmetics cos=(Cosmetics) request.getAttribute("cos"); %>
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
	<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="admincss/font.css">
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
  function update(){
        var id = document.getElementById("id").value;
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
  if (ml == "" || tid == ""||size==""||price=="") {
			return;
		}
		window.location.href = "admin/index?method=updatecos&&id="+id+"&tid=" + tid+ "&name=" + encodeURI(encodeURI(name))+ "&colour=" + encodeURI(encodeURI(colour))+ "&price=" 
				+ price+ "&img=" + encodeURI(encodeURI(img))+ "&size=" + size+ "&coloursize=" + encodeURI(encodeURI(coloursize))+ "&style=" + encodeURI(encodeURI(style))+ "&effect="
				 + encodeURI(encodeURI(effect))+ "&girlc=" + encodeURI(encodeURI(girlc))+ "&bodyc=" + encodeURI(encodeURI(bodyc))+ "&type=" + encodeURI(encodeURI(type))+ "&ml=" + ml;
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
  <div>
  <div class="x-body">
		<form class="layui-form">
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>id</label>
				<div class="layui-input-inline">
					<input type="text" name="id" value="<%=cos.getId()%>" id="id" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>类别id </label>
				<div class="layui-input-inline">
					<input type="text" name="tid" value="<%=cos.getTid()%>" id="tid" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>产品名称 </label>
				<div class="layui-input-inline">
					<input type="text" name="name" value="<%=cos.getName()%>" id="name" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>产品颜色</label>
				<div class="layui-input-inline">
					<input type="text" name="colour" value="<%=cos.getColour()%>" id="colour" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"><span
					class="x-red">*</span>产品价格 </label>
				<div class="layui-input-inline">
					<input type="text" name="price" value="<%=cos.getPrice()%>" id="price" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> 
			 <form class="form-x"> 	<button type="button" class="layui-btn" id="test1">上传图片</button></form> </label>
				<div class="layui-input-inline">
					<input type="text" name="img" value="<%=cos.getImg()%>" id="img" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>型号 </label>
				<div class="layui-input-inline">
					<input type="text" name="size" value="<%=cos.getSize()%>" id="size" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>口红色号 </label>
				<div class="layui-input-inline">
					<input type="text" name="coloursize" value="<%=cos.getColoursize()%>" id="coloursize" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>样式 </label>
				<div class="layui-input-inline">
					<input type="text"  name="style" value="<%=cos.getStyle()%>" id="style"  required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>说明 </label>
				<div class="layui-input-inline">
					<input type="text" name="effect" value="<%=cos.getEffect()%>" id="effect" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>女款 </label>
				<div class="layui-input-inline">
					<input type="text" name="girlc" value="<%=cos.getGirlc()%>" id="girlc" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>男款</label>
				<div class="layui-input-inline">
					<input type="text" name="bodyc" value="<%=cos.getBodyc()%>" id="bodyc" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>属性 </label>
				<div class="layui-input-inline">
					<input type="text" name="type" value="<%=cos.getType()%>" id="type" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>毫升 </label>
				<div class="layui-input-inline">
					<input type="text" name="ml" value="<%=cos.getMl()%>" id="ml" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<input class="layui-btn" lay-filter="add" lay-submit="" onclick="update()" value="修改" type="button">
				<a href="admin/index.jsp" >返回首页</a>
			</div>
		</form>
  </body>
</html>
