package br.com.apostilaJavaWebCaelum.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "TB_TAREFA")
public class Tarefa {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@NotEmpty(message = "A descrição deve ser preenchida.")
	@Size(min = 5, message = "Descrição deve ter pelo menos 5 carateres.")
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "finalizado")
	private boolean finalizado;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataFinalizacao")
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}