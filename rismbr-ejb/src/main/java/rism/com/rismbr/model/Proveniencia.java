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
import javax.validation.constraints.Size;

/**
 * Proveniencia
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "proveniencia", schema = "rismbr")
public class Proveniencia implements Serializable{

	private static final long serialVersionUID = -6738777890878585819L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proveniencia_seq_gen")
	@SequenceGenerator(name = "proveniencia_seq_gen", sequenceName = "rismbr.proveniencia_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 10)
	@Column(name = "tipo")
	private String tipo;
	
	@Size(max = 65)
	@Column(name = "nome")
	private String nome;
	
	@Size(max = 65)
	@Column(name = "lugar")
	private String lugar;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proveniencia")
	private List<Documento> documentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

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
