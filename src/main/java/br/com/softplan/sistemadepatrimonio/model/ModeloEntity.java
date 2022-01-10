package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "modelo")
public class ModeloEntity {
	
	@Id
	@Column (name = "idmodelo")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "modelo")
	private String modelo;
	
	@ManyToOne
	private CaracteristicaEntity IdCaracteristica;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public CaracteristicaEntity getIdCaracteristica() {
		return IdCaracteristica;
	}
	
	
	
	

}
