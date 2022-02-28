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
		// RESGATE DE NOME, COLETA DE DADOS DO SERVLET E JAGA AQUI
		String varNome = (String)request.getAttribute("meuNome");
		out.println(varNome);
	%>
	
	
</body>
</html>