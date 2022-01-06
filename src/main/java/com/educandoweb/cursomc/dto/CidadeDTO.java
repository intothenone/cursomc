package com.educandoweb.cursomc.dto;

import com.educandoweb.cursomc.domain.Cidade;

public class CidadeDTO {

	private Integer id;
	private String nome;
	
	public CidadeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CidadeDTO(Cidade obj) {
		super();
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
