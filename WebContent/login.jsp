<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="UTF-8">
	<title>login</title>
</head>
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/common.css">
	<link rel="stylesheet" href="css/login.css">
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<body >
	<div class="main" >
		<div class="title">客户关系管理系统-登陆</div>
		<div class="main-box">
			<FORM id=form1 name=form1 action="user_login.action" method=post target="_parent">
			<p><label class="label-1">USERNAME</label><input type="text"  class="text-field-1" name="user.user_code"/></p>
			<p><label class="label-2">PASSWORD</label><input type="password"  class="text-field-2" name="user.user_password"/></p>
			<a href="regist.jsp" class="register">注册</a>
			<input type="checkbox" name="checkbox" class="check"><label for="checkbox">Remember me</label>
			 <input type="submit" class="button" value="SIGN-IN"/>
			</FORM>
		</div>
	</div>
</body>
</HTML>
