<html>
<body>
<form action="HelloServlet" method="post">
	
	<h1><%= request.getAttribute("msg") != null ? request.getAttribute("msg") : "" %></h1>
	
	<span>Nome:&nbsp; </span>
	<input type="text" name="nome" placeholder=" Digite seu nome" >
	<input type="submit" value="Enviar" />
</form>
</body>
</html>
