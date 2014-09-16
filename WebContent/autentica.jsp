<%@page import="fafica.org.br.Modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%

Usuario usuario = new Usuario();

String login = request.getParameter("txtEmail");
String senha = request.getParameter("txtSenha");

if (login.equals(usuario.getEmail()) && senha.equals(usuario.getSenha())) {
	session.setAttribute("usuario", usuario);
	response.sendRedirect("Entrou.html");
} else {
	request.setAttribute("msg", "Dados inválidos");
	RequestDispatcher dispatcher = request.getRequestDispatcher("/Entrar.html");
	dispatcher.forward(request, response);
}


%>
</body>
</html>