<%@page import="fafica.org.br.Repositorios.UsuarioRepositorio"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="fafica.org.br.Fachada.Facade"%>
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
			Facade fachada = new Facade();

			String email = request.getParameter("txtEmail");
			String senha = request.getParameter("txtSenha");

			// metodos de buscar e retornar as informações do usuario do banco
			boolean autenticado = fachada.Login(email, senha);

			if (autenticado) {
		fachada.retornarusuario(email, senha);
		session.setAttribute("usuario", email);
		response.sendRedirect("Entrou.html");
			} else {
		request.setAttribute("msg", "Dados inválidos");
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("Entrar_Login.html");
		dispatcher.forward(request, response);
			}
	%>


</body>
</html>