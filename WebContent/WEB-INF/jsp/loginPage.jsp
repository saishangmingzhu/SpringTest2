<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../j_spring_security_check" method="post">
		<p>
		UserName:<input type="text" name="j_username"/>
		</p>
		<p>
		Password:<input type="password" name="j_password"/>
		</p>
		<input type="submit" name="Login">
	</form>
</body>
</html>