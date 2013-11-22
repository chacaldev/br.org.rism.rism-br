package rism.com.rismbr.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * Coro
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "coro", schema = "rismbr")
public class Coro implements Serializable{

	private static final long serialVersionUID = -7347089376655603137L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coros_seq_gen")
	@SequenceGenerator(name = "coros_seq_gen", sequenceName = "coros_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Digits(fraction = 0, integer = 1)
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coro")
	private List<Vozes> vozes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Vozes> getVozes() {
		return vozes;
	}

	public void setVozes(List<Vozes> vozes) {
		this.vozes = vozes;
	}
	
}
