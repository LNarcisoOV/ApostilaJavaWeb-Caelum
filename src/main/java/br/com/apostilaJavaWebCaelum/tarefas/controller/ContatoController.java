package br.com.apostilaJavaWebCaelum.tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.apostilaJavaWebCaelum.dao.ContatoDao;
import br.com.apostilaJavaWebCaelum.model.Contato;

@Controller
public class ContatoController {

	ContatoDao dao;
	
	@Autowired
	public ContatoController(){
		this.dao = new ContatoDao();
	}
	
	@RequestMapping("contato/cadastro")
	public String formContato() {
		return "contato/formContato";
	}
	
	@RequestMapping("contato/adicionarContato")
	public void adicionaContato(Contato contato) {
		// salva o contato
		dao.adiciona(contato);
	}
}
