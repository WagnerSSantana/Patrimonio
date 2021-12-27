package br.com.softplan.sistemadepatrimonio.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;


import br.com.softplan.sistemadepatrimonio.model.UsuarioEntity;

public class UsuarioDAO {
	
	private final EntityManager em;
	
	public UsuarioDAO (EntityManager em) {
		
		this.em = em;
	}
	
	
	public UsuarioEntity insert (UsuarioEntity usuario) {
		em.persist(usuario);
		return usuario;
	}
	
	public UsuarioEntity upadate (UsuarioEntity usuario) {
		em.merge(usuario);
		em.persist(usuario);
		return usuario;
	}
	
	public UsuarioEntity insertOrUpdate (UsuarioEntity usuario) {
		if (usuario.getId() > 0) {
			return this.upadate(usuario);
		}else {
			return this.insert(usuario);
		}
	}
	
	public void delete (UsuarioEntity usuario) {
		em.merge(usuario);
		em.remove(usuario);
	}
	
	public UsuarioEntity selectPorId (UsuarioEntity usuario) {
		return em.find(UsuarioEntity.class, usuario);
	}
	
	public List<UsuarioEntity> selectAll() {
		// consulta JPQL
		String jpql = "select u from UsuarioEntity as u";
		Query query = em.createQuery(jpql);
		
		return retornaListaComBaseNaConsulta(query); 
		
		
	}


	private List<UsuarioEntity> retornaListaComBaseNaConsulta(Query query) {
		List<UsuarioEntity> usuarios;		
		try {
			usuarios = query.getResultList();
						
		}catch (NoResultException e) {
			usuarios = new ArrayList<UsuarioEntity>();
		}
		return usuarios;
	}
	
	
	public boolean existeNoBancoPorUsuarioESenha(UsuarioEntity usuarioNovo) {
		String jpql = "select u from UsuarioEntity as u"
				+ "where u.nome = :pUsuario and u.senha = :pSenha";
		Query query = em.createQuery(jpql);
		query.setParameter("pUsuario", usuarioNovo.getNome());
		query.setParameter("pSenha", usuarioNovo.getNome());
		
		
		return !retornaListaComBaseNaConsulta(query).isEmpty();
		
	}

}
