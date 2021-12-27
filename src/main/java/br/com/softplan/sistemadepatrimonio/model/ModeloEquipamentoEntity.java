package br.com.softplan.sistemadepatrimonio.model;


import javax.persistence.Table;


@Table (name = "modelo_has_equipamento")
public class ModeloEquipamentoEntity {

	
	private ModeloEntity idModelo;

	private EquipamentoEntity patrimonioEquipamento;
	
	
	public ModeloEntity getIdModelo() {
		return idModelo;
	}
	public EquipamentoEntity getPatrimonioEquipamento() {
		return patrimonioEquipamento;
	}
	
	
	
}
