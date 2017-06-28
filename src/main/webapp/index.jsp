<html>
<body>
<form action="HelloServlet" method="post">
	<h2>Verifique se o ano é bissexto</h2>
	<h1><%= request.getAttribute("msg") != null ? request.getAttribute("msg") : "" %></h1>
	
	<span>Nome:&nbsp; </span>
	<input type="text" name="ano" placeholder=" Digite o ano" >
	<input type="submit" value="Enviar" />
</form>
</body>
</html>
