<%@page import="java.util.List"%>
<%@page import="fafica.org.br.Modelo.Usuario"%>
<%@page import="fafica.org.br.Modelo.Servicos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="fafica.org.br.Fachada.Facade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="cidades-estados-1.2-utf8.js"></script>
<script type="text/javascript">
	window.onload = function() {
		new dgCidadesEstados({
			estado : document.getElementById('estado'),
			cidade : document.getElementById('cidade'),
			estadoVal : '<%=("estado")%>',
			cidadeVal : '<%=("cidade")%>'
	
		});
	}
</script>
<meta charset="UTF-8">

<link href="estilos.css" rel="stylesheet" type="text/css">
</head>
<body>

	<form action="Listar_Servicos" method="get" >

		<table width="100%" border="0" cellspacing="2" cellpadding="0">
			<tbody>
				<tr>
					<td class="textosTitulos">Categorias</td>
					<td width="70%" rowspan="12">

						<table border="1" cellspacing="0" cellpadding="0">
							<thead>
								<tr>
									<td>Codigo</td>
									<td>Titulo</td>
									<td>Estado</td>
									<td>Opção</td>
								</tr>
							</thead>
							<tbody>
								<%
									ArrayList<Servicos> servicos = (ArrayList<Servicos>) request
											.getAttribute("servicos");
									if (servicos == null) {
								%>
								<tr>
									<td>Nenhum Registro cadastrado!!</td>
								</tr>
								<%
									} else {
										for (Servicos servico : servicos) {
								%>
								<tr>
									<td><%=servico.getCodigo()%></td>
									<td><%=servico.getTitulo_servico()%></td>
									<td><%=servico.getEstado()%></td>
									<td><a
										href="ExcluirServicos_Servlet?codigo=<%=servico.getCodigo()%>" >Excluir</a>
									</td>
								</tr>
								<%
									} // fecha for
									} // fecha else
								%>
							</tbody>
						</table> <br> <br> <input type="submit"
						value="Pesquisar Serviços">

					</td>
				</tr>
				<tr>
					<td width="30%"><select class="selectFormulario">
							<option value="0">Selecione a categoria</option>
							<option value="AL">Advocacia e Leis</option>
							<option value="AG">Animação Gráfica</option>
							<option value="Aq">Arquitetura</option>
							<option value="DI">Desenho Industrial</option>
							<option value="DG">Design Gráfico</option>
							<option value="DA">Direção de Arte</option>
							<option value="FT">Fotografia</option>
							<option value="Il">Ilustração</option>
							<option value="Inf">Informática</option>
							<option value="MF">Moda Figurino</option>
							<option value="PM">Produção Musical</option>
							<option value="RadJ">Redator / Jornalismo</option>
							<option value="SG">Serviços Gerais</option>
							<option value="TD">Tradução</option>
							<option value="Vd">Vídeo / Cinema</option>
					</select></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td class="textosTitulos">Localidade</td>
				</tr>
				<tr>
					<td>	<label class="textosGeral">Estado</label> <select name="estado"
								class="selectFormulario" id="estado"></select> <label><br>
								<span class="textosGeral">Cidade</span></label> <select name="cidade"
								class="selectFormulario" id="cidade"></select>
						</form></td>
				</tr>
			</tbody>
		</table>
	</form>


</body>
</html>