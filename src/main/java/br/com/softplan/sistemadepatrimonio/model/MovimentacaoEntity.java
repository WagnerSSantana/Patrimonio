package br.com.softplan.sistemadepatrimonio.model;

import java.time.LocalDate;

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
@Table (name = "movimentação")
public class MovimentacaoEntity {
	
	@Id
	@Column (name = "idMovimentacao")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "date_inicio")
	private LocalDate dataInicial = LocalDate.now();
	@Column (name = "date_conclusao")
	private LocalDate dataFinal;
	
	
	@Column (name = "status")
	@Enumerated (EnumType.STRING)
	private Status status;
	
	@ManyToOne
	private EquipamentoEntity idEquipamento;
	@ManyToOne
	private UsuarioEntity idUsuario;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public EquipamentoEntity getIdEquipamento() {
		return idEquipamento;
	}
	public UsuarioEntity getIdUsuario() {
		return idUsuario;
	}
	
	
	

}
