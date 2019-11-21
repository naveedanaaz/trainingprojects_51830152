<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer app login page!</title>
<style type="text/css">
.error{
 color: red;
 /* font-family: sans-serif;
 font-style: italic; */
}
h3{
color:black;
}
body{
 background-image:url(C:/Users/Coalesce/Downloads/nwimage.jpg);
}
</style>
</head>
<body>
<center>
 <h3 align="center">Login to Proceed!!</h3>
 ${error }<br/>
${message }<br/> 
<form:form action="login" method="post" modelAttribute="userbean">
	<table>
	 <tr>
		<td>Enter email</td>
		<td align="center"><form:input path="email"/><form:errors path="email" class="error"/></td>
	</tr>
	<tr>
		  <td>Enter password</td>
		<td align="center"><form:input path="password" type="password"/><form:errors path="password" class="error"/></td>
	 </tr>
	<tr>
		<td align="center"><input type="submit" value="Login"/>
</td>
	</tr> 
	

 </table>
	
</form:form>
</center>
</body>
</html>




