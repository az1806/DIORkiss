<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>My JSP 'test.jsp' starting page</title>
    <script type="text/javascript" src="admin/js/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="admin/lib/layui/css/layui.css" type="text/css"></link>
    <script type="text/javascript" src="admin/lib/layui/layui.js"></script>
     
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
</head>
<body>
    <form class="form-x">        
        商品名字：<input type="text" id="img" name="dname"/><button type="button" class="layui-btn" id="test1">上传图片</button>
       
       
    </form>
</body>
</html>