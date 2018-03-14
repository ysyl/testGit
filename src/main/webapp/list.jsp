	<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  	
	<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
	<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
	<html>  
	  <head>  
	    <title>首页</title>  
	  </head>  
	  <body>  
	     登录成功！欢迎访问首页O(∩_∩)O  
   <a href="userAuth/logout">登出</a>  
     <br/><br/>  
        <a href="userAuth/testShiroAnnocation">Test ShiroAnnocation</a>  
       <br/><br/>   
   <shiro:hasRole name="admin">  
   <br/><br/>  
   <a href="admin.jsp">Admin Page</a>  
   </shiro:hasRole>  
     
   <shiro:hasRole name="user">  
   <br/><br/>  
   <a href="User.jsp">User Page</a>  
   </shiro:hasRole>  

	  </body>  
	</html> 
