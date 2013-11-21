package rism.com.rismbr.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Arranjador
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@DiscriminatorValue("4")
public class Arranjador extends Papel {

	private static final long serialVersionUID = -8441616961593802652L;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arranjador")
	private List<Obra> obras;

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

}
