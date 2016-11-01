<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="static/js/jquery-1.10.1.min.js"></script>
<script>
function test1(){
    
    $.ajax({
         url:"/test/userinfo/5",
         data:{},
         type:"post",
         dataType:"json",
         success:function(data){
             alert("success");
             alert(data[0].user_name);
         },
         error:function(){
             alert("error");
         }
     });
    
    
}

function test2(){
    window.location.href="test2.jsp";
}

</script>
<body>
<input type="button" value="test1" onclick="test1();"/>
<input type="button" value="test2" onclick="test2();"/>
</body>
</html>