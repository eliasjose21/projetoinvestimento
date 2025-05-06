package br.com.unicuritiba.projetoinvestimento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Investimento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private int periodo;
	private float rentabilidade;
	private float inicial;
	
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
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public float getRentabilidade() {
		return rentabilidade;
	}
	public void setRentabilidade(float rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	public float getInicial() {
		return inicial;
	}
	public void setInicial(float inicial) {
		this.inicial = inicial;
	}
}
