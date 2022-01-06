package br.com.softplan.sistemadepatrimonio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.530-0300")
@StaticMetamodel(SetorEntity.class)
public class SetorEntity_ {
	public static volatile SingularAttribute<SetorEntity, Long> id;
	public static volatile SingularAttribute<SetorEntity, String> nomeSetor;
	public static volatile SingularAttribute<SetorEntity, String> andar;
	public static volatile SingularAttribute<SetorEntity, Ala> ala;
	public static volatile SingularAttribute<SetorEntity, DiretoriaEntity> idDieretoria;
}
