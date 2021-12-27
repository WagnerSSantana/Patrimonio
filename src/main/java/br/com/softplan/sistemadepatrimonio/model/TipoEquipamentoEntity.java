package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tipo_equipamento")
public class TipoEquipamentoEntity {
	
	@Id
	@Column (name = "idtipo_equipamento")
	@Enumerated (EnumType.STRING)
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
