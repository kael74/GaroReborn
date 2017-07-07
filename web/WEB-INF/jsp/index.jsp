<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <%-- <%@include file="../WEB-INF/jdf/estilo.jspf" --%>
        <link rel="stylesheet" href="<c:url value="/Resource/css/normalize.css"/>"/>
	<link rel="stylesheet" href="<c:url value="/Resource/css/sweetalert2.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/Resource/css/material.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value="/Resource/css/material-design-iconic-font.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value="/Resource/css/jquery.mCustomScrollbar.css"/>"/>
	<link rel="stylesheet" href="<c:url value="/Resource/css/main.css"/>"/>
    </head>

    <body class="cover">
	<div class="container-login">
		<p class="text-center" style="font-size: 80px;">
			<i class="zmdi zmdi-account-circle"></i>
		</p>
		<p class="text-center text-condensedLight">Sign in with your Account</p>
		<form>
			<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="text" id="userName">
			    <label class="mdl-textfield__label" for="userName">User Name</label>
			</div>
			<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="password" id="pass">
			    <label class="mdl-textfield__label" for="pass">Password</label>
			</div>
			<button id="SingIn" class="mdl-button mdl-js-button mdl-js-ripple-effect" style="color: #3F51B5; float:right;">
				Sign in <i class="zmdi zmdi-mail-send"></i>
			</button>
		</form>
	</div>
</body>
</html>
