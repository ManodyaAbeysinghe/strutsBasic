<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts Example</title>
</head>
<body>

<h1>Login Page</h1>
<form action = "log" method="post">
<label>User Name</label>
<input type = "text" name="un"/><br/>
<label>Password</label>
<input type = "password" name="pw"/><br/>
<input type = "submit" value="login"/>

</form>

</body>
</html>