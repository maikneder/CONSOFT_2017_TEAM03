package SGCteam03.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evento {
	private Integer id_evento;
	private Integer id_tipo_evento;
	private String titulo;
	private String abr;
	private Date data;
	private String local;
	private String descricao;
	private String categoria;
	private Boolean ativa;
	
	public Integer getId_evento() 
	{
		return id_evento;
	}
	
	public void setId_evento(Integer id_evento) 
	{
		this.id_evento = id_evento;
	}
	
	public Integer getId_tipo_evento() 
	{
		return id_tipo_evento;
	}
	
	public void setId_tipo_evento(Integer id_tipo_evento) 
	{
		this.id_tipo_evento = id_tipo_evento;
	}
	
	public String getTitulo() 
	{
		return titulo;
	}
	
	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
	
	public String getAbr() 
	{
		return abr;
	}
	
	public void setAbr(String abr) 
	{
		this.abr = abr;
	}
	
	public Date getData() 
	{
		return data;
	}
	
	public void setData(Date data) 
	{
		this.data = data;
	}
	
	public String getLocal() 
	{
		return local;
	}
	
	public void setLocal(String local) 
	{
		this.local = local;
	}
	
	public String getDescricao() 
	{
		return descricao;
	}
	
	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}
	
	public String getCategoria() 
	{
		return categoria;
	}
	
	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}
	
	public Boolean getAtiva() 
	{
		return ativa;
	}
	
	public void setAtiva(Boolean ativa) 
	{
		this.ativa = ativa;
	}
	
	
}
