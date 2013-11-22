package rism.com.rismbr.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Copista
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@DiscriminatorValue("6")
public class Copista extends Papel {

	private static final long serialVersionUID = 8717871658097802404L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "copista")
	private List<Documento> documentos;

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
