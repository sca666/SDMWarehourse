<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>测试</title>
  </head>


  <body>
    登录成功！<br>
    用户名: ${user.userName}<br>
    年龄: ${user.age}<br>
    <button name="index" onclick="window.location.href='/'">返回首页</button>
  </body>
</html>
