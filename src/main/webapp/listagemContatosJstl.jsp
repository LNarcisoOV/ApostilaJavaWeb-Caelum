<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="cabecalho.jsp" />
<html>
	<body>
		<!-- cria o DAO -->
		<jsp:useBean id="dao"
			class="br.com.apostilaJavaWebCaelum.dao.ContatoDao" />
	
		<table border="1">
			<tr>
				<td>Nome</td>
				<td>Email</td>
				<td>Endere�o</td>
				<td>Data nascimento</td>
			</tr>
			<!-- percorre contatos montando as linhas da tabela -->
			<c:forEach var="contato" items="${dao.pesquisaTodosOsContatos}">
				<tr>
					<td>${contato.nome}</td>
					<td>${contato.email}</td>
					<td>${contato.endereco}</td>
					<td>
						<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" />
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>