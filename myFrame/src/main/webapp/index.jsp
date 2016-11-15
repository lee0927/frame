<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<html>
<head>
<title>测试页面</title>

<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>

<script type="text/javascript">
	function login(){
		window.location="${pageContext.request.contextPath}/user/login.do";
//		$.ajax({
//			url:"${pageContext.request.contextPath}/user/login.do",
//			data:{},
//			dataType:"text",
//			type:"post", 
//			success:function(data){
//				//alert("success");
//				
//			},
//			error:function(){
//				//alert("error");
//			}
//		});
	}
</script>
</head>
<body>
	<form action="user/userLogin">
		<input type="text" name="name"/>
		<input type="text" name="psd">
		<input type="submit" value="用户登陆"/>
	</form>
	<input type="button" value="页面跳转测试" onclick="login();"/>
</body>
</html>
