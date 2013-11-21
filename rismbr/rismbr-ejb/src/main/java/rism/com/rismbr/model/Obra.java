package rism.com.rismbr.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 * Obra
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "obra", schema = "rismbr")
public class Obra implements Serializable{

	private static final long serialVersionUID = -5462128838022242141L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "obra_seq_gen")
	@SequenceGenerator(name = "obra_seq_gen", sequenceName = "obra_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 255)
	@Column(name = "titulo_uniforme")
	private String tituloUniforme;
	
	@Size(max = 255)
	@Column(name = "titulo_proprio")
	private String tituloProprio;
	
	@Size(max = 255)
	@Column(name = "outros_titulos")
	private String outrosTitulos;
	
	@Size(max = 10)
	@Column(name = "cat_compositor_sigla")
	private String catCompositorSigla;
	
	@Size(max = 10)
	@Column(name = "cat_compositor_vol_pag")
	private String catCompositorVolPag;
	
	@Size(max = 10)
	@Column(name = "cat_compositor_tonalidade")
	private String catCompositorTonalidade;
	
	@Size(max = 30)
	@Column(name = "forma_musical_diplomatica")
	private String formaMusicalDiplomatica;
	
	@Size(max = 30)
	@Column(name = "forma_musical_normalizada")
	private String formaMusicalNormalizada;
	
	@Digits(fraction = 0, integer = 2)
	@Column(name = "numero_opus")
	private Integer numeroOpus;
	
	@Size(max = 5)
	@Column(name = "tonalidade_obra")
	private String tonalidadeObra;

	@Column(name = "is_arranjo")
	private Boolean arranjo;
	
	@Size(max = 10)
	@Column(name = "sel_esb_fragm")
	private String selEsbFragmento;

	@Column(name = "autografo")
	private String autografo;
	
	@Size(max = 255)
	@Column(name = "identificacao_fragmento")
	private String identificacaoFragmento;
	
	@Size(max = 255)
	@Column(name = "dedicatoria")
	private String dedicatoria;
	
	@Size(max = 25)
	@Column(name = "data_composicao")
	private String dataComposicao;
	
	@Size(max = 100)
	@Column(name = "estreia_local_data")
	private String estreiaLocalData;
	
	@Size(max = 100)
	@Column(name = "outras_execucoes_local_data")
	private String outrasExecucoesLocalData;
	
	@Size(max = 255)
	@Column(name = "outras_inf_fonte")
	private String outrasInfFonte;
	
	@Size(max = 255)
	@Column(name = "info_fontes_secundarias")
	private String infoFontesSecundarias;
	
	@Size(max = 255)
	@Column(name = "bibliografia")
	private String bibliografia;
	
	@Size(max = 255)
	@Column(name = "prec_bibliografica")
	private String precBibliografica;
	
	@Size(max = 255)
	@Column(name = "personagens")
	private String personagens;
	
	@Size(max = 255)
	@Column(name = "outros_nomes_personagens")
	private String outrosNomesPersonagens;
	
	@Size(max = 255)
	@Column(name = "outros_nomes")
	private String outrosNomes;
	
	@Size(max = 255)
	@Column(name = "interpretes")
	private String interpretes;
	
	@ManyToOne
	@JoinColumn(name = "documento_id")
	private Documento documento;
	
	@OneToOne
	@JoinColumn(name = "incipit_id")
	private Incipit incipit;
	
	@OneToOne
	@JoinColumn(name = "meio_interpretacao_id")
	private MeioInterpretacao meioInterpretacao;
	
	@ManyToOne
	@JoinColumn(name = "autor_literario_id")
	private AutorLiterario autorLiterario;
	
	@ManyToOne
	@JoinColumn(name = "arranjador_id")
	private Arranjador arranjador;
	
	@ManyToMany
	@JoinTable(
			name = "obra_compbase", 
			joinColumns = {@JoinColumn(name = "obra_id", referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name = "compbase_id", referencedColumnName = "id")})
	private List<CompositorBase> compositorBase;
	
	@ManyToOne
	@JoinColumn(name = "co_compositor_id")
	private CoCompositor coCompositor;
	
	@ManyToOne
	@JoinColumn(name = "compositor_id")
	private Compositor compositor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTituloUniforme() {
		return tituloUniforme;
	}

	public void setTituloUniforme(String tituloUniforme) {
		this.tituloUniforme = tituloUniforme;
	}

	public String getTituloProprio() {
		return tituloProprio;
	}

	public void setTituloProprio(String tituloProprio) {
		this.tituloProprio = tituloProprio;
	}

	public String getOutrosTitulos() {
		return outrosTitulos;
	}

	public void setOutrosTitulos(String outrosTitulos) {
		this.outrosTitulos = outrosTitulos;
	}

	public String getCatCompositorSigla() {
		return catCompositorSigla;
	}

	public void setCatCompositorSigla(String catCompositorSigla) {
		this.catCompositorSigla = catCompositorSigla;
	}

	public String getCatCompositorVolPag() {
		return catCompositorVolPag;
	}

	public void setCatCompositorVolPag(String catCompositorVolPag) {
		this.catCompositorVolPag = catCompositorVolPag;
	}

	public String getCatCompositorTonalidade() {
		return catCompositorTonalidade;
	}

	public void setCatCompositorTonalidade(String catCompositorTonalidade) {
		this.catCompositorTonalidade = catCompositorTonalidade;
	}

	public String getFormaMusicalDiplomatica() {
		return formaMusicalDiplomatica;
	}

	public void setFormaMusicalDiplomatica(String formaMusicalDiplomatica) {
		this.formaMusicalDiplomatica = formaMusicalDiplomatica;
	}

	public String getFormaMusicalNormalizada() {
		return formaMusicalNormalizada;
	}

	public void setFormaMusicalNormalizada(String formaMusicalNormalizada) {
		this.formaMusicalNormalizada = formaMusicalNormalizada;
	}

	public Integer getNumeroOpus() {
		return numeroOpus;
	}

	public void setNumeroOpus(Integer numeroOpus) {
		this.numeroOpus = numeroOpus;
	}

	public String getTonalidadeObra() {
		return tonalidadeObra;
	}

	public void setTonalidadeObra(String tonalidadeObra) {
		this.tonalidadeObra = tonalidadeObra;
	}

	public Boolean getArranjo() {
		return arranjo;
	}

	public void setArranjo(Boolean arranjo) {
		this.arranjo = arranjo;
	}

	public String getSelEsbFragmento() {
		return selEsbFragmento;
	}

	public void setSelEsbFragmento(String selEsbFragmento) {
		this.selEsbFragmento = selEsbFragmento;
	}

	public String getAutografo() {
		return autografo;
	}

	public void setAutografo(String autografo) {
		this.autografo = autografo;
	}

	public String getIdentificacaoFragmento() {
		return identificacaoFragmento;
	}

	public void setIdentificacaoFragmento(String identificacaoFragmento) {
		this.identificacaoFragmento = identificacaoFragmento;
	}

	public String getDedicatoria() {
		return dedicatoria;
	}

	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}

	public String getDataComposicao() {
		return dataComposicao;
	}

	public void setDataComposicao(String dataComposicao) {
		this.dataComposicao = dataComposicao;
	}

	public String getEstreiaLocalData() {
		return estreiaLocalData;
	}

	public void setEstreiaLocalData(String estreiaLocalData) {
		this.estreiaLocalData = estreiaLocalData;
	}

	public String getOutrasExecucoesLocalData() {
		return outrasExecucoesLocalData;
	}

	public void setOutrasExecucoesLocalData(String outrasExecucoesLocalData) {
		this.outrasExecucoesLocalData = outrasExecucoesLocalData;
	}

	public String getOutrasInfFonte() {
		return outrasInfFonte;
	}

	public void setOutrasInfFonte(String outrasInfFonte) {
		this.outrasInfFonte = outrasInfFonte;
	}

	public String getInfoFontesSecundarias() {
		return infoFontesSecundarias;
	}

	public void setInfoFontesSecundarias(String infoFontesSecundarias) {
		this.infoFontesSecundarias = infoFontesSecundarias;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public String getPrecBibliografica() {
		return precBibliografica;
	}

	public void setPrecBibliografica(String precBibliografica) {
		this.precBibliografica = precBibliografica;
	}

	public String getPersonagens() {
		return personagens;
	}

	public void setPersonagens(String personagens) {
		this.personagens = personagens;
	}

	public String getOutrosNomesPersonagens() {
		return outrosNomesPersonagens;
	}

	public void setOutrosNomesPersonagens(String outrosNomesPersonagens) {
		this.outrosNomesPersonagens = outrosNomesPersonagens;
	}

	public String getOutrosNomes() {
		return outrosNomes;
	}

	public void setOutrosNomes(String outrosNomes) {
		this.outrosNomes = outrosNomes;
	}

	public String getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Incipit getIncipit() {
		return incipit;
	}

	public void setIncipit(Incipit incipit) {
		this.incipit = incipit;
	}

	public MeioInterpretacao getMeioInterpretacao() {
		return meioInterpretacao;
	}

	public void setMeioInterpretacao(MeioInterpretacao meioInterpretacao) {
		this.meioInterpretacao = meioInterpretacao;
	}

	public AutorLiterario getAutorLiterario() {
		return autorLiterario;
	}

	public void setAutorLiterario(AutorLiterario autorLiterario) {
		this.autorLiterario = autorLiterario;
	}

	public Arranjador getArranjador() {
		return arranjador;
	}

	public void setArranjador(Arranjador arranjador) {
		this.arranjador = arranjador;
	}

	public List<CompositorBase> getCompositorBase() {
		return compositorBase;
	}

	public void setCompositorBase(List<CompositorBase> compositorBase) {
		this.compositorBase = compositorBase;
	}

	public CoCompositor getCoCompositor() {
		return coCompositor;
	}

	public void setCoCompositor(CoCompositor coCompositor) {
		this.coCompositor = coCompositor;
	}

	public Compositor getCompositor() {
		return compositor;
	}

	public void setCompositor(Compositor compositor) {
		this.compositor = compositor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
