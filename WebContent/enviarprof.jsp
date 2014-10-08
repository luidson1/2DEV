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
<body>
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

		} catch (Exception e) {
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null, e.getMessage());
		}
	%>
</body>
</html>