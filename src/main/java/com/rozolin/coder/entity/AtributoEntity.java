package com.rozolin.coder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atributo")
public class AtributoEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9085662643784686328L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "tipo")
	private String tipo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_classe")
	private ClasseEntity classeEntity;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtributoEntity other = (AtributoEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "AtributoEntity [id=" + id + ", nome=" + nome + ", tipo=" + tipo
				+ ", classeEntity=" + classeEntity + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ClasseEntity getClasseEntity() {
		return classeEntity;
	}

	public void setClasseEntity(ClasseEntity classeEntity) {
		this.classeEntity = classeEntity;
	}
	
	

}
