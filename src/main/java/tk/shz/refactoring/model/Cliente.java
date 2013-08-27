package tk.shz.refactoring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4710972067660854236L;

	@Column(nullable = false, length = 50)
	private String nome;

	@Column
	private Double taxa;

	public Cliente() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

}
