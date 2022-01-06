package br.com.softplan.sistemadepatrimonio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.516-0300")
@StaticMetamodel(FornecedorEntity.class)
public class FornecedorEntity_ {
	public static volatile SingularAttribute<FornecedorEntity, Long> id;
	public static volatile SingularAttribute<FornecedorEntity, String> razaoSocial;
	public static volatile SingularAttribute<FornecedorEntity, String> nomeFantasia;
	public static volatile SingularAttribute<FornecedorEntity, String> cnpj;
	public static volatile SingularAttribute<FornecedorEntity, String> inscricao;
	public static volatile SingularAttribute<FornecedorEntity, String> responsavel;
	public static volatile SingularAttribute<FornecedorEntity, EnderecoEntity> idEndereco;
}
