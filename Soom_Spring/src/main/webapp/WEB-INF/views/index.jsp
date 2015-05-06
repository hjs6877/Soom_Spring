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
			    <label for="userEmail">Email address</label>
			    <input type="email" class="form-control" id="userEmail" placeholder="Enter email">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Password</label>
			    <input type="password" class="form-control" id="userPass" placeholder="Password">
			  </div>
			  <div class="row">
			  	<div class="col-xs-4">
			  		<label>
					      <input type="checkbox"> save ID
					    </label>
			  	</div>
			  	<div class="col-xs-4">
			  		<a href="#" id="btnSignup">Sign up for SOOM</a>
			  	</div>
			  	<div class="col-xs-4"><a href="#">Forgot password</a></div>
			  </div>
			  <div class="row margin-none">
			  	<button type="button" id="btnLogin" class="btn btn-primary btn-lg btn-block">Sign in</button>
			  </div>
			</form>
		</div>
		<div class="col-xs-2"></div>
	</div>
	
	<!-- S: Singup modal -->
	<div id="modalSignup" class="modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	     	<div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="exampleModalLabel">Sign up for SOOM</h4>
		      </div>
		      <div class="modal-body">
		        <form>
		          <div class="form-group">
		            <label for="signup-email" class="control-label">email</label>
		            <input type="text" class="form-control" id="signup-email">
		          </div>
		          <div class="form-group">
		            <label for="signup-pass" class="control-label">password</label>
		            <input type="password" class="form-control" id="signup-pass" placeholder="at least 6(alphabet or number) characters">
		          </div>
		        </form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		        <button type="button" id="btnSignupComplete" class="btn btn-primary">Sign up</button>
		      </div>
 	 	</div>
 	 </div>
	</div>
	<!-- E: Singup modal -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/framework/jquery/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/framework/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/index.js"></script>
</body>
</html>
