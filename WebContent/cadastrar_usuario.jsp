<%@page import="javax.websocket.SendResult"%>
<%@page import="org.apache.catalina.ha.backend.Sender"%>
<%@page import="fafica.org.br.Fachada.Fachada"%>
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

			Usuario u = new Usuario();
			u.setNome(request.getParameter("nome"));
			u.setEmail(request.getParameter("email"));
			u.setSenha(request.getParameter("senha"));
			//		 if (u.setNome() != null) {
			Fachada f = new Fachada();
			f.cadastrarUsuario(u);

			//	 } else {
			//	 request.setAttribute("msg", "Preencha os campos vazios.");
			//}

			request.setAttribute("msg", "Gravado com sucesso!");
			session.setAttribute("usuario", u);
			response.sendRedirect("Entrou.html");


	%>
</body>
</html>