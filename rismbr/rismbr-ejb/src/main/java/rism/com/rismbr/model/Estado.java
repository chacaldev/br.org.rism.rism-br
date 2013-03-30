package rism.com.rismbr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="estado")
public class Estado {
	@Id
	@SequenceGenerator(name="estado_seq_gen", sequenceName="estado_id_seq")
	@GeneratedValue(strategy= GenerationType.SEQUENCE , generator="estado_seq_gen")
	private long id;
	
	@NotNull
	@Column(name="sigla")
	private String sigla;
	
	@NotNull
	@Column(name="nome")
	private String nome;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
