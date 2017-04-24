<html>
	<%@ page import="java.util.*,
		br.com.apostilaJavaWebCaelum.dao.*,
		br.com.apostilaJavaWebCaelum.model.*"
	%>
  <body>
    <table border="1">
    	<tr>
    		<td>Nome</td> 
          	<td>Email</td>
          	<td>Endereço</td>
          	<td>Data nascimento</td>
    	</tr>
      <%
      ContatoDao dao = new ContatoDao();
      List<Contato> contatos = dao.pesquisaTodosOsContatos();
      
      for (Contato contato : contatos ) {
      %>
        <tr>
          <td><%=contato.getNome() %></td> 
          <td><%=contato.getEmail() %></td>
          <td><%=contato.getEndereco() %></td>
          <td><%=contato.getDataNascimento().getTime() %></td>
        </tr>
      <%
      }
      %>
    </table>
  </body>
</html>