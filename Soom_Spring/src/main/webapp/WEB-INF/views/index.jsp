<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Welcome to SOOM Korea</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/framework/bootstrap/css/bootstrap.css" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css" />
</head>
<body>
	<div class="row">
		<div class="col-xs-2"></div>
		<div class="col-xs-8 text-center"><h1>This is SOOM-Spring Web site</h1></div>
		<div class="col-xs-2"></div>
	</div>
  
  
	<div class="row">
		<div class="col-xs-2"></div>
		<div class="col-xs-8  login-form">
			<form>
			  <div class="form-group">
			    <label for="exampleInputEmail1">Email address</label>
			    <input type="email" class="form-control" id="userEmail" placeholder="Enter email">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Password</label>
			    <input type="password" class="form-control" id="userPass" placeholder="Password">
			  </div>
			  <div class="checkbox">
			    <label>
			      <input type="checkbox"> save ID
			    </label>
			  </div>
			  <button type="button" id="btnLogin" class="btn btn-primary btn-lg btn-block">Login</button>
			</form>
		</div>
		<div class="col-xs-2"></div>
	</div>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/framework/jquery/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/index.js"></script>
</body>
</html>
