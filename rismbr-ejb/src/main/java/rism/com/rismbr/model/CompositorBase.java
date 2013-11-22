package rism.com.rismbr.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * CompositorBase
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@DiscriminatorValue("3")
public class CompositorBase extends Papel {

	private static final long serialVersionUID = -6347810043508122291L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compositorBase")
	private List<Obra> obras;

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}
	
}
