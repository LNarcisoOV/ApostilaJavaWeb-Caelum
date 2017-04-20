package br.com.apostilaJavaWebCaelum.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/apostilajavawebcaelum", "root", "123456");
        } catch (SQLException e) {
        	System.out.println("ERRO AO TENTAR CONECTAR COM O BANCO DE DADOS: " + e.getMessage());
        	e.printStackTrace();
        	throw new RuntimeException(e);
        }
    }
}
