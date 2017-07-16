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
	
}
