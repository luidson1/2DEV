<%@page import="java.util.ArrayList"%>
<%@page import="fafica.org.br.Modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Listar_Usuarios_Servlet" method="get" >
		<h1>LISTA DE USUÁRIOS CADASTRADOS NO SISTEMA</h1>
		<table width="100%" border="0" cellspacing="2" cellpadding="0">
			<tbody>
				<tr>
					<td width="70%" rowspan="12">

						<table border="1" cellspacing="0" cellpadding="0">
							<thead>
								<tr>
									<td> Nome</td>
									<td> E-mail</td>
									<td> Reputação </td>
									<td>Opção</td>
								</tr>
							</thead>
							<tbody>
								<%
									ArrayList<Usuario> usuario = (ArrayList<Usuario>) request
											.getAttribute("usuarios");
									if (usuario == null) {
								%>
								<tr>
									<td>Nenhum Registro cadastrado!!</td>
								</tr>
								<%
									} else {
										for (Usuario usuarios : usuario) {
								%>
								<tr>
									<td><%=usuarios.getNome()%></td>
									<td><%=usuarios.getEmail()%></td>
									<td><%=usuarios.getAvaliacao()%></td>
									<td><a
										href="ExcluirUsuario_Servlet?email=<%=usuarios.getEmail()%>" >Excluir</a>
									</td>
								</tr>
								<%
									} // fecha for
									} // fecha else
								%>
							</tbody>
						</table> <br> <br> <input type="submit"
						value="Pesquisar Usuarios">

					</td>
				</tr>

</body>
</html>