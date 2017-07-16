package SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Submissao {

	private Integer id_submissao;
	private String tipo_subm;
	private String nome;
	private Integer id_autor;
	private Integer aceita;
	private Integer votos;
	
}
