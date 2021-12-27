package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "equipamento")
public class EquipamentoEntity {
	
	@Id
	@Column (name = "patrimonio")
	private long patrimonio;
	@Column (name = "equipamento")
	private String equipamento;
	@Column (name = "serial")
	private String serial;
	
	@ManyToOne
	private FornecedorEntity idFornecedor;
	@ManyToOne
	private SetorEntity idSetor;
	@ManyToOne
	private ResponsavelEntity idResponsavel;
	@ManyToOne
	private MarcaEntity idMarca;
	
	
	
	
	public long getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(long patrimonio) {
		this.patrimonio = patrimonio;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public FornecedorEntity getIdFornecedor() {
		return idFornecedor;
	}
	public SetorEntity getIdSetor() {
		return idSetor;
	}
	public ResponsavelEntity getIdResponsavel() {
		return idResponsavel;
	}
	public MarcaEntity getIdMarca() {
		return idMarca;
	}
	
	
	
	
	

}
