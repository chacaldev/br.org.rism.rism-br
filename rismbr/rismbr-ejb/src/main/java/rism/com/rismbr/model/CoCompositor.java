package rism.com.rismbr.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * CoCompositor
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@DiscriminatorValue("2")
public class CoCompositor extends Papel{

	private static final long serialVersionUID = 1758706870552935606L;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coCompositor")
	private List<Obra> obras;

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
