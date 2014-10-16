<%@page import="fafica.org.br.Modelo.Profissionais"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<link href="estilos.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="Listar_Profissionais" method="get" target="_parent">
		<table width="100%" border="0" cellspacing="2" cellpadding="0">
			<tbody>
				<tr>
					<td class="textosTitulos">Categorias</td>
					<td width="70%" rowspan="12">
						<table border="1" cellspacing="0" cellpadding="0">
							<thead>
								<tr>
									<td>Codigo</td>
									<td>Profissao</td>
									<td>Positivos</td>
									<td>Negativos</td>

								</tr>
							</thead>
							<tbody>
								<%
									ArrayList<Profissionais> profissionais = (ArrayList<Profissionais>) request
											.getAttribute("profissionais");
									if (profissionais == null) {
								%>
								<tr>
									<td>Nenhum Registro cadastrado!!</td>
								</tr>
								<%
									} else {
										for (Profissionais profissional : profissionais) {
								%>
								<tr>
									<td><%=profissional.getCodigo1()%></td>
									<td><%=profissional.getProfissao()%></td>
									<td><%=profissional.getPositivos()%></td>
									<td><%=profissional.getNegativos()%></td>
									<td><a
										href="Exibir_Curriculum.html?id=<%=profissional.getCodigo1()%>" target ="_parent">Vizualizar</a>
									</td>
								</tr>
								<%
									} // fecha for
									} // fecha else
								%>
							</tbody>
					</table> <br> <br> <input type="submit"
						value="Pesquisar Profissionais">
	
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
					<td>
							<label class="textosGeral">Estado</label> <select name="estado"
								class="selectFormulario" id="estado"></select> <label><br>
								<span class="textosGeral">Cidade</span></label> <select name="cidade"
								class="selectFormulario" id="cidade"></select>
						</td>
				</tr>
				<tr>
					<td class="textosTitulos">Avaliação</td>
				</tr>
				<tr>
					<td><input type="radio" id="todos" checked>Todos</td>
				</tr>
				<tr>
					<td><input type="radio" id="01"><img src="01.png"
						width="112" height="20" /></td>
				</tr>
				<tr>
					<td><input type="radio" id="02"><img src="02.png"
						width="112" height="20" /></td>
				</tr>
				<tr>
					<td><input type="radio" id="03"><img src="03.png"
						width="112" height="20" /></td>
				</tr>
				<tr>
					<td><input type="radio" id="04"><img src="04.png"
						width="112" height="20" /></td>
				</tr>
				<tr>
					<td><input type="radio" id="05"><img src="05.png"
						width="112" height="20" /></td>
				</tr>
			</tbody>
		</table>
</form>
</body>
</html>