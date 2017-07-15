package SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_evento;
    private String tipo_evento;
    private String titulo;
    private String abr;
    private String data;
    private String local;
    private String descricao;
    private String categoria;
    private Integer ativa;
    
}
