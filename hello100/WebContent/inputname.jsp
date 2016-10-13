<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>首页：输入查询作者名字的信息</title>
 <div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
 <img src="1.jpg" height="100%" width="100%"/>    
 </div>

</head>
<body>
	<center>图书管理界面</center>
	<center> 查询</center>
	<center>  <s:property value="     "/>   </center>
	<center>  <s:property value="     "/>   </center>
	<center>  <s:property value="     "/>   </center>
	<center>Please input author's name here:</center>
	<form action="chaxun.action">
		<center><input type="text" name="name"/></center>
		<center><input type="submit" value="提交"/></center>
	</form>
	
</body>
</html>