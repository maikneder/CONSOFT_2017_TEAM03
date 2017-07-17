package SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fase {
	private Integer idfase;
	private Boolean ativa;
	private Integer idintervalo;
	
	public Integer getIdfase() 
	{
		return idfase;
	}
	
	public void setIdfase(Integer idfase) 
	{
		this.idfase = idfase;
	}

	public Boolean getAtiva() 
	{
		return ativa;
	}
	
	public void setAtiva(Boolean ativa) 
	{
		this.ativa = ativa;
	}
	
	public Integer getIdintervalo() 
	{
		return idintervalo;
	}
	
	public void setIdintervalo(Integer idintervalo) 
	{
		this.idintervalo = idintervalo;
	}
	
	
}
