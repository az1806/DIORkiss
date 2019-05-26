<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'hzp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <% ArrayList< Cosmetics> co = (ArrayList< Cosmetics>) request.getAttribute(" Cosmetics");%>     
               <%  for (int i=0;i<co.size();i++) { %>
            <div class="am-u-sm-6 am-u-md-6 am-u-lg-4">
                <a href="product_info">
               <%=co.get(i).getImg() %>
               <%=co.get(i).getName() %>      
               <%=co.get(i).getId()%>
              <%=co.get(i).getColour() %>
              <%=co.get(i).getPrice() %>元
                </a>
            </div>
              <%
                   }
                   %>
  </body>
</html>
