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
 * Individuo
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "individuo", schema = "rismbr")
public class Individuo implements Serializable{

	private static final long serialVersionUID = -99841350352024817L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "individuo_seq_gen")
	@SequenceGenerator(name = "individuo_seq_gen", sequenceName = "rismbr.individuo_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 125)
	@Column(name = "nome_instituicao")
	private String nomeInstituicao;
	
	@Size(max = 125)
	@Column(name = "nome_rism_br")
	private String nomeRismBr;
	
	@Size(max = 125)
	@Column(name = "nome_rism_intl")
	private String nomeRismInternacional;
	
	@Size(max = 125)
	@Column(name = "nome_artistico")
	private String nomeArtistico;
	
	@Size(max = 20)
	@Column(name = "data_nascimento")
	private String dataNascimento;
	
	@Size(max = 20)
	@Column(name = "data_morte")
	private String dataMorte;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "copista")
	private List<Documento> documentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getNomeRismBr() {
		return nomeRismBr;
	}

	public void setNomeRismBr(String nomeRismBr) {
		this.nomeRismBr = nomeRismBr;
	}

	public String getNomeRismInternacional() {
		return nomeRismInternacional;
	}

	public void setNomeRismInternacional(String nomeRismInternacional) {
		this.nomeRismInternacional = nomeRismInternacional;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(String dataMorte) {
		this.dataMorte = dataMorte;
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
