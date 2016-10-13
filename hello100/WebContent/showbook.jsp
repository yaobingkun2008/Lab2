<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书和作者详细信息</title>
</head>
<body>
	<h3>书与作者的详细信息</h3>
	<h4>书ISBN编号：</h4>
	<%out.println(request.getParameter("id0")); %>
	<h5>题目：</h5>
	<%out.println(request.getParameter("id1")); %>
	<h6>出版商：</h6>
	<%out.println(request.getParameter("id3")); %>
	<h4>出版日期：</h4>
	<%out.println(request.getParameter("id4")); %>
	<h4>价格：</h4>
	<%out.println(request.getParameter("id5")); %>
	<h4>作者信息：</h4>
	<h4>作者名字：</h4>
	<%out.println(request.getParameter("id6")); %>
	<h4>年龄：</h4>
	<%out.println(request.getParameter("id7")); %>
	<h4>国籍：</h4>
	<%out.println(request.getParameter("id8")); %>
	<h4> 编号：</h4>
	<%out.println(request.getParameter("id2")); %>
	<!--  -->
	<form action="chaxun.action">
		<input type="hidden" name="name" value="<s:property value="#parameters.id6"/>"/>
		<input type="submit" value="回到书目列表"/>
	</form>
</body>
</html>