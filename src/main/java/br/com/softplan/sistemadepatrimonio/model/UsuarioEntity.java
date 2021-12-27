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
@Table (name = "usuario")
public class UsuarioEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idusuario")
	private long id;
	@Column (name = "nome")
	private String nome;
	@Column (name = "senha")
	private String senha;
	
	@Column (name = "nivel")
	@Enumerated (EnumType.STRING)
	private NivelDeAcesso nivel;

	
	
	public UsuarioEntity() {

	}

	public UsuarioEntity(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	


	public UsuarioEntity(String nome, String senha, NivelDeAcesso nivel) {
		this.nome = nome;
		this.senha = senha;
		this.nivel = nivel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelDeAcesso getNivel() {
		return nivel;
	}
	
	
	
	
	
	

}
