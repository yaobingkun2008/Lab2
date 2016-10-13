<%@ page language="java" import="java.util.*" import="java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果</title>
</head>
<body>
	<h1>作者名字是：</h1> 
	<s:property value="name"/> 
	<table width="242" height="40" border="1" cellpadding="1"  cellspacing="1">  
	<caption></caption>  
	<tr>  
	<th> ISBN </th> 
	<th> title </th> 
	<th> authorid </th> 
	<th> publisher </th>
	<th> publishdate </th>
	<th> price </th>
	<th>操作</th>
	</tr> 
	
	<s:iterator id="u" value="booklist"> 
	
	<tr>
	 <td> <s:property value="#u.ISBN" /> </td>
	  <td> <a href="showbook.jsp?id0=<s:property value="#u.ISBN"/>&id1=<s:property value="#u.title"/>&id2=<s:property value="#u.authorid"/>&id3=<s:property value="#u.publisher"/>&id4=<s:property value="#u.publishdate"/>&id5=<s:property value="#u.price"/>&id6=<s:property value="#u.authorname"/>&id7=<s:property value="#u.age"/>&id8=<s:property value="#u.country"/>"> <s:property value="#u.title" /> </a> </td>
	  <td> <s:property value="#u.authorid" /> </td> 
	  <td> <s:property value="#u.publisher" /> </td>
	  <td> <s:property value="#u.publishdate" /> </td>
	  <td> <s:property value="#u.price" /> </td>
	  <td> 
	  <form action="delete.action">
	  		<input type="hidden" name="bookname" value="<s:property value="#u.title"/>"/>
	  		<input type="hidden" name="author_id" value="<s:property value="#u.authorid"/>"/>
	  		<input type = "submit" value="删除"/>
	  </form>
	  </td>
	  </tr>
	  
	   </s:iterator> 
	   </table>
	<form action="back.action">
		<input type="submit" value="回到查询界面"/>
	</form>
</body>
</html>