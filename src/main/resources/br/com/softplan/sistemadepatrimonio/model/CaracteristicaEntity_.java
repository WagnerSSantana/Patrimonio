package br.com.softplan.sistemadepatrimonio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.452-0300")
@StaticMetamodel(CaracteristicaEntity.class)
public class CaracteristicaEntity_ {
	public static volatile SingularAttribute<CaracteristicaEntity, Long> id;
	public static volatile SingularAttribute<CaracteristicaEntity, String> caracteristica;
	public static volatile SingularAttribute<CaracteristicaEntity, TipoEquipamentoEntity> idTipoEquipamento;
}
