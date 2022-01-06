package br.com.softplan.sistemadepatrimonio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.533-0300")
@StaticMetamodel(UsuarioEntity.class)
public class UsuarioEntity_ {
	public static volatile SingularAttribute<UsuarioEntity, Long> id;
	public static volatile SingularAttribute<UsuarioEntity, String> nome;
	public static volatile SingularAttribute<UsuarioEntity, String> senha;
	public static volatile SingularAttribute<UsuarioEntity, NivelDeAcesso> nivel;
}
