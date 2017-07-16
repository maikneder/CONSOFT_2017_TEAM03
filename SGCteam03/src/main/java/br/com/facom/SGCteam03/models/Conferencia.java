package br.com.facom.SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idconferencia;
	private String nome;
	private String subtitulo;
	private String nome_abr;
	private String subtitulo_sec;
	private String pag_web;
	private String organizador;
	private String cidade;
	private String email;
	private String remetente_email;
	private String email_conf;
	private String end_rem;
	private String conferenciacol;
	private String arq_sup;
	private String moeda;
	
	public Integer getIdconferencia() 
	{
		return idconferencia;
	}
	
	public void setIdconferencia(Integer idconferencia) 
	{
		this.idconferencia = idconferencia;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getSubtitulo() 
	{
		return subtitulo;
	}
	
	public void setSubtitulo(String subtitulo) 
	{
		this.subtitulo = subtitulo;
	}
	
	public String getNome_abr() 
	{
		return nome_abr;
	}
	
	public void setNome_abr(String nome_abr) 
	{
		this.nome_abr = nome_abr;
	}
	
	public String getSubtitulo_sec() 
	{
		return subtitulo_sec;
	}
	
	public void setSubtitulo_sec(String subtitulo_sec) 
	{
		this.subtitulo_sec = subtitulo_sec;
	}
	
	public String getPag_web()
	{
		return pag_web;
	}
	
	public void setPag_web(String pag_web) 
	{
		this.pag_web = pag_web;
	}
	
	public String getOrganizador() 
	{
		return organizador;
	}
	
	public void setOrganizador(String organizador) 
	{
		this.organizador = organizador;
	}
	
	public String getCidade() 
	{
		return cidade;
	}
	
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getRemetente_email() 
	{
		return remetente_email;
	}
	
	public void setRemetente_email(String remetente_email) 
	{
		this.remetente_email = remetente_email;
	}
	
	public String getEmail_conf() 
	{
		return email_conf;
	}
	
	public void setEmail_conf(String email_conf) 
	{
		this.email_conf = email_conf;
	}
	
	public String getEnd_rem() 
	{
		return end_rem;
	}
	
	public void setEnd_rem(String end_rem) 
	{
		this.end_rem = end_rem;
	}
	
	public String getConferenciacol() 
	{
		return conferenciacol;
	}
	
	public void setConferenciacol(String conferenciacol) 
	{
		this.conferenciacol = conferenciacol;
	}
	
	public String getArq_sup() 
	{
		return arq_sup;
	}
	
	public void setArq_sup(String arq_sup) 
	{
		this.arq_sup = arq_sup;
	}
	
	public String getMoeda() 
	{
		return moeda;
	}
	
	public void setMoeda(String moeda) 
	{
		this.moeda = moeda;
	}
	
		
}
