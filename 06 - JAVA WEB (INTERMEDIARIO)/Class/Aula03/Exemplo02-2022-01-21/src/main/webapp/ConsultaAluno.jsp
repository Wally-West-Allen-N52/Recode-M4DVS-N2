<%@page import="modelo.regra.negocio.Aluno" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Aluno aluno = (Aluno) request.getAttribute("al"); %>
	
	<h3>Matricula:</h3><%= aluno.getMatricula() %>
	<h3>Nome:</h3><%= aluno.getNome() %>
	<h3>Teste:</h3><%= aluno.getTeste() %>
	<h3>Prova:</h3><%= aluno.getProva() %>
	<h3>Média:</h3><%= aluno.getMedia() %>
	
</body>
</html>