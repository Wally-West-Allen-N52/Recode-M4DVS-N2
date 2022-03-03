<%@page import="modelo.negocio.Aluno" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	body {
		background-color: #072347;
		color: white;
	}
</style>
<body>

	<% Aluno aluno = (Aluno) request.getAttribute("al"); %>
	
	<h3>Matricula:</h3> <%= aluno.getMatricula() %>
	<h3>Nome:</h3> <%= aluno.getNome() %>
	
</body>
</html>