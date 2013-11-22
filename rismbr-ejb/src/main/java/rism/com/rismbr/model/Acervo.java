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
 * Acervo
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "acervo", schema = "rismbr")
public class Acervo implements Serializable{

	private static final long serialVersionUID = -1796362280154164794L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acervo_seq_gen")
	@SequenceGenerator(name = "acervo_seq_gen", sequenceName = "rismbr.acervo_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 32)
	@Column(name = "codigo")
	private String codigo;
	
	@Size(max = 100)
	@Column(name = "nome")
	private String nome;
	
	@Size(max = 100)
	@Column(name = "cidade")
	private String cidade;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "acervo")
	private List<Documento> documentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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
