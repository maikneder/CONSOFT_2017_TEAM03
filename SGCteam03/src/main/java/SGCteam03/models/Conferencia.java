package SGCteam03.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

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
	   private Integer idevento;
	   private Integer idsessao;
	   private Integer idcategoriapreco;
	   private Integer idfase;
	   private Integer idtopico;
	   private Integer idsubmissao;

	   public String getNome()
	   {
	      return this.nome;
	   }

	   public void setName(String nome)
	   {
	      this.nome = nome;
	   }
}