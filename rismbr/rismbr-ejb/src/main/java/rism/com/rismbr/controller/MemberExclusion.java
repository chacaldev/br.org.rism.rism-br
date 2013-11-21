package rism.com.rismbr.controller;

import java.util.logging.Logger;

import javax.ejb.Stateful;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import rism.com.rismbr.model.Member;

@Stateful
@Model
public class MemberExclusion {
	
	@Inject
	private Logger log;
	
	@Inject
	private EntityManager em;
	
	@Inject
	private Event<Member> memberEventSrc;

	public void exclude(Member member){
		log.info("Excluding " + member.getName());
		em.remove(em.merge(member));
		memberEventSrc.fire(member);
	}
}
