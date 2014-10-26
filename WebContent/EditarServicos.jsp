<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EditarUsuario_Servlet" method="POST">
	<h1>Configurações do Serviço</h1>
	<table>
		<tr>
			<td>Nome</td>
			<td>Endereço</td>
			<td>Cidade</td>
			<td>UF</td>
			<td>Email</td>
			<td>Senha</td>
		</tr>
		<tr>
			<td><input type="text" name="nome" value=""></input></td>
			<td><input type="text" name="endereco" value=""></input></td>
			<td><input type="text" name="cidade" value=""></input></td>
			<td><input type="text" name="uf" value=""></input></td>
			<td><input type="text" name="email" value=""></input></td>
			<td><input type="text" name="senha" value=""></input></td>

		</tr>
	</table>
	<input type="submit" value="atualizar"></input>
	<a href="Entrou.html">Cancelar</a>
</form>
</body>
</body>
</html>