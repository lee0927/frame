<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试页面</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

<script>
	function login(){
		$.ajax({
			url:"${pageContext.request.contextPath}/user/login.do",
			data:{},
			dataType:"json",
			success:function(data){
				alert("success");
			},
			error:function(){
				alert("error");
			}
		});
	}
</script>
</head>
<body>
	<input type="button" value="登陆" onclick="login();"/>
</body>
</html>
