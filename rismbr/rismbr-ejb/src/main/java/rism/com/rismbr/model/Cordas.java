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
 * Cordas
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "cordas", schema = "rismbr")
public class Cordas implements Serializable{

	private static final long serialVersionUID = -4098008124321961941L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cordas_seq_gen")
	@SequenceGenerator(name = "cordas_seq_gen", sequenceName = "cordas_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "violino1")
	private Integer violino1;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "violino2")
	private Integer violino2;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "viola")
	private Integer viola;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "violoncelo")
	private Integer violoncelo;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "contrabaixo")
	private Integer contrabaixo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getViolino1() {
		return violino1;
	}

	public void setViolino1(Integer violino1) {
		this.violino1 = violino1;
	}

	public Integer getViolino2() {
		return violino2;
	}

	public void setViolino2(Integer violino2) {
		this.violino2 = violino2;
	}

	public Integer getViola() {
		return viola;
	}

	public void setViola(Integer viola) {
		this.viola = viola;
	}

	public Integer getVioloncelo() {
		return violoncelo;
	}

	public void setVioloncelo(Integer violoncelo) {
		this.violoncelo = violoncelo;
	}

	public Integer getContrabaixo() {
		return contrabaixo;
	}

	public void setContrabaixo(Integer contrabaixo) {
		this.contrabaixo = contrabaixo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
