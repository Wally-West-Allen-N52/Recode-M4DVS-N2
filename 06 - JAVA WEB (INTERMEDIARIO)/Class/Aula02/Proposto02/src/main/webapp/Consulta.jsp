<%@page import="modelo.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Olerite</title>
</head>
<style>
body {
	background-color: black;	
}
div {
	background-color: green;
	color: #fff;
	text-align: center;
	border-radius: 15px; 
}
</style>
<body>
	<div>
		<% Funcionario funcionario = (Funcionario) request.getAttribute("objFuncionario");%>
		
		Nome:<%= funcionario.getNome() %><br/>
		Matricula:<%= funcionario.getMatricula()%><br/>
		Salário líquio:<%= funcionario.getSalarioLiquido()%>
	</div>
</body>
</html>