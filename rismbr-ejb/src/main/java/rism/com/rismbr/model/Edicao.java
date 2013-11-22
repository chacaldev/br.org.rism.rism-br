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
import javax.validation.constraints.Size;

/**
 * Edicao
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "edicao", schema = "rismbr")
public class Edicao implements Serializable{

	private static final long serialVersionUID = 5234074313906595844L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "edicao_seq_gen")
	@SequenceGenerator(name = "edicao_seq_gen", sequenceName = "rismbr.edicao_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 65)
	@Column(name = "local")
	private String local;
	
	@Size(max = 65)
	@Column(name = "nome_editor_editorial")
	private String nomeEditorEditorial;
	
	@Size(max = 25)
	@Column(name = "data_edicao")
	private String dataEdicao;
	
	@Size(max = 65)
	@Column(name = "nome_impressor")
	private String nomeImpressor;

	@Digits(fraction = 0, integer = 10)
	@Column(name = "numero_prancha")
	private Integer numeroPrancha;
	
	@Size(max = 25)
	@Column(name = "referencia_rism_ai")
	private String referenciaRismAI;
	
	@Size(max = 25)
	@Column(name = "referencia_rism_b")
	private String referenciaRismB;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "edicao")
	private List<Documento> documentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNomeEditorEditorial() {
		return nomeEditorEditorial;
	}

	public void setNomeEditorEditorial(String nomeEditorEditorial) {
		this.nomeEditorEditorial = nomeEditorEditorial;
	}

	public String getDataEdicao() {
		return dataEdicao;
	}

	public void setDataEdicao(String dataEdicao) {
		this.dataEdicao = dataEdicao;
	}

	public String getNomeImpressor() {
		return nomeImpressor;
	}

	public void setNomeImpressor(String nomeImpressor) {
		this.nomeImpressor = nomeImpressor;
	}

	public Integer getNumeroPrancha() {
		return numeroPrancha;
	}

	public void setNumeroPrancha(Integer numeroPrancha) {
		this.numeroPrancha = numeroPrancha;
	}

	public String getReferenciaRismAI() {
		return referenciaRismAI;
	}

	public void setReferenciaRismAI(String referenciaRismAI) {
		this.referenciaRismAI = referenciaRismAI;
	}

	public String getReferenciaRismB() {
		return referenciaRismB;
	}

	public void setReferenciaRismB(String referenciaRismB) {
		this.referenciaRismB = referenciaRismB;
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
