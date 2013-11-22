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
 * Incipit
 * 
 * @author David Pasco (cpasco@gmail.com)
 * @date 19/10/2013
 * @version 1.0 
 */

@Entity
@Table(name = "incipit", schema = "rismbr")
public class Incipit implements Serializable{

	private static final long serialVersionUID = 9076410541313325664L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incipit_seq_gen")
	@SequenceGenerator(name = "incipit_seq_gen", sequenceName = "incipit_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 25)
	@Column(name = "ordem_numerica")
	private String ordemNumerica;
	
	@Size(max = 25)
	@Column(name = "voz_instrumento")
	private String vozInstrumento;
	
	@Size(max = 25)
	@Column(name = "personagem")
	private String personagem;
	
	@Size(max = 65)
	@Column(name = "epigrafe")
	private String epigrafe;
	
	@Size(max = 25)
	@Column(name = "tempo")
	private String tempo;
	
	@Size(max = 3)
	@Column(name = "clave")
	private String clave;
	
	@Size(max = 5)
	@Column(name = "tonalidade")
	private String tonalidade;
	
	@Size(max = 5)
	@Column(name = "compasso")
	private String compasso;
	
	@Size(max = 5)
	@Column(name = "medida_real_compasso")
	private String medidaRealCompasso;
	
	@Column(name = "incipit_musical")
	private byte[] incipitMusical;
	
	@Size(max = 3)
	@Column(name = "comentario_incipit")
	private String comentarioIncipit;
	
	@Size(max = 255)
	@Column(name = "incipit_literario_sacro")
	private String incipitLiterarioSacro;
	
	@Size(max = 255)
	@Column(name = "incipit_literario_normalizado")
	private String incipitLiterarioNormalizado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrdemNumerica() {
		return ordemNumerica;
	}

	public void setOrdemNumerica(String ordemNumerica) {
		this.ordemNumerica = ordemNumerica;
	}

	public String getVozInstrumento() {
		return vozInstrumento;
	}

	public void setVozInstrumento(String vozInstrumento) {
		this.vozInstrumento = vozInstrumento;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

	public String getEpigrafe() {
		return epigrafe;
	}

	public void setEpigrafe(String epigrafe) {
		this.epigrafe = epigrafe;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTonalidade() {
		return tonalidade;
	}

	public void setTonalidade(String tonalidade) {
		this.tonalidade = tonalidade;
	}

	public String getCompasso() {
		return compasso;
	}

	public void setCompasso(String compasso) {
		this.compasso = compasso;
	}

	public String getMedidaRealCompasso() {
		return medidaRealCompasso;
	}

	public void setMedidaRealCompasso(String medidaRealCompasso) {
		this.medidaRealCompasso = medidaRealCompasso;
	}

	public byte[] getIncipitMusical() {
		return incipitMusical;
	}

	public void setIncipitMusical(byte[] incipitMusical) {
		this.incipitMusical = incipitMusical;
	}

	public String getComentarioIncipit() {
		return comentarioIncipit;
	}

	public void setComentarioIncipit(String comentarioIncipit) {
		this.comentarioIncipit = comentarioIncipit;
	}

	public String getIncipitLiterarioSacro() {
		return incipitLiterarioSacro;
	}

	public void setIncipitLiterarioSacro(String incipitLiterarioSacro) {
		this.incipitLiterarioSacro = incipitLiterarioSacro;
	}

	public String getIncipitLiterarioNormalizado() {
		return incipitLiterarioNormalizado;
	}

	public void setIncipitLiterarioNormalizado(String incipitLiterarioNormalizado) {
		this.incipitLiterarioNormalizado = incipitLiterarioNormalizado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
