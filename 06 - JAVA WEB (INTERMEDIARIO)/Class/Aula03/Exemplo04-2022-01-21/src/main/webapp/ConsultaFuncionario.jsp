<%@page import="modelo.pessoal.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<% Funcionario funcionario = (Funcionario) request.getAttribute("func"); %>
	
	<h3>Matricula:</h3> <%= funcionario.getMatricula() %>
	<h3>Nome:</h3> <%= funcionario.getNome() %>
	<h3>Salario Bruto:</h3> <%= funcionario.getSalarioBrutto() %>

</body>
</html>