package br.com.apostilaJavaWebCaelum.infra;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexoesBanco {

	public static void main(String... args) throws SQLException{
		System.out.println("--------- INICIO DA EXECU��O DA CLASSE DE TESTE. ----------");
		System.out.println("EXECUTANDO CLASSE DE TESTE PARA CONEX�O COM BANCO DE DADOS.");
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o efetuada com sucesso!");
		connection.close();
		System.out.println("Fechando conex�o.");
		System.out.println("----------- FIM DA EXECU��O DA CLASSE DE TESTE. -----------");
	}
}
