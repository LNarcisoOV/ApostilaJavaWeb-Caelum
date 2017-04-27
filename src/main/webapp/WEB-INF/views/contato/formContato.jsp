<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"%>

<html>
	<head>
		<link href="js/jquery-ui.css" rel="stylesheet">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-ui.min.js"></script>
	</head>
	<body>
		<form action="adicionarContato" method="POST">
			Nome: <input type="text" name="nome" />
			<br />
			E-mail: <input type="text" name="email" />
			<br /> 
			Endere�o: <input type="text" name="endereco" />
			<br /> 
			Data Nascimento: <caelum:campoData id="dataNascimento" />
			<br /> 
			<input type="submit" value="Gravar" />
		</form>
	</body>
</html>