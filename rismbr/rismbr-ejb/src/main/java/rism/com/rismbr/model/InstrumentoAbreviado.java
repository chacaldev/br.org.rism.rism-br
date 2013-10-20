/**
 * 
 */
package rism.com.rismbr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * InstrumentoAbreviado
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "instrumento_abreviado", schema = "rismbr")
public class InstrumentoAbreviado implements Serializable{

	private static final long serialVersionUID = 1050014943037188662L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instrumento_abreviado_seq_gen")
	@SequenceGenerator(name = "instrumento_abreviado_seq_gen", sequenceName = "instrumento_abreviado_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 50)
	@Column(name = "nome")
	private String nome;
	
	@Size(max = 10)
	@Column(name = "abreviacao")
	private String abreviacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
