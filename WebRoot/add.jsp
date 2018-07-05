<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
  

    <form action="${pageContext.request.contextPath }/user/addUser"  method="post">
    <center>
    <h1>添加用户</h1>
  
    用户编号:<input type="text" name="uid"><br/>
    用户名:<input type="text" name="username"><br/>
    密码:<input type="password" name="password"><br/>
    薪水:<input type="text" name="salary"><br/>
    <input type="submit" value="添加">
      </center>
    </form>
  </body>
</html>
