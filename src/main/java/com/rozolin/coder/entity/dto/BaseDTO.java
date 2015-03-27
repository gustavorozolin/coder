package com.rozolin.coder.entity.dto;

import java.util.Date;

public abstract class BaseDTO {

	private Date dtCadastro;
	
	private Integer versao;

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}
}
