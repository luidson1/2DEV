<%@page import="javax.websocket.SendResult"%>
<%@page import="org.apache.catalina.ha.backend.Sender"%>
<%@page import="fafica.org.br.Fachada.Fachada"%>
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
		Fachada f = new Fachada();
		String titulo    = request.getParameter("titulo");
		String categoria = request.getParameter("categoria");
		String cidade    = request.getParameter("cidade");
		String estado    = request.getParameter("estado");
		String orcamento = request.getParameter("txtOrcamento");
		String descricao_serv = request.getParameter("txtAreaOrcamento");
	
		Servicos servico = new Servicos();
		servico.setTitulo_servico(titulo);
		servico.setCategoria(Integer.parseInt(categoria));
		servico.setCidade(cidade);
        servico.setEstado(estado);
        servico.setOrcamento(Integer.parseInt(orcamento));
        servico.setDescricao_serv(descricao_serv);
		
		
		f.cadastrarservico(servico);

		request.setAttribute("msg", "Serviço lançado!");
		request.setAttribute("Servicos", servico);
		response.sendRedirect("http://localhost:8085/2DEVS/Entrou.html");
	%>
</body>
</html>