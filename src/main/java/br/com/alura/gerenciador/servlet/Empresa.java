package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	private Date data = new Date();

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
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Empresa(Integer id, String nome, Date data) {
		this.id = id;
		this.nome = nome;
		this.data = data;
	}

	public Empresa() {
	}

}
