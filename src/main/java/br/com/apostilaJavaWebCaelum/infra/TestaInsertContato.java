package br.com.apostilaJavaWebCaelum.infra;

import java.util.Calendar;

import br.com.apostilaJavaWebCaelum.dao.ContatoDao;
import br.com.apostilaJavaWebCaelum.model.Contato;

public class TestaInsertContato {

	public static void main(String args[]){
		Contato contato = new Contato();
		
		contato.setNome("DAVID GILMOUR");
		contato.setEmail("DAVIDGILMOUR@GMAIL.COM");
		contato.setEndereco("LONDRES, INGLATERRA");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao contatoDao = new ContatoDao();
		
		contatoDao.adiciona(contato);
		
		System.out.println("Insert em TB_CONTATO realizado com sucesso.");
	}
}
