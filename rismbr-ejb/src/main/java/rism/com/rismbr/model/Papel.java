package rism.com.rismbr.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Papel
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Inheritance
@DiscriminatorColumn(name = "tipo_papel", discriminatorType = DiscriminatorType.INTEGER)
@Table(name = "papel", schema = "rismbr")
public abstract class Papel implements Serializable{
	
	private static final long serialVersionUID = -4992746621098556368L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "papel_seq_gen")
	@SequenceGenerator(name = "papel_seq_gen", sequenceName = "papel_id_seq", allocationSize = 1)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "individuo_id")
	private Individuo individuo;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}
	
}
