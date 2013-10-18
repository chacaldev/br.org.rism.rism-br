package rism.com.rismbr.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import rism.com.rismbr.model.Estado;

@Stateful
@Model
public class EstadoRegistration {
	@Inject
	private Logger log;

	@Inject
	private EntityManager em;
	
	@Inject
	private Event<Estado> estadoEventSrc;
	
	private Estado newEstado;
	
	@Produces
	@Named
	public Estado getNewEstado(){
		return newEstado;
	}
	
	public void register() throws Exception {
      log.info("Registering " + newEstado.getNome());
      em.persist(newEstado);
      estadoEventSrc.fire(newEstado);
      initNewEstado();
	   }

	@PostConstruct
	private void initNewEstado() {
		newEstado = new Estado();
	}
}
