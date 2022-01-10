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
@Table (name = "caracteristica")
public class CaracteristicaEntity {
	
	@Id
	@Column (name = "idcaracteristica")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "caracteristica")
	private String caracteristica;
	
	@ManyToOne
	private TipoEquipamentoEntity idTipoEquipamento;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public TipoEquipamentoEntity getIdTipoEquipamento() {
		return idTipoEquipamento;
	}
	
	

}

 