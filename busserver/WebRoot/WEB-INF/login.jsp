<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    <h1>管理员登陆</h1>
    <form action="/busserver/login.do?flag=login" method="post">
    <table>
    <tr><td>管理员名:</td><td> <input type="text" name="name" /></td></tr>
    <tr><td>密码:</td><td><input type="password" name="pwd"/></td></tr>
    <tr><td><input type="submit" value="登陆" /></td><td><input type="reset" value="重填"/></td></tr>
    </table>
   
    <br/>
    
    </form>
  </body>
</html>
