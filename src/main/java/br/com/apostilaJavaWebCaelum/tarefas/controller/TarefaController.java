package br.com.apostilaJavaWebCaelum.tarefas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.apostilaJavaWebCaelum.model.Tarefa;

@Controller
public class TarefaController {

	@RequestMapping("tarefa/cadastro")
	public String paginaDeCadastro() {
		return "tarefa/form";
	}

	@RequestMapping("tarefa/adicionaTarefa")
	public String adicionaTarefa(@Valid Tarefa tarefa, BindingResult result) {
		
		if(result.hasFieldErrors("descricao")){
			return "tarefa/form";
		}
		
		return "tarefa/adicionada";
	}
}
