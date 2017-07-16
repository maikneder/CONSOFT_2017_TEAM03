package br.com.facom.SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Submissao {
	private Integer id_submissao;
	private Integer id_tipo_subm;
	private String name;
	private Integer id_autor;
	private Boolean aceita;
	private Integer votos;
	
	public Integer getId_submissao() 
	{
		return id_submissao;
	}
	
	public void setId_submissao(Integer id_submissao) 
	{
		this.id_submissao = id_submissao;
	}
	
	public Integer getId_tipo_subm() 
	{
		return id_tipo_subm;
	}
	
	public void setId_tipo_subm(Integer id_tipo_subm) 
	{
		this.id_tipo_subm = id_tipo_subm;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Integer getId_autor() 
	{
		return id_autor;
	}
	
	public void setId_autor(Integer id_autor) 
	{
		this.id_autor = id_autor;
	}
	
	public Boolean getAceita() 
	{
		return aceita;
	}
	
	public void setAceita(Boolean aceita) 
	{
		this.aceita = aceita;
	}
	
	public Integer getVotos() 
	{
		return votos;
	}
	
	public void setVotos(Integer votos) 
	{
		this.votos = votos;
	}
	
	
}
