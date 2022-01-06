package br.com.softplan.sistemadepatrimonio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.514-0300")
@StaticMetamodel(EquipamentoEntity.class)
public class EquipamentoEntity_ {
	public static volatile SingularAttribute<EquipamentoEntity, Long> patrimonio;
	public static volatile SingularAttribute<EquipamentoEntity, String> equipamento;
	public static volatile SingularAttribute<EquipamentoEntity, String> serial;
	public static volatile SingularAttribute<EquipamentoEntity, FornecedorEntity> idFornecedor;
	public static volatile SingularAttribute<EquipamentoEntity, SetorEntity> idSetor;
	public static volatile SingularAttribute<EquipamentoEntity, ResponsavelEntity> idResponsavel;
	public static volatile SingularAttribute<EquipamentoEntity, MarcaEntity> idMarca;
}
