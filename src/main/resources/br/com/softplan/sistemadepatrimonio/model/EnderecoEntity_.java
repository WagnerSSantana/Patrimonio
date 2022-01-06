package br.com.softplan.sistemadepatrimonio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.512-0300")
@StaticMetamodel(EnderecoEntity.class)
public class EnderecoEntity_ {
	public static volatile SingularAttribute<EnderecoEntity, Long> id;
	public static volatile SingularAttribute<EnderecoEntity, String> endereco;
	public static volatile SingularAttribute<EnderecoEntity, String> bairro;
	public static volatile SingularAttribute<EnderecoEntity, String> uf;
	public static volatile SingularAttribute<EnderecoEntity, Long> numero;
	public static volatile SingularAttribute<EnderecoEntity, String> complemento;
	public static volatile SingularAttribute<EnderecoEntity, String> telefone;
	public static volatile SingularAttribute<EnderecoEntity, String> telefone2;
}
