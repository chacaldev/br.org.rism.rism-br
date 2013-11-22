package rism.com.rismbr.facade.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import rism.com.rismbr.facade.DbAccess;
import rism.com.rismbr.model.Estado;

@Stateless(name="DbAccess")
public class DbAccessBean implements DbAccess{
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Estado> getAllEstados() {
		return em.createQuery("from Estado").getResultList();
	}

	@Override
	public void createEstado(Estado estado) {
		em.persist(estado);
	}

}
