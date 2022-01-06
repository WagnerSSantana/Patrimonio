package br.com.softplan.sistemadepatrimonio.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-01-06T17:00:07.527-0300")
@StaticMetamodel(MovimentacaoEntity.class)
public class MovimentacaoEntity_ {
	public static volatile SingularAttribute<MovimentacaoEntity, Long> id;
	public static volatile SingularAttribute<MovimentacaoEntity, LocalDate> dataInicial;
	public static volatile SingularAttribute<MovimentacaoEntity, LocalDate> dataFinal;
	public static volatile SingularAttribute<MovimentacaoEntity, Status> status;
	public static volatile SingularAttribute<MovimentacaoEntity, EquipamentoEntity> idEquipamento;
	public static volatile SingularAttribute<MovimentacaoEntity, UsuarioEntity> idUsuario;
}
