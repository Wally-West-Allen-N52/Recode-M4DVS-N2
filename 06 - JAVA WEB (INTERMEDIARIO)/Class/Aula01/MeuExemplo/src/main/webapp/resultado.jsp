<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String varMenssagem = (String) request.getAttribute("saidaMenssagem");
	%>
	<h1 style="color: blue">
		Menssagem legal: <br>
	</h1>
	<%
	out.println(varMenssagem);
	%>
</body>
</html>