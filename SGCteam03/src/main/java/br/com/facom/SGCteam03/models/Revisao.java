package br.com.facom.SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Revisao {
	private Integer id_revisao;
	private Integer id_submissao;
	private Float nota;
	private Boolean aprovada;
	
	public Integer getId_revisao() 
	{
		return id_revisao;
	}
	
	public void setId_revisao(Integer id_revisao) 
	{
		this.id_revisao = id_revisao;
	}
	
	public Integer getId_submissao() 
	{
		return id_submissao;
	}
	
	public void setId_submissao(Integer id_submissao) 
	{
		this.id_submissao = id_submissao;
	}
	
	public Float getNota() 
	{
		return nota;
	}
	
	public void setNota(Float nota) 
	{
		this.nota = nota;
	}
	
	public Boolean getAprovada() 
	{
		return aprovada;
	}
	
	public void setAprovada(Boolean aprovada) 
	{
		this.aprovada = aprovada;
	}
	
	
}
