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
import javax.validation.constraints.Size;

/**
 * DescricaoFisica
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "descricao_fisica", schema = "rismbr")
public class DescricaoFisica implements Serializable{

	private static final long serialVersionUID = 5796061481355983657L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "descricao_fisica_seq_gen")
	@SequenceGenerator(name = "descricao_fisica_seq_gen", sequenceName = "rismbr.descricao_fisica_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 65)
	@Column(name = "material_falta")
	private String materialFalta;
	
	@Size(max = 20)
	@Column(name = "medidas")
	private String medidas;
	
	@Digits(fraction = 0, integer = 5)
	@Column(name = "numero_composicoes")
	private Integer numeroComposicoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaterialFalta() {
		return materialFalta;
	}

	public void setMaterialFalta(String materialFalta) {
		this.materialFalta = materialFalta;
	}

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public Integer getNumeroComposicoes() {
		return numeroComposicoes;
	}

	public void setNumeroComposicoes(Integer numeroComposicoes) {
		this.numeroComposicoes = numeroComposicoes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
