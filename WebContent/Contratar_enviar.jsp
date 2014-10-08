<%@page import="javax.websocket.SendResult"%>
<%@page import="org.apache.catalina.ha.backend.Sender"%>
<%@page import="fafica.org.br.Fachada.Facade"%>
<%@page import="fafica.org.br.Modelo.Servicos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		/*		servicos.setCategoria(Integer.parseInt(request
		 .getParameter(("slcCategoria"))));
		 servicos.setEstado(request.getParameter("estado"));
		 servicos.setCidade(request.getParameter("cidade"));
		 servicos.setOrcamento(Integer.parseInt(request
		 .getParameter("txtOrcamento")));
		 servicos.setDescricao_serv(request.getParameter("txtAreaOrcamento"));
			 */
			Servicos s = new Servicos();
			Facade f = new Facade();

			s.setTitulo_servico(request.getParameter("txtTituloServico"));

			f.cadastrarservico(s);
			request.setAttribute("msg", "Gravado com sucesso!");
			response.sendRedirect("http://localhost:8085/2DEVS/Entrou.html");
	%>
</body>
</html>