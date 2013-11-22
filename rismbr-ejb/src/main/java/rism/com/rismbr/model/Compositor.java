package rism.com.rismbr.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

/**
 * Compositor
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@DiscriminatorValue("1")
public class Compositor extends Papel {

	private static final long serialVersionUID = -1980640933776481992L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compositor")
	private List<Obra> obras;
	
	@Size(max = 125)
	@Column(name = "nome_diplomatico")
	private String nomeDiplomatico;

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

	public String getNomeDiplomatico() {
		return nomeDiplomatico;
	}

	public void setNomeDiplomatico(String nomeDiplomatico) {
		this.nomeDiplomatico = nomeDiplomatico;
	}
	
}
