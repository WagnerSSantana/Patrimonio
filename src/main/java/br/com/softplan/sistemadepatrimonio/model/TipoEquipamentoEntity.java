package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tipo_equipamento")
public class TipoEquipamentoEntity {
	
	@Id
	@Column (name = "idtipo_equipamento")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "tipo_equipamento")
	private String tipoEquipamento;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipoEquipamento() {
		return tipoEquipamento;
	}
	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	
	
}
