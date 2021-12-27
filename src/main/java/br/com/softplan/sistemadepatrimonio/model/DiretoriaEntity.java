package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "diretoria")
public class DiretoriaEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "iddiretoria")
	private long id;
	@Column (name = "diretoria")
	private String diretoria;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDiretoria() {
		return diretoria;
	}
	public void setDiretoria(String diretoria) {
		this.diretoria = diretoria;
	}

	
	
}