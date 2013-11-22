package rism.com.rismbr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * Vozes
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "vozes", schema = "rismbr")
public class Vozes implements Serializable{

	private static final long serialVersionUID = 7768427781644568941L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vozes_seq_gen")
	@SequenceGenerator(name = "vozes_seq_gen", sequenceName = "vozes_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "soprano")
	private Integer soprano;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "alto")
	private Integer alto;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "tenor")
	private Integer tenor;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "baritono")
	private Integer baritono;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "desconhecida")
	private Integer desconhecida;
	
	@ManyToOne
	@JoinColumn(name = "coro_id")
	private Coro coro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSoprano() {
		return soprano;
	}

	public void setSoprano(Integer soprano) {
		this.soprano = soprano;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}

	public Integer getTenor() {
		return tenor;
	}

	public void setTenor(Integer tenor) {
		this.tenor = tenor;
	}

	public Integer getBaritono() {
		return baritono;
	}

	public void setBaritono(Integer baritono) {
		this.baritono = baritono;
	}

	public Integer getDesconhecida() {
		return desconhecida;
	}

	public void setDesconhecida(Integer desconhecida) {
		this.desconhecida = desconhecida;
	}

	public Coro getCoro() {
		return coro;
	}

	public void setCoro(Coro coro) {
		this.coro = coro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
