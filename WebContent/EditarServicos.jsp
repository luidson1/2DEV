<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Configura��es do Servi�o</title>
</head>
<body>
	<form action="EditarServicos_Servlet" method="POST">
		<h1>Configura��es do Servi�o</h1>
		<table width="100%" height="100%" border="0" cellspacing="0"
			cellpadding="0">
			<tr>
				<td valign="middle" align="left"><b> C�digo do Servi�o:</b> <input
					type="text" name="codigo_servico" size="" value=""> <br><br>
				<b> T�tulo do Servi�o:</b> <input type="text" name="titulo_servico"
					size="" value=""> <br><br> <b>Or�amento:
				</b> <input type="text" name="orcamento" size="" value=" "> <br>
					<br> <b> Dura��o Estimada: </b> <input type="text"
					name="duracao" size="" value=" "> <br> <br> <b>Editar:
						Trabalho que deva ser realizado: </b><br /> <textarea
						name="descricao_trabalho" rows="5" cols="70">
</textarea></td>
			</tr>
		</table>
		<input type="submit" value="Atualizar"></input> <a href="Entrou.html">Cancelar</a>
	</form>
</body>
</body>
</html>