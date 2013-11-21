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
 * SoproMadeiras
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "sopro_madeiras", schema = "rismbr")
public class SoproMadeiras implements Serializable{

	private static final long serialVersionUID = -43536561282772285L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sopro_madeiras_seq_gen")
	@SequenceGenerator(name = "sopro_madeiras_seq_gen", sequenceName = "sopro_madeiras_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "flauta")
	private Integer flauta;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "oboe")
	private Integer oboe;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "clarinete")
	private Integer clarinete;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "fagote")
	private Integer fagote;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFlauta() {
		return flauta;
	}

	public void setFlauta(Integer flauta) {
		this.flauta = flauta;
	}

	public Integer getOboe() {
		return oboe;
	}

	public void setOboe(Integer oboe) {
		this.oboe = oboe;
	}

	public Integer getClarinete() {
		return clarinete;
	}

	public void setClarinete(Integer clarinete) {
		this.clarinete = clarinete;
	}

	public Integer getFagote() {
		return fagote;
	}

	public void setFagote(Integer fagote) {
		this.fagote = fagote;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
