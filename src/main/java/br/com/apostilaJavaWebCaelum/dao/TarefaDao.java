package br.com.apostilaJavaWebCaelum.dao;

import java.util.Calendar;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.apostilaJavaWebCaelum.infra.GenericManager;
import br.com.apostilaJavaWebCaelum.model.Tarefa;

@Repository
public class TarefaDao {
	
	private EntityManager manager;
	
	@Autowired
	public TarefaDao(){
		manager = new GenericManager().getManager();
	}

	public void adicionaTarefa(Tarefa tarefa){
		
		tarefa.setFinalizado(false);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		
		manager.getTransaction().begin();    
		manager.persist(tarefa);
		manager.getTransaction().commit();  
	}
}
