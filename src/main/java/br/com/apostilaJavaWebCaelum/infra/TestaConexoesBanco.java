package br.com.apostilaJavaWebCaelum.infra;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexoesBanco {

	public static void main(String... args) throws SQLException{
		System.out.println("--------- INICIO DA EXECUÇÃO DA CLASSE DE TESTE. ----------");
		System.out.println("EXECUTANDO CLASSE DE TESTE PARA CONEXÃO COM BANCO DE DADOS.");
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão efetuada com sucesso!");
		connection.close();
		System.out.println("Fechando conexão.");
		System.out.println("----------- FIM DA EXECUÇÃO DA CLASSE DE TESTE. -----------");
	}
}
