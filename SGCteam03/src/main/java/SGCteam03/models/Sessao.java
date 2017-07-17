package SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sessao {
	private Integer id_sessao;
	private String nome;
	private String nome_abr;
	private String intervalo;
	
	public Integer getId_sessao() 
	{
		return id_sessao;
	}
	
	public void setId_sessao(Integer id_sessao) 
	{
		this.id_sessao = id_sessao;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getNome_abr() 
	{
		return nome_abr;
	}
	
	public void setNome_abr(String nome_abr) 
	{
		this.nome_abr = nome_abr;
	}
	
	public String getIntervalo() 
	{
		return intervalo;
	}
	
	public void setIntervalo(String intervalo) 
	{
		this.intervalo = intervalo;
	}	
	
}
