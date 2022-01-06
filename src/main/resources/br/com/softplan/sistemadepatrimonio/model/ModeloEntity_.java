package br.com.softplan.sistemadepatrimonio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.526-0300")
@StaticMetamodel(ModeloEntity.class)
public class ModeloEntity_ {
	public static volatile SingularAttribute<ModeloEntity, Long> id;
	public static volatile SingularAttribute<ModeloEntity, String> modelo;
	public static volatile SingularAttribute<ModeloEntity, CaracteristicaEntity> IdCaracteristica;
}
