<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Profissional</title>
</head>
<body bgcolor="white">
	<form action="EditarProfissional_Servlet" method="POST">
		<h1>Configurações do Profissional</h1>
		<table width="100%" height="100%" border="0" cellspacing="0"
			cellpadding="0">
			<tr>
				<td valign="middle" align="left"><b> Código:</b> <input
					type="text" name="codigo1" size="" value=" ">
					<br><b> Profissão:</b> <input ype="text" name="profissao" size="" value=" ">
					 <br> <b>Conte-nos
						sobre você: </b><br /> <textarea name="descricao_profissional"
						rows="5" cols="70">
</textarea><br /> <br> <b>Resuma a sua experiência profissional: </b><br />
					<textarea name="descricao_experiencia" rows="5" cols="70">
</textarea><br /> <input type="submit" value="Atualizar"></input> <a
					href="Entrou.html">Cancelar</a>
			</tbody>
		</table>
	</form>
</body>
</body>
</html>