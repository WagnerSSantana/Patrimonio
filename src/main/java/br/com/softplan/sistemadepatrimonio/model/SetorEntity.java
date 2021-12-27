package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table (name = "setor")
public class SetorEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idsetor")
	private long id;
	@Column (name = "nome_setor")
	private String nomeSetor;
	@Column (name = "andar")
	private String andar;
	
	@Column (name = "ala")
	@Enumerated (EnumType.STRING)
	private Ala ala;
	
	@ManyToOne
	private DiretoriaEntity idDieretoria;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public Ala getAla() {
		return ala;
	}

	public DiretoriaEntity getIdDieretoria() {
		return idDieretoria;
	}
	
	
	
	
}


