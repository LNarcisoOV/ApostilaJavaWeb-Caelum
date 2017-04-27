package br.com.apostilaJavaWebCaelum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.apostilaJavaWebCaelum.infra.ConnectionFactory;
import br.com.apostilaJavaWebCaelum.model.Contato;

@Repository
public class ContatoDao {
	private Connection connection;

	@Autowired
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Contato contato) {
		String sql = "insert into tb_contatos " + "(nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";

		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao tentar inserir contato.");
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
	}

	public List<Contato> pesquisaTodosOsContatos() {
		List<Contato> contatos = new ArrayList<Contato>();
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement("select * from tb_contatos");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao pesquisar contato.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Contato> getPesquisaTodosOsContatos() {
		List<Contato> contatos = new ArrayList<Contato>();
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement("select * from tb_contatos");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao pesquisar contato.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
}
