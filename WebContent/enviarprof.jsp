<%@page import="fafica.org.br.Fachada.Facade"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="fafica.org.br.Modelo.Profissionais"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body target="_parent">
	<%
		try {

			String Profissao = request.getParameter("txtTituloProf");
			String Descricao_experiencia = request
					.getParameter("txtAreaExperienciaProf");
			String Descricao_profissional = request
					.getParameter("txtAreaContenos");
			Profissionais p = new Profissionais();

			p.setProfissao(Profissao);
			p.setDescricao_experiencia(Descricao_experiencia);
			p.setDescricao_profissional(Descricao_profissional);

			Facade f = new Facade();

			f.cadastrarprofissional(p);

			request.setAttribute("msg", "Serviço lançado!");
			request.setAttribute("Profissao", Profissao);
			response.sendRedirect("http://localhost:8085/2DEVS/Buscar_profissionais.html");

		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
</body>
</html>