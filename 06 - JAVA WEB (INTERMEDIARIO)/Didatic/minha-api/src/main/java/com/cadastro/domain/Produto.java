package com.cadastro.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// CRIAR UMA CLASSE PARA COMPARAÇÕES
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return id == other.id;
	}

	// CRIAR VARIÁVEIS/ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENTO
	private Integer id;
	private String nome;
	private String modelo;
	private int quantidade;
	private double valor;
	
	// 	MÉTOODO COSNTRUTOR PADRÃO
	public Produto() {
		
	}

	// "Generate constructor using field" to point "this" to each variable
	public Produto(int id, String nome, String modelo, int quantidade, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	
	// GERAR OS getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", modelo=" + modelo + ", quantidade=" + quantidade + ", valor="
				+ valor + "]";
	}
}
