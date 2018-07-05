<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/del.js">

</script>
  </head>
  
  <body>
   <form>
   <table border="1" cellspacing="0" align="center" width="80%">
   <tr><th>用户编号</th><th>用户名</th><th>密码</th><th>薪水</th><th>操作</th></tr>
   <c:if test="${users==null }">
   <tr><td colspan="5"><font color="red">没有符合条件的数据</font></td></tr>
   </c:if>
   <c:if test="${users!=null }">
   <c:forEach items="${users }" var="user">
   <tr><td>${user.uid }</td>
   <td>${user.username }</td>
   <td>${user.password }</td>
   <td>${user.salary }</td>
   <td>
   <!-- 修改了uid为user_id -->
   <a href="${pageContext.request.contextPath }/user/getUserByUid?uid=${user.uid}">修改</a>
   <a href="javascript:ma(${user.uid })">删除</a>
   </td>
   </tr>
   </c:forEach>
   </c:if>
   
   </table>
   </form>
  </body>
</html>
