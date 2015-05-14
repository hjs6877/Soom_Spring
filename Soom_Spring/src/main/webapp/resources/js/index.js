/**
 * Main Login
 */
$("#btnLogin").bind("click", function(){
	var userEmail = $("#userEmail").val();
	var userPass = $("#userPass").val();
	$.ajax({
		datatype : "json",
		url : "/siksco/soom/signin",
		method : "POST",
		data : {
			userEmail : userEmail,
			userPass : userPass
		},
		beforeSend : function(){
			
		},
		success : function(result){
			alert("요청 성공");
		},
		error : function(xhr, status, errorThrown){
			alert(errorThrown);
		}
	});
});

$("#btnSignup").bind("click", function(){
	$("#modalSignup").modal("show");
});

$("#btnSignupComplete").bind("click", function(){
	var userEmail = $("#signup-email").val();
	var userPass = $("#signup-pass").val();
	
	if(userEmail && userPass){
		$.ajax({
			datatype : "json",
			url : "signup",
			method : "POST",
			data : {
				userEmail : userEmail,
				userPass : userPass
			},
			beforeSend : function(){
				
			},
			success : function(data){
				if($.trim(data.result) == "SUCCESS"){
					alert("sign up completely.\nSign in, please..");
					$("#modalSignup").modal("hide");
					$("#userEmail").val(userEmail);
				}else{
					alert("failed to sing up.\n try again..");
				}
				
			},
			error : function(xhr, status, errorThrown){
				alert(errorThrown);
			}
		});
	}
	
});
