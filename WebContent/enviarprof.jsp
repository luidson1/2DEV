<%@page import="fafica.org.br.Fachada.Fachada"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="org.apache.tomcat.dbcp.jocl.JOCLContentHandler"%>
<%@page import="fafica.org.br.Modelo.Profissionais"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		String titulo_profissao = request.getParameter("txtTituloProf");
		String descricao_exp = request
				.getParameter("txtAreaExperienciaProf");
		String descricao_serv = request.getParameter("txtAreaContenos");
		Profissionais p = new Profissionais();

		try {

			p.setProfissao(titulo_profissao);
			p.setDescricao_experiencia(descricao_exp);
			p.setDescricao_profissional(descricao_serv);

			Fachada f = new Fachada();

			f.cadastrarprofissional(p);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	%>
</body>
</html>