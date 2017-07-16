package SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Revisao {
	
	private Integer id_revisao;
	private Integer id_submissao;
	private Integer nota;
	private Integer aprovada;

}
