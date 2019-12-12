

<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false"%>

<nav class="top ">
	<a href="${contextPath}">
		<span style="color:#0924c4;margin:0px" class=" glyphicon glyphicon-home redColor"></span>
		惠州农产品电商平台
	</a>

	<span>欢迎使用NpcMall</span>

	<c:if test="${!empty user}">
		<a href="loginPage">${user.NAME}</a>
		<a href="forelogout">退出</a>
	</c:if>

	<c:if test="${empty user}">
		<a href="loginPage">请登录</a>
		<a href="registerPage">免费注册</a>
	</c:if>


	<span class="pull-right">
			<a href="forebought">我的订单</a>
			<a href="forecart">
			<span style="color:#0e3ac4;margin:0px" class=" glyphicon glyphicon-shopping-cart redColor"></span>
			购物车<strong>${cartTotalItemNumber}</strong>件</a>
		</span>


</nav>



