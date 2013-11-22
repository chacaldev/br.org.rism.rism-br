package rism.com.rismbr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * SoproMetais
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "sopro_metais", schema = "rismbr")
public class SoproMetais implements Serializable{

	private static final long serialVersionUID = -9166754789381880922L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sopro_metais_seq_gen")
	@SequenceGenerator(name = "sopro_metais_seq_gen", sequenceName = "sopro_metais_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "trompa")
	private Integer trompa;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "trompete")
	private Integer trompete;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "trombone")
	private Integer trombone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTrompa() {
		return trompa;
	}

	public void setTrompa(Integer trompa) {
		this.trompa = trompa;
	}

	public Integer getTrompete() {
		return trompete;
	}

	public void setTrompete(Integer trompete) {
		this.trompete = trompete;
	}

	public Integer getTrombone() {
		return trombone;
	}

	public void setTrombone(Integer trombone) {
		this.trombone = trombone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
