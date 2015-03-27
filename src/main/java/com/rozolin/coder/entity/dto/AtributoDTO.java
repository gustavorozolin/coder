package com.rozolin.coder.entity.dto;

public class AtributoDTO extends BaseDTO {

	private long id;

	private String nome;

	private String tipo;

	private ClasseDTO classeDTO;

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
		AtributoDTO other = (AtributoDTO) obj;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ClasseDTO getClasseDTO() {
		return classeDTO;
	}

	public void setClasseDTO(ClasseDTO classeDTO) {
		this.classeDTO = classeDTO;
	}

}
