package rism.com.rismbr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * MeioInterpretacao
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "meio_interpretacao")
public class MeioInterpretacao implements Serializable{

	private static final long serialVersionUID = 7270016170011915552L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meio_interpretacao_seq_gen")
	@SequenceGenerator(name = "meio_interpretacao_seq_gen", sequenceName = "meio_interpretacao_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 100)
	@Column(name = "rel_abreviada_vozes_instrumentos")
	private String relAbreviadaVozesInstrumentos;
	
	@Size(max = 65)
	@Column(name = "outros_solistas_vocais")
	private String outrosSolistasVocais;
	
	@Size(max = 65)
	@Column(name = "outras_vozes_coros")
	private String outrasVozesCoros;
	
	@Size(max = 65)
	@Column(name = "outros_instrumentos")
	private String outrosInstrumentos;
	
	@Size(max = 65)
	@Column(name = "baixo_continuo")
	private String baixoContinuo;
	
	@Size(max = 65)
	@Column(name = "observacoes_baixo_continuo")
	private String observacoesBaixoContinuo;
	
	@OneToOne
	@JoinColumn(name = "vozes_id")
	private Vozes solistasVocais;
	
	@OneToOne
	@JoinColumn(name = "coros_id")
	private Coro coros;
	
	@OneToOne
	@JoinColumn(name = "cordas_id")
	private Cordas cordas;
	
	@OneToOne
	@JoinColumn(name = "sopro_metais_id")
	private SoproMetais soproMetais;
	
	@OneToOne
	@JoinColumn(name = "sopro_madeiras_id")
	private SoproMadeiras soproMadeiras;
	
	@OneToOne
	@JoinColumn(name = "inst_teclado_id")
	private InstrumentoAbreviado instrumentoTeclado;
	
	@OneToOne
	@JoinColumn(name = "inst_corda_pulsada_pincada_id")
	private InstrumentoAbreviado instrumentoCordaPulsadaPincada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRelAbreviadaVozesInstrumentos() {
		return relAbreviadaVozesInstrumentos;
	}

	public void setRelAbreviadaVozesInstrumentos(
			String relAbreviadaVozesInstrumentos) {
		this.relAbreviadaVozesInstrumentos = relAbreviadaVozesInstrumentos;
	}

	public String getOutrosSolistasVocais() {
		return outrosSolistasVocais;
	}

	public void setOutrosSolistasVocais(String outrosSolistasVocais) {
		this.outrosSolistasVocais = outrosSolistasVocais;
	}

	public String getOutrasVozesCoros() {
		return outrasVozesCoros;
	}

	public void setOutrasVozesCoros(String outrasVozesCoros) {
		this.outrasVozesCoros = outrasVozesCoros;
	}

	public String getOutrosInstrumentos() {
		return outrosInstrumentos;
	}

	public void setOutrosInstrumentos(String outrosInstrumentos) {
		this.outrosInstrumentos = outrosInstrumentos;
	}

	public String getBaixoContinuo() {
		return baixoContinuo;
	}

	public void setBaixoContinuo(String baixoContinuo) {
		this.baixoContinuo = baixoContinuo;
	}

	public String getObservacoesBaixoContinuo() {
		return observacoesBaixoContinuo;
	}

	public void setObservacoesBaixoContinuo(String observacoesBaixoContinuo) {
		this.observacoesBaixoContinuo = observacoesBaixoContinuo;
	}

	public Vozes getSolistasVocais() {
		return solistasVocais;
	}

	public void setSolistasVocais(Vozes solistasVocais) {
		this.solistasVocais = solistasVocais;
	}

	public Coro getCoros() {
		return coros;
	}

	public void setCoros(Coro coros) {
		this.coros = coros;
	}

	public Cordas getCordas() {
		return cordas;
	}

	public void setCordas(Cordas cordas) {
		this.cordas = cordas;
	}

	public SoproMetais getSoproMetais() {
		return soproMetais;
	}

	public void setSoproMetais(SoproMetais soproMetais) {
		this.soproMetais = soproMetais;
	}

	public SoproMadeiras getSoproMadeiras() {
		return soproMadeiras;
	}

	public void setSoproMadeiras(SoproMadeiras soproMadeiras) {
		this.soproMadeiras = soproMadeiras;
	}

	public InstrumentoAbreviado getInstrumentoTeclado() {
		return instrumentoTeclado;
	}

	public void setInstrumentoTeclado(InstrumentoAbreviado instrumentoTeclado) {
		this.instrumentoTeclado = instrumentoTeclado;
	}

	public InstrumentoAbreviado getInstrumentoCordaPulsadaPincada() {
		return instrumentoCordaPulsadaPincada;
	}

	public void setInstrumentoCordaPulsadaPincada(
			InstrumentoAbreviado instrumentoCordaPulsadaPincada) {
		this.instrumentoCordaPulsadaPincada = instrumentoCordaPulsadaPincada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
