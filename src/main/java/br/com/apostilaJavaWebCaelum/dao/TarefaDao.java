package br.com.apostilaJavaWebCaelum.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import br.com.apostilaJavaWebCaelum.model.Tarefa;

@Repository
public class TarefaDao {

	public void adicionaTarefa(Tarefa tarefa){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	}
}
