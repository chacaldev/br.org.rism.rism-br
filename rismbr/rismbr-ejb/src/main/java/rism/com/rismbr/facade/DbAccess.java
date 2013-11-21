package rism.com.rismbr.facade;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import rism.com.rismbr.model.Estado;

@Local
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public interface DbAccess {
	List<Estado> getAllEstados();
	
	void createEstado(Estado estado);
}
