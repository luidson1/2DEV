<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page language="java" trimDirectiveWhitespaces="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body bgcolor="F0F1EF">
	<%
		String msg = (String) request.getAttribute("msg");
		if (msg != null) {
	%>
	<b><%=msg%></b>
	<%
		}
	%>
	<form action="autentica.jsp" method="post" target="_parent">
		<br> <br> <br> <br> <br>
		<Center>
			<Font style="face: Cambria; size: 7; color: blue"> DADOS PARA
				ENTRAR.</Font>
		</Center>
		<br> <br>
		<center>
			<A HREF="http://www.facebook.com.br" target="_parent"> <img
				src="entrar_facebook.jpg" style="align: center" width="n%"
				height="n%" border="0">
			</A>
		</center>
		<br> <br>
		<Center>
			<Font style="face: Cambria; size: 5; color: blue">Ou </Font>
		</Center>
		<center>
			<br> <br> <Font face="Verdana" size="3" color="blue">
				Seu Email: <input type="text" name="txtEmail" size="" value="">
			</font> <Font face="Verdana" size="3" color="blue"> Senha: <input
				type="password" name="txtSenha" value=""></font> <input
				type="submit" value="Entrar">
		</center>
	</form>
</body>
</html>