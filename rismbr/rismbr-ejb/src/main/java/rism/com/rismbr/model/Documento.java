package rism.com.rismbr.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 * Documento
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name="documento", schema="rismbr")
public class Documento implements Serializable{

	private static final long serialVersionUID = -5384815100594793934L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documento_seq_gen")
	@SequenceGenerator(name = "documento_seq_gen", sequenceName = "rismbr.documento_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 20)
	@Column(name = "codigo")
	private String codigo;
	
	@Size(max = 65)
	@Column(name = "marcas_dagua")
	private String marcasDagua;
	
	@Column(name = "status", nullable=false)
	private String status;
	
	@Column(name = "data_ultima_atualizacao")
	private Calendar dataUltimaAtualizacao;
	
	@Size(max = 20)
	@Column(name = "data_manuscrito")
	private String dataManuscrito;
	
	@Size(max = 20)
	@Column(name = "codigo_antigo")
	private String codigoAntigo;
	
	@Size(max = 20)
	@Column(name="tipo_documento_coletivo")
	private String tipoDocumentoColetivo;
	
	@Size(max = 150)
	@Column(name = "relacao_conteudo")
	private String relacaoConteudo;
	
	@Column(name = "is_coletivo", nullable = false)
	private Boolean coletivo;
	
	@Digits(fraction = 0, integer = 10)
	@Column(name = "quantidade_obras")
	private Integer quantidadeObras;

	@ManyToOne
	@JoinColumn(name = "acervo_id")
	private Acervo acervo;
	
	@ManyToOne
	@JoinColumn(name = "proveniencia_id")
	private Proveniencia proveniencia;
	
	@ManyToOne
	@JoinColumn(name = "edicao_id")
	private Edicao edicao;
	
	@ManyToOne
	@JoinColumn(name = "copista_id")
	private Copista copista;
	
	@OneToOne
	@JoinColumn(name = "descricao_fisica_id")
	private DescricaoFisica descricaoFisica;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documento")
	private List<Obra> obras;
	
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

	public String getMarcasDagua() {
		return marcasDagua;
	}

	public void setMarcasDagua(String marcasDagua) {
		this.marcasDagua = marcasDagua;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Calendar getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}

	public void setDataUltimaAtualizacao(Calendar dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}

	public String getDataManuscrito() {
		return dataManuscrito;
	}

	public void setDataManuscrito(String dataManuscrito) {
		this.dataManuscrito = dataManuscrito;
	}

	public String getCodigoAntigo() {
		return codigoAntigo;
	}

	public void setCodigoAntigo(String codigoAntigo) {
		this.codigoAntigo = codigoAntigo;
	}

	public String getTipoDocumentoColetivo() {
		return tipoDocumentoColetivo;
	}

	public void setTipoDocumentoColetivo(String tipoDocumentoColetivo) {
		this.tipoDocumentoColetivo = tipoDocumentoColetivo;
	}

	public String getRelacaoConteudo() {
		return relacaoConteudo;
	}

	public void setRelacaoConteudo(String relacaoConteudo) {
		this.relacaoConteudo = relacaoConteudo;
	}

	public Boolean getColetivo() {
		return coletivo;
	}

	public void setColetivo(Boolean coletivo) {
		this.coletivo = coletivo;
	}

	public Integer getQuantidadeObras() {
		return quantidadeObras;
	}

	public void setQuantidadeObras(Integer quantidadeObras) {
		this.quantidadeObras = quantidadeObras;
	}

	public Acervo getAcervo() {
		return acervo;
	}

	public void setAcervo(Acervo acervo) {
		this.acervo = acervo;
	}

	public Proveniencia getProveniencia() {
		return proveniencia;
	}

	public void setProveniencia(Proveniencia proveniencia) {
		this.proveniencia = proveniencia;
	}

	public Edicao getEdicao() {
		return edicao;
	}

	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}

	public Copista getCopista() {
		return copista;
	}

	public void setCopista(Copista copista) {
		this.copista = copista;
	}

	public DescricaoFisica getDescricaoFisica() {
		return descricaoFisica;
	}

	public void setDescricaoFisica(DescricaoFisica descricaoFisica) {
		this.descricaoFisica = descricaoFisica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

}