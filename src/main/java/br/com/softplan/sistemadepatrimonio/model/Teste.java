package br.com.softplan.sistemadepatrimonio.model;

import javax.persistence.EntityManager;

import br.com.softplan.sistemadepatrimonio.dao.UsuarioDAO;
import br.com.softplan.sistemadepatrimonio.util.JpaUtil;

public class Teste {
	public static void main (String[]args) {
		
		
		
//		DiretoriaEntity ObjDiretoria = new DiretoriaEntity();
//		CaracteristicaEntity ObjCaracteristica = new CaracteristicaEntity();
//		EnderecoEntity ObjEndereco = new EnderecoEntity();
//		EquipamentoEntity ObjEquipamento =  new EquipamentoEntity();
//		FornecedorEntity ObjFornecedor = new FornecedorEntity();
//		MarcaEntity ObjMarca = new MarcaEntity();
//		ModeloEntity ObjModelo = new ModeloEntity();
//		ModeloEquipamentoEntity ObjModeloEquipamento = new ModeloEquipamentoEntity();
//		MovimentacaoEntity ObjMovimentacao = new MovimentacaoEntity();
//		ResponsavelEntity ObjResponsavel = new ResponsavelEntity();
//		SetorEntity ObjSetor = new SetorEntity();
//		TipoEquipamentoEntity ObjTipoEquipamento = new TipoEquipamentoEntity();
		
		
		UsuarioEntity ObjUsuario = new UsuarioEntity("Wagner","123456");
		EntityManager em = JpaUtil.getEntityManager();
		UsuarioDAO usuarioDAO = new UsuarioDAO(em);
		
		
		em.getTransaction().begin();
		
		usuarioDAO.insert(ObjUsuario);
		
		em.getTransaction().commit();
		em.close();
		
		
		System.out.println("Feito");
		System.out.println();
		
	
	}
	
	
}
