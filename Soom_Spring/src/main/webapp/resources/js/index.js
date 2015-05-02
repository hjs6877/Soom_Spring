/**
 * Main Login
 */
$("#btnLogin").bind("click", function(){
	var userEmail = $("#userEmail").val();
	var userPass = $("#userPass").val();
	$.ajax({
		datatype : "json",
		url : "login",
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
	})
});