package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "fornecedor")
public class FornecedorEntity {
	
	@Id
	@Column (name = "idfornecedor")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "razao_social")
	private String razaoSocial;
	@Column (name = "nome_fantasia")
	private String nomeFantasia;
	@Column (name = "cnpj")
	private String cnpj;
	@Column (name = "inscricao")
	private String inscricao;
	@Column (name = "responsavel")
	private String responsavel;
	
	@OneToOne
	private EnderecoEntity idEndereco;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public EnderecoEntity getIdEndereco() {
		return idEndereco;
	}

	
	
	
	
	
}
