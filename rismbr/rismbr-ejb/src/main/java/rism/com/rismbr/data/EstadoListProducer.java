package rism.com.rismbr.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import rism.com.rismbr.model.Estado;

@RequestScoped
public class EstadoListProducer {
	
	@Inject
	private EntityManager em;

	private List<Estado> estados;

	// @Named provides access the return value via the EL variable name "members" in the UI (e.g.,
	// Facelets or JSP view)
	@Produces
	@Named
	public List<Estado> getEstados() {
      return estados;
	}	
	
	public void onEstadoListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Estado estado) {
	      retrieveAllEstadosOrderedByName();
	}

	@PostConstruct
	public void retrieveAllEstadosOrderedByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Estado> criteria = cb.createQuery(Estado.class);
		Root<Estado> estado = criteria.from(Estado.class);
		// Swap criteria statements if you would like to try out type-safe criteria queries, a new
		// feature in JPA 2.0
		// criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
		criteria.select(estado).orderBy(cb.asc(estado.get("nome")));
		estados = em.createQuery(criteria).getResultList();
	}
}
