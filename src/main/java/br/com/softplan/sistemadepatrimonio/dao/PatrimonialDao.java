package br.com.softplan.sistemadepatrimonio.dao;

import javax.persistence.EntityManager;

import br.com.softplan.sistemadepatrimonio.model.DiretoriaEntity;




public class PatrimonialDao {
	
	private EntityManager em;

	public PatrimonialDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar (DiretoriaEntity diretoria) {
		this.em.persist(diretoria);
	}
	
	
	

}


